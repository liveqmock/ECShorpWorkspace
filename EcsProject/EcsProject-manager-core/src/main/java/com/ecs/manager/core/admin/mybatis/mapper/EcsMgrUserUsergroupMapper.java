package com.ecs.manager.core.admin.mybatis.mapper;

import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrUserUsergroup;
import com.ecs.manager.core.admin.mybatis.pojo.EcsMgrUserUsergroupCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMgrUserUsergroupMapper {
    int countByExample(EcsMgrUserUsergroupCriteria example);

    int deleteByExample(EcsMgrUserUsergroupCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(EcsMgrUserUsergroup record);

    int insertSelective(EcsMgrUserUsergroup record);

    List<EcsMgrUserUsergroup> selectByExample(EcsMgrUserUsergroupCriteria example);

    EcsMgrUserUsergroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EcsMgrUserUsergroup record, @Param("example") EcsMgrUserUsergroupCriteria example);

    int updateByExample(@Param("record") EcsMgrUserUsergroup record, @Param("example") EcsMgrUserUsergroupCriteria example);

    int updateByPrimaryKeySelective(EcsMgrUserUsergroup record);

    int updateByPrimaryKey(EcsMgrUserUsergroup record);
}