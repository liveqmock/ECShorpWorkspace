package com.ecs.manager.core.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.commons.exception.ExceptionFactory;
import com.ecs.manager.core.admin.constant.ErrConstants;
import com.ecs.manager.core.admin.model.EcsMenuModel;
import com.ecs.manager.core.admin.mybatis.mapper.EcsMgrMenusMapper;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrMenus;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrMenusCriteria;
import com.ecs.manager.core.cache.CacheService;

@Service
public class AdminMenuServiceImpl implements AdminMenuService {

  private static final XLogger LOGGER = XLoggerFactory.getXLogger(AdminMenuServiceImpl.class);

  @Autowired
  EcsMgrMenusMapper ecsMgrMenusMapper;
  @Autowired
  AdminMenuCacheService adminMenuCacheService;
  
  @Override
  public EcsMenuModel getMenuListAll() {
    try {
      EcsMenuModel model = recursiveMenuTree(-1);
      return model;
    } catch (Throwable e) {
      LOGGER.error("查询菜单失败！", e);
      throw ExceptionFactory.buildBusinessException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR, "查询菜单失败！！");
    }
  }

  /**
   * 递归查询菜单
   * @param menuId
   * @return
   */
  public EcsMenuModel recursiveMenuTree(int menuId) {
    // 查询该节点的信息
    EcsMgrMenus ecsMgrMenus = ecsMgrMenusMapper.selectByPrimaryKey(menuId);
    EcsMenuModel model = convertEcsMenuModel(ecsMgrMenus);
    // 查询出cid下的所有子节点
    EcsMgrMenusCriteria criteria = new EcsMgrMenusCriteria();
    criteria.createCriteria().andParentidEqualTo(menuId);
    criteria.setOrderByClause("create_dt");
    List<EcsMgrMenus> list = ecsMgrMenusMapper.selectByExample(criteria);
    List<EcsMenuModel> modelList = new ArrayList<EcsMenuModel>();
    if (CollectionUtils.isNotEmpty(list)) {
      for (EcsMgrMenus menu : list) {
        modelList.add(convertEcsMenuModel(menu));
      }
    }
    // 遍历子节点
    for (EcsMenuModel child : modelList) {
      EcsMenuModel n = recursiveMenuTree(child.getId());
      // 递归
      model.getChildren().add(n);
    }

    return model;
  }



  private EcsMenuModel convertEcsMenuModel(EcsMgrMenus ecsMgrMenus) {
    EcsMenuModel model = new EcsMenuModel();
    model.setId(ecsMgrMenus.getId());
    model.setText(ecsMgrMenus.getMenuName());
    model.setStatus(ecsMgrMenus.getStatus());
    model.setHref(ecsMgrMenus.getMenuUrl());
    model.setpId(ecsMgrMenus.getParentid());
    model.setMemo(ecsMgrMenus.getMemo());
    model.setCreateDate(ecsMgrMenus.getCreateDt());
    return model;
  }

  @Override
  public void createMenu(Integer parentId, String menuName, String href, Integer status, String memo) {
    EcsMgrMenus record=new EcsMgrMenus();
    record.setMenuName(menuName);
    record.setParentid(parentId);
    record.setMenuUrl(href);
    record.setStatus(status);
    record.setMemo(memo);
    this.ecsMgrMenusMapper.insertSelective(record);
    this.adminMenuCacheService.removeAll();
    
  }

  @Override
  public void deleteMenu(Integer id) {
    this.ecsMgrMenusMapper.deleteByPrimaryKey(id);
    this.adminMenuCacheService.removeAll();
  }

  @Override
  public EcsMenuModel getMenuById(Integer id) {
    EcsMgrMenus menu= this.ecsMgrMenusMapper.selectByPrimaryKey(id);
    return this.convertEcsMenuModel(menu);
  }

  @Override
  public void updateMenu(Integer id, Integer parentId, String menuName, String href, Integer status, String memo) {
    EcsMgrMenus record=new EcsMgrMenus();
    record.setId(id);
    record.setMenuName(menuName);
    record.setParentid(parentId);
    record.setMenuUrl(href);
    record.setStatus(status);
    record.setMemo(memo);
    this.ecsMgrMenusMapper.updateByPrimaryKeySelective(record);
    this.adminMenuCacheService.removeAll();
  }

}
