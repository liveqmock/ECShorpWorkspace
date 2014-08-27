package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsShippingMethod;
import com.ecs.manager.core.mybatis.pojo.EcsShippingMethodCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsShippingMethodMapper {
    int countByExample(EcsShippingMethodCriteria example);

    int deleteByExample(EcsShippingMethodCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsShippingMethod record);

    int insertSelective(EcsShippingMethod record);

    List<EcsShippingMethod> selectByExampleWithBLOBs(EcsShippingMethodCriteria example);

    List<EcsShippingMethod> selectByExample(EcsShippingMethodCriteria example);

    EcsShippingMethod selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsShippingMethod record, @Param("example") EcsShippingMethodCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsShippingMethod record, @Param("example") EcsShippingMethodCriteria example);

    int updateByExample(@Param("record") EcsShippingMethod record, @Param("example") EcsShippingMethodCriteria example);

    int updateByPrimaryKeySelective(EcsShippingMethod record);

    int updateByPrimaryKeyWithBLOBs(EcsShippingMethod record);

    int updateByPrimaryKey(EcsShippingMethod record);
}