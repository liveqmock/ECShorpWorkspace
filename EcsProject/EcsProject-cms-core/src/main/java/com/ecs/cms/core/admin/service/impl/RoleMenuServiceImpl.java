package com.ecs.cms.core.admin.service.impl;

import java.util.List;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.cms.core.admin.dao.RoleMenuDao;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoleMenu;
import com.ecs.cms.core.admin.service.RoleMenuService;
import com.ecs.cms.core.constants.ErrConstants;
import com.ecs.commons.exception.ExceptionFactory;
/**
 * 
 * <p>
 * 
 * @CLASS :RoleMenuServiceImpl.java
 * @DESCRIPTION :
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年6月21日
 *       </p>
 * 
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl implements RoleMenuService {
	
	//日志
    private static final XLogger LOGGER = XLoggerFactory.getXLogger(RoleMenuServiceImpl.class);

	@Autowired
	private RoleMenuDao roleMenuDao;
	/**
	 * 根据角色Id查询
	 */
	@Override
	public List<EcsMgrRoleMenu> getRoleMenubyroleId(Integer roleId) {
		try {
			return roleMenuDao.getRoleMenubyroleId(roleId);
		} catch (Throwable e) {
			LOGGER.error("查询角色菜单对应权限异常！",e);
			throw ExceptionFactory.buildBusinessException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR, "查询角色菜单对应权限异常！",e);
		}
	}
}
