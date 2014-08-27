package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsProductSpecificationCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsProductSpecificationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsProductSpecificationMapper {
    int countByExample(EcsProductSpecificationCriteria example);

    int deleteByExample(EcsProductSpecificationCriteria example);

    int deleteByPrimaryKey(EcsProductSpecificationKey key);

    int insert(EcsProductSpecificationKey record);

    int insertSelective(EcsProductSpecificationKey record);

    List<EcsProductSpecificationKey> selectByExample(EcsProductSpecificationCriteria example);

    int updateByExampleSelective(@Param("record") EcsProductSpecificationKey record, @Param("example") EcsProductSpecificationCriteria example);

    int updateByExample(@Param("record") EcsProductSpecificationKey record, @Param("example") EcsProductSpecificationCriteria example);
}