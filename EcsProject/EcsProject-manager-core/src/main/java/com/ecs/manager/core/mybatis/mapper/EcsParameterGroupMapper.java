package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsParameterGroup;
import com.ecs.manager.core.mybatis.pojo.EcsParameterGroupCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsParameterGroupMapper {
    int countByExample(EcsParameterGroupCriteria example);

    int deleteByExample(EcsParameterGroupCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsParameterGroup record);

    int insertSelective(EcsParameterGroup record);

    List<EcsParameterGroup> selectByExample(EcsParameterGroupCriteria example);

    EcsParameterGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsParameterGroup record, @Param("example") EcsParameterGroupCriteria example);

    int updateByExample(@Param("record") EcsParameterGroup record, @Param("example") EcsParameterGroupCriteria example);

    int updateByPrimaryKeySelective(EcsParameterGroup record);

    int updateByPrimaryKey(EcsParameterGroup record);
}