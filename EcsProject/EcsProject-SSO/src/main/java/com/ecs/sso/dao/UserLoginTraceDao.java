package com.ecs.sso.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ecs.sso.model.UserLoginTraceModel;

/**
 * @Description: 用户基本信息DAO
 * @author toney.li
 * @date 2013-8-6 上午11:13:49
 * 
 */
@Repository("userLoginTraceDao")
public interface UserLoginTraceDao {
	public void insert(UserLoginTraceModel userLoginTraceModel);

	public void updateLogoutTime(@Param("logoutTime") Date date,@Param("userId") Long userId,@Param("tokenId") String tokenId);
}
