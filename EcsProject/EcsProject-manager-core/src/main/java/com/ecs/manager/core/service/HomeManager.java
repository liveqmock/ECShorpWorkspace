package com.ecs.manager.core.service;

import java.util.List;
import java.util.Map;

/**
 * 
 * <p>
 * 
 * @CLASS :首页数据展示
 * @DESCRIPTION :
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年6月5日
 *       </p>
 * 
 */
public interface HomeManager {

	public Map<String,List<Object>> getHomeDateList();
}
