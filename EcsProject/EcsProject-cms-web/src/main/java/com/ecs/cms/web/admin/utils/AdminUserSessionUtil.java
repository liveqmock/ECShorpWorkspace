package com.ecs.cms.web.admin.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsers;
import com.ecs.commons.utils.EncryptUtils;

/**
 *************************************************************** 
 * <p>
 * 
 * @DESCRIPTION :
 * @AUTHOR : mike@xiu.com
 * @DATE :2013-7-24 下午3:51:02
 *       </p>
 **************************************************************** 
 */
public class AdminUserSessionUtil {
  private static final XLogger LOGGER = XLoggerFactory.getXLogger(AdminUserSessionUtil.class);
  private static final String COMM_USER_COOKIE = "comment_user";
  public final static String COOKIE_XUSERID_ENCRYPTION = "xuserId2";// 对userId加密后cookieName

  private static AdminUserAuthInfoHolder getUser(String userString) {
    JSONObject ja = JSONObject.fromObject(userString);
    AdminUserAuthInfoHolder user = (AdminUserAuthInfoHolder) JSONObject.toBean(ja, EcsMgrUsers.class);
    return user;
  }

  private static String toString(Object object) {
    JSONObject json = JSONObject.fromObject(object);
    String str = json.toString();
    return str;
  }

  public static void setUserAuthInfoToCookie(HttpServletResponse response, AdminUserAuthInfoHolder user) {
    String originalUserId = toString(user);
    originalUserId = EncryptUtils.encrypt(originalUserId);
    CookieUtil.getInstance().addCookie(response, COMM_USER_COOKIE, originalUserId);
    String md5Code = "encryption.auth_md5code";//SpringResourceLocator.getConfiguration().getString("encryption.auth_md5code");
    String encryption_userId =
        org.springframework.util.DigestUtils.md5DigestAsHex((originalUserId + md5Code).getBytes());
    CookieUtil.getInstance().addCookie(response, COOKIE_XUSERID_ENCRYPTION, encryption_userId);

  }

  /**
   * 
   * @Description:
   * @param request
   * @return
   */
  public static boolean checkDataIntegrityOfUser(HttpServletRequest request) {

    String originalUserId = CookieUtil.getInstance().readCookieValue(request, COMM_USER_COOKIE);
    if (StringUtils.isBlank(originalUserId)) {// userId为空
      return false;
    }

    // 加密后的userId
    String encryption_userId =
        CookieUtil.getInstance().readCookieValue(request, COOKIE_XUSERID_ENCRYPTION);

    if (!StringUtils.isBlank(encryption_userId)) {
      String md5Code ="encryption.auth_md5code";
         // SpringResourceLocator.getConfiguration().getString("encryption.auth_md5code");
      originalUserId =
          org.springframework.util.DigestUtils
              .md5DigestAsHex((originalUserId + md5Code).getBytes());

      if (encryption_userId.equals(originalUserId)) {
        LOGGER.debug(AdminUserSessionUtil.class.getName() + " UserIds are equivalent !");
        return true;
      } else {
        LOGGER.debug(AdminUserSessionUtil.class.getName() + " UserIds are not equivalent!");
      }

    } else {
      LOGGER.debug(AdminUserSessionUtil.class.getName() + " Encryption UserId mustn't be blank!");
    }
    return false;
  }

  public static AdminUserAuthInfoHolder buildUserAuthInfoFromCookie(HttpServletRequest request) {
    AdminUserAuthInfoHolder user = null;
    try {
      user=(AdminUserAuthInfoHolder) request.getSession().getAttribute(COMM_USER_COOKIE);
//      String userString = CookieUtil.getInstance().readCookieValue(request, COMM_USER_COOKIE);

//      if (StringUtils.isBlank(userString)) {
//        return null;
//      }
//      userString = java.net.URLEncoder.encode(userString, "utf-8");
////      userString = EncryptUtils.decrypt(userString);
//      user = getUser(userString);

    } catch (Exception e) {
      LOGGER.error("", e);
    }
    return user;
  }

  public static void clearUserAuthInfoFromCookie(HttpServletResponse response) {
    CookieUtil.getInstance().deleteCookie(response, COMM_USER_COOKIE);
  }
}
