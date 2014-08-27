package com.ecs.cms.core.admin.dao;

import java.util.List;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUserUsergroup;

/**
 * 用户组  2013.06.06
 * @author haijun.chen@xiu.com
 */
public interface UserUserGroupDao {
	
	/**
	 * 添加用户--用户组对应关系
	 * @param userGroup
	 */
    void addUserUserGroup(EcsMgrUserUsergroup userUserGroup);
    
    /**
     * 根据用户组的Id查询用户--用户组信息
     * @param userGroupId
     * @return
     */
    public List<EcsMgrUserUsergroup> getUserUserGroupByusergroupId(Long userGroupId);
    
    /**
     * 删除用户--用户组对应的关系数据
     * @param userGroupId
     * @return
     */
    public int deleteUserUserGroup(Integer userGroupId);
}
