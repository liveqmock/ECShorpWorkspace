package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsOrderItem;
import com.ecs.manager.core.mybatis.pojo.EcsOrderItemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsOrderItemMapper {
    int countByExample(EcsOrderItemCriteria example);

    int deleteByExample(EcsOrderItemCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsOrderItem record);

    int insertSelective(EcsOrderItem record);

    List<EcsOrderItem> selectByExample(EcsOrderItemCriteria example);

    EcsOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsOrderItem record, @Param("example") EcsOrderItemCriteria example);

    int updateByExample(@Param("record") EcsOrderItem record, @Param("example") EcsOrderItemCriteria example);

    int updateByPrimaryKeySelective(EcsOrderItem record);

    int updateByPrimaryKey(EcsOrderItem record);
}