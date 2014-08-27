package com.ecs.cms.web.admin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecs.cms.core.admin.MenuService;
import com.ecs.cms.core.admin.AdminUserService;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrMenus;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsers;
import com.ecs.cms.web.admin.constants.Constants;
import com.ecs.cms.web.admin.utils.AdminSessionUtil;
import com.ecs.cms.web.mvc.view.JsonPackageWrapper;

/**
 * @CLASS :com.xiu.recommend.web.controller.LoginController
 * @DESCRIPTION :
 * @AUTHOR :haijun.chen@xiu.com
 * @VERSION :v1.0
 * @DATE :2013-05-29 上午10:07:08
 */
@Controller
@RequestMapping(value = { "/admin/login", "/", "" })
public class AdminLoginController {

    // 日志
    private static final XLogger LOGGER = XLoggerFactory.getXLogger(AdminLoginController.class);

    @Autowired
    private AdminUserService adminUserService;

    @Autowired
    private MenuService menuService;

    /**
     * 登录页面加载
     * 
     * @Title: index
     * @Description:
     * @param deliveryAddress
     * @return String
     * @throws
     */
    @RequestMapping(value = { "index", "/", "" }, method = RequestMethod.GET)
    public String index(Model model) {
        return "admin/login/index";
    }

    /**
     * 用户登录检验
     * 
     * @param loginName
     * @param password
     * @param model
     * @return
     */
    @RequestMapping(value = "check", method = RequestMethod.POST, produces = "application/json", params = "format=json")
    public String check(HttpServletRequest request, HttpServletResponse response, String loginName, String password,
            Model model) {
        JsonPackageWrapper json = new JsonPackageWrapper();
        Map<Object, Object> uMap = new HashMap<Object, Object>();
        List<EcsMgrMenus> menulist = new ArrayList<EcsMgrMenus>();
        try {
            uMap = adminUserService.check_loginUser(loginName, password);
            EcsMgrUsers user = (EcsMgrUsers) uMap.get("user");// 获得用户对象
            if (user != null) {
         
                menulist = menuService.getMenuListByUser(user);// 加载当前用户拥有的权限菜单
                adminUserService.updateUserVersion(user.getId());
                user = adminUserService.getUser(user.getId());
                AdminSessionUtil.setUser(request,response, user);
                AdminSessionUtil.setMenuList(request,response, menulist);

            }
            json.setScode(uMap.get("sCode").toString());
            json.setData(uMap.get("data"));
        } catch (Exception e) {
            json.setScode(JsonPackageWrapper.S_ERR);
            json.setSmsg("系统发生异常！");
            LOGGER.error("用户登录请求失败！：", e);
        }
        model.addAttribute(Constants.JSON_MODEL_DATA, json);
        return "";
    }
}
