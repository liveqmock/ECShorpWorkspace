package com.ecs.sso.constants;

public class SSOConstants {

	public static final  int USER_LEVEL_1=1;
	public static final  int USER_LEVEL_2=2;
	public static final String MOBILE_TYPE = "1";
	public static final String EMAIL_TYPE = "2";

	/**
	 * 登录常量
	 */
	public static final int LOGIN_OP = 1;
	/**
	 * 登出常量
	 */
	public static final int LOGOUT_OP = 0;

	/**
	 * 登录超时时间 单位为毫秒.
	 */
	public static final int SESSION_TIMEOUT = 30 * 60 * 1000;
	/**
	 * 正常用户状态
	 */
	public static final Integer USER_STATUS_NORMAL = 1;
	/**
	 * 正常用户状态
	 */
	public static final Integer USER_STATUS_FORBID = 0;
	/**
	 * 连续3次输入密码
	 */
	public static final Integer USER_STATUS_THREE_TIMES = 2;
	/**
	 * 可用
	 */
	public static final int ENABLED = 1;
	/**
	 * 不可用
	 */
	public static final int DISENABLED = 0;
}
