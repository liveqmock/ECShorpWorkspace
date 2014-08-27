package com.ecs.core.manager;

import java.util.Map;

import com.ecs.core.exception.ManagerException;
import com.ecs.core.model.AppConfigModel;

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
	 * @throws ManagerException
	 */

	Map<String, AppConfigModel> getAppConfigs() throws ManagerException;
	/**
	 * 系统配置放入本地内存.
	 * 
	 * @throws ManagerException
	 */
	
	Map<String, AppConfigModel> getAppConfigsByKey(String key) throws ManagerException;
}
