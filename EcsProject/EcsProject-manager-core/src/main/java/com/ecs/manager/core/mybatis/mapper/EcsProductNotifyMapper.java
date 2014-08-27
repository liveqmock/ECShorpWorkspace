package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsProductNotify;
import com.ecs.manager.core.mybatis.pojo.EcsProductNotifyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsProductNotifyMapper {
    int countByExample(EcsProductNotifyCriteria example);

    int deleteByExample(EcsProductNotifyCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsProductNotify record);

    int insertSelective(EcsProductNotify record);

    List<EcsProductNotify> selectByExample(EcsProductNotifyCriteria example);

    EcsProductNotify selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsProductNotify record, @Param("example") EcsProductNotifyCriteria example);

    int updateByExample(@Param("record") EcsProductNotify record, @Param("example") EcsProductNotifyCriteria example);

    int updateByPrimaryKeySelective(EcsProductNotify record);

    int updateByPrimaryKey(EcsProductNotify record);
}