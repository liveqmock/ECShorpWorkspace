package com.ecs.manager.web.interceptor.validator;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.stereotype.Component;

import com.ecs.commons.exception.ExceptionFactory;
import com.ecs.manager.core.admin.constant.ErrConstants;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrUsers;
import com.ecs.manager.web.annotation.AuthLevel;
import com.ecs.manager.web.constants.Constants;
import com.ecs.manager.web.util.SessionStoreUtil;

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
@Component("sessionValidator")
public class SessionValidator implements AuthorizationValidator {

	private static final XLogger LOGGER = XLoggerFactory.getXLogger(SessionValidator.class);

	@Override
	public boolean validate(HttpServletRequest request, AuthLevel level) {
		EcsMgrUsers user=SessionStoreUtil.getUserSession(request);
		if(user==null){
		  throw ExceptionFactory.buildAdminException(ErrConstants.GENERAL_LOGINOUT_CODE,ErrConstants.GENERAL_LOGINOUT_MSG);
		}
		request.setAttribute(Constants.USER_AUTH_INFO_ATTR, user);
		request.setAttribute(Constants.USER_MENU_INFO_ATTR, SessionStoreUtil.getMenuSession(request));
		return true;
	}
}
