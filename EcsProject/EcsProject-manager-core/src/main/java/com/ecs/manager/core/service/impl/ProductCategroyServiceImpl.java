package com.ecs.manager.core.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecs.manager.core.admin.bo.EcsProductCategoryBo;
import com.ecs.manager.core.admin.model.EcsMenuModel;
import com.ecs.manager.core.admin.model.EcsUserModel;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrMenus;
import com.ecs.manager.core.mybatis.mapper.EcsProductCategoryMapper;
import com.ecs.manager.core.mybatis.pojo.EcsProductCategory;
import com.ecs.manager.core.mybatis.pojo.EcsProductCategoryCriteria;
import com.ecs.manager.core.service.ProductCategoryService;

@Service
public class ProductCategroyServiceImpl implements ProductCategoryService {

  private static final XLogger LOGGER = XLoggerFactory.getXLogger(ProductCategroyServiceImpl.class);

  @Autowired
  private EcsProductCategoryMapper ecsProductCategoryMapper;

  @Override
  public EcsProductCategory getProductCategoryById(Long id) {
    return this.ecsProductCategoryMapper.selectByPrimaryKey(id);
  }

  @Override
  public void deleteProductCategory(Long id) {
    this.ecsProductCategoryMapper.deleteByPrimaryKey(id);
  }

  @Override
  public void createProductCategory(String categoryName, String pageTitle, String pageDesc, String categoryKeys, Integer orders, String brands, Long parentId) {
    EcsProductCategory record=new EcsProductCategory();
    record.setName(categoryName);
    record.setCreateDate(new Date());
    record.setModifyDate(new Date());
    record.setOrders(orders);
    record.setSeoTitle(pageTitle);
    record.setSeoDescription(pageDesc);
    record.setSeoKeywords(categoryKeys);
    record.setParent(parentId);
    record.setGrade(-1);
    record.setTreePath("");
    this.ecsProductCategoryMapper.insertSelective(record);
  }

  @Override
  public void updateProductCategory(Long id, String categoryName, String pageTitle, String pageDesc, String categoryKeys, Integer orders,
      String brands, Long parentId) {
    EcsProductCategory record=new EcsProductCategory();
    record.setId(id);
    record.setParent(parentId);
    record.setName(categoryName);
    record.setCreateDate(new Date());
    record.setModifyDate(new Date());
    record.setOrders(orders);
    record.setSeoTitle(pageTitle);
    record.setSeoDescription(pageDesc);
    record.setSeoKeywords(categoryKeys);
    record.setParent(parentId);
    record.setGrade(-1);
    record.setTreePath("");
    this.ecsProductCategoryMapper.updateByPrimaryKeySelective(record);
  }

  @Override
  public List<EcsProductCategoryBo> getProductCategoryTree() {
    List<EcsProductCategoryBo> categoryList = this.getTopProductCategory();
    List<EcsProductCategoryBo> resultList = new ArrayList<EcsProductCategoryBo>();
    for (EcsProductCategoryBo category : categoryList) {
      EcsProductCategoryBo bo = recursiveMenuTree(category.getId());
      resultList.add(bo);
    }
    return resultList;
  }

  @Override
  public List<EcsProductCategoryBo> getTopProductCategory() {
    return getNextLevelProductCategoryById(null);
  }

  @Override
  public List<EcsProductCategoryBo> getNextLevelProductCategoryById(Long catId) {
    EcsProductCategoryCriteria criteria = new EcsProductCategoryCriteria();
    if (catId == null) {
      criteria.createCriteria().andParentIsNull();
    } else {
      criteria.createCriteria().andParentEqualTo(catId);
    }
    criteria.setOrderByClause("orders");
    List<EcsProductCategory> list = ecsProductCategoryMapper.selectByExample(criteria);
    if (CollectionUtils.isEmpty(list)) {
      return null;
    }
    List<EcsProductCategoryBo> categoryList = new ArrayList<EcsProductCategoryBo>();
    for (EcsProductCategory cat : list) {
      EcsProductCategoryBo bo = convertEcsProductCategoryBo(cat);
      criteria = new EcsProductCategoryCriteria();
      criteria.createCriteria().andParentEqualTo(cat.getId());
      int count = ecsProductCategoryMapper.countByExample(criteria);
      bo.setState("closed");
      if (count == 0) {
        bo.setState("open");
      }
      categoryList.add(bo);
    }
    return categoryList;
  }

  /**
   * 递归查询商品分类
   * 
   * @param categoryId
   * @return
   */
  public EcsProductCategoryBo recursiveMenuTree(Long categoryId) {
    // 查询该节点的信息
    EcsProductCategory ecsProductCategory = ecsProductCategoryMapper.selectByPrimaryKey(categoryId);
    EcsProductCategoryBo model = convertEcsProductCategoryBo(ecsProductCategory);
    // 查询出cid下的所有子节点
    EcsProductCategoryCriteria criteria = new EcsProductCategoryCriteria();
    criteria.createCriteria().andParentEqualTo(categoryId);
    criteria.setOrderByClause("orders");
    List<EcsProductCategory> list = ecsProductCategoryMapper.selectByExample(criteria);
    List<EcsProductCategoryBo> modelList = new ArrayList<EcsProductCategoryBo>();
    if (CollectionUtils.isNotEmpty(list)) {
      for (EcsProductCategory category : list) {
        modelList.add(convertEcsProductCategoryBo(category));
      }
    }
    // 遍历子节点
    for (EcsProductCategoryBo child : modelList) {
      EcsProductCategoryBo n = recursiveMenuTree(child.getId());
      // 递归
      model.getChildren().add(n);
    }

    return model;
  }

  private EcsProductCategoryBo convertEcsProductCategoryBo(EcsProductCategory ecsProductCategory) {
    EcsProductCategoryBo model = new EcsProductCategoryBo();
    model.setId(ecsProductCategory.getId());
    model.setText(ecsProductCategory.getName());
    model.setCreateDate(ecsProductCategory.getCreateDate());
    model.setGrade(ecsProductCategory.getGrade());
    model.setModifyDate(ecsProductCategory.getModifyDate());
    model.setOrders(ecsProductCategory.getOrders());
    model.setParent(ecsProductCategory.getParent());
    model.setSeoDescription(ecsProductCategory.getSeoDescription());
    model.setSeoKeywords(ecsProductCategory.getSeoKeywords());
    model.setSeoTitle(ecsProductCategory.getSeoTitle());
    model.setTreePath(ecsProductCategory.getTreePath());
    return model;
  }
}
