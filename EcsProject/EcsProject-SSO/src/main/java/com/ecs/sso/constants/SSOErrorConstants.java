package com.ecs.sso.constants;

/**
 * @Description: SSO 错误码定义
 * @author toney.li
 * @date 2013-8-9 上午10:00:22
 * 
 */
public class SSOErrorConstants {
	/**
	 * 格式为 SSO+X(状态)+XX(业务模块)+XXX（错误明细） <br/>
	 * 状态:0 系统错误，1：业务错误<br/>
	 * 业务模块:00登录，01注册 <br/>
	 * 错误明细：递增
	 */
	/**
	 * 登录模块系统错误编码前缀。
	 */
	private static final String ERR_LOGIN_BIZ_PREFIX = "SSO_001";
	/**
	 * 登录模块业务错误编码前缀。
	 */
	private static final String ERR_LOGIN_SYSTEM_PREFIX = "SSO_000";
	/**
	 * 注册模块系统错误编码前缀。
	 */
	private static final String ERR_REGISTER_SYSTEM_PREFIX = "SSO_001";
	/**
	 * 注册模块业务错误编码前缀。
	 */
	private static final String ERR_REGISTER_BIZ_PREFIX = "SSO_101";

	/**
	 * 登录模块系统错误
	 */
	public static final String ERR_LOGIN_SYSTEM = ERR_LOGIN_SYSTEM_PREFIX + "100";
	/**
	 * 用户登录，校验失败
	 */
	public static final String ERR_LOGIN_VALIDATE = ERR_LOGIN_BIZ_PREFIX + "101";
	/**
	 * 检查登录状态，校验失败
	 */
	public static final String ERR_LOGIN_CHECK_VALIDATE = ERR_LOGIN_BIZ_PREFIX + "102";

	/**
	 * session超时
	 */
	public static final String ERR_LOGIN_SEESION_TIMEOUT = ERR_LOGIN_BIZ_PREFIX + "103";
	/**
	 * 错误的登录类型
	 */
	public static final String ERR_LOGIN_TYPE = ERR_LOGIN_BIZ_PREFIX + "104";
	
	
	/**
	 * 禁止登录
	 */

	public static final String ERR_LOGIN_UNAUTH = ERR_LOGIN_BIZ_PREFIX + "105";
	/**
	 * 检查登录状态，入参校验失败
	 */
	public static final String ERR_LOGIN_CHECK_VALIDATEPARAM = ERR_LOGIN_BIZ_PREFIX + "106";
	/**
	 * 登录失败 未找到用户
	 */
	public static final String ERR_LOGIN_NOT_FOUND = ERR_LOGIN_BIZ_PREFIX + "107";
	
	/**
	 * 用户未登录
	 */
	public static final String BIZ_LOGIN_NOTRECORD_CODE =  ERR_LOGIN_BIZ_PREFIX + "108";;
	//======================================================================================
	
	
	/**
	 * 注册模版系统错误
	 */
	public static final String ERR_REGISTER_SYSTEM = ERR_REGISTER_SYSTEM_PREFIX + "1101";
	/**
	 * 注册插入userInfomodel失败
	 */
	public static final String ERR_REGISTER_INSERT_USERINFOMODEL = ERR_REGISTER_BIZ_PREFIX + "101";
	/**
	 * 注册入参校验失败
	 */
	public static final String ERR_REGISTER_VALIDATEPARAM = ERR_REGISTER_BIZ_PREFIX + "102";
	/**
	 * 注册帐号已存在
	 */
	public static final String ERR_REGISTER_VALIDATEEXIST = ERR_REGISTER_BIZ_PREFIX + "103";
	/**
	 * 注册用户已经存在
	 */
	public static final String ERR_REGISTER_USERNAMEEXIST = ERR_REGISTER_BIZ_PREFIX + "104";
	/**
	 * 注册手机号已经存在
	 */
	public static final String ERR_REGISTER_MOBILEEXIST = ERR_REGISTER_BIZ_PREFIX + "105";
    
	
	
}
