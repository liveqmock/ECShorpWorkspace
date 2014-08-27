package com.ecs.sso.service;

import com.ecs.sso.bo.UserLoginBo;
import com.ecs.sso.model.UserInfoModel;

/**
 * @Description: 用户登录Cache处理
 * @author toney.li
 * @date 2013-8-6 上午10:31:36
 * 
 */
public interface UserInfoCacheService {
	/**
	 * 
	 * <b>功能：</b>登录后把登录信息和用户信息 放入Cache<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-7 <br/>
	 * 
	 * @param userLoginBo
	 */
	public void putLoginCache(UserLoginBo userLoginBo);

	/**
	 * 
	 * <b>功能：</b>根据tokenId查询登录状态<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-8 <br/>
	 * @param tokenId
	 * @return
	 */
	UserLoginBo getByTokenId(String tokenId);

	/**
	 * 
	 * <b>功能：</b>根据tokenId移除登录缓存<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-8 <br/>
	 * @param tokenId
	 */
	public void remove(String tokenId);

	/**
	 * 
	 * <b>功能：</b>获取用户信息<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-22 <br/>
	 * @param userId
	 * @return
	 */
	UserInfoModel getByUserId(Long userId);

	/**
	 * 
	 * <b>功能：</b>把用户信息放入缓存<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-22 <br/>
	 * @param userInfoModel
	 */
	public void putUserInfoModel(UserInfoModel userInfoModel);

	/**
	 * 
	 * <b>功能：</b>把用户登录信息放入缓存<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-22 <br/>
	 * @param userLoginBo
	 */
	public void putUserLoginBo(UserLoginBo userLoginBo);
}
