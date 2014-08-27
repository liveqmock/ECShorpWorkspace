package com.ecs.cms.core.admin.service;
import java.util.List;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUserRole;
/**
 * 
 * <p>
 * 
 * @CLASS :UserRoleService.java
 * @DESCRIPTION :
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年6月21日
 *       </p>
 * 
 */
public interface UserRoleService {
    
	/**
	 * 根据用户Id查询对应的
	 * @param id
	 * @return
	 */
    public List<EcsMgrUserRole> getUserRolebyuserId(Integer userId);
	
   
    
}
