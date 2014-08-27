package com.ecs.manager.web.util;

import org.springframework.util.Assert;

import com.ecs.manager.core.auth.UserAuthInfo;

public class UserAuthInfoHolder {
    private static final ThreadLocal<UserAuthInfo> threadLocal = new ThreadLocal<UserAuthInfo>(); // NOPMD

    public static UserAuthInfo getUserAuthInfo() {
        return threadLocal.get();
    }

    public static void setUserAuthInfo(UserAuthInfo user) {
        Assert.notNull(user, "Only non-null UserAuthInfo instances are permitted");
        threadLocal.set(user);
    }

    public static void clear() {
        threadLocal.remove();
    }
}