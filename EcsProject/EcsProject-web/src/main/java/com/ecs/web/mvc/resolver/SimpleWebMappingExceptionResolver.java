package com.ecs.web.mvc.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import com.ecs.core.exception.AppBaseException;
import com.ecs.web.constants.Constants;
import com.ecs.web.constants.ErrConstants;
import com.ecs.web.mvc.util.RequestUtil;
import com.ecs.web.mvc.view.JsonPackageWrapper;

/**
 *************************************************************** 
 * <p>
 * @CLASS :SimpleWebMappingExceptionResolver.java
 * @DESCRIPTION : 全局异常控制
 * @AUTHOR :toney.li
 * @VERSION :v1.0
 * @DATE :Mar 21, 2013
 *       </p>
 **************************************************************** 
 */
public class SimpleWebMappingExceptionResolver extends SimpleMappingExceptionResolver {
	
	
	
    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
            Exception ex) {
        ModelAndView model = super.doResolveException(request, response, handler, ex);

        if ((model != null) && (ex != null)) {
            if (RequestUtil.isJsonRequest(request) && AppBaseException.class.isAssignableFrom(ex.getClass())) { 
                model.addObject(Constants.JSON_MODEL_DATA, new JsonPackageWrapper(JsonPackageWrapper.S_ERR,
                        ((AppBaseException) ex).getMessageWithSupportCode()));
            }
            model.addObject("errorMsg", generateErrorMessage(request, response, ex));
        }

        return model;
    }

    private String generateErrorMessage(HttpServletRequest request, HttpServletResponse response, Exception ex) {
    	if(AppBaseException.class.isAssignableFrom(ex.getClass())){
			return ((AppBaseException) ex).getMessageWithSupportCode();
        } else {
            return ErrConstants.GENERAL_COMM_ERR_MSG + "[500]";
        }
    }
}
