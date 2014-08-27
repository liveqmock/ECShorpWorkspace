package com.ecs.manager.core.admin.mybatis.mapper;

import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrMenus;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrMenusCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMgrMenusMapper {
    int countByExample(EcsMgrMenusCriteria example);

    int deleteByExample(EcsMgrMenusCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(EcsMgrMenus record);

    int insertSelective(EcsMgrMenus record);

    List<EcsMgrMenus> selectByExample(EcsMgrMenusCriteria example);

    EcsMgrMenus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EcsMgrMenus record, @Param("example") EcsMgrMenusCriteria example);

    int updateByExample(@Param("record") EcsMgrMenus record, @Param("example") EcsMgrMenusCriteria example);

    int updateByPrimaryKeySelective(EcsMgrMenus record);

    int updateByPrimaryKey(EcsMgrMenus record);
}