package com.ecs.cms.core.admin.dao;

import java.util.List;
import java.util.Map;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoles;
/**
 * 角色管理 2013.06.04
 * @author haijun.chen@xiu.com
 */
public interface RoleDao {
	
	/**
	 * 根据角色ID查询
	 * @param id
	 * @return
	 */
	public EcsMgrRoles getRoleById(Integer id);
	
	/**
	 * 查询角色(状态:启用、停用)，带分页
	 * @return
	 */
	public List<EcsMgrRoles> getRoleListAll(Map<Object,Object> map);
	/**
	 * 查询所有角色
	 * @return
	 */
	public List<EcsMgrRoles> getRoleList();
	/**
	 * 总记录数量
	 * @param map
	 * @return
	 */
	public String getRoleTotalCount(Map<Object,Object> map);
	
	/**
	 * 修改角色的状态
	 * @param map
	 * @return
	 */
	public int updateRoleStatus(Map<Object,Object> map);
	
	/**
	 * 根据角色名称查询
	 * @param roleName
	 * @return
	 */
	public EcsMgrRoles getRoleByroleName(String roleName);
	
	/**
	 * 保存角色
	 * @param role
	 */
	int addRole(EcsMgrRoles role);
	
	/**
	 * 修改角色
	 * @param role
	 */
	int updateRole(EcsMgrRoles role);
	
	/**
	 * 获得角色系列
	 * @return
	 */
	//public long getRoleSEQ();
}
