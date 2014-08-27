package com.ecs.manager.core.service;

import java.util.List;

import com.ecs.manager.core.admin.bo.EcsProductCategoryBo;
import com.ecs.manager.core.admin.model.EcsUserModel;
import com.ecs.manager.core.mybatis.pojo.EcsProductCategory;

public interface ProductCategoryService {

  EcsProductCategory getProductCategoryById(Long id);

  void deleteProductCategory(Long id);

  void updateProductCategory(Long id, String categoryName, String pageTitle, String pageDesc, String categoryKeys, Integer orders, String brands, Long parentId);

  List<EcsProductCategoryBo> getProductCategoryTree();

  /**
   * 查询顶级分类
   * 
   * @return
   */
  List<EcsProductCategoryBo> getTopProductCategory();

  /**
   * 下一级的所有分类
   * 
   * @param catId
   * @return
   */
  List<EcsProductCategoryBo> getNextLevelProductCategoryById(Long catId);

  void createProductCategory(String categoryName, String pageTitle, String pageDesc, String categoryKeys, Integer orders, String brands, Long parentId);




}
