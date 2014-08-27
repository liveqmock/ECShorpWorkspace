package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsOrder;
import com.ecs.manager.core.mybatis.pojo.EcsOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsOrderMapper {
    int countByExample(EcsOrderCriteria example);

    int deleteByExample(EcsOrderCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsOrder record);

    int insertSelective(EcsOrder record);

    List<EcsOrder> selectByExample(EcsOrderCriteria example);

    EcsOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsOrder record, @Param("example") EcsOrderCriteria example);

    int updateByExample(@Param("record") EcsOrder record, @Param("example") EcsOrderCriteria example);

    int updateByPrimaryKeySelective(EcsOrder record);

    int updateByPrimaryKey(EcsOrder record);
}