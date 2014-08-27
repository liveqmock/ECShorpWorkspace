package com.ecs.manager.web.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

import com.ecs.manager.core.admin.bo.EcsMgrMenusBo;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrUsers;

/**
 *************************************************************** 
 * <p>
 * CookieValidator.java
 * 
 * @DESCRIPTION :用户登录 Cookie 校验方式。
 * @AUTHOR : Toney.li
 * @DATE :下午3:22:26
 *       </p>
 **************************************************************** 
 */
public class SessionStoreUtil {

  private static final XLogger LOGGER = XLoggerFactory.getXLogger(SessionStoreUtil.class);

  private static final String ADMIN_LOGIN = "admin_user_logined";
  private static final String ADMIN_MENU = "admin_user_menu";

  public static void storeUserSession(HttpServletRequest request, EcsMgrUsers adminUser) {
    request.getSession().setAttribute(ADMIN_LOGIN, adminUser);
  }

  public static EcsMgrUsers getUserSession(HttpServletRequest request) {
    return (EcsMgrUsers) request.getSession().getAttribute(ADMIN_LOGIN);
  }

  public static void storeMenuSession(HttpServletRequest request, List<EcsMgrMenusBo> userMenus) {
    request.getSession().setAttribute(ADMIN_MENU, userMenus);

  }

  public static List<EcsMgrMenusBo> getMenuSession(HttpServletRequest request) {
    return (List<EcsMgrMenusBo>) request.getSession().getAttribute(ADMIN_MENU);

  }
}
