package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsReturnsItem;
import com.ecs.manager.core.mybatis.pojo.EcsReturnsItemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsReturnsItemMapper {
    int countByExample(EcsReturnsItemCriteria example);

    int deleteByExample(EcsReturnsItemCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsReturnsItem record);

    int insertSelective(EcsReturnsItem record);

    List<EcsReturnsItem> selectByExample(EcsReturnsItemCriteria example);

    EcsReturnsItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsReturnsItem record, @Param("example") EcsReturnsItemCriteria example);

    int updateByExample(@Param("record") EcsReturnsItem record, @Param("example") EcsReturnsItemCriteria example);

    int updateByPrimaryKeySelective(EcsReturnsItem record);

    int updateByPrimaryKey(EcsReturnsItem record);
}