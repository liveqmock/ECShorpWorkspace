package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsDeliveryCorp;
import com.ecs.manager.core.mybatis.pojo.EcsDeliveryCorpCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsDeliveryCorpMapper {
    int countByExample(EcsDeliveryCorpCriteria example);

    int deleteByExample(EcsDeliveryCorpCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsDeliveryCorp record);

    int insertSelective(EcsDeliveryCorp record);

    List<EcsDeliveryCorp> selectByExample(EcsDeliveryCorpCriteria example);

    EcsDeliveryCorp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsDeliveryCorp record, @Param("example") EcsDeliveryCorpCriteria example);

    int updateByExample(@Param("record") EcsDeliveryCorp record, @Param("example") EcsDeliveryCorpCriteria example);

    int updateByPrimaryKeySelective(EcsDeliveryCorp record);

    int updateByPrimaryKey(EcsDeliveryCorp record);
}