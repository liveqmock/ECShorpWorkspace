package com.ecs.manager.core.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ecs.commons.model.BaseObject;

public class EcsMenuModel extends BaseObject {

  /**
   * 
   */
  private static final long serialVersionUID = 5895709614627988576L;

  private Integer id;
  private String text;
  private String href;
  private Integer status;
  private Integer pId;
  private Date createDate;
  private Integer sort;
  private String memo;
  private List<EcsMenuModel> children = new ArrayList<EcsMenuModel>();

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getpId() {
    return pId;
  }

  public void setpId(Integer pId) {
    this.pId = pId;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public List<EcsMenuModel> getChildren() {
    return children;
  }

  public void setChildren(List<EcsMenuModel> children) {
    this.children = children;
  }

}
