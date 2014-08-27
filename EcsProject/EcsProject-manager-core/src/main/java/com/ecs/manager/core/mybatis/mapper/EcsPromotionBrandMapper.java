package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPromotionBrandCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsPromotionBrandKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPromotionBrandMapper {
    int countByExample(EcsPromotionBrandCriteria example);

    int deleteByExample(EcsPromotionBrandCriteria example);

    int deleteByPrimaryKey(EcsPromotionBrandKey key);

    int insert(EcsPromotionBrandKey record);

    int insertSelective(EcsPromotionBrandKey record);

    List<EcsPromotionBrandKey> selectByExample(EcsPromotionBrandCriteria example);

    int updateByExampleSelective(@Param("record") EcsPromotionBrandKey record, @Param("example") EcsPromotionBrandCriteria example);

    int updateByExample(@Param("record") EcsPromotionBrandKey record, @Param("example") EcsPromotionBrandCriteria example);
}