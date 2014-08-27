package com.ecs.cms.core.admin.service;


public interface AdminMenuCacheService {

  Object get(Integer userId);

  void put(Integer userId, Object object);

  void remove(Integer userId);


  String genKey(Integer userId);

  void removeAll();

}
