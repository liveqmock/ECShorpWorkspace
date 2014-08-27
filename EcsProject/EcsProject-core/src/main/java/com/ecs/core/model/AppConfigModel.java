package com.ecs.core.model;

import java.util.Date;

import com.ecs.commons.model.BaseObject;

/**
 *************************************************************** 
 * <p>
 * 
 * @CLASS :AppConfigBO.java
 * @DESCRIPTION : 系统配置业务对象
 * @AUTHOR :toney.li
 * @VERSION :v1.0
 * @DATE :Mar 19, 2013
 *       </p>
 **************************************************************** 
 */
public class AppConfigModel extends BaseObject {

	private static final long serialVersionUID = 2462265427690584062L;

	private Long configId;
	private String groupCode;
	// '是否可用,0:不可用 1：可用',
	private Integer enabled;
	private String cfgKey;
	private String cfgValues;
	private Date createDate;
	private String cfgDescription;
	
	public Long getConfigId() {
		return configId;
	}

	public void setConfigId(Long configId) {
		this.configId = configId;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public String getCfgKey() {
		return cfgKey;
	}

	public void setCfgKey(String cfgKey) {
		this.cfgKey = cfgKey;
	}

	public String getCfgValues() {
		return cfgValues;
	}

	public void setCfgValues(String cfgValues) {
		this.cfgValues = cfgValues;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCfgDescription() {
		return cfgDescription;
	}

	public void setCfgDescription(String cfgDescription) {
		this.cfgDescription = cfgDescription;
	}

}
