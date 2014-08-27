package com.ecs.manager.web.controller.product;

import java.util.List;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecs.manager.core.admin.bo.EcsProductCategoryBo;
import com.ecs.manager.core.mybatis.pojo.EcsProductCategory;
import com.ecs.manager.core.service.ProductService;
import com.ecs.manager.web.annotation.AuthLevel;
import com.ecs.manager.web.annotation.AuthRequired;
import com.ecs.manager.web.constants.Constants;
import com.ecs.manager.web.view.JsonPackageWrapper;

@Controller
@AuthRequired(AuthLevel.STRICT)
@RequestMapping("/admin/product")
public class ProductController {
  private static final XLogger LOGGER = XLoggerFactory.getXLogger(ProductController.class);

  @Autowired
  private ProductService productService;

  @RequestMapping(value = "list", method = RequestMethod.GET)
  public String list(Model model) {

    return "manager/product/list";
  }

  @RequestMapping(value = "categorylist.json", method = RequestMethod.GET)
  public void userList(Model model) {
    List<EcsProductCategoryBo> categoryList = productService.getProductCategoryTree();
    model.addAttribute(Constants.JSON_MODEL_DATA, categoryList);
    return;
  }


  @RequestMapping(value = "createCategory", method = RequestMethod.GET)
  public String createMenu(Model model) {
    return "manager/category/create_category";
  }

  @RequestMapping(value = "delete.json", method = RequestMethod.POST)
  public void delete(Long id, Model model) {
    JsonPackageWrapper json = new JsonPackageWrapper();
    json.setData("success");
    try {
      this.productCategoryService.deleteProductCategory(id);
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    } catch (Exception e) {
      json.setScode(JsonPackageWrapper.S_ERR);
      json.setSmsg(e.getMessage());
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    }
    return;
  }

  @RequestMapping(value = "editCategory", method = RequestMethod.GET)
  public String edit(Long id, Model model) {
    EcsProductCategory categoryModel = this.productCategoryService.getProductCategoryById(id);
    model.addAttribute("editCat", categoryModel);
    return "manager/category/create_category";
  }

  @RequestMapping(value = "createCategory.json", method = RequestMethod.POST)
  public void createMenu(Long id, Long parentId, String categoryName, String pageTitle, String pageDesc, String categoryKeys, Integer orders,
      String brands, Model model) {
    if (id != null) {
      updateCategory(id, parentId, categoryName, pageTitle, pageDesc, categoryKeys, orders, brands, model);
    } else {
      JsonPackageWrapper json = new JsonPackageWrapper();
      json.setData("success");
      try {
        productCategoryService.createProductCategory(categoryName, pageTitle, pageDesc, categoryKeys, orders, brands, parentId);
        model.addAttribute(Constants.JSON_MODEL_DATA, json);
      } catch (Exception e) {
        json.setScode(JsonPackageWrapper.S_ERR);
        model.addAttribute(Constants.JSON_MODEL_DATA, json);
      }
    }
    return;
  }

  @RequestMapping(value = "nextLevelCat.json", method = RequestMethod.GET)
  public void createMenu(Long id, Model model) {
    List<EcsProductCategoryBo> categoryList = productCategoryService.getNextLevelProductCategoryById(id);
    model.addAttribute(Constants.JSON_MODEL_DATA, categoryList);
    return;
  }

  @RequestMapping(value = "updateCategory.json", method = RequestMethod.POST)
  public void updateCategory(Long id, Long parentId, String categoryName, String pageTitle, String pageDesc, String categoryKeys, Integer orders,
      String brands, Model model) {
    JsonPackageWrapper json = new JsonPackageWrapper();
    json.setData("success");
    try {
      productCategoryService.updateProductCategory(id, categoryName, pageTitle, pageDesc, categoryKeys, orders, brands, parentId);
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    } catch (Exception e) {
      json.setScode(JsonPackageWrapper.S_ERR);
      model.addAttribute(Constants.JSON_MODEL_DATA, json);
    }
    return;
  }
}
