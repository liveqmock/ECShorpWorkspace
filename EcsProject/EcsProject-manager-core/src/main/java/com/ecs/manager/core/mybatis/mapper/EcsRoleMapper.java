package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsRole;
import com.ecs.manager.core.mybatis.pojo.EcsRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsRoleMapper {
    int countByExample(EcsRoleCriteria example);

    int deleteByExample(EcsRoleCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsRole record);

    int insertSelective(EcsRole record);

    List<EcsRole> selectByExample(EcsRoleCriteria example);

    EcsRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsRole record, @Param("example") EcsRoleCriteria example);

    int updateByExample(@Param("record") EcsRole record, @Param("example") EcsRoleCriteria example);

    int updateByPrimaryKeySelective(EcsRole record);

    int updateByPrimaryKey(EcsRole record);
}