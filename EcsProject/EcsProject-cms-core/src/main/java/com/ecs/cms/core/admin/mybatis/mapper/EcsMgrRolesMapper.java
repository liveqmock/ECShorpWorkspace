package com.ecs.cms.core.admin.mybatis.mapper;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRoles;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrRolesCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMgrRolesMapper {
    int countByExample(EcsMgrRolesCriteria example);

    int deleteByExample(EcsMgrRolesCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(EcsMgrRoles record);

    int insertSelective(EcsMgrRoles record);

    List<EcsMgrRoles> selectByExample(EcsMgrRolesCriteria example);

    EcsMgrRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EcsMgrRoles record, @Param("example") EcsMgrRolesCriteria example);

    int updateByExample(@Param("record") EcsMgrRoles record, @Param("example") EcsMgrRolesCriteria example);

    int updateByPrimaryKeySelective(EcsMgrRoles record);

    int updateByPrimaryKey(EcsMgrRoles record);
}