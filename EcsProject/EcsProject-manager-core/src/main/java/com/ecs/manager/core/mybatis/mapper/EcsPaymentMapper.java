package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPayment;
import com.ecs.manager.core.mybatis.pojo.EcsPaymentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPaymentMapper {
    int countByExample(EcsPaymentCriteria example);

    int deleteByExample(EcsPaymentCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsPayment record);

    int insertSelective(EcsPayment record);

    List<EcsPayment> selectByExample(EcsPaymentCriteria example);

    EcsPayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsPayment record, @Param("example") EcsPaymentCriteria example);

    int updateByExample(@Param("record") EcsPayment record, @Param("example") EcsPaymentCriteria example);

    int updateByPrimaryKeySelective(EcsPayment record);

    int updateByPrimaryKey(EcsPayment record);
}