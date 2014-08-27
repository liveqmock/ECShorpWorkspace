package com.ecs.cms.core.manager;

import java.util.Map;

import com.ecs.cms.core.model.AppConfigModel;
import com.ecs.commons.exception.BusinessException;

/**
 *************************************************************** 
 * <p>
 * 
 * @CLASS :AppConfigManager.java
 * @DESCRIPTION : 系统的配置管理
 * @AUTHOR :toney.li
 * @VERSION :v1.0
 * @DATE :Mar 19, 2013
 *       </p>
 **************************************************************** 
 */
public interface AppConfigManager {

	/**
	 * 系统配置放入本地内存.
	 * 
	 * @throws BusinessException
	 */

	Map<String, AppConfigModel> getAppConfigs() throws BusinessException;
	/**
	 * 系统配置放入本地内存.
	 * 
	 * @throws BusinessException
	 */
	
	Map<String, AppConfigModel> getAppConfigsByKey(String key) throws BusinessException;
}
