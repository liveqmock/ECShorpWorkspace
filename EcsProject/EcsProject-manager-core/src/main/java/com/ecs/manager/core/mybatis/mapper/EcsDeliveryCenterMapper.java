package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsDeliveryCenter;
import com.ecs.manager.core.mybatis.pojo.EcsDeliveryCenterCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsDeliveryCenterMapper {
    int countByExample(EcsDeliveryCenterCriteria example);

    int deleteByExample(EcsDeliveryCenterCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsDeliveryCenter record);

    int insertSelective(EcsDeliveryCenter record);

    List<EcsDeliveryCenter> selectByExample(EcsDeliveryCenterCriteria example);

    EcsDeliveryCenter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsDeliveryCenter record, @Param("example") EcsDeliveryCenterCriteria example);

    int updateByExample(@Param("record") EcsDeliveryCenter record, @Param("example") EcsDeliveryCenterCriteria example);

    int updateByPrimaryKeySelective(EcsDeliveryCenter record);

    int updateByPrimaryKey(EcsDeliveryCenter record);
}