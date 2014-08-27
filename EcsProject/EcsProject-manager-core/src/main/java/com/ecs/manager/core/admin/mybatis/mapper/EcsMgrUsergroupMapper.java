package com.ecs.manager.core.admin.mybatis.mapper;

import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrUsergroup;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrUsergroupCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMgrUsergroupMapper {
    int countByExample(EcsMgrUsergroupCriteria example);

    int deleteByExample(EcsMgrUsergroupCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(EcsMgrUsergroup record);

    int insertSelective(EcsMgrUsergroup record);

    List<EcsMgrUsergroup> selectByExample(EcsMgrUsergroupCriteria example);

    EcsMgrUsergroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EcsMgrUsergroup record, @Param("example") EcsMgrUsergroupCriteria example);

    int updateByExample(@Param("record") EcsMgrUsergroup record, @Param("example") EcsMgrUsergroupCriteria example);

    int updateByPrimaryKeySelective(EcsMgrUsergroup record);

    int updateByPrimaryKey(EcsMgrUsergroup record);
}