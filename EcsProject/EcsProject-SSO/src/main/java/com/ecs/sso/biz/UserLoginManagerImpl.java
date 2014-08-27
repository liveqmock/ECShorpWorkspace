package com.ecs.sso.biz;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.commons.exception.ExceptionFactory;
import com.ecs.sso.bo.UserLoginBo;
import com.ecs.sso.constants.SSOConstants;
import com.ecs.sso.constants.SSOErrorConstants;
import com.ecs.sso.model.UserInfoModel;
import com.ecs.sso.service.UserInfoService;
import com.ecs.sso.service.UserLoginTraceService;
import com.ecs.sso.utils.TokenIdUtils;

/**
 * @see UserLoginServcie
 * @Description:
 * @author toney.li
 * @date 2013-8-6 上午10:33:45
 * 
 */
@Service("userLoginManager")
public class UserLoginManagerImpl implements UserLoginManager {
	private final static XLogger LOGGER = XLoggerFactory.getXLogger(UserLoginManagerImpl.class);
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private UserLoginTraceService userLoginTraceService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.xec.sso.biz.UserLoginManager#login(com.xec.sso.bean.UserLoginDTO)
	 */
	@Override
	public UserLoginBo login(String loginName, String password, String loginType, String loginIp) {
		UserInfoModel userInfoModel = null;
		if (SSOConstants.EMAIL_TYPE.equals(loginType)) {
			userInfoModel = this.userInfoService.getByUsernameAndPwd(loginName, password);
		} else if (SSOConstants.MOBILE_TYPE.equals(loginType)) {
			userInfoModel = this.userInfoService.getByMobileAndPwd(loginName, password);
		} else {
			LOGGER.info("LOGIN_ARG_ERROR  --- 用户登录类型错误：userName={} loginType={}", new Object[] { loginName, loginType });
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_LOGIN_TYPE, "用户登录类型错误");
		}
		if (userInfoModel == null) {
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_LOGIN_NOT_FOUND, "登录失败 未找到用户");
		}
		if (!validateAccess(userInfoModel, loginType)) {
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_LOGIN_UNAUTH, "登录失败 用户认证失败");
		}
		// 缓存处理
		UserLoginBo userLoginBo = new UserLoginBo();
		userLoginBo = wrapUserLoginBean(userInfoModel, loginName, password, loginType, loginIp);
		userInfoService.loginAfterDispose(userLoginBo);
		return userLoginBo;
	}

	private boolean validateAccess(UserInfoModel userInfoModel, String loginType) {
		if (userInfoModel.getUserStatus() != SSOConstants.USER_STATUS_NORMAL) {
			LOGGER.info("禁止登录用户 userInfoModel={}", new Object[] { userInfoModel.toString() });
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_LOGIN_UNAUTH,"禁止登录用户");
		}
		// TODO 是否校验认证登录方式
		if (SSOConstants.EMAIL_TYPE.equals(loginType)) {
			// 邮箱是否认证 0:未认证 1:认证通过
		} else if (SSOConstants.MOBILE_TYPE.equals(loginType)) {
			// 手机是否认证 0:未认证 1:认证通过
		}
		return true;
	}

	/**
	 * 
	 * <b>功能：</b>封装登录数据<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-7 <br/>
	 * 
	 * @param userInfoModel
	 * @param loginType
	 * @param loginIp
	 * @return
	 */
	private UserLoginBo wrapUserLoginBean(UserInfoModel userInfoModel, String loginName, String password, String loginType, String loginIp) {
		Date now = new Date();
		UserLoginBo bean = new UserLoginBo();
		String tokenId = TokenIdUtils.generateTokenId(userInfoModel.getUserId(), now, loginIp);
		bean.setTokenId(TokenIdUtils.tokenEncode(tokenId));
		bean.setLastUpdateTime(now);
		bean.setLoginIp(loginIp);
		bean.setLoginTime(now);
		bean.setLoginType(loginType);
		if (SSOConstants.EMAIL_TYPE.equals(loginType)) {
			bean.setLoginName(userInfoModel.getUserName());
		} else if (SSOConstants.MOBILE_TYPE.equals(loginType)) {
			bean.setLoginName(userInfoModel.getMobile());
		}
		bean.setUserInfoModel(userInfoModel);
		return bean;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.xec.sso.biz.UserLoginManager#checkUserLogined(com.xec.sso.bean.UserLoginDTO)
	 */
	@Override
	public UserLoginBo checkUserLogined(String loginName, String tokenId, String loginType, String loginIp) {
		if (StringUtils.isBlank(tokenId) || StringUtils.isBlank(loginType) || (StringUtils.isBlank(loginName)) || StringUtils.isBlank(loginIp)) {
			LOGGER.info("checkUserLogined parameter fail param loginName={} tokenId={} loginType={} loginIp={}", new Object[] { loginName, tokenId, loginType, loginIp });
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_LOGIN_CHECK_VALIDATEPARAM,"检查登录状态，入参校验失败");
		}
		UserLoginBo userLoginBo = this.userInfoService.getByTokenId(tokenId);
		if (userLoginBo == null) {
		  throw ExceptionFactory.buildSSOException(SSOErrorConstants.BIZ_LOGIN_NOTRECORD_CODE,"检查登录状态，用户未登录");
		}
		if (!validate(userLoginBo, loginName, tokenId, loginType, loginIp)) {
		  throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_LOGIN_CHECK_VALIDATE,"检查登录状态，基本信息交易失败");
		}
		userLoginBo.setLastUpdateTime(new Date());
		UserInfoModel userInfoModel=this.userInfoService.getByUserId(userLoginBo.getUserInfoModel().getUserId());
		if(userInfoModel==null){
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_LOGIN_NOT_FOUND,"未找到登录记录");
		}
		if(!this.validateAccess(userInfoModel, loginType)){
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_LOGIN_UNAUTH,"登录验证没通过");
		}
		this.userInfoService.checkUserAfter(userInfoModel,userLoginBo);
		return userLoginBo;
	}

	/**
	 * 
	 * <b>功能：</b>校验登录状态明细,前台传过来的数据是否和缓存中的一致，Session是否超时<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-9 <br/>
	 * 
	 * @param userLoginedBo
	 *            前端入参
	 * @param userLoginBo
	 *            持久层数据
	 * @return
	 */
	private boolean validate(UserLoginBo userLoginBo, String loginName, String tokenId, String loginType, String loginIp) {
		if (!StringUtils.equals(loginName, userLoginBo.getLoginName())) {
			LOGGER.info("登录帐号 不一致  loginName={} userLoginBo.getLoginName()={} tokenId={} loginType={}", new Object[] { loginName,
					userLoginBo.getLoginName() ,tokenId,loginType});
			return false;
		}
		Date now = new Date();
		Date onlineDate = DateUtils.addMilliseconds(userLoginBo.getLastUpdateTime(), SSOConstants.SESSION_TIMEOUT);
		if (now.after(onlineDate)) {
			LOGGER.info("SESSION超时 lostUpdateTime={} currentTime={}", new Object[] { userLoginBo.getLastUpdateTime(), now });
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_LOGIN_SEESION_TIMEOUT,"登录SESSION超时 ");
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.xec.sso.biz.UserLoginManager#logout(com.xec.sso.bean.UserLoginDTO)
	 */
	@Override
	public void logout(String loginName, String tokenId, String loginType, String loginIp) {
		UserLoginBo userLoginedBo = this.checkUserLogined( loginName,  tokenId,  loginType,  loginIp);
		if (userLoginedBo != null) {
			this.userInfoService.logoutAfter(userLoginedBo);
		}
	}
}
