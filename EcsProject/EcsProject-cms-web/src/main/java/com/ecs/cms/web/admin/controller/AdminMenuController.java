package com.ecs.cms.web.admin.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecs.cms.core.admin.model.EcsMenuModel;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrMenus;
import com.ecs.cms.core.admin.service.AdminMenuService;
import com.ecs.cms.web.constants.Constants;
import com.ecs.cms.web.mvc.annotation.AuthLevel;
import com.ecs.cms.web.mvc.annotation.AuthRequired;
import com.ecs.cms.web.mvc.view.JsonPackageWrapper;
import com.ecs.commons.model.Page;

@Controller
@AuthRequired(AuthLevel.STRICT)
@RequestMapping("/menu")
public class AdminMenuController {
  private static final XLogger LOGGER = XLoggerFactory.getXLogger(AdminMenuController.class);
  @Autowired
  AdminMenuService adminMenuService;

  @RequestMapping(value = "list", method = RequestMethod.GET)
  public String list(String menuName, Long menuStatus, Page<EcsMgrMenus> page, Model model) {
    return "manager/menu/list";
  }

  /**
   * 菜单
   * 
   * @param model
   */
  @RequestMapping(value = "jsonmenulist.json", method = RequestMethod.GET)
  public void jsonMenuList(String menuName, Long menuStatus, Model model) {
    try {
      // 加载符合条件的所有启用的菜单
      EcsMenuModel menuModel = adminMenuService.getMenuListAll();
      List<EcsMenuModel> menuList = new ArrayList<EcsMenuModel>();
      menuList.add(menuModel);
      model.addAttribute(Constants.JSON_MODEL_DATA, menuList);
    } catch (Exception e) {
      e.printStackTrace();
      LOGGER.error("查询菜单异常！", e);
    }
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
      this.adminMenuService.deleteMenu(id);
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
    EcsMenuModel menuModel = this.adminMenuService.getMenuById(id);
    model.addAttribute("editMenu", menuModel);
    return "manager/menu/create_menu";
  }

  @RequestMapping(value = "createMenu.json", method = RequestMethod.POST)
  public void createMenu(Integer id, Integer parentId, String menuName, String href, Integer status, String memo, Model model) {
    if (id != null) {
      this.updateMenu(id, parentId, menuName, href, status, memo, model);
    } else {
      JsonPackageWrapper json = new JsonPackageWrapper();
      json.setData("success");
      try {
        adminMenuService.createMenu(parentId, menuName, href, status, memo);
        model.addAttribute(Constants.JSON_MODEL_DATA, json);
      } catch (Exception e) {
        json.setScode(JsonPackageWrapper.S_ERR);
        model.addAttribute(Constants.JSON_MODEL_DATA, json);
      }
    }
  }

  @RequestMapping(value = "updateMenu.json", method = RequestMethod.POST)
  public void updateMenu(Integer id, Integer parentId, String menuName, String href, Integer status, String memo, Model model) {
    JsonPackageWrapper json = new JsonPackageWrapper();
    json.setData("success");
    LOGGER.info("menuName:" + menuName);
    try {
      adminMenuService.updateMenu(id, parentId, menuName, href, status, memo);
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    } catch (Exception e) {
      json.setScode(JsonPackageWrapper.S_ERR);
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    }
  }
}
