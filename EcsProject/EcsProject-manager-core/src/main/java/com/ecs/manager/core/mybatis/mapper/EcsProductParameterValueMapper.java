package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsProductParameterValue;
import com.ecs.manager.core.mybatis.pojo.EcsProductParameterValueCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsProductParameterValueKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsProductParameterValueMapper {
    int countByExample(EcsProductParameterValueCriteria example);

    int deleteByExample(EcsProductParameterValueCriteria example);

    int deleteByPrimaryKey(EcsProductParameterValueKey key);

    int insert(EcsProductParameterValue record);

    int insertSelective(EcsProductParameterValue record);

    List<EcsProductParameterValue> selectByExample(EcsProductParameterValueCriteria example);

    EcsProductParameterValue selectByPrimaryKey(EcsProductParameterValueKey key);

    int updateByExampleSelective(@Param("record") EcsProductParameterValue record, @Param("example") EcsProductParameterValueCriteria example);

    int updateByExample(@Param("record") EcsProductParameterValue record, @Param("example") EcsProductParameterValueCriteria example);

    int updateByPrimaryKeySelective(EcsProductParameterValue record);

    int updateByPrimaryKey(EcsProductParameterValue record);
}