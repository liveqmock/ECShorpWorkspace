package com.ecs.sso.service;

import com.ecs.sso.bo.UserLoginBo;

/**
  * @Description:用户登录登出记录
  * @author toney.li
  * @date 2013-8-8 上午10:00:20
  *
  */
public interface UserLoginTraceService {

	void saveUserLoginTrace(UserLoginBo userLoginedBo);

	void updateUserLogoutTrace(UserLoginBo userLoginedBo);


}
