package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsSn;
import com.ecs.manager.core.mybatis.pojo.EcsSnCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsSnMapper {
    int countByExample(EcsSnCriteria example);

    int deleteByExample(EcsSnCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsSn record);

    int insertSelective(EcsSn record);

    List<EcsSn> selectByExample(EcsSnCriteria example);

    EcsSn selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsSn record, @Param("example") EcsSnCriteria example);

    int updateByExample(@Param("record") EcsSn record, @Param("example") EcsSnCriteria example);

    int updateByPrimaryKeySelective(EcsSn record);

    int updateByPrimaryKey(EcsSn record);
}