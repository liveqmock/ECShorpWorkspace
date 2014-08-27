package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPromotionProductCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsPromotionProductKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPromotionProductMapper {
    int countByExample(EcsPromotionProductCriteria example);

    int deleteByExample(EcsPromotionProductCriteria example);

    int deleteByPrimaryKey(EcsPromotionProductKey key);

    int insert(EcsPromotionProductKey record);

    int insertSelective(EcsPromotionProductKey record);

    List<EcsPromotionProductKey> selectByExample(EcsPromotionProductCriteria example);

    int updateByExampleSelective(@Param("record") EcsPromotionProductKey record, @Param("example") EcsPromotionProductCriteria example);

    int updateByExample(@Param("record") EcsPromotionProductKey record, @Param("example") EcsPromotionProductCriteria example);
}