/**
 * 
 */
package com.ecs.sso.utils;

import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.DigestUtils;

/**
 *************************************************************** 
 * <p>
 * 
 * @CLASS :TokenIdUtil.java
 * @DESCRIPTION :TOKENID 的工具.
 * @AUTHOR :ly_zy_ljh
 * @VERSION :v1.0
 * @DATE :2013-3-26
 *       </p>
 **************************************************************** 
 */
public class TokenIdUtils {
	/**
	 * 
	 * <b>功能：</b>userId+uuid+loginDate<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-7 <br/>
	 * 
	 * @param string
	 * @param date
	 * @return
	 */
	public static String generateTokenId(Long userId, Date date, String loginIp) {
		String token = String.valueOf(userId) + "-" + UUID.randomUUID().toString() + "-" + String.valueOf(date.getTime());
		return token;
	}

	/**
	 * 
	 * <b>功能：</b>两次MD加密<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-8 <br/>
	 * @param tokenId
	 * @return
	 */
	public static String tokenEncode(String tokenId) {
		return DigestUtils.md5DigestAsHex(DigestUtils.md5DigestAsHex(tokenId.getBytes()).getBytes());
	}
}
