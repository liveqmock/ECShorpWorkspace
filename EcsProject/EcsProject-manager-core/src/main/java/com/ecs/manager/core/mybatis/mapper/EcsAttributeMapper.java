package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsAttribute;
import com.ecs.manager.core.mybatis.pojo.EcsAttributeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAttributeMapper {
    int countByExample(EcsAttributeCriteria example);

    int deleteByExample(EcsAttributeCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsAttribute record);

    int insertSelective(EcsAttribute record);

    List<EcsAttribute> selectByExample(EcsAttributeCriteria example);

    EcsAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsAttribute record, @Param("example") EcsAttributeCriteria example);

    int updateByExample(@Param("record") EcsAttribute record, @Param("example") EcsAttributeCriteria example);

    int updateByPrimaryKeySelective(EcsAttribute record);

    int updateByPrimaryKey(EcsAttribute record);
}