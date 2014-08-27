package com.ecs.sso.service;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.ecs.sso.bo.UserLoginBo;
import com.ecs.sso.constants.SSOConstants;
import com.ecs.sso.dao.UserLoginTraceDao;

/**
 * @Description:用户登录登出记录
 * @author toney.li
 * @date 2013-8-8 上午10:00:20
 * 
 */
@Service("userLoginTraceService")
public class UserLoginTraceServiceImpl implements UserLoginTraceService {
	private static final XLogger LOGGER = XLoggerFactory.getXLogger(UserLoginTraceServiceImpl.class);
	@Autowired
	private ThreadPoolTaskExecutor ssoTaskExecutor;
	@Autowired
	private UserLoginTraceDao userLoginTraceDao;

	@Override
	public void saveUserLoginTrace(UserLoginBo userLoginedBo) {
		try {
			UserLoginTraceTask task = new UserLoginTraceTask();
			task.setLoginFlag(SSOConstants.LOGIN_OP);
			task.setUserLoginTraceDao(userLoginTraceDao);
			task.setUserLoginedBo(userLoginedBo);
			ssoTaskExecutor.execute(task);
		} catch (Throwable t) {
			LOGGER.error("用户登录轨迹记录失败  userInfoModel={} tokenId={} loginType={}", new Object[] { userLoginedBo.getUserInfoModel().toString(), userLoginedBo.getTokenId(), userLoginedBo.getLoginType() }, t);
		}
	}

	@Override
	public void updateUserLogoutTrace(UserLoginBo userLoginedBo) {
		try {
			UserLoginTraceTask task = new UserLoginTraceTask();
			task.setLoginFlag(SSOConstants.LOGOUT_OP);
			task.setUserLoginedBo(userLoginedBo);
			task.setUserLoginTraceDao(userLoginTraceDao);
			ssoTaskExecutor.execute(task);
		} catch (Throwable t) {
			LOGGER.error("用户登录轨迹记录失败  userLoginedBo={}", new Object[] { userLoginedBo.getUserInfoModel().toString()}, t);
		}
	}
}
