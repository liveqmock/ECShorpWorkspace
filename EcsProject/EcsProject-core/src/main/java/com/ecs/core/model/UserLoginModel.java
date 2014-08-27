package com.ecs.core.model;

import com.ecs.commons.model.BaseObject;

public class UserLoginModel extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7742838438136788248L;

	Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
