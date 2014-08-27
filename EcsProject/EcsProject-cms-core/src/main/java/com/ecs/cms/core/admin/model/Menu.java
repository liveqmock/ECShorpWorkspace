package com.ecs.cms.core.admin.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ecs.commons.model.BaseObject;
/**
 * 
 * <p>
 * 
 * @CLASS :fieMenu.java
 * @DESCRIPTION :
 * @AUTHOR :Toney.li
 * @VERSION :v1.0
 * @DATE :2014年6月21日
 *       </p>
 * 
 */
public class Menu extends BaseObject implements Serializable {
	private static final long serialVersionUID = 5908372387868348561L;

	private Long id; // 菜单ID
	private String menuName; // 菜单名称
	private String menuUrl; // 菜单URL
	private Long parentId; // 上级菜单
	private Date createDt; // 创建时间
	private String memo; // 备注信息
	private Long status; // 状态: 1 启用 , 2作废
	private Long dispunm; // 排序序号
	private Integer version; // 版本号
	
	private String parentName;//上级菜单的名称
	private List<Menu> mlist;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getDispunm() {
		return dispunm;
	}

	public void setDispunm(Long dispunm) {
		this.dispunm = dispunm;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public List<Menu> getMlist() {
		return mlist;
	}

	public void setMlist(List<Menu> mlist) {
		this.mlist = mlist;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	
}
