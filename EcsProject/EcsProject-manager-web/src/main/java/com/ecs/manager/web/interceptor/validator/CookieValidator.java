package com.ecs.manager.web.interceptor.validator;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecs.manager.core.auth.UserAuthInfo;
import com.ecs.manager.core.model.UserLoginModel;
import com.ecs.manager.core.service.UserLoginService;
import com.ecs.manager.web.annotation.AuthLevel;
import com.ecs.manager.web.constants.Constants;

/**
 *************************************************************** 
 * <p>
 * CookieValidator.java
 * @DESCRIPTION :用户登录 Cookie 校验方式。
 * @AUTHOR : Toney.li
 * @DATE :下午3:22:26
 *       </p>
 **************************************************************** 
 */
@Component("cookieValidator")
public class CookieValidator implements AuthorizationValidator {

	private static final XLogger LOGGER = XLoggerFactory.getXLogger(CookieValidator.class);
	@Autowired
	private UserLoginService userLoginManager;

	@Override
	public boolean validate(HttpServletRequest request, AuthLevel level) {
		if (AuthLevel.NONE == level) {
			return true;
		}
		UserAuthInfo user = null;
		// 1. 构造UserAuthInfo对象，以便后续的业务使用 TODO
		// UserAuthInfo user =
		// CookieStoreUtil.buildUserAuthInfoFromCookie(request);
		// if (user != null) {
		// user.setClientIpAddress(IPUtil.getRequestIP(request));
		// }

		// 2. 检查是否有tokenId TODO
		// if ((user == null) || (StringUtils.isBlank(user.getSsoTokenId())) ||
		// (user.getSsoUserId() == null)) {
		// return false;
		// }

		// 3. 检查Cookies上记录数据的安全性 TODO
		// if (!CookieStoreUtil.checkDataIntegrityOfUser(request)) {
		// return false;
		// }

		// 4. 到SSO服务器检测tokenId是否有效
		if ((AuthLevel.STRICT == level) && !checkLoginedStatus(user)) {
			return false;
		} else if (AuthLevel.ADMIN == level && !checkAdminLoginedStatus(user)) {
			return false;
		}

		// 5. 构造UserAuthInfo对象，以便后续的业务使用
		request.setAttribute(Constants.USER_AUTH_INFO_ATTR, user);
		return true;
	}

	/**
	 * 检查是否系统管理员登录.
	 * 
	 * @param user
	 * @return
	 */
	private boolean checkAdminLoginedStatus(UserAuthInfo user) {
		try {
			UserLoginModel UserLoginModel = this.userLoginManager.checkLoginedState(user.getTokenId(), user.getUserId(), user.getUserName());
			if (UserLoginModel != null && UserLoginModel.getUserId() != null && UserLoginModel.getUserId().longValue() == user.getUserId().longValue()) {
				return true;
			}
		} catch (Exception e) {
			LOGGER.error("系统管理员认证失败,tokenId={},ip={},userId={},userName={},exception={}", new Object[] { user.getTokenId(), user.getUserId(), user.getUserName(), e });
			LOGGER.error("系统管理员认证失败", e);
		}
		return false;
	}

	/**
	 * @param request
	 * @Title: checkSsoStatus
	 * @Description: SSO权限认证
	 * @param @param ssoTokenId
	 * @param @param ip
	 * @param @param userId
	 * @param @return
	 * @return boolean
	 * @throws
	 */
	private boolean checkLoginedStatus(UserAuthInfo user) {
		try {
			UserLoginModel UserLoginModel = this.userLoginManager.checkLoginedState(user.getTokenId(), user.getUserId(), user.getUserName());
			if (UserLoginModel != null && UserLoginModel.getUserId() != null && UserLoginModel.getUserId().longValue() == user.getUserId().longValue()) {
				return true;
			}
		} catch (Exception e) {
			LOGGER.error("用户认证失败,tokenId={},ip={},userId={},userName={},exception={}", new Object[] { user.getTokenId(), user.getUserId(), user.getUserName(), e });
			LOGGER.error("用户认证失败", e);
		}
		return false;
	}
}
