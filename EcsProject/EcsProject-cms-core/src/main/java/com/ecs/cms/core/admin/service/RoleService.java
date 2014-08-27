package com.ecs.cms.core.admin.service;

import java.util.List;
import java.util.Map;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoles;
import com.ecs.commons.model.Page;
/** 
 *************************************************************** 
 * <p>
 * @DESCRIPTION : 
 * @AUTHOR : haijun.chen@xiu.com 
 * @DATE :2013-06-04
 * </p>
 **************************************************************** 
 */
public interface RoleService {
    
	/**
	 * 根据角色Id查询
	 * @param id
	 * @return
	 */
    public EcsMgrRoles getRolebyId(Integer id);
	
    /**
     * 查询角色 (查询角色 (状态:启用、停用)
     * @param map
     * @return
     */
    public List<EcsMgrRoles> getRoleListAll(Map<Object,Object> map,Page<?> page);
    
    /**
     * 查询所有
     * @return
     */
    public List<EcsMgrRoles> getRoleList();
    
    /**
     * 修改角色的状态
     * @param map
     * @return
     */
    public int updateRoleStatus(Map<Object,Object> map);
    
    /**
     * 添加--保存角色
     * @param role
     * @param role_menu
     * @return
     */
    public int save(EcsMgrRoles role,String role_menu);
    
    /**
     * 角色--修改
     * @param role
     * @param role_menu
     * @param oldroleName
     * @return
     */
    public int update(EcsMgrRoles role,String role_menu,String oldroleName);
    
}
