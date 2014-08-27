package com.ecs.commons.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

/**
 * @Description: 一些常用的校验工具方法
 * @author toney.li
 * @date 2013-8-8 上午11:21:56
 * 
 */
public class ValidationUtils {
	private static final XLogger LOGGER = XLoggerFactory.getXLogger(ValidationUtils.class);

	/**
	 * 
	 * <b>功能：</b>邮箱校验<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-8 <br/>
	 * @param email
	 * @return
	 */
	public static boolean validateEmail(String email) {
		if (StringUtils.isBlank(email)) {
			return false;
		}
		boolean flag = false;
		try {
			String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(email);
			flag = matcher.matches();
		} catch (Exception e) {
			flag = false;
		}

		return flag;
	}

	/**
	 * 
	 * <b>功能：</b>手机校验<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-8 <br/>
	 * 
	 * @param mobile
	 * @return
	 */
	public static boolean validateMobile(String mobile) {
		if (StringUtils.isBlank(mobile)) {
			return false;
		}
		boolean flag = false;
		try {
			Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
			Matcher m = p.matcher(mobile);
			flag = m.matches();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
}
