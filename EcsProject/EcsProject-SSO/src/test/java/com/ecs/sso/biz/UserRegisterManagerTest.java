package com.ecs.sso.biz;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.ecs.sso.constants.SSOConstants;
import com.ecs.sso.model.UserInfoModel;

public class UserRegisterManagerTest extends BaseManagerTestCase {
	@Autowired
	UserRegisterManager userRegisterManager;

	@Test
	@Rollback(false)
	public void testRegister() {
		UserInfoModel userRegister = new UserInfoModel();
		userRegister.setUserName("lyxmq@163.com");
		userRegister.setPassword("111111");
		this.userRegisterManager.register(userRegister, SSOConstants.EMAIL_TYPE);
	}

}
