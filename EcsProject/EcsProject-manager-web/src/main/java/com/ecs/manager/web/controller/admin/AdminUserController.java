package com.ecs.manager.web.controller.admin;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecs.manager.core.admin.model.EcsUserModel;
import com.ecs.manager.core.admin.service.AdminUserService;
import com.ecs.manager.web.annotation.AuthLevel;
import com.ecs.manager.web.annotation.AuthRequired;
import com.ecs.manager.web.constants.Constants;
import com.ecs.manager.web.view.JsonPackageWrapper;

@Controller
@RequestMapping("/adminUser")
@AuthRequired(AuthLevel.STRICT)
public class AdminUserController {
  private static final XLogger LOGGER = XLoggerFactory.getXLogger(AdminUserController.class);
  
  @Autowired
  private AdminUserService adminUserService;

  @RequestMapping(value = "list", method = RequestMethod.GET)
  public String list(Model model) {

    return "manager/user/list";
  }

  @RequestMapping(value = "userlist.json", method = RequestMethod.GET)
  public void userList(Model model) {

    return;
  }
  

  @RequestMapping(value = "createMenu", method = RequestMethod.GET)
  public String createMenu(Model model) {
    return "manager/menu/create_menu";
  }

  @RequestMapping(value = "delete.json", method = RequestMethod.POST)
  public void delete(Integer id, Model model) {
    JsonPackageWrapper json = new JsonPackageWrapper();
    json.setData("success");
    try {
      this.adminUserService.deleteUser(id);
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    } catch (Exception e) {
      json.setScode(JsonPackageWrapper.S_ERR);
      json.setSmsg(e.getMessage());
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    }
    return;
  }

  @RequestMapping(value = "edit", method = RequestMethod.GET)
  public String edit(Integer id, Model model) {
    EcsUserModel menuModel = this.adminUserService.getMenuById(id);
    model.addAttribute("editMenu", menuModel);
    return "manager/menu/create_menu";
  }

  @RequestMapping(value = "createMenu.json", method = RequestMethod.POST)
  public void createMenu(Integer status, String mobile, String email, String password, String userName, String memo, Model model) {
    JsonPackageWrapper json = new JsonPackageWrapper();
    json.setData("success");
    try {
      adminUserService.createUser(userName,password,email,mobile,status, memo);
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    } catch (Exception e) {
      json.setScode(JsonPackageWrapper.S_ERR);
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    }
    return;
  }

  @RequestMapping(value = "updateUser.json", method = RequestMethod.POST)
  public void updateMenu(Integer id, Integer status, String mobile, String email, String password, String userName, String memo, Model model) {
    JsonPackageWrapper json = new JsonPackageWrapper();
    json.setData("success");
    try {
      adminUserService.updateUser(id, userName,password,email,mobile,status, memo);
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    } catch (Exception e) {
      json.setScode(JsonPackageWrapper.S_ERR);
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    }
    return;
  }
}
