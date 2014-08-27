package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsParameter;
import com.ecs.manager.core.mybatis.pojo.EcsParameterCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsParameterMapper {
    int countByExample(EcsParameterCriteria example);

    int deleteByExample(EcsParameterCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsParameter record);

    int insertSelective(EcsParameter record);

    List<EcsParameter> selectByExample(EcsParameterCriteria example);

    EcsParameter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsParameter record, @Param("example") EcsParameterCriteria example);

    int updateByExample(@Param("record") EcsParameter record, @Param("example") EcsParameterCriteria example);

    int updateByPrimaryKeySelective(EcsParameter record);

    int updateByPrimaryKey(EcsParameter record);
}