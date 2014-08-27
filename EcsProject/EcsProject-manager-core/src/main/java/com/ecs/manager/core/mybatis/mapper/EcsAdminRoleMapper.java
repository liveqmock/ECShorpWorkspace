package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsAdminRoleCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsAdminRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAdminRoleMapper {
    int countByExample(EcsAdminRoleCriteria example);

    int deleteByExample(EcsAdminRoleCriteria example);

    int deleteByPrimaryKey(EcsAdminRoleKey key);

    int insert(EcsAdminRoleKey record);

    int insertSelective(EcsAdminRoleKey record);

    List<EcsAdminRoleKey> selectByExample(EcsAdminRoleCriteria example);

    int updateByExampleSelective(@Param("record") EcsAdminRoleKey record, @Param("example") EcsAdminRoleCriteria example);

    int updateByExample(@Param("record") EcsAdminRoleKey record, @Param("example") EcsAdminRoleCriteria example);
}