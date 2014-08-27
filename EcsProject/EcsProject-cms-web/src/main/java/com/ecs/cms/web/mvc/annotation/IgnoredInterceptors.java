package com.ecs.cms.web.mvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.web.servlet.HandlerInterceptor;

/**
 *************************************************************** 
 * <p>
 * IgnoredInterceptors.java
 * @DESCRIPTION :忽略拦截器
 * @AUTHOR : Toney.li
 * @DATE :下午3:19:15
 *       </p>
 **************************************************************** 
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoredInterceptors {
    Class<? extends HandlerInterceptor>[] value();
}
