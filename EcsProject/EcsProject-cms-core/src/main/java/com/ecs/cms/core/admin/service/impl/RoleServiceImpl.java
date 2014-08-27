package com.ecs.cms.core.admin.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.cms.core.admin.dao.RoleDao;
import com.ecs.cms.core.admin.dao.RoleMenuDao;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoleMenu;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoles;
import com.ecs.cms.core.admin.service.RoleService;
import com.ecs.cms.core.constants.ErrConstants;
import com.ecs.commons.exception.ExceptionFactory;
import com.ecs.commons.model.Page;

/**
 * 
 * <p>
 * 
 * @CLASS :RoleServiceImpl.java
 * @DESCRIPTION :
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年6月21日
 *       </p>
 * 
 */
@Transactional
@Service("roleService")
public class RoleServiceImpl implements RoleService {

  // 日志
  private static final XLogger LOGGER = XLoggerFactory.getXLogger(RoleServiceImpl.class);

  @Autowired
  private RoleDao roleDao;

  @Autowired
  private RoleMenuDao roleMenuDao;

  /**
   * 查询角色 (状态:启用、停用)
   */
  @Override
  public List<EcsMgrRoles> getRoleListAll(Map<Object, Object> map, Page<?> page) {
    List<EcsMgrRoles> rolelist = new ArrayList<EcsMgrRoles>();
    try {
      int pageMax = page.getPageNo() * page.getPageSize();
      int pageMin = 1;
      if (page.getPageNo() != 1) {
        pageMin = (pageMax - (page.getPageNo() - 1) * page.getPageSize()) + 1;
      }
      map.put("pageMin", pageMin - 1);
      map.put("pageSize", page.getPageSize());
      map.put("pageMax", pageMax);

      // 获得分页列表
      rolelist = roleDao.getRoleListAll(map);
      // 获取总记录数
      Long totalCount = Long.parseLong(roleDao.getRoleTotalCount(map));
      page.setTotalCount(Integer.valueOf(String.valueOf(totalCount)));
    } catch (Throwable e) {
      LOGGER.error("查询角色信息异常！", e);
      throw ExceptionFactory.buildBusinessException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR,
          "查询角色信息异常！", e);
    }
    return rolelist;
  }

  /**
   * 修改角色的状态
   */
  @Override
  public int updateRoleStatus(Map<Object, Object> map) {
    int result = 0;
    try {
      if (roleDao.updateRoleStatus(map) > 0) {
        result = 0;
      } else {
        result = -1;
      }
    } catch (Throwable e) {
      result = -1;
      LOGGER.error("修改角色状态失败！", e);
      throw ExceptionFactory.buildBusinessException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR,
          "修改角色状态失败！", e);
    }
    return result;
  }

  /**
   * 添加--保存角色
   */
  @Override
  public int save(EcsMgrRoles role, String role_menu) {
    int result = 0;
    try {
      // 根据角色名称查询，判断角色名称是否已经存在
      EcsMgrRoles r = roleDao.getRoleByroleName(role.getRoleName());
      if (r != null) {
        result = 1;
      } else {
        // 保存角色
        roleDao.addRole(role);
        // 保存角色对应菜单的权限
        if (!"".equals(role_menu)) {
          if (role_menu.indexOf(",") != -1) {
            String[] menuIds = role_menu.split(",");
            if (menuIds.length > 0) {
              for (String menuId : menuIds) {
                EcsMgrRoleMenu rm = new EcsMgrRoleMenu();
                rm.setMenuId(Integer.valueOf(menuId));
                rm.setRoleId(role.getId());
                rm.setCreateDt(new Date());
                roleMenuDao.addRoleMenu(rm);
              }
            }
          } else {
            EcsMgrRoleMenu rm = new EcsMgrRoleMenu();
            rm.setMenuId(Integer.valueOf(role_menu));
            rm.setRoleId(role.getId());
            rm.setCreateDt(new Date());
            roleMenuDao.addRoleMenu(rm);
          }
        }
        result = 0;
      }
    } catch (Throwable e) {
      result = -1;
      LOGGER.error("添加角色失败！", e);
      throw ExceptionFactory.buildBusinessException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR,
          "添加角色失败！", e);
    }
    return result;
  }

  /**
   * 根据角色Id查询
   */
  @Override
  public EcsMgrRoles getRolebyId(Integer id) {
    try {
      return roleDao.getRoleById(id);
    } catch (Throwable e) {
      LOGGER.error("根据角色ID：" + id + " 查询角色异常！", e);
      throw ExceptionFactory.buildBusinessException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR,
          "根据角色ID：" + id + " 查询角色异常！", e);
    }
  }

  /**
   * 角色--修改
   */
  @Override
  public int update(EcsMgrRoles role, String role_menu, String oldroleName) {
    int result = 0;
    try {
      // 根据角色名称查询，判断角色名称是否已经存在
      EcsMgrRoles r = roleDao.getRoleByroleName(role.getRoleName());
      if (r != null && !oldroleName.equals(r.getRoleName())) {
        result = 1;
      } else {
        // 修改角色
        roleDao.updateRole(role);
        // 删除角色--菜单对应的权限
        roleMenuDao.deleteRoleMenu(role.getId());
        // 修改角色对应菜单的权限
        if (!"".equals(role_menu)) {
          if (role_menu.indexOf(",") != -1) {
            String[] menuIds = role_menu.split(",");
            if (menuIds.length > 0) {
              for (String menuId : menuIds) {
                EcsMgrRoleMenu rm = new EcsMgrRoleMenu();
                rm.setMenuId(Integer.valueOf(menuId));
                rm.setRoleId(role.getId());
                rm.setCreateDt(new Date());
                roleMenuDao.addRoleMenu(rm);
              }
            }
          } else {
            EcsMgrRoleMenu rm = new EcsMgrRoleMenu();
            rm.setMenuId(Integer.valueOf(role_menu));
            rm.setRoleId(role.getId());
            rm.setCreateDt(new Date());
            roleMenuDao.addRoleMenu(rm);
          }
        }
        result = 0;
      }
    } catch (Throwable e) {
      result = -1;
      LOGGER.error("修改角色失败！", e);
      throw ExceptionFactory.buildBusinessException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR,
          "修改角色失败！", e);
    }
    return result;
  }

  /**
   * 查询所有
   */
  @Override
  public List<EcsMgrRoles> getRoleList() {
    try {
      return roleDao.getRoleList();
    } catch (Throwable e) {
      LOGGER.error("查询角色信息异常！", e);
      throw ExceptionFactory.buildBusinessException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR,
          "查询角色信息异常！", e);
    }
  }
}
