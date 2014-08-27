package com.ecs.manager.core.service;

import com.ecs.manager.core.model.UserLoginModel;


/**
 * @Description: 用户登录、登出、刷新登录状态.
 * @author toney.li
 * @date 2013-8-6 上午11:17:50
 * 
 */
public interface UserLoginService {

	public UserLoginModel login(String loginName, String password, String loginType, String loginIp);

	public void logout(String loginName, String tokenId, String loginType, String loginIp);

	/**
	 * 
	 * <b>功能：</b>校验登录状态明细,前台传过来的数据是否和缓存中的一致，Session是否超时 ，暂时不考虑ip限制 <br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-6 <br/>
	 * 
	 * @param loginName
	 * @param tokenId
	 * @param loginType
	 * @param loginIp
	 * @return
	 */
	UserLoginModel checkUserLogined(String loginName, String tokenId, String loginType, String loginIp);

	/**
	 * 检查用户登录状态
	 * @param tokenId
	 * @param userId
	 * @param userName
	 * @return
	 */
	public UserLoginModel checkLoginedState(
			String tokenId, Long userId, String userName);
}
