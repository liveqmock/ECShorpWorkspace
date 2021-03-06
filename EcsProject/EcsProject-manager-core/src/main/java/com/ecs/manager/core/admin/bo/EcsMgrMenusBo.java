package com.ecs.manager.core.admin.bo;


import java.util.List;

import com.ecs.commons.model.BaseObject;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrMenus;

public class EcsMgrMenusBo extends BaseObject {

  /**
   * 
   */
  private static final long serialVersionUID = 8438148430198399919L;

  private EcsMgrMenus ecsMgrMenus;
  private List<EcsMgrMenus> childrenMenus;

  public EcsMgrMenus getEcsMgrMenus() {
    return ecsMgrMenus;
  }

  public void setEcsMgrMenus(EcsMgrMenus ecsMgrMenus) {
    this.ecsMgrMenus = ecsMgrMenus;
  }

  public List<EcsMgrMenus> getChildrenMenus() {
    return childrenMenus;
  }

  public void setChildrenMenus(List<EcsMgrMenus> childrenMenus) {
    this.childrenMenus = childrenMenus;
  }


}
