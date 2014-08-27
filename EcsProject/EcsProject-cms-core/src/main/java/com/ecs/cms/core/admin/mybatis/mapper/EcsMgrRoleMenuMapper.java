package com.ecs.cms.core.admin.mybatis.mapper;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoleMenu;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoleMenuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMgrRoleMenuMapper {
    int countByExample(EcsMgrRoleMenuCriteria example);

    int deleteByExample(EcsMgrRoleMenuCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(EcsMgrRoleMenu record);

    int insertSelective(EcsMgrRoleMenu record);

    List<EcsMgrRoleMenu> selectByExample(EcsMgrRoleMenuCriteria example);

    EcsMgrRoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EcsMgrRoleMenu record, @Param("example") EcsMgrRoleMenuCriteria example);

    int updateByExample(@Param("record") EcsMgrRoleMenu record, @Param("example") EcsMgrRoleMenuCriteria example);

    int updateByPrimaryKeySelective(EcsMgrRoleMenu record);

    int updateByPrimaryKey(EcsMgrRoleMenu record);
}