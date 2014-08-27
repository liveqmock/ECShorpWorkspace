package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsProductCategory;
import com.ecs.manager.core.mybatis.pojo.EcsProductCategoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsProductCategoryMapper {
    int countByExample(EcsProductCategoryCriteria example);

    int deleteByExample(EcsProductCategoryCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsProductCategory record);

    int insertSelective(EcsProductCategory record);

    List<EcsProductCategory> selectByExample(EcsProductCategoryCriteria example);

    EcsProductCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsProductCategory record, @Param("example") EcsProductCategoryCriteria example);

    int updateByExample(@Param("record") EcsProductCategory record, @Param("example") EcsProductCategoryCriteria example);

    int updateByPrimaryKeySelective(EcsProductCategory record);

    int updateByPrimaryKey(EcsProductCategory record);
}