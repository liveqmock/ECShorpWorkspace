package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsOrderCoupon;
import com.ecs.manager.core.mybatis.pojo.EcsOrderCouponCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsOrderCouponMapper {
    int countByExample(EcsOrderCouponCriteria example);

    int deleteByExample(EcsOrderCouponCriteria example);

    int insert(EcsOrderCoupon record);

    int insertSelective(EcsOrderCoupon record);

    List<EcsOrderCoupon> selectByExample(EcsOrderCouponCriteria example);

    int updateByExampleSelective(@Param("record") EcsOrderCoupon record, @Param("example") EcsOrderCouponCriteria example);

    int updateByExample(@Param("record") EcsOrderCoupon record, @Param("example") EcsOrderCouponCriteria example);
}