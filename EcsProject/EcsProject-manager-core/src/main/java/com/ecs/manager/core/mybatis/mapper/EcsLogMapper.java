package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsLog;
import com.ecs.manager.core.mybatis.pojo.EcsLogCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsLogMapper {
    int countByExample(EcsLogCriteria example);

    int deleteByExample(EcsLogCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsLogWithBLOBs record);

    int insertSelective(EcsLogWithBLOBs record);

    List<EcsLogWithBLOBs> selectByExampleWithBLOBs(EcsLogCriteria example);

    List<EcsLog> selectByExample(EcsLogCriteria example);

    EcsLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsLogWithBLOBs record, @Param("example") EcsLogCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsLogWithBLOBs record, @Param("example") EcsLogCriteria example);

    int updateByExample(@Param("record") EcsLog record, @Param("example") EcsLogCriteria example);

    int updateByPrimaryKeySelective(EcsLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EcsLogWithBLOBs record);

    int updateByPrimaryKey(EcsLog record);
}