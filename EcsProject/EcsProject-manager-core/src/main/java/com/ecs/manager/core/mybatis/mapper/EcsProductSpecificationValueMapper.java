package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsProductSpecificationValueCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsProductSpecificationValueKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsProductSpecificationValueMapper {
    int countByExample(EcsProductSpecificationValueCriteria example);

    int deleteByExample(EcsProductSpecificationValueCriteria example);

    int deleteByPrimaryKey(EcsProductSpecificationValueKey key);

    int insert(EcsProductSpecificationValueKey record);

    int insertSelective(EcsProductSpecificationValueKey record);

    List<EcsProductSpecificationValueKey> selectByExample(EcsProductSpecificationValueCriteria example);

    int updateByExampleSelective(@Param("record") EcsProductSpecificationValueKey record, @Param("example") EcsProductSpecificationValueCriteria example);

    int updateByExample(@Param("record") EcsProductSpecificationValueKey record, @Param("example") EcsProductSpecificationValueCriteria example);
}