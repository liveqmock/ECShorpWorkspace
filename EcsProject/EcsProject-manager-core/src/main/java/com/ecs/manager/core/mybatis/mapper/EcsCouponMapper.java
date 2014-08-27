package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsCoupon;
import com.ecs.manager.core.mybatis.pojo.EcsCouponCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsCouponMapper {
    int countByExample(EcsCouponCriteria example);

    int deleteByExample(EcsCouponCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsCoupon record);

    int insertSelective(EcsCoupon record);

    List<EcsCoupon> selectByExampleWithBLOBs(EcsCouponCriteria example);

    List<EcsCoupon> selectByExample(EcsCouponCriteria example);

    EcsCoupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsCoupon record, @Param("example") EcsCouponCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsCoupon record, @Param("example") EcsCouponCriteria example);

    int updateByExample(@Param("record") EcsCoupon record, @Param("example") EcsCouponCriteria example);

    int updateByPrimaryKeySelective(EcsCoupon record);

    int updateByPrimaryKeyWithBLOBs(EcsCoupon record);

    int updateByPrimaryKey(EcsCoupon record);
}