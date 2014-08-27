package com.ecs.cms.core.cache;


/**
 *************************************************************** 
 * <p>
 * @CLASS :CacheService.java
 * @DESCRIPTION : Cache service
 * @AUTHOR :toney.li
 * @VERSION :v1.0
 * @DATE :Mar 23, 2013
 *       </p>
 **************************************************************** 
 */
public interface CacheService {

	Object get(String cacheName, String key) ;

	void put(String cacheName, String key, Object t);

	void cacheManagerInfo(String cacheName);

	void remove(String cacheName,String key);

  void removeAll(String cacheName);
	
}
