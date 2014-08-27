package com.ecs.cms.core.admin.dao;

import java.util.List;
import java.util.Map;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsers;

public interface UserDao {
    EcsMgrUsers getUser(Integer id);

    EcsMgrUsers getUserByUsername(String username);

    int addUser(EcsMgrUsers user);

    int updateUser(EcsMgrUsers user);

    int deleteUser(Integer id);
    
    /**
     * 查询用户(分页)
     * @param map
     * @return
     */
    public List<EcsMgrUsers> getUserListAll(Map<Object,Object> map);
    
    /**
     * 获得总记录条数
     * @param map
     * @return
     */
    public String getUserTotalCount(Map<Object,Object> map);
    
    /**
     * 查询所有用户
     * @return
     */
    public List<EcsMgrUsers> getUserList();
    
    /**
     * 修改用户的状态
     * @param map
     * @return
     */
    public int updateUserStatus(Map<Object,Object> map);
    
    public int updateUserVersion(Integer id);
    /**
	 * 获得用户系列
	 * @return
	 */
	//public long getUserSEQ();
	
	/**
	 * 修改用户密码
	 * @param map
	 * @return
	 */
	public int updateUserPwd(Map<Object,Object> map);
	
}
