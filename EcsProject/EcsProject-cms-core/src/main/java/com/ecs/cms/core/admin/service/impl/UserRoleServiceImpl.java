package com.ecs.cms.core.admin.service.impl;
import java.util.List;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.cms.core.admin.dao.UserRoleDao;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUserRole;
import com.ecs.cms.core.admin.service.UserRoleService;
import com.ecs.cms.core.constants.ErrConstants;
import com.ecs.commons.exception.ExceptionFactory;
/**
 * 
 * <p>
 * 
 * @CLASS :UserRoleServiceImpl.java
 * @DESCRIPTION :
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年6月21日
 *       </p>
 * 
 */
@Transactional
@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {
	
	//日志
    private static final XLogger LOGGER = XLoggerFactory.getXLogger(UserRoleServiceImpl.class);

    @Autowired
    private UserRoleDao userRoleDao;
	/**
	 * 根据用户Id查询
	 */
	@Override
	public List<EcsMgrUserRole> getUserRolebyuserId(Integer userId) {
		try {
			return userRoleDao.getUserRolebyuserId(userId);
		} catch (Throwable e) {
			LOGGER.error("查询用户角色对应关系异常！",e);
			throw ExceptionFactory.buildAdminException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR, "查询用户角色对应关系异常！",e);
		}
	}
}
