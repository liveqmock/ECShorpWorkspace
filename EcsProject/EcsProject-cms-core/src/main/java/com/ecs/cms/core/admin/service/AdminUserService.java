package com.ecs.cms.core.admin.service;

import com.ecs.cms.core.admin.model.EcsUserModel;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsers;

/**
 * 
 * <p>
 * 
 * @CLASS :AdminUserManager.java
 * @DESCRIPTION :管理员管理类
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年7月8日
 *       </p>
 * 
 */
public interface AdminUserService {

  EcsMgrUsers doUserLogin(String loginName, String password);

  void deleteUser(Integer id);

  EcsUserModel getMenuById(Integer id);

  void createUser(String userName, String password, String email, String mobile, Integer status, String memo);

  void updateUser(Integer id, String userName, String password, String email, String mobile, Integer status, String memo);

}
