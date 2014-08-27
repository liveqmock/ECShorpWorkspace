package com.ecs.sso.model;

import java.util.Date;

import com.ecs.commons.model.BaseObject;

/**
 * 
 *************************************************************** 
 * <p>
 * 
 * @CLASS :UserModule
 * @DESCRIPTION :用户信息
 * @AUTHOR :toney.li
 * @VERSION :v1.0
 * @DATE :Mar 10, 2013
 *       </p>
 **************************************************************** 
 */
public class UserInfoModel extends BaseObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1247421452408323385L;

	private Long userId;
	private String userName;
	private String password;
	private String isEnabled;
	private String nickName;
	private String mobile;
	private Date createTime;
	private Date updateTime;
	private Integer userStatus;

	private Integer userLevel;

	private String userEmail;

	private Integer emailAuthenStatus;
	private Integer mobileAuthenStatus;

	public String getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getEmailAuthenStatus() {
		return emailAuthenStatus;
	}

	public void setEmailAuthenStatus(Integer emailAuthenStatus) {
		this.emailAuthenStatus = emailAuthenStatus;
	}

	public Integer getMobileAuthenStatus() {
		return mobileAuthenStatus;
	}

	public void setMobileAuthenStatus(Integer mobileAuthenStatus) {
		this.mobileAuthenStatus = mobileAuthenStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((emailAuthenStatus == null) ? 0 : emailAuthenStatus.hashCode());
		result = prime * result + ((isEnabled == null) ? 0 : isEnabled.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((mobileAuthenStatus == null) ? 0 : mobileAuthenStatus.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userLevel == null) ? 0 : userLevel.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userStatus == null) ? 0 : userStatus.hashCode());
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
		UserInfoModel other = (UserInfoModel) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (emailAuthenStatus == null) {
			if (other.emailAuthenStatus != null)
				return false;
		} else if (!emailAuthenStatus.equals(other.emailAuthenStatus))
			return false;
		if (isEnabled == null) {
			if (other.isEnabled != null)
				return false;
		} else if (!isEnabled.equals(other.isEnabled))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (mobileAuthenStatus == null) {
			if (other.mobileAuthenStatus != null)
				return false;
		} else if (!mobileAuthenStatus.equals(other.mobileAuthenStatus))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userLevel == null) {
			if (other.userLevel != null)
				return false;
		} else if (!userLevel.equals(other.userLevel))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userStatus == null) {
			if (other.userStatus != null)
				return false;
		} else if (!userStatus.equals(other.userStatus))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserInfoModel [userId=" + userId + ", userName=" + userName + ", password=" + password + ", isEnabled=" + isEnabled + ", nickName=" + nickName + ", mobile="
				+ mobile + ", createTime=" + createTime + ", updateTime=" + updateTime + ", userStatus=" + userStatus + ", userLevel=" + userLevel + ", userEmail=" + userEmail
				+ ", emailAuthenStatus=" + emailAuthenStatus + ", mobileAuthenStatus=" + mobileAuthenStatus + "]";
	}
}