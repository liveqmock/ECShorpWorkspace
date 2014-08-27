package com.ecs.cms.web.admin.utils;

import org.springframework.util.Assert;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsers;

public class AdminUserAuthInfoHolder {
	private static final ThreadLocal<EcsMgrUsers> threadLocal = new ThreadLocal<EcsMgrUsers>(); // NOPMD

	public static EcsMgrUsers getAdminUserAuthInfo() {
		return threadLocal.get();
	}

	public static void setAdminUserAuthInfo(EcsMgrUsers user) {
		Assert.notNull(user,
				"Only non-null UserAuthInfo instances are permitted");
		threadLocal.set(user);
	}

	public static void clear() {
		threadLocal.remove();
	}

}
