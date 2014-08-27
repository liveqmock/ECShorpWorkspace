package com.ecs.sso.service;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.ecs.commons.exception.BusinessException;
import com.ecs.sso.bo.UserLoginBo;
import com.ecs.sso.constants.SSOConstants;
import com.ecs.sso.constants.SSOErrorConstants;
import com.ecs.sso.dao.UserInfoDao;
import com.ecs.sso.model.UserInfoModel;

/**
 * @Description:用户基本信息Service
 * @author toney.li
 * @date 2013-8-6 上午11:08:01
 * 
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	private static final XLogger LOGGER = XLoggerFactory.getXLogger(UserInfoServiceImpl.class);

	@Autowired
	private UserInfoDao userInfoDao;
	@Autowired
	private UserInfoCacheService  userInfoCacheService;
	@Autowired
	private UserLoginTraceService userLoginTraceService;
	
	@Override
	public UserInfoModel getByUserId(Long userId) {
		UserInfoModel userInfoModel=this.userInfoCacheService.getByUserId(userId);
		if(userInfoModel!=null){
			return userInfoModel;
		}
		userInfoModel = this.userInfoDao.getById(userId);
		this.userInfoCacheService.putUserInfoModel(userInfoModel);
		return userInfoModel;
	}

	@Override
	public UserInfoModel getByUsernameAndPwd(String userName, String pwd) {
		return this.userInfoDao.getByUsernameAndPwd(userName, DigestUtils.md5DigestAsHex(pwd.getBytes()));
	}

	@Override
	public UserInfoModel getByMobileAndPwd(String mobile, String pwd) {
		return this.userInfoDao.getByMobileAndPwd(mobile, DigestUtils.md5DigestAsHex(pwd.getBytes()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.xec.sso.service.UserInfoService#addUserInfo(com.xec.sso.bean.UserRegisterDTO)
	 */
	@Override
	public void addUserInfo(UserInfoModel registerUserInfoModel, String registerType) {
		UserInfoModel userInfoModel = new UserInfoModel();
		userInfoModel.setUserName(registerUserInfoModel.getUserName());
		String userEmail = StringUtils.isNotBlank(registerUserInfoModel.getUserName()) ? registerUserInfoModel.getUserName() : registerUserInfoModel.getUserEmail();
		userInfoModel.setUserEmail(userEmail);
		userInfoModel.setMobile(registerUserInfoModel.getMobile());
		userInfoModel.setPassword(DigestUtils.md5DigestAsHex(registerUserInfoModel.getPassword().getBytes()));
		userInfoModel.setUserLevel(SSOConstants.USER_LEVEL_1);
		userInfoModel.setUserStatus(SSOConstants.ENABLED);
		userInfoModel.setCreateTime(new Date());
		userInfoModel.setIsEnabled(String.valueOf(SSOConstants.ENABLED));
		userInfoModel.setUserLevel(SSOConstants.USER_LEVEL_1);
		userInfoModel.setEmailAuthenStatus(SSOConstants.ENABLED);
		userInfoModel.setMobileAuthenStatus(SSOConstants.ENABLED);
		try {
			this.userInfoDao.insert(userInfoModel);
		} catch (Exception e) {
			LOGGER.error("插入USERINFOMODEL记录失败", e);
			e.printStackTrace();
			throw new BusinessException(SSOErrorConstants.ERR_REGISTER_INSERT_USERINFOMODEL);
		}
	}

	@Override
	public UserInfoModel getByUsername(String userName) {
		return this.userInfoDao.getByUserName(userName);
	}

	@Override
	public UserInfoModel getByMobile(String mobile) {
		return this.userInfoDao.getByMobile(mobile);
	}

	/* (non-Javadoc)
	 * @see com.xec.sso.service.UserInfoService#loginAfterDispose(com.xec.sso.bo.UserLoginBo)
	 */
	@Override
	public void loginAfterDispose(UserLoginBo userLoginBo) {
		userInfoCacheService.putLoginCache(userLoginBo);
		userLoginTraceService.saveUserLoginTrace(userLoginBo);
	}

	@Override
	public UserLoginBo getByTokenId(String tokenId) {
		return this.userInfoCacheService.getByTokenId(tokenId);
	}

	@Override
	public void checkUserAfter(UserInfoModel userInfoModel, UserLoginBo userLoginBo) {
		this.userInfoCacheService.putUserLoginBo(userLoginBo);
	}

	@Override
	public void logoutAfter(UserLoginBo userLoginedBo) {
		this.userInfoCacheService.remove(userLoginedBo.getTokenId());
		this.userLoginTraceService.updateUserLogoutTrace(userLoginedBo);		
	}

}
