package com.ecs.sso.service;

import java.util.Date;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

import com.ecs.sso.bo.UserLoginBo;
import com.ecs.sso.constants.SSOConstants;
import com.ecs.sso.dao.UserLoginTraceDao;
import com.ecs.sso.model.UserLoginTraceModel;

/**
 * @Description: 记录用的登录登出轨迹
 * @author toney.li
 * @date 2013-8-12 下午4:55:22
 * 
 */
public class UserLoginTraceTask implements Runnable {
	private static final XLogger LOGGER = XLoggerFactory.getXLogger(UserLoginTraceTask.class);

	private static UserLoginTraceDao userLoginTraceDao;
	private int loginFlag;
	private UserLoginBo userLoginedBo;

	public UserLoginBo getUserLoginedBo() {
		return userLoginedBo;
	}

	public void setUserLoginedBo(UserLoginBo userLoginedBo) {
		this.userLoginedBo = userLoginedBo;
	}

	public void setLoginFlag(int loginFlag) {
		this.loginFlag = loginFlag;
	}

	public void setUserLoginTraceDao(UserLoginTraceDao userLoginTraceDao) {
		UserLoginTraceTask.userLoginTraceDao = userLoginTraceDao;
	}

	protected UserLoginTraceTask() {
	}

	@Override
	public void run() {
		try {
			if (this.loginFlag == SSOConstants.LOGIN_OP) {
				if (this.userLoginedBo.getUserInfoModel() == null || userLoginTraceDao == null) {
					LOGGER.info("userInfoModel= {} userLoginTraceDao={}", new Object[] { this.userLoginedBo.getUserInfoModel(), userLoginTraceDao });
					super.finalize();
					return;
				}
				UserLoginTraceModel userLoginTraceModel = new UserLoginTraceModel();
				userLoginTraceModel.setLoginAcc(userLoginedBo.getLoginName());
				userLoginTraceModel.setLoginIp(userLoginedBo.getLoginIp());
				userLoginTraceModel.setLoginTime(userLoginedBo.getLoginTime());
				userLoginTraceModel.setTokenId(userLoginedBo.getTokenId());
				userLoginTraceModel.setUserId(this.userLoginedBo.getUserInfoModel().getUserId());
				userLoginTraceDao.insert(userLoginTraceModel);
			} else if (this.loginFlag == SSOConstants.LOGOUT_OP) {
				if (this.userLoginedBo.getUserInfoModel() == null || userLoginTraceDao == null) {
					LOGGER.info("userInfoModel= {} userLoginTraceDao={}", new Object[] { this.userLoginedBo.getUserInfoModel(), userLoginTraceDao });
					super.finalize();
					return;
				}
				userLoginTraceDao.updateLogoutTime(new Date(), this.userLoginedBo.getUserInfoModel().getUserId(), userLoginedBo.getTokenId());
			}
		} catch (Throwable e) {
			LOGGER.error("UserLoginTraceTask  run error ", e);
		}
	}

}