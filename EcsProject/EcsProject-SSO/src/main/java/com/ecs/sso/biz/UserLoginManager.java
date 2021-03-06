package com.ecs.sso.biz;

import com.ecs.sso.bo.UserLoginBo;

/**
 * @Description: 用户登录、登出、刷新登录状态.
 * @author toney.li
 * @date 2013-8-6 上午11:17:50
 * 
 */
public interface UserLoginManager {

	public UserLoginBo login(String loginName, String password, String loginType, String loginIp);

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
	UserLoginBo checkUserLogined(String loginName, String tokenId, String loginType, String loginIp);
}
