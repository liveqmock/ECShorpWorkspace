package com.ecs.cms.core.admin.service;

import java.util.List;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUserUsergroup;
/** 
 *************************************************************** 
 * <p>
 * @DESCRIPTION : 
 * @AUTHOR : haijun.chen@xiu.com 
 * @DATE :2013-06-07
 * </p>
 **************************************************************** 
 */
public interface UserUserGroupService {
    
	/**
	 * 根据用户组Id查询对应的用户组
	 * @param id
	 * @return
	 */
    public List<EcsMgrUserUsergroup> getUserUserGroupbyuserId(Long userGroupId);
	
   
    
}
