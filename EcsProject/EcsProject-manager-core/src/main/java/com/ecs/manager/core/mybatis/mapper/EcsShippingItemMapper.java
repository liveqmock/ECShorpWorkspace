package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsShippingItem;
import com.ecs.manager.core.mybatis.pojo.EcsShippingItemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsShippingItemMapper {
    int countByExample(EcsShippingItemCriteria example);

    int deleteByExample(EcsShippingItemCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsShippingItem record);

    int insertSelective(EcsShippingItem record);

    List<EcsShippingItem> selectByExample(EcsShippingItemCriteria example);

    EcsShippingItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsShippingItem record, @Param("example") EcsShippingItemCriteria example);

    int updateByExample(@Param("record") EcsShippingItem record, @Param("example") EcsShippingItemCriteria example);

    int updateByPrimaryKeySelective(EcsShippingItem record);

    int updateByPrimaryKey(EcsShippingItem record);
}