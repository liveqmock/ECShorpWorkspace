package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsSpecificationValue;
import com.ecs.manager.core.mybatis.pojo.EcsSpecificationValueCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsSpecificationValueMapper {
    int countByExample(EcsSpecificationValueCriteria example);

    int deleteByExample(EcsSpecificationValueCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsSpecificationValue record);

    int insertSelective(EcsSpecificationValue record);

    List<EcsSpecificationValue> selectByExample(EcsSpecificationValueCriteria example);

    EcsSpecificationValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsSpecificationValue record, @Param("example") EcsSpecificationValueCriteria example);

    int updateByExample(@Param("record") EcsSpecificationValue record, @Param("example") EcsSpecificationValueCriteria example);

    int updateByPrimaryKeySelective(EcsSpecificationValue record);

    int updateByPrimaryKey(EcsSpecificationValue record);
}