package com.ecs.manager.core.admin.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ecs.commons.model.BaseObject;

public class EcsProductCategoryBo extends BaseObject {
  /**
   * 
   */
  private static final long serialVersionUID = 6300129072953407911L;

  private Long id;

  private Date createDate;

  private Date modifyDate;

  private Integer orders;

  private Integer grade;

  private String text;

  private String seoDescription;

  private String seoKeywords;

  private String seoTitle;

  private String treePath;

  private Long parent;
  
  private String state;

  private List<EcsProductCategoryBo> children = new ArrayList<EcsProductCategoryBo>();

  
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public List<EcsProductCategoryBo> getChildren() {
    return children;
  }

  public void setChildren(List<EcsProductCategoryBo> children) {
    this.children = children;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  public Integer getOrders() {
    return orders;
  }

  public void setOrders(Integer orders) {
    this.orders = orders;
  }

  public Integer getGrade() {
    return grade;
  }

  public void setGrade(Integer grade) {
    this.grade = grade;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getSeoDescription() {
    return seoDescription;
  }

  public void setSeoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
  }

  public String getSeoKeywords() {
    return seoKeywords;
  }

  public void setSeoKeywords(String seoKeywords) {
    this.seoKeywords = seoKeywords;
  }

  public String getSeoTitle() {
    return seoTitle;
  }

  public void setSeoTitle(String seoTitle) {
    this.seoTitle = seoTitle;
  }

  public String getTreePath() {
    return treePath;
  }

  public void setTreePath(String treePath) {
    this.treePath = treePath;
  }

  public Long getParent() {
    return parent;
  }

  public void setParent(Long parent) {
    this.parent = parent;
  }


}
