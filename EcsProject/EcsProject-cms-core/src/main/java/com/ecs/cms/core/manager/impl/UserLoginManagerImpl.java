package com.ecs.cms.core.manager.impl;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.stereotype.Service;

import com.ecs.cms.core.manager.UserLoginManager;
import com.ecs.cms.core.model.UserLoginModel;

/**
 * @see UserLoginServcie
 * @Description:
 * @author toney.li
 * @date 2013-8-6 上午10:33:45
 * 
 */
@Service("userLoginManager")
public class UserLoginManagerImpl implements UserLoginManager {
	private final static XLogger LOGGER = XLoggerFactory
			.getXLogger(UserLoginManagerImpl.class);

	@Override
	public UserLoginModel login(String loginName,
			String password, String loginType, String loginIp) {
		return null;
	}

	@Override
	public void logout(String loginName, String tokenId, String loginType,
			String loginIp) {
		
	}

	@Override
	public UserLoginModel checkUserLogined(String loginName,
			String tokenId, String loginType, String loginIp) {
		return null;
	}

	@Override
	public UserLoginModel checkLoginedState(String tokenId, Long userId,
			String userName) {
		return null;
	}
}
