package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPluginConfigAttribute;
import com.ecs.manager.core.mybatis.pojo.EcsPluginConfigAttributeCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsPluginConfigAttributeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPluginConfigAttributeMapper {
    int countByExample(EcsPluginConfigAttributeCriteria example);

    int deleteByExample(EcsPluginConfigAttributeCriteria example);

    int deleteByPrimaryKey(EcsPluginConfigAttributeKey key);

    int insert(EcsPluginConfigAttribute record);

    int insertSelective(EcsPluginConfigAttribute record);

    List<EcsPluginConfigAttribute> selectByExample(EcsPluginConfigAttributeCriteria example);

    EcsPluginConfigAttribute selectByPrimaryKey(EcsPluginConfigAttributeKey key);

    int updateByExampleSelective(@Param("record") EcsPluginConfigAttribute record, @Param("example") EcsPluginConfigAttributeCriteria example);

    int updateByExample(@Param("record") EcsPluginConfigAttribute record, @Param("example") EcsPluginConfigAttributeCriteria example);

    int updateByPrimaryKeySelective(EcsPluginConfigAttribute record);

    int updateByPrimaryKey(EcsPluginConfigAttribute record);
}