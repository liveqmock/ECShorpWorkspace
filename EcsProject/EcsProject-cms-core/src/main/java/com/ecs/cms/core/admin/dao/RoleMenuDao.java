package com.ecs.cms.core.admin.dao;
import java.util.List;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoleMenu;
/**
 * 角色对应菜单  2013.06.05
 * @author haijun.chen@xiu.com
 */
public interface RoleMenuDao {
	
	/**
	 *  保存角色--菜单 对应权限
	 * @param menu
	 */
	void addRoleMenu(EcsMgrRoleMenu roleMenu);
	
	/**
	 * 根据角色ID查询
	 * @param roleId
	 * @return
	 */
	public List<EcsMgrRoleMenu> getRoleMenubyroleId(Integer roleId);
	
	
	/**
	 * 根据角色Id删除 对应权限
	 * @param roleId
	 * @return
	 */
	public int deleteRoleMenu(Integer roleId);
	
}
