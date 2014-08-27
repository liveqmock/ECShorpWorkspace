package com.ecs.manager.core.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.manager.core.cache.CacheService;
import com.ecs.manager.core.service.HomeManager;

/**
 * 
 * <p>
 * 
 * @CLASS :
 * @DESCRIPTION :首页数据展示
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年6月5日
 *       </p>
 * 
 */
@Transactional
@Service("homeManager")
public class HomeManagerImpl implements HomeManager {

  static final XLogger LOGGER = XLoggerFactory.getXLogger(HomeManagerImpl.class);
  @Autowired
  private CacheService cacheService;

  private static final String CACHE_NAME = "homeDataCache";

  /*
   * (non-Javadoc)
   * 
   * @see com.ecs.core.manager.HomeManager#getHomeDateList()
   */
  public Map<String, List<Object>> getHomeDateList() {
    cacheService.get(CACHE_NAME, "");
    return null;
  }
}
