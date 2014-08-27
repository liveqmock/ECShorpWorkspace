package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsProductTagCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsProductTagKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsProductTagMapper {
    int countByExample(EcsProductTagCriteria example);

    int deleteByExample(EcsProductTagCriteria example);

    int deleteByPrimaryKey(EcsProductTagKey key);

    int insert(EcsProductTagKey record);

    int insertSelective(EcsProductTagKey record);

    List<EcsProductTagKey> selectByExample(EcsProductTagCriteria example);

    int updateByExampleSelective(@Param("record") EcsProductTagKey record, @Param("example") EcsProductTagCriteria example);

    int updateByExample(@Param("record") EcsProductTagKey record, @Param("example") EcsProductTagCriteria example);
}