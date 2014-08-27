package com.ecs.cms.web.admin.utils;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsers;
import com.ecs.commons.utils.EncryptUtils;
import com.ecs.commons.utils.JSONObjectUtils;

public class AdminSessionUtil {

	private static final XLogger LOGGER = XLoggerFactory.getXLogger(AdminSessionUtil.class);
	private static final String COMM_USER_COOKIE = "admin_user";
	private static final String MENU_LIST_COOKIE = "menu_list";

	private static EcsMgrUsers getUser(String userString) {
	  EcsMgrUsers user = (EcsMgrUsers) JSONObjectUtils.getObject(userString, EcsMgrUsers.class);
		return user;
	}

	@SuppressWarnings("rawtypes")
	public static void setMenuList(HttpServletRequest request,HttpServletResponse response, List menuList) {
//		String value = JSONObjectUtils.toString(menuList);
//		value = EncryptUtils.encrypt(value);
//		CookieUtil.getInstance().addCookie(response, MENU_LIST_COOKIE, value);
		HttpSession session=request.getSession();
		session.setAttribute(MENU_LIST_COOKIE, menuList);
	}

	public static void setUser(HttpServletRequest request, HttpServletResponse response, EcsMgrUsers user) {
//		String value = JSONObjectUtils.toString(user);
//		value = EncryptUtils.encrypt(value);
//		CookieUtil.getInstance().addCookie(response, COMM_USER_COOKIE, value);
	  request.getSession().setAttribute(COMM_USER_COOKIE, user);
	}

	@SuppressWarnings("rawtypes")
	public static List getMenu(HttpServletRequest request) {
		List list = null;
		try {
//			String userString = CookieUtil.getInstance().readCookieValue(request, MENU_LIST_COOKIE);
//
//			if (StringUtils.isEmpty(userString)) {
//				return null;
//			}
//			userString = java.net.URLEncoder.encode(userString, "utf-8");
//			userString = EncryptUtils.decrypt(userString);
//			list = (List) JSONObjectUtils.getCollection(userString, Menu.class);
			list=(List) request.getSession().getAttribute(MENU_LIST_COOKIE);

		} catch (Exception e) {
			LOGGER.error("", e);
		}
		return list;
	}

	public static EcsMgrUsers getUser(HttpServletRequest request) {
	  EcsMgrUsers user = null;
		try {
			String userString = CookieUtil.getInstance().readCookieValue(request, COMM_USER_COOKIE);

			if (StringUtils.isEmpty(userString)) {
				return null;
			}
			userString = java.net.URLEncoder.encode(userString, "utf-8");
//			userString = EncryptUtils.decrypt(userString);
			user = getUser(userString);

		} catch (Exception e) {
			LOGGER.error("", e);
		}
		return user;
	}

	public static void clearUser(HttpServletResponse response) {
		CookieUtil.getInstance().deleteCookie(response, COMM_USER_COOKIE);
	}
}
