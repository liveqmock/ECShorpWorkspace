package com.ecs.cms.web.admin.interceptor.validator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.ecs.cms.core.admin.AdminUserService;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsers;
import com.ecs.cms.web.admin.utils.AdminSessionUtil;
import com.ecs.cms.web.admin.validator.AuthorizationValidator;
import com.ecs.cms.web.mvc.annotation.AuthLevel;

@Component("adminCookie")
public class AdminCookieValidator implements AuthorizationValidator {
  @Autowired
  private AdminUserService adminUserService;

  @Override
  public boolean validate(HttpServletRequest request, AuthLevel level) {
    Assert.notNull(level);
    if (AuthLevel.NONE == level) {
      return true;
    }
    EcsMgrUsers user = AdminSessionUtil.getUser(request);
    if (user == null) {
      return false;
    }
    EcsMgrUsers user2 = adminUserService.getUser(user.getId());
    if (!user.getVersion().equals(user2.getVersion())) {
      return false;
    }
    return true;
  }

}
