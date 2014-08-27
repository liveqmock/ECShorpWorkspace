/**
 * 
 */
package com.ecs.sso.utils;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.DigestUtils;

/**
  * @Description: SSO工具类
  * @author toney.li
  * @date 2013-8-6 上午11:44:28
  *
  */
public class SSOUtil {
	/**
	 * 
	 * <b>功能：</b>登录密码加密，，二次md5<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-6 <br/>
	 * @param password
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static String encodePassword(String password) throws IllegalArgumentException{
		if(StringUtils.isBlank(password)){
			throw new IllegalArgumentException("password can not blank!!!");
		}
		String result=DigestUtils.md5DigestAsHex(DigestUtils.md5DigestAsHex(password.getBytes()).getBytes());
		return result;
	}
}
