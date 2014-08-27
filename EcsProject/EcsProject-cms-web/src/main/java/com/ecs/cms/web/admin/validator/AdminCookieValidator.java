package com.ecs.cms.web.admin.validator;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.ecs.cms.core.auth.UserAuthInfo;
import com.ecs.cms.web.admin.constants.Constants;
import com.ecs.cms.web.admin.utils.AdminUserAuthInfoHolder;
import com.ecs.cms.web.admin.utils.AdminUserSessionUtil;
import com.ecs.cms.web.mvc.annotation.AuthLevel;

/**
 * 
 * <p>
 * 
 * @CLASS :CookieValidator.java
 * @DESCRIPTION :
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年6月22日
 *       </p>
 * 
 */
@Component("adminCookieValidator")
public class AdminCookieValidator implements AuthorizationValidator {
    protected final static XLogger LOGGER = XLoggerFactory.getXLogger(AdminCookieValidator.class);

	public interface AuthValidator {
        public boolean validate(HttpServletRequest request);
    }

    public class NoneValidator implements AuthValidator {
        public boolean validate(HttpServletRequest request) {
            return true;
        }
    }

    public class UnCheckValidator implements AuthValidator {
        public boolean validate(HttpServletRequest request) {
            AdminUserAuthInfoHolder user = AdminUserSessionUtil.buildUserAuthInfoFromCookie(request);
//            if (user != null) {
//                user.setClientIpAddress(IPUtil.getRequestIP(request));
//            }
            request.setAttribute(Constants.USER_AUTH_INFO_ATTR, user);
            return true;
        }
    }

    public class BasicValidator implements AuthValidator {
        public boolean validate(HttpServletRequest request) {
            AdminUserAuthInfoHolder user = AdminUserSessionUtil.buildUserAuthInfoFromCookie(request);
            if (user == null) {
                return false;
            }
//            user.setClientIpAddress(IPUtil.getRequestIP(request));
//            // 2. 检查是否有tokenId
//            if (StringUtils.isBlank(user.getSsoTokenId()) || user.getSsoUserId() == null) {
//                return false;
//            }
            // 3. 检查Cookies上记录数据的安全性
            if (!AdminUserSessionUtil.checkDataIntegrityOfUser(request)) {
                return false;
            }
            // 5. 构造UserAuthInfo对象，以便后续的业务使用
            request.setAttribute(Constants.USER_AUTH_INFO_ATTR, user);
            return true;
        }
    }

    public class StrictValidator implements AuthValidator  {
        public boolean validate(HttpServletRequest request) {
            AdminUserAuthInfoHolder user = AdminUserSessionUtil.buildUserAuthInfoFromCookie(request);
            if (user == null) {
                return false;
            }
//            user.setClientIpAddress(IPUtil.getRequestIP(request));
//            // 2. 检查是否有tokenId
//            if ((StringUtils.isBlank(user.getSsoTokenId())) || (user.getSsoUserId() == null)) {
//                return false;
//            }
//            // 3. 检查Cookies上记录数据的安全性
//            if (!AdminUserSessionUtil.checkDataIntegrityOfUser(request)) {
//                return false;
//            }
//            // 4. 到SSO服务器检测tokenId是否有效
//            if (!checkLoginStatus(user)) {
//                return false;
//            }
            // 5. 构造UserAuthInfo对象，以便后续的业务使用
            request.setAttribute(Constants.USER_AUTH_INFO_ATTR, user);
            return true;
        }
    }


    protected AuthValidator getAuthValidator(AuthLevel level){
        AuthValidator validator=new NoneValidator();
        if (AuthLevel.UNCHECK == level) {
            validator=new UnCheckValidator();
        }else if (AuthLevel.BASIC == level) {
            validator=new BasicValidator();
        }else if (AuthLevel.STRICT == level) {
            validator=new StrictValidator();
        }
        return validator;
    }
    
    @Override
    public boolean validate(HttpServletRequest request, AuthLevel level) {
        Assert.notNull(level);
        return getAuthValidator(level).validate(request);
    }

    protected boolean checkLoginStatus(UserAuthInfo user) {
        return true;
    }
}
