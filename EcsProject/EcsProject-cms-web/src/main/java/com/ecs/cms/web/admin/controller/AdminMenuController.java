package com.ecs.cms.web.admin.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecs.cms.core.admin.MenuService;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrMenus;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsers;
import com.ecs.cms.web.admin.constants.Constants;
import com.ecs.cms.web.admin.utils.AdminUserAuthInfoHolder;
import com.ecs.cms.web.admin.utils.AdminSessionUtil;
import com.ecs.cms.web.mvc.annotation.AuthRequired;
import com.ecs.cms.web.mvc.view.JsonPackageWrapper;
import com.ecs.commons.model.Page;
/**
 * @CLASS :com.xiu.recommend.web.controller.MenuController
 * @DESCRIPTION :
 * @AUTHOR :haijun.chen@xiu.com
 * @VERSION :v1.0
 * @DATE :2013-05-29 上午10:07:08
 */
@AuthRequired
@Controller
@RequestMapping(value = "/admin/menu")
public class AdminMenuController {
	
	//日志
    private static final XLogger LOGGER = XLoggerFactory.getXLogger(AdminMenuController.class);
	@Autowired
	private MenuService menuService;
   
   
    /**
     * 首页--左边菜单--内容
     * @param model
     * @return
     */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "menu_left_bot", method = RequestMethod.GET)
    public String menu_left_bot(HttpServletRequest request,Model model) {
    	//从session中获取菜单权限信息
		//List<Menu> menulist=(List<Menu>) request.getSession().getAttribute("menulist");
		List menulist=AdminSessionUtil.getMenu(request);
    	model.addAttribute("menulist",menulist);
        return "admin/menu/menu_left_bot";
    }
    
    /**
     * 菜单管理--查询菜单
     * @param model
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(String menu_name,Long menu_status,Page<?> page,Model model) {
    	List<EcsMgrMenus> menulist=new ArrayList<EcsMgrMenus>();
    	Map<Object,Object> map=new HashMap<Object, Object>();
    	page.setPageNo(page.getPageNo() == 0 ? 1 : page.getPageNo());
    	try {
    		//加载符合条件的所有启用的菜单
    		map.put("menu_name",menu_name);
    		map.put("status", menu_status);
    		menulist=menuService.getMenuListAll(map,page);
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("查询菜单异常！",e);
		}
    	model.addAttribute("menulist",menulist);
    	model.addAttribute("menu_name",menu_name);
    	model.addAttribute("menu_status",menu_status);
        return "admin/menu/list";
    }
    
    /**
     * 添加菜单--界面加载
     * @param menu_name
     * @param menu_status
     * @param model
     * @return
     */
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String create(String menu_name,Long menu_status,Model model) {
    	List<EcsMgrMenus> menulist=new ArrayList<EcsMgrMenus>();
    	try {
    		menulist=menuService.getOneMenuList();
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("查询菜单异常！",e);
		}
    	model.addAttribute("menu_name",menu_name);
    	model.addAttribute("menu_status",menu_status);
    	model.addAttribute("menulist",menulist);
        return "admin/menu/create";
    }
    
    /**
     * 菜单管理--添加菜单--保存
     * @param menu
     * @param model
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST, produces = "application/json", params = "format=json")
    public String save(EcsMgrMenus menu,Model model) {
    	JsonPackageWrapper json = new JsonPackageWrapper();
    	try {
    		 menu.setCreateDt(new Date());
    		 int result=menuService.save(menu);
    		 if(result==0){
    			 json.setScode(JsonPackageWrapper.S_OK);
    			 json.setData("菜单保存成功！");
    		 }else if(result==1){
    			 json.setScode(JsonPackageWrapper.S_ERR);
    			 json.setData("菜单名称已经存在！");
    		 }else{
    			 json.setScode(JsonPackageWrapper.S_ERR);
    			 json.setData("菜单保存失败！");
    		 }
		} catch (Exception e) {
			json.setScode(JsonPackageWrapper.S_ERR);
            json.setSmsg("系统发生异常！");
            LOGGER.error("用户添加菜单失败！：", e);
		}
    	model.addAttribute(Constants.JSON_MODEL_DATA, json);
        return "";
    }
    
    /**
     * 菜单管理--编辑菜单--界面加载
     * @param menu_name
     * @param menu_status
     * @param model
     * @return
     */
    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(Integer id,String menu_name,Long menu_status,Model model) {
    	List<EcsMgrMenus> menulist=new ArrayList<EcsMgrMenus>();
    	EcsMgrMenus menu=new EcsMgrMenus();
    	try {
    		menu=menuService.getMenu(id);
    		menulist=menuService.getOneMenuList();
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("查询菜单异常！",e);
		}
    	model.addAttribute("menu_name",menu_name);
    	model.addAttribute("menu_status",menu_status);
    	model.addAttribute("menu",menu);
    	model.addAttribute("menulist",menulist);
        return "admin/menu/edit";
    }
    
    /**
     * 菜单管理--编辑菜单--修改菜单
     * @param menu
     * @param model
     * @return
     */
    @RequestMapping(value = "edit", method = RequestMethod.POST, produces = "application/json", params = "format=json")
    public String edit(EcsMgrMenus menu,String oldmenuName,Model model) {
    	JsonPackageWrapper json = new JsonPackageWrapper();
    	try {
    		 int result=menuService.update(menu,oldmenuName);//保存数据
    		 if(result==0){
    			 json.setScode(JsonPackageWrapper.S_OK);
    			 json.setData("菜单修改成功！");
    		 }else if(result==1){
    			 json.setScode(JsonPackageWrapper.S_ERR);
    			 json.setData("菜单名称已经存在！");
    		 }else{
    			 json.setScode(JsonPackageWrapper.S_ERR);
    			 json.setData("菜单修改失败！");
    		 }
		} catch (Exception e) {
			json.setScode(JsonPackageWrapper.S_ERR);
            json.setSmsg("系统发生异常！");
            LOGGER.error("用户修改菜单失败！：", e);
		}
    	model.addAttribute(Constants.JSON_MODEL_DATA, json);
        return "";
    }
    
    /**
     * 菜单管理--修改菜单的状态(status: 1 启用 , 0 停用 )
     * @param id
     * @param status
     * @param model
     * @return
     */
    @RequestMapping(value = "updatestatus", method = RequestMethod.POST, produces = "application/json", params = "format=json")
    public String updatestatus(Long id,Long status,Model model) {
    	JsonPackageWrapper json = new JsonPackageWrapper();
    	Map<Object,Object> map=new HashMap<Object, Object>();
    	try {
    		 map.put("id", id);
    		 map.put("status", status);
    		 if(menuService.updateStatus(map)==0){
    			 json.setScode(JsonPackageWrapper.S_OK);
                 json.setData("修改菜单状态成功！");
    		 }else{
    			 json.setScode(JsonPackageWrapper.S_ERR);
                 json.setData("修改菜单状态失败！");
    		 }
		} catch (Exception e) {
			json.setScode(JsonPackageWrapper.S_ERR);
            json.setSmsg("系统发生异常！");
            LOGGER.error("修改菜单状态失败！：", e);
		}
    	model.addAttribute(Constants.JSON_MODEL_DATA, json);
        return "";
    }
    
    
    /**
     * 登录成功后，跳转到主页面
     * @param model
     * @return
     */
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(Model model) {
      //String value=SpringResourceLocator.getConfiguration().getString("sms.identifying_code_expired_minute");
        return "admin/menu/index";
    }
    
    /**
     * 首页--主界面
     * @param model
     * @return
     */
    @RequestMapping(value = "menu_main", method = RequestMethod.GET)
    public String menu_main(Model model) {
        return "admin/menu/menu_main";
    }
    /**
     * 首页--主界面页头
     * @param model
     * @return
     */
    @RequestMapping(value = "menu_top", method = RequestMethod.GET)
    public String menu_top(Model model) {
    	//从Session中获取用户信息
    	EcsMgrUsers user=AdminUserAuthInfoHolder.getAdminUserAuthInfo();
        model.addAttribute("user", user);
        return "admin/menu/menu_top";
    }
    /**
     * 首页--左边菜单
     * @param model
     * @return
     */
    @RequestMapping(value = "menu_left", method = RequestMethod.GET)
    public String menu_left(Model model) {
        return "admin/menu/menu_left";
    }
    /**
     * 首页--左边菜单--页头
     * @param model
     * @return
     */
    @RequestMapping(value = "menu_left_top", method = RequestMethod.GET)
    public String menu_left_top(Model model) {
        return "admin/menu/menu_left_top";
    }
    /**
     * 首页--左边菜单--收起（隐藏）
     * @param model
     * @return
     */
    @RequestMapping(value = "menu_center", method = RequestMethod.GET)
    public String menu_center(Model model) {
        return "admin/menu/menu_center";
    }
    /**
     * 首页--右侧公共页脚
     * @param model
     * @return
     */
    @RequestMapping(value = "menu_bottom", method = RequestMethod.GET)
    public String menu_bottom(Model model) {
        return "admin/menu/menu_bottom";
    }
}
