package com.ecs.cms.core.admin.dao;

import java.util.List;
import java.util.Map;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsergroup;

/**
 * 用户组  2013.06.06
 * @author haijun.chen@xiu.com
 */
public interface UserGroupDao {
	
	/**
	 * 根据用户组ID查询用户组
	 * @param id
	 * @return
	 */
	public EcsMgrUsergroup getUserGroupById(Long id);
	/**
	 * 查询用户组
	 * @param map
	 * @return
	 */
	public List<EcsMgrUsergroup> getUserGroupListAll(Map<Object,Object> map);
	/**
	 * 获得总记录数
	 * @param map
	 * @return
	 */
	public String getUserGroupTotalCount(Map<Object,Object> map);
	
	/**
	 * 根据用户组的名称查询
	 * @param userGroupName
	 * @return
	 */
	public EcsMgrUsergroup getUserGroupByuserGroupName(String userGroupName);
	
	/**
	 * 获得用户组系列
	 * @return
	 */
	public Integer getUserGroupSEQ();
	
	/**
	 * 添加用户组
	 * @param userGroup
	 */
    int addUserGroup(EcsMgrUsergroup userGroup);
    
    /**
	 * 修改用户组的状态
	 * @param map
	 * @return
	 */
	public int updateUserGroupStatus(Map<Object,Object> map);
	
	/**
	 * 修改用户组
	 * @param userGroup
	 * @return
	 */
	public int updateUserGroup(EcsMgrUsergroup userGroup);
}
