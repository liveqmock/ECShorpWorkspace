package com.ecs.sso.service;

import com.ecs.sso.bo.UserLoginBo;
import com.ecs.sso.model.UserInfoModel;

/**
 * @Description: 用户基本信息接口
 * @author toney.li
 * @date 2013-8-6 上午10:31:36
 * 
 */
public interface UserInfoService {
	/**
	 * 通过用户ID获取用户信息
	 * 
	 * @param id
	 * @return
	 */
	public UserInfoModel getByUserId(Long id);

	/**
	 * 通过用户名+密码获取用户信息
	 * 
	 * @param userName
	 * @param pwd
	 * @return
	 */
	/**
	 * 
	 * <b>功能：</b>根据用户密码获取用户信息<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-6 <br/>
	 * 
	 * @param userName
	 * @param pwd
	 * @return
	 */
	public UserInfoModel getByUsernameAndPwd(String userName, String pwd);

	/**
	 * 
	 * <b>功能：</b>根据手机+密码获取用户信息<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-6 <br/>
	 * 
	 * @param mobile
	 * @param pwd
	 * @return
	 */
	public UserInfoModel getByMobileAndPwd(String mobile, String pwd);

	/**
	 * 
	 * <b>功能：</b>新增用户信息<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-9 <br/>
	 * 
	 * @param userRegisterDTO
	 */
	public void addUserInfo(UserInfoModel registerUserInfoModel,String loginType);

	public UserInfoModel getByUsername(String userName);

	public UserInfoModel getByMobile(String mobile);

	/**
	 * 
	 * <b>功能：</b>用户登录成功以后的数据处理，缓存和记录登录轨迹<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-22 <br/>
	 * @param userLoginBo
	 */
	public void loginAfterDispose(UserLoginBo userLoginBo);

	/**
	 * 
	 * <b>功能：</b>获取用户已登录信息<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-22 <br/>
	 * @param tokenId
	 * @return
	 */
	public UserLoginBo getByTokenId(String tokenId);

	/**
	 * 
	 * <b>功能：</b>验证登录完成之后的动作<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-22 <br/>
	 * @param userInfoModel 
	 * @param userLoginBo
	 * @return
	 */
	public void checkUserAfter(UserInfoModel userInfoModel, UserLoginBo userLoginBo);

	/**
	 * 
	 * <b>功能：</b> 退出后 清缓存 记日志<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-23 <br/>
	 * @param userLoginedBo
	 */
	public void logoutAfter(UserLoginBo userLoginedBo);
}
