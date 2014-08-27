package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsTag;
import com.ecs.manager.core.mybatis.pojo.EcsTagCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsTagMapper {
    int countByExample(EcsTagCriteria example);

    int deleteByExample(EcsTagCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsTag record);

    int insertSelective(EcsTag record);

    List<EcsTag> selectByExample(EcsTagCriteria example);

    EcsTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsTag record, @Param("example") EcsTagCriteria example);

    int updateByExample(@Param("record") EcsTag record, @Param("example") EcsTagCriteria example);

    int updateByPrimaryKeySelective(EcsTag record);

    int updateByPrimaryKey(EcsTag record);
}