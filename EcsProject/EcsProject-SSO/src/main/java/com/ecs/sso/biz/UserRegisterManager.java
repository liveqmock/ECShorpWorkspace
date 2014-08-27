package com.ecs.sso.biz;

import com.ecs.sso.model.UserInfoModel;

/**
 * @Description: 用户注册
 * @author toney.li
 * @date 2013-8-8 上午11:11:04
 * 
 */
public interface UserRegisterManager {

	/**
	 * 
	 * <b>功能：</b>用户注册<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-9 <br/>
	 * 
	 * @param userInfoModel
	 * @param registerType
	 */

	void register(UserInfoModel userInfoModel, String registerType);
	
	/**
	 * 
	 * <b>功能：</b>用户是否已经被注册<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-19 <br/>
	 * @param regName
	 * @return
	 */
	Boolean isRegistedRegName(String regName, String registerType);

}
