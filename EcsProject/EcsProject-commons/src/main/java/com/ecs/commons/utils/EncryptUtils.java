package com.ecs.commons.utils;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;


/**
  * @Description: 加密
  * @author toney.li
  * @date 2013-8-7 下午4:12:34
  *
  */
public class EncryptUtils {  
    private static final String SITE_WIDE_SECRET = "abc-BCD-efc-123-456-!@#-end";  
    private static final PasswordEncoder encoder = new StandardPasswordEncoder(  
       SITE_WIDE_SECRET);  
   
    public static String encrypt(String srcStr) {  
         return encoder.encode(srcStr);  
    }  
   
    public static boolean match(String srcStr, String encodeStr) {  
         return encoder.matches(srcStr, encodeStr);  
    }  
 }  