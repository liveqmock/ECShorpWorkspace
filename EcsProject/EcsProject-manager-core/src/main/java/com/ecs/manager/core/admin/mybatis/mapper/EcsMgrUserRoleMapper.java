package com.ecs.manager.core.admin.mybatis.mapper;

import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrUserRole;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrUserRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMgrUserRoleMapper {
    int countByExample(EcsMgrUserRoleCriteria example);

    int deleteByExample(EcsMgrUserRoleCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(EcsMgrUserRole record);

    int insertSelective(EcsMgrUserRole record);

    List<EcsMgrUserRole> selectByExample(EcsMgrUserRoleCriteria example);

    EcsMgrUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EcsMgrUserRole record, @Param("example") EcsMgrUserRoleCriteria example);

    int updateByExample(@Param("record") EcsMgrUserRole record, @Param("example") EcsMgrUserRoleCriteria example);

    int updateByPrimaryKeySelective(EcsMgrUserRole record);

    int updateByPrimaryKey(EcsMgrUserRole record);
}