package com.ecs.sso.biz;

import org.apache.commons.lang.StringUtils;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.commons.exception.ExceptionFactory;
import com.ecs.commons.utils.ValidationUtils;
import com.ecs.sso.constants.SSOConstants;
import com.ecs.sso.constants.SSOErrorConstants;
import com.ecs.sso.model.UserInfoModel;
import com.ecs.sso.service.UserInfoService;

/**
 * @Description: 用户注册
 * @author toney.li
 * @date 2013-8-8 上午11:11:04
 * 
 */
@Service("userRegisterManager")
public class UserRegisterManagerImpl implements UserRegisterManager {
	private static final XLogger LOGGER = XLoggerFactory.getXLogger(UserRegisterManagerImpl.class);

	@Autowired
	private UserInfoService userInfoService;

	@Override
	public void register(UserInfoModel userInfoModel,String registerType) {
		if (!validateParam(userInfoModel,registerType)) {
			LOGGER.info("注册校验失败 入参为 method = {} userRegisterDTO={}", new Object[] { "validateParam", userInfoModel.toString() });
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_REGISTER_VALIDATEPARAM,"注册校验失败 入参校验失败");
		}
		if (!validateExist(userInfoModel,registerType)) {
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_REGISTER_VALIDATEEXIST,"注册校验失败 用户已存在");
		}
		this.userInfoService.addUserInfo(userInfoModel,registerType);
	}

	/**
	 * 
	 * <b>功能：</b>校验帐号是否存在<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-9 <br/>
	 * 
	 * @param userRegisterDTO
	 * 
	 * @return
	 */
	private boolean validateExist(UserInfoModel userInfoModel, String registerType) {
		if (SSOConstants.EMAIL_TYPE.equals(registerType) && userInfoService.getByUsername(userInfoModel.getUserName()) != null) {
			LOGGER.info("注册校验失败 入参为method = {} userRegisterDTO={}", new Object[] { "validateExist", userInfoModel.toString() });
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_REGISTER_USERNAMEEXIST,"注册校验失败，用户已存在");
		}
		if (SSOConstants.MOBILE_TYPE.equals(registerType) && userInfoService.getByMobile(userInfoModel.getMobile()) != null) {
			LOGGER.info("注册校验失败 入参为method = {} userRegisterDTO={}", new Object[] { "validateExist", userInfoModel.toString() });
			throw ExceptionFactory.buildSSOException(SSOErrorConstants.ERR_REGISTER_MOBILEEXIST,"注册校验失败,手机已存在");
		}
		return true;
	}

	/**
	 * 
	 * <b>功能：</b>校验入参格式是否正确<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-9 <br/>
	 * 
	 * @param userRegisterDTO
	 * @return
	 */
	private boolean validateParam(UserInfoModel userInfoModel, String registerType) {
		if (StringUtils.isBlank(userInfoModel.getPassword()) || StringUtils.isBlank(registerType)
				|| (!SSOConstants.EMAIL_TYPE.equals(registerType) && !SSOConstants.MOBILE_TYPE.equals(registerType))) {
			return false;
		}
		if (SSOConstants.EMAIL_TYPE.equals(registerType) && (StringUtils.isBlank(userInfoModel.getUserName()) || !ValidationUtils.validateEmail(userInfoModel.getUserName()))) {
			return false;
		}
		if (SSOConstants.MOBILE_TYPE.equals(registerType) && (StringUtils.isBlank(userInfoModel.getMobile()) || !ValidationUtils.validateMobile(userInfoModel.getMobile()))) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see com.xec.sso.biz.UserRegisterManager#isRegistedRegName(java.lang.String, java.lang.String)
	 */
	@Override
	public Boolean isRegistedRegName(String regName, String registerType) {
		UserInfoModel userInfoModel=null;
		if(SSOConstants.EMAIL_TYPE.equals(registerType)){
			userInfoModel=this.userInfoService.getByUsername(regName);
		}
		if(SSOConstants.MOBILE_TYPE.equals(registerType)){
			userInfoModel=this.userInfoService.getByMobile(regName);
		}
		return userInfoModel==null?false:true;
	}
}
