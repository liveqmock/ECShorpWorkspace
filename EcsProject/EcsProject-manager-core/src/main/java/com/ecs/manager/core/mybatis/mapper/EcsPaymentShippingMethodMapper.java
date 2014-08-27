package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPaymentShippingMethodCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsPaymentShippingMethodKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPaymentShippingMethodMapper {
    int countByExample(EcsPaymentShippingMethodCriteria example);

    int deleteByExample(EcsPaymentShippingMethodCriteria example);

    int deleteByPrimaryKey(EcsPaymentShippingMethodKey key);

    int insert(EcsPaymentShippingMethodKey record);

    int insertSelective(EcsPaymentShippingMethodKey record);

    List<EcsPaymentShippingMethodKey> selectByExample(EcsPaymentShippingMethodCriteria example);

    int updateByExampleSelective(@Param("record") EcsPaymentShippingMethodKey record, @Param("example") EcsPaymentShippingMethodCriteria example);

    int updateByExample(@Param("record") EcsPaymentShippingMethodKey record, @Param("example") EcsPaymentShippingMethodCriteria example);
}