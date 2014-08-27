package com.ecs.sso.bo;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ecs.commons.model.BaseObject;
import com.ecs.sso.model.UserInfoModel;

/**
 * @Description:用户登录信息
 * @author toney.li
 * @date 2013-8-6 上午11:21:33
 * 
 */
/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author toney.li
 * @date 2013-8-21 下午6:13:38
 * 
 */
public class UserLoginBo extends BaseObject {

	private static final long serialVersionUID = -937467815145643167L;
	private Date loginTime;
	private Date lastUpdateTime;
	/**
	 * 加密后的token
	 */
	private String tokenId;
	private String loginIp;
	/**
	 * 登录时使用的帐号
	 */
	private String loginName;
	private String loginType;

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	private UserInfoModel userInfoModel;

	public UserInfoModel getUserInfoModel() {
		return userInfoModel;
	}

	public void setUserInfoModel(UserInfoModel userInfoModel) {
		this.userInfoModel = userInfoModel;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
