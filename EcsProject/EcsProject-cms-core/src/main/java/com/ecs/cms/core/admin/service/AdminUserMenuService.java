package com.ecs.cms.core.admin.service;

import java.util.List;

import com.ecs.cms.core.admin.bo.EcsMgrMenusBo;

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
public interface AdminUserMenuService {

  List<EcsMgrMenusBo> getMenuListByUser(Integer userId);

  List<EcsMgrMenusBo> queryMenuListByUser(Integer userId);

}
