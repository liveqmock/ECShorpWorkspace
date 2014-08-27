package com.ecs.sso.model;

import java.util.Date;

import com.ecs.commons.model.BaseObject;

/**
 * @Description: 用户登录trace
 * @author toney.li
 * @date 2013-8-5 下午4:34:36
 * 
 */
public class UserLoginTraceModel extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1325376051386166209L;
	private String tokenId;
	private Long userId;
	private String loginAcc;
	private Date loginTime;
	private Date logoutTime;
	private String loginIp;

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginAcc() {
		return loginAcc;
	}

	public void setLoginAcc(String loginAcc) {
		this.loginAcc = loginAcc;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loginAcc == null) ? 0 : loginAcc.hashCode());
		result = prime * result + ((loginIp == null) ? 0 : loginIp.hashCode());
		result = prime * result + ((loginTime == null) ? 0 : loginTime.hashCode());
		result = prime * result + ((logoutTime == null) ? 0 : logoutTime.hashCode());
		result = prime * result + ((tokenId == null) ? 0 : tokenId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserLoginTraceModel other = (UserLoginTraceModel) obj;
		if (loginAcc == null) {
			if (other.loginAcc != null)
				return false;
		} else if (!loginAcc.equals(other.loginAcc))
			return false;
		if (loginIp == null) {
			if (other.loginIp != null)
				return false;
		} else if (!loginIp.equals(other.loginIp))
			return false;
		if (loginTime == null) {
			if (other.loginTime != null)
				return false;
		} else if (!loginTime.equals(other.loginTime))
			return false;
		if (logoutTime == null) {
			if (other.logoutTime != null)
				return false;
		} else if (!logoutTime.equals(other.logoutTime))
			return false;
		if (tokenId == null) {
			if (other.tokenId != null)
				return false;
		} else if (!tokenId.equals(other.tokenId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserLoginTraceModel [tokenId=" + tokenId + ", userId=" + userId + ", loginAcc=" + loginAcc + ", loginTime=" + loginTime + ", logoutTime=" + logoutTime
				+ ", loginIp=" + loginIp + "]";
	}

}