package com.ecs.cms.core.admin.dao;

import java.util.List;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUserRole;
/**
 * 用户对应角色  2013.06.05
 * @author haijun.chen@xiu.com
 */
public interface UserRoleDao {
	
	/**
	 *  保存用户--角色 对应权限
	 * @param menu
	 */
	void addUserRole(EcsMgrUserRole userRole);
	
	/**
	 * 根据用户ID查询
	 * @param roleId
	 * @return
	 */
	public List<EcsMgrUserRole> getUserRolebyuserId(Integer userId);
	
	/**
	 * 根据用户Id删除 对应的角色
	 * @param roleId
	 * @return
	 */
	public int deleteUserRole(Integer userId);
}
