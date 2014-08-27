package com.ecs.sso.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.util.DigestUtils;

public class PasswordEncoderTest extends TestCase{

	@Test
	public void testMd5(){
		Md5PasswordEncoder pwdEncoder=new Md5PasswordEncoder();
		System.out.println(pwdEncoder.encodePassword("111111", ""));
		System.out.println(DigestUtils.md5DigestAsHex("111111".getBytes()));
	}
	
	@Test
	public void testAES(){
//		Encryptors.queryableText("bea38012b2866c66", "bea38012b2866c66bea38012b2866c66");
		
//		String salt = KeyGenerators.secureRandom(32).generateKey().toString();
//		System.out.println(salt);
//		TextEncryptor textEncryptor=Encryptors.queryableText("password", salt);
//		textEncryptor.encrypt("a");
//		System.out.println(Encryptors.queryableText("bea38012b2866c66bea38012b2866c66", salt));
//		System.out.println(Encryptors.standard("111111", "bea38012b2866c66bea38012b2866c66"));
		String t="jgx%2BFZeGxD5c0%2FudoEmb9kuRXObm4IB2jFqHXyZ%2FzI74F1uewKfOBomC6ZPoSPz%2BX2jHl2sISroJJfQvzc8ZsvK23IVz64YfGeeZLjLsdwQdJIvvs3lIMhV3hV3HFSX31hJDsmnr5VHiaKgh%2FX%2BJkg%3D%3D";
		try {
			System.out.println(URLDecoder.decode(t, "utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
