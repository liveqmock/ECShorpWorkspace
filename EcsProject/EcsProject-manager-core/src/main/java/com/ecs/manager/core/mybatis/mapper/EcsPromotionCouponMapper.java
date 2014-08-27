package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPromotionCouponCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsPromotionCouponKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPromotionCouponMapper {
    int countByExample(EcsPromotionCouponCriteria example);

    int deleteByExample(EcsPromotionCouponCriteria example);

    int deleteByPrimaryKey(EcsPromotionCouponKey key);

    int insert(EcsPromotionCouponKey record);

    int insertSelective(EcsPromotionCouponKey record);

    List<EcsPromotionCouponKey> selectByExample(EcsPromotionCouponCriteria example);

    int updateByExampleSelective(@Param("record") EcsPromotionCouponKey record, @Param("example") EcsPromotionCouponCriteria example);

    int updateByExample(@Param("record") EcsPromotionCouponKey record, @Param("example") EcsPromotionCouponCriteria example);
}