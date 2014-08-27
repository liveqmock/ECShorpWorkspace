package com.ecs.cms.core.admin.service;

import java.util.List;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoleMenu;
/** 
 *************************************************************** 
 * <p>
 * @DESCRIPTION : 
 * @AUTHOR : haijun.chen@xiu.com 
 * @DATE :2013-06-04
 * </p>
 **************************************************************** 
 */
public interface RoleMenuService {
    
	/**
	 * 根据角色Id查询
	 * @param id
	 * @return
	 */
    public List<EcsMgrRoleMenu> getRoleMenubyroleId(Integer roleId);
	
   
    
}
