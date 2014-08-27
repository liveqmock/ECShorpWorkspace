package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsCartItem;
import com.ecs.manager.core.mybatis.pojo.EcsCartItemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsCartItemMapper {
    int countByExample(EcsCartItemCriteria example);

    int deleteByExample(EcsCartItemCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsCartItem record);

    int insertSelective(EcsCartItem record);

    List<EcsCartItem> selectByExample(EcsCartItemCriteria example);

    EcsCartItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsCartItem record, @Param("example") EcsCartItemCriteria example);

    int updateByExample(@Param("record") EcsCartItem record, @Param("example") EcsCartItemCriteria example);

    int updateByPrimaryKeySelective(EcsCartItem record);

    int updateByPrimaryKey(EcsCartItem record);
}