package com.ecs.cms.core.manager.impl;

import java.util.Map;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.stereotype.Service;

import com.ecs.cms.core.manager.AppConfigManager;
import com.ecs.cms.core.model.AppConfigModel;
import com.ecs.commons.exception.BusinessException;

/**
 *************************************************************** 
 * <p>
 * 
 * @CLASS :AppConfigManagerImpl.java
 * @DESCRIPTION : 系统配置管理
 * @AUTHOR :toney.li
 * @VERSION :v1.0
 * @DATE :Mar 19, 2013
 *       </p>
 **************************************************************** 
 */
@Service("appConfigManager")
public class AppConfigManagerImpl implements AppConfigManager {
  private static final XLogger LOGGER = XLoggerFactory.getXLogger(AppConfigManagerImpl.class);

  @Override
  public Map<String, AppConfigModel> getAppConfigs() throws BusinessException {
    return null;
  }

  @Override
  public Map<String, AppConfigModel> getAppConfigsByKey(String key) throws BusinessException {
    return null;
  }

}
