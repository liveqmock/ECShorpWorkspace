package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPaymentMethod;
import com.ecs.manager.core.mybatis.pojo.EcsPaymentMethodCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPaymentMethodMapper {
    int countByExample(EcsPaymentMethodCriteria example);

    int deleteByExample(EcsPaymentMethodCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsPaymentMethod record);

    int insertSelective(EcsPaymentMethod record);

    List<EcsPaymentMethod> selectByExampleWithBLOBs(EcsPaymentMethodCriteria example);

    List<EcsPaymentMethod> selectByExample(EcsPaymentMethodCriteria example);

    EcsPaymentMethod selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsPaymentMethod record, @Param("example") EcsPaymentMethodCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsPaymentMethod record, @Param("example") EcsPaymentMethodCriteria example);

    int updateByExample(@Param("record") EcsPaymentMethod record, @Param("example") EcsPaymentMethodCriteria example);

    int updateByPrimaryKeySelective(EcsPaymentMethod record);

    int updateByPrimaryKeyWithBLOBs(EcsPaymentMethod record);

    int updateByPrimaryKey(EcsPaymentMethod record);
}