package com.ecs.cms.core.admin.service.impl;

import java.util.List;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecs.cms.core.admin.dao.UserUserGroupDao;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUserUsergroup;
import com.ecs.cms.core.admin.service.UserUserGroupService;
import com.ecs.cms.core.constants.ErrConstants;
import com.ecs.commons.exception.ExceptionFactory;
/**
 * 
 * <p>
 * 
 * @CLASS :UserUserGroupServiceImpl.java
 * @DESCRIPTION :
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年6月21日
 *       </p>
 * 
 */
@Transactional
@Service("userUserGroupService")
public class UserUserGroupServiceImpl implements UserUserGroupService {
	
	//日志
    private static final XLogger LOGGER = XLoggerFactory.getXLogger(UserUserGroupServiceImpl.class);

    @Autowired
    private UserUserGroupDao userUserGroupDao;
	/**
	 * 根据用户组Id查询
	 */
	@Override
	public List<EcsMgrUserUsergroup> getUserUserGroupbyuserId(Long userGroupId) {
		try {
			return userUserGroupDao.getUserUserGroupByusergroupId(userGroupId);
		} catch (Throwable e) {
			LOGGER.error("查询用户--用户组对应关系异常！",e);
			throw ExceptionFactory.buildAdminException(ErrConstants.BusinessErrorCode.BIZ_COMMENT_ERR, "查询用户--用户组对应关系异常！",e);
		}
	}
}
