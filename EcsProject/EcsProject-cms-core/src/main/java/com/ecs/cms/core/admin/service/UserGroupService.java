package com.ecs.cms.core.admin.service;

import java.util.List;
import java.util.Map;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsergroup;
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
public interface UserGroupService {
    
	 /**
     * 查询用户组(分页)
     * @param map
     * @return
     */
    public List<EcsMgrUsergroup> getUserGroupListAll(Map<Object,Object> map,Page<?> page);
	
    /**
     * 保存用户组
     * @param usergroup
     * @param user_usergroup
     * @return
     */
    public int save(EcsMgrUsergroup usergroup,String user_usergroup);
    
    /**
     * 修改用户组的状态
     * @param map
     * @return
     */
    public int updateUserGroupStatus(Map<Object,Object> map);
    
    /**
     * 根据用户组ID查询用户组
     */
    public EcsMgrUsergroup getUserGroup(Long id);
    
    /**
     * 修改用户组
     * @param usergroup
     * @param user_usergroup
     * @param olduserGroupName
     * @return
     */
    public int update(EcsMgrUsergroup usergroup,String user_usergroup,String olduserGroupName);
   
    
}
