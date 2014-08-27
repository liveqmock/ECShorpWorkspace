package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPromotionProductCategoryCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsPromotionProductCategoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPromotionProductCategoryMapper {
    int countByExample(EcsPromotionProductCategoryCriteria example);

    int deleteByExample(EcsPromotionProductCategoryCriteria example);

    int deleteByPrimaryKey(EcsPromotionProductCategoryKey key);

    int insert(EcsPromotionProductCategoryKey record);

    int insertSelective(EcsPromotionProductCategoryKey record);

    List<EcsPromotionProductCategoryKey> selectByExample(EcsPromotionProductCategoryCriteria example);

    int updateByExampleSelective(@Param("record") EcsPromotionProductCategoryKey record, @Param("example") EcsPromotionProductCategoryCriteria example);

    int updateByExample(@Param("record") EcsPromotionProductCategoryKey record, @Param("example") EcsPromotionProductCategoryCriteria example);
}