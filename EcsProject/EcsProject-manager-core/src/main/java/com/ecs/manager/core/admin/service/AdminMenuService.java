package com.ecs.manager.core.admin.service;

import com.ecs.manager.core.admin.model.EcsMenuModel;

public interface AdminMenuService {

  /**
   * 获取菜单列表
   * @return
   */
  EcsMenuModel getMenuListAll();


  /**
   * 创建新菜单
   * @param parentId
   * @param menuName
   * @param href
   * @param status
   * @param memo
   */
  void createMenu(Integer parentId, String menuName, String href, Integer status, String memo);


  void deleteMenu(Integer id);


  EcsMenuModel getMenuById(Integer id);


  void updateMenu(Integer id, Integer parentId, String menuName, String href, Integer status, String memo);

}
