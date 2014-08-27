package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsCart;
import com.ecs.manager.core.mybatis.pojo.EcsCartCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsCartMapper {
    int countByExample(EcsCartCriteria example);

    int deleteByExample(EcsCartCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsCart record);

    int insertSelective(EcsCart record);

    List<EcsCart> selectByExample(EcsCartCriteria example);

    EcsCart selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsCart record, @Param("example") EcsCartCriteria example);

    int updateByExample(@Param("record") EcsCart record, @Param("example") EcsCartCriteria example);

    int updateByPrimaryKeySelective(EcsCart record);

    int updateByPrimaryKey(EcsCart record);
}