package com.ecs.sso.service;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.sso.bo.UserLoginBo;
import com.ecs.sso.model.UserInfoModel;

/**
 * @Description: 用户登录Cache处理
 * @author toney.li
 * @date 2013-8-7 下午12:16:01
 * 
 */
@Service("userInfoCacheService")
public class UserInfoCacheServiceImpl implements UserInfoCacheService {

	private static final XLogger LOGGER = XLoggerFactory.getXLogger(UserInfoCacheServiceImpl.class);

	/**
	 * 登录后信息
	 */
	private static final String LOGIN_CACHE_NAME = "userLoginedCache";
	/**
	 * 用户信息
	 */
	private static final String USER_CACHE_NAME = "userCache";
	private static String KEY_GEN = "className-" + UserInfoCacheServiceImpl.class.getName() + "-tokenId-%s";
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private CacheService cacheService;

	@Override
	public UserLoginBo getByTokenId(String tokenId) {
		String key = String.format(KEY_GEN, tokenId);
		return (UserLoginBo) this.cacheService.get(LOGIN_CACHE_NAME, key);
	}

	@Override
	public UserInfoModel getByUserId(Long userId) {
		String key = String.format(KEY_GEN, userId);
		return (UserInfoModel) this.cacheService.get(USER_CACHE_NAME, key);
	}

	/*
	 * 登录后把登录信息和用户信息 放入Cache (non-Javadoc)
	 * 
	 * @see com.xec.sso.service.UserInfoCacheService#putLoginCache(com.xec.sso.bo.UserLoginBo, com.xec.sso.model.UserInfoModel)
	 */
	@Override
	public void putLoginCache(UserLoginBo userLoginBo) {
		putUserLoginBo(userLoginBo);
		putUserInfoModel(userLoginBo.getUserInfoModel());
	}

	@Override
	public void remove(String tokenId) {
		String key = String.format(KEY_GEN, tokenId);
		this.cacheService.remove(LOGIN_CACHE_NAME, key);
	}

	@Override
	public void putUserInfoModel(UserInfoModel userInfoModel) {
		String key = String.format(KEY_GEN, userInfoModel.getUserId());
		this.cacheService.put(USER_CACHE_NAME, key, userInfoModel);
	}

	@Override
	public void putUserLoginBo(UserLoginBo userLoginBo) {
		String key = String.format(KEY_GEN, userLoginBo.getTokenId());
		this.cacheService.put(LOGIN_CACHE_NAME, key, userLoginBo);		
	}

}
