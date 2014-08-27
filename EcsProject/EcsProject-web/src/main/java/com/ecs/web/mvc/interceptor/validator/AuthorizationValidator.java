package com.ecs.web.mvc.interceptor.validator;

import javax.servlet.http.HttpServletRequest;

import com.ecs.web.mvc.annotation.AuthLevel;

/**
 *************************************************************** 
 * <p>
 * AuthorizationValidator.java
 * @DESCRIPTION :请描述一下文件功能
 * @AUTHOR : Toney.li
 * @DATE :下午3:22:07
 *       </p>
 **************************************************************** 
 */
public interface AuthorizationValidator {
    public boolean validate(HttpServletRequest request, AuthLevel level);
}
