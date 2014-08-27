package com.ecs.cms.core.admin.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.ecs.cms.core.admin.bo.EcsMgrMenusBo;
import com.ecs.cms.core.admin.constants.ErrConstants;
import com.ecs.cms.core.admin.mybatis.mapper.EcsMgrMenusMapper;
import com.ecs.cms.core.admin.mybatis.mapper.EcsMgrRoleMenuMapper;
import com.ecs.cms.core.admin.mybatis.mapper.EcsMgrRolesMapper;
import com.ecs.cms.core.admin.mybatis.mapper.EcsMgrUserRoleMapper;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrMenus;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrMenusCriteria;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoleMenu;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoleMenuCriteria;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUserRole;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUserRoleCriteria;
import com.ecs.cms.core.admin.service.AdminMenuCacheService;
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
public class AdminUserMenuServiceImpl implements AdminUserMenuService {
  private static final XLogger LOGGER = XLoggerFactory.getXLogger(AdminUserMenuServiceImpl.class);


  @Autowired
  EcsMgrRolesMapper ecsMgrRolesMapper;
  @Autowired
  EcsMgrUserRoleMapper ecsMgrUserRoleMapper;
  @Autowired
  EcsMgrRoleMenuMapper ecsMgrRoleMenuMapper;
  @Autowired
  EcsMgrMenusMapper ecsMgrMenusMapper;
  @Autowired
  AdminMenuCacheService adminMenuCacheService;

  @SuppressWarnings("unchecked")
  @Override
  public List<EcsMgrMenusBo> getMenuListByUser(Integer userId) {
    List<EcsMgrMenusBo> userMenuList = new ArrayList<EcsMgrMenusBo>();
    Object obj = adminMenuCacheService.get(userId);
    if (obj != null) {
      userMenuList = (List<EcsMgrMenusBo>) obj;
      return userMenuList;
    }
    userMenuList = this.queryMenuListByUser(userId);
    adminMenuCacheService.put(userId, userMenuList);
    return userMenuList;
  }

  /**
   * 加载符合当前登录用户有权限的菜单 (状态:启用)
   */
  @Override
  public List<EcsMgrMenusBo> queryMenuListByUser(Integer userId) {
    Assert.notNull(userId);
    Set<Integer> menuIdlist = new HashSet<Integer>();
    try {
      EcsMgrUserRoleCriteria example = new EcsMgrUserRoleCriteria();
      example.createCriteria().andUserIdEqualTo(userId);
      // 根据用户Id,查找当前用户对应的角色
      List<EcsMgrUserRole> urlist = ecsMgrUserRoleMapper.selectByExample(example);
      if (CollectionUtils.isEmpty(urlist)) {
        return null;
      }
      // 查询角色所有的权限菜单Id
      for (EcsMgrUserRole ur : urlist) {
        Set<Integer> tmp = getMenuIdByRoleId(ur.getRoleId());
        if (tmp != null && tmp.size() > 0) {
          menuIdlist.addAll(tmp);
        }
      }
      if (CollectionUtils.isEmpty(menuIdlist)) {
        return null;
      }
      List<EcsMgrMenusBo> boList = new ArrayList<EcsMgrMenusBo>();
      // 循环获取菜单
      Map<Integer, Integer> existMap = new HashMap<Integer, Integer>();
      for (Integer mId : menuIdlist) {
        getMenuListByMenuId(mId, boList, existMap);
      }
      return boList;

    } catch (Throwable e) {
      LOGGER.error("加载菜单异常！", e);
      throw ExceptionFactory.buildBusinessException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR, "加载菜单异常！！", e);
    }
  }

  private void getMenuListByMenuId(Integer mId, List<EcsMgrMenusBo> boList, Map<Integer, Integer> existMap) {
    if (existMap.containsKey(mId)) {
      return;
    }
    // 根据菜单的ID,查找一级菜单
    EcsMgrMenus mu = ecsMgrMenusMapper.selectByPrimaryKey(mId);
    EcsMgrMenusBo bo = new EcsMgrMenusBo();
    bo.setEcsMgrMenus(mu);
    if (mu != null) {
      // 根据一级菜单的ID，查找该菜单目录下面的子菜单
      EcsMgrMenusCriteria criteria = new EcsMgrMenusCriteria();
      criteria.createCriteria().andParentidEqualTo(mu.getId());
      List<EcsMgrMenus> mtlist = ecsMgrMenusMapper.selectByExample(criteria);
      for (int i = 0; CollectionUtils.isNotEmpty(mtlist) && i < mtlist.size(); i++) {
        EcsMgrMenus menu = mtlist.get(i);
        if (existMap.containsKey(menu.getId())) {
          mtlist.remove(i);
          i--;
        }
        existMap.put(menu.getId(), menu.getId());
      }
      bo.setChildrenMenus(mtlist);
    }
    boList.add(bo);
  }

  private Set<Integer> getMenuIdByRoleId(Integer roleId) {
    EcsMgrRoleMenuCriteria c = new EcsMgrRoleMenuCriteria();
    c.createCriteria().andRoleIdEqualTo(roleId);
    // 根据用户角色,查找用户对应的 权限菜单
    List<EcsMgrRoleMenu> rmlist = ecsMgrRoleMenuMapper.selectByExample(c);
    if (CollectionUtils.isEmpty(rmlist)) {
      return null;
    }
    Set<Integer> set = new HashSet<Integer>();
    for (EcsMgrRoleMenu rm : rmlist) {
      set.add(rm.getMenuId());
    }
    return set;
  }
}
