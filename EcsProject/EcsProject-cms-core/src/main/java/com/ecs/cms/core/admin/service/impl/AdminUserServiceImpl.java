package com.ecs.cms.core.admin.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.cms.core.admin.model.EcsUserModel;
import com.ecs.cms.core.admin.mybatis.mapper.EcsMgrUsersMapper;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsers;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsersCriteria;
import com.ecs.cms.core.admin.service.AdminUserMenuService;
import com.ecs.cms.core.admin.service.AdminUserService;
import com.ecs.commons.exception.ExceptionFactory;

/**
 * 
 * <p>
 * 
 * @CLASS :AdminUserManagerImpl.java
 * @DESCRIPTION :@see {@link AdminUserService}
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年7月8日
 *       </p>
 * 
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
  private static final XLogger LOGGER = XLoggerFactory.getXLogger(AdminUserServiceImpl.class);

  @Autowired
  EcsMgrUsersMapper ecsMgrUsersMapper;
  
  @Autowired
  AdminUserMenuService adminUserMenuManager;

  /*
   * (non-Javadoc)
   * 
   * @see com.ecs.manager.core.admin.service.AdminUserManager#doUserLogin(java.lang.String,
   * java.lang.String)
   */
  @Override
  public EcsMgrUsers doUserLogin(String loginName, String password) {
    EcsMgrUsersCriteria example = new EcsMgrUsersCriteria();
    example.createCriteria().andUsernameEqualTo(loginName).andPasswordEqualTo(password);
    List<EcsMgrUsers> userList = ecsMgrUsersMapper.selectByExample(example);
    if (CollectionUtils.isEmpty(userList)) {
      return null;
    }
    if (CollectionUtils.size(userList) > 1) {
      LOGGER.info("找到两个用户名密码一样的用户 loginName :{} password :{} ",new Object[]{loginName,password});
      throw ExceptionFactory.buildBusinessException("", "用户必须是唯一的");
    }
    EcsMgrUsers user=userList.get(0);
    return user;
  }

  @Override
  public void deleteUser(Integer id) {
    
  }

  @Override
  public EcsUserModel getMenuById(Integer id) {
    return null;
  }

  @Override
  public void createUser(String userName, String password, String email, String mobile, Integer status, String memo) {
    
  }

  @Override
  public void updateUser(Integer id, String userName, String password, String email, String mobile, Integer status, String memo) {
    
  }

}
