package com.ecs.cms.core.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.cms.core.admin.service.AdminMenuCacheService;
import com.ecs.cms.core.cache.CacheService;

/**
 * 
 * <p>
 * 
 * @CLASS :AdminMenuCacheServiceImpl.java
 * @DESCRIPTION : 菜单的Cache管理.
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年8月26日
 *       </p>
 * 
 */
@Service
public class AdminMenuCacheServiceImpl implements AdminMenuCacheService {

  private static final String CACHE_NAME = "ADMIN_CACHE_NAME";
  private static final String GET_MENU_LIST_BY_USERID = "GET_MENU_LIST_BY_USERID_";

  @Autowired
  CacheService cacheService;

  @Override
  public Object get(Integer userId) {
    return cacheService.get(CACHE_NAME, this.genKey(userId));
  }

  @Override
  public void put(Integer userId, Object object) {
    cacheService.put(CACHE_NAME, this.genKey(userId), object);
  }

  @Override
  public void remove(Integer userId) {
    cacheService.remove(CACHE_NAME, this.genKey(userId));
  }

  @Override
  public void removeAll() {
    cacheService.removeAll(CACHE_NAME);
  }

  @Override
  public String genKey(Integer userId) {
    return GET_MENU_LIST_BY_USERID + String.valueOf(userId);
  }
}
