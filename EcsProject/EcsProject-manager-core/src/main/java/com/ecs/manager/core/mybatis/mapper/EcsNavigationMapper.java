package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsNavigation;
import com.ecs.manager.core.mybatis.pojo.EcsNavigationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsNavigationMapper {
    int countByExample(EcsNavigationCriteria example);

    int deleteByExample(EcsNavigationCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsNavigation record);

    int insertSelective(EcsNavigation record);

    List<EcsNavigation> selectByExample(EcsNavigationCriteria example);

    EcsNavigation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsNavigation record, @Param("example") EcsNavigationCriteria example);

    int updateByExample(@Param("record") EcsNavigation record, @Param("example") EcsNavigationCriteria example);

    int updateByPrimaryKeySelective(EcsNavigation record);

    int updateByPrimaryKey(EcsNavigation record);
}