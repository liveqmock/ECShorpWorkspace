package com.ecs.manager.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecs.manager.core.admin.bo.EcsMgrMenusBo;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrUsers;
import com.ecs.manager.core.admin.service.AdminUserMenuService;
import com.ecs.manager.core.admin.service.AdminUserService;
import com.ecs.manager.web.annotation.AuthLevel;
import com.ecs.manager.web.annotation.AuthRequired;
import com.ecs.manager.web.constants.Constants;
import com.ecs.manager.web.util.SessionStoreUtil;
import com.ecs.manager.web.view.JsonPackageWrapper;

/**
 *************************************************************** 
 * <p>
 * 
 * @CLASS :LoginController.java
 * @DESCRIPTION : 登录
 * @AUTHOR :toney.li
 * @VERSION :v1.0
 * @DATE :Mar 23, 2013
 *       </p>
 **************************************************************** 
 */
@Controller
@AuthRequired(AuthLevel.NONE)
public class LoginController {
  private static final XLogger LOGGER = XLoggerFactory.getXLogger(LoginController.class);

  @Autowired
  AdminUserService adminUserService;
  @Autowired
  AdminUserMenuService adminUserMenuService;
  @Autowired
  private AdminUserMenuService adminUserMenuServcie;



  @RequestMapping(value = "login", method = RequestMethod.GET)
  public String login(String userName, String password, String serviceUrl, Model model) {
    return "login";
  }

  @RequestMapping(value = "login.json", method = RequestMethod.POST)
  public void login(String loginName, String password, Model model, HttpServletRequest request) {

    JsonPackageWrapper json = new JsonPackageWrapper();
    try {
      EcsMgrUsers user = adminUserService.doUserLogin(loginName, password);
      SessionStoreUtil.storeUserSession(request,user);
      if(user==null){
        json = new JsonPackageWrapper();
        json.setScode(JsonPackageWrapper.S_ERR);
        json.setSmsg("用户名或密码错误");
        model.addAttribute(Constants.JSON_MODEL_DATA, json);
      }
      List<EcsMgrMenusBo> userMenus=adminUserMenuServcie.getMenuListByUser(user.getId());
      SessionStoreUtil.storeMenuSession(request,userMenus);
      json = new JsonPackageWrapper();
      json.setSmsg("登录成功!");
    } catch (Exception e) {
      json = new JsonPackageWrapper();
      json.setScode(JsonPackageWrapper.S_ERR);
      json.setSmsg("系统发生异常！");
      LOGGER.error("用户登录请求失败！：", e);
    }
    model.addAttribute(Constants.JSON_MODEL_DATA, json);
    return ;
  }

}
