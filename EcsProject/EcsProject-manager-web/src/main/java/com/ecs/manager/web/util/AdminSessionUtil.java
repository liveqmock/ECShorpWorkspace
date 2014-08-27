package com.ecs.manager.web.util;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

import com.ecs.commons.exception.ExceptionFactory;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrUsers;

public class AdminSessionUtil {

  private static final XLogger LOGGER = XLoggerFactory.getXLogger(AdminSessionUtil.class);
  private static String ADMIN_LOGINED_SESSION = "ADMIN_LOGINED_SESSION";

  private static EcsMgrUsers getUser(HttpServletRequest request) {
    if (request.getSession().getAttribute(ADMIN_LOGINED_SESSION) == null) {
      return null;
    }
    try {
      EcsMgrUsers user = (EcsMgrUsers) request.getSession().getAttribute(ADMIN_LOGINED_SESSION);
      return user;
    } catch (Exception e) {
      LOGGER.error("session 解析失败", e);
      throw ExceptionFactory.buildAdminException("", "session解析失败");
    }
  }


  public static void setUser(HttpServletRequest request, EcsMgrUsers user) {
    request.getSession().setAttribute(ADMIN_LOGINED_SESSION, user);
  }


}
