package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPluginConfig;
import com.ecs.manager.core.mybatis.pojo.EcsPluginConfigCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPluginConfigMapper {
    int countByExample(EcsPluginConfigCriteria example);

    int deleteByExample(EcsPluginConfigCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsPluginConfig record);

    int insertSelective(EcsPluginConfig record);

    List<EcsPluginConfig> selectByExample(EcsPluginConfigCriteria example);

    EcsPluginConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsPluginConfig record, @Param("example") EcsPluginConfigCriteria example);

    int updateByExample(@Param("record") EcsPluginConfig record, @Param("example") EcsPluginConfigCriteria example);

    int updateByPrimaryKeySelective(EcsPluginConfig record);

    int updateByPrimaryKey(EcsPluginConfig record);
}