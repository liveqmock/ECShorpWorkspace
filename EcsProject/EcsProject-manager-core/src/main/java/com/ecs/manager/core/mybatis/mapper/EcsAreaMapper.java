package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsArea;
import com.ecs.manager.core.mybatis.pojo.EcsAreaCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAreaMapper {
    int countByExample(EcsAreaCriteria example);

    int deleteByExample(EcsAreaCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsArea record);

    int insertSelective(EcsArea record);

    List<EcsArea> selectByExampleWithBLOBs(EcsAreaCriteria example);

    List<EcsArea> selectByExample(EcsAreaCriteria example);

    EcsArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsArea record, @Param("example") EcsAreaCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsArea record, @Param("example") EcsAreaCriteria example);

    int updateByExample(@Param("record") EcsArea record, @Param("example") EcsAreaCriteria example);

    int updateByPrimaryKeySelective(EcsArea record);

    int updateByPrimaryKeyWithBLOBs(EcsArea record);

    int updateByPrimaryKey(EcsArea record);
}