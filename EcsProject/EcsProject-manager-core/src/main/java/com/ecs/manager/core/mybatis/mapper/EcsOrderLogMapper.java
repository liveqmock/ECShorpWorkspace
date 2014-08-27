package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsOrderLog;
import com.ecs.manager.core.mybatis.pojo.EcsOrderLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsOrderLogMapper {
    int countByExample(EcsOrderLogCriteria example);

    int deleteByExample(EcsOrderLogCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsOrderLog record);

    int insertSelective(EcsOrderLog record);

    List<EcsOrderLog> selectByExample(EcsOrderLogCriteria example);

    EcsOrderLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsOrderLog record, @Param("example") EcsOrderLogCriteria example);

    int updateByExample(@Param("record") EcsOrderLog record, @Param("example") EcsOrderLogCriteria example);

    int updateByPrimaryKeySelective(EcsOrderLog record);

    int updateByPrimaryKey(EcsOrderLog record);
}