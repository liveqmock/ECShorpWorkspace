package com.ecs.manager.core.service.impl;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.stereotype.Service;

import com.ecs.manager.core.model.UserLoginModel;
import com.ecs.manager.core.service.UserLoginService;

/**
 * @see UserLoginServcie
 * @Description:
 * @author toney.li
 * @date 2013-8-6 上午10:33:45
 * 
 */
@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService {
	private final static XLogger LOGGER = XLoggerFactory
			.getXLogger(UserLoginServiceImpl.class);

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
