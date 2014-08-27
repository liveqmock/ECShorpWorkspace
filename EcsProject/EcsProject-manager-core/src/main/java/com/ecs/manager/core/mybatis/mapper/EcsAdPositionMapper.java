package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsAdPosition;
import com.ecs.manager.core.mybatis.pojo.EcsAdPositionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAdPositionMapper {
    int countByExample(EcsAdPositionCriteria example);

    int deleteByExample(EcsAdPositionCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsAdPosition record);

    int insertSelective(EcsAdPosition record);

    List<EcsAdPosition> selectByExampleWithBLOBs(EcsAdPositionCriteria example);

    List<EcsAdPosition> selectByExample(EcsAdPositionCriteria example);

    EcsAdPosition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsAdPosition record, @Param("example") EcsAdPositionCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsAdPosition record, @Param("example") EcsAdPositionCriteria example);

    int updateByExample(@Param("record") EcsAdPosition record, @Param("example") EcsAdPositionCriteria example);

    int updateByPrimaryKeySelective(EcsAdPosition record);

    int updateByPrimaryKeyWithBLOBs(EcsAdPosition record);

    int updateByPrimaryKey(EcsAdPosition record);
}