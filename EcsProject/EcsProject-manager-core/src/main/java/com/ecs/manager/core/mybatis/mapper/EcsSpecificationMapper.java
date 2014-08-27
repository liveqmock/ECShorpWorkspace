package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsSpecification;
import com.ecs.manager.core.mybatis.pojo.EcsSpecificationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsSpecificationMapper {
    int countByExample(EcsSpecificationCriteria example);

    int deleteByExample(EcsSpecificationCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsSpecification record);

    int insertSelective(EcsSpecification record);

    List<EcsSpecification> selectByExample(EcsSpecificationCriteria example);

    EcsSpecification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsSpecification record, @Param("example") EcsSpecificationCriteria example);

    int updateByExample(@Param("record") EcsSpecification record, @Param("example") EcsSpecificationCriteria example);

    int updateByPrimaryKeySelective(EcsSpecification record);

    int updateByPrimaryKey(EcsSpecification record);
}