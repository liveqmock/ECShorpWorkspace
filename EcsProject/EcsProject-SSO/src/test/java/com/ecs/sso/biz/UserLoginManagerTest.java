package com.ecs.sso.biz;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.ecs.sso.bo.UserLoginBo;
import com.ecs.sso.constants.SSOConstants;
import com.ecs.sso.model.UserInfoModel;

public class UserLoginManagerTest extends BaseManagerTestCase {
	@Autowired
	UserLoginManager userLoginManager;

	@Test
	public void testLogin() {
		UserInfoModel userInfoModel = new UserInfoModel();
		userInfoModel.setUserName("lyxmq@126.com");
		userInfoModel.setPassword("111111");
		UserLoginBo userLoginBean = this.userLoginManager.login("lyxmq@126.com", "111111", SSOConstants.EMAIL_TYPE, "127.0.0.1");
		//login(userInfoModel, SSOConstants.EMAIL_TYPE, "127.0.0.1");
		Assert.notNull(userLoginBean);
		long start = System.currentTimeMillis();
		while (start + 2000 > System.currentTimeMillis()) {
		}
		userLoginBean = this.userLoginManager.checkUserLogined("lyxmq@126.com", userLoginBean.getTokenId(), SSOConstants.EMAIL_TYPE, "127.0.0.1");
		Assert.notNull(userLoginBean);
		start = System.currentTimeMillis();
		// while (start + 4000 > System.currentTimeMillis()) {
		// }
		// userLoginBean = this.userLoginManager.checkUserLogined(userInfoModel, userLoginBean.getTokenId(), userLoginBean.getLoginIp(), SSOConstants.EMAIL_TYPE);
		// Assert.assertNotNull(userLoginBean);
	}

}
