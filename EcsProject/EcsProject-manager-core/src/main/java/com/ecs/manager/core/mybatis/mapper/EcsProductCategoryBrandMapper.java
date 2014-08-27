package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsProductCategoryBrandCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsProductCategoryBrandKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsProductCategoryBrandMapper {
    int countByExample(EcsProductCategoryBrandCriteria example);

    int deleteByExample(EcsProductCategoryBrandCriteria example);

    int deleteByPrimaryKey(EcsProductCategoryBrandKey key);

    int insert(EcsProductCategoryBrandKey record);

    int insertSelective(EcsProductCategoryBrandKey record);

    List<EcsProductCategoryBrandKey> selectByExample(EcsProductCategoryBrandCriteria example);

    int updateByExampleSelective(@Param("record") EcsProductCategoryBrandKey record, @Param("example") EcsProductCategoryBrandCriteria example);

    int updateByExample(@Param("record") EcsProductCategoryBrandKey record, @Param("example") EcsProductCategoryBrandCriteria example);
}