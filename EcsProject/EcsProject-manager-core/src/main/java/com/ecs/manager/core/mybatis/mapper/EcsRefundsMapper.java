package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsRefunds;
import com.ecs.manager.core.mybatis.pojo.EcsRefundsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsRefundsMapper {
    int countByExample(EcsRefundsCriteria example);

    int deleteByExample(EcsRefundsCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsRefunds record);

    int insertSelective(EcsRefunds record);

    List<EcsRefunds> selectByExample(EcsRefundsCriteria example);

    EcsRefunds selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsRefunds record, @Param("example") EcsRefundsCriteria example);

    int updateByExample(@Param("record") EcsRefunds record, @Param("example") EcsRefundsCriteria example);

    int updateByPrimaryKeySelective(EcsRefunds record);

    int updateByPrimaryKey(EcsRefunds record);
}