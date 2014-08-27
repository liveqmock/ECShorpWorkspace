package com.ecs.cms.core.admin.mybatis.mapper;

import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsers;
import com.ecs.cms.core.admin.mybatis.pojo.EcsMgrUsersCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMgrUsersMapper {
    int countByExample(EcsMgrUsersCriteria example);

    int deleteByExample(EcsMgrUsersCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(EcsMgrUsers record);

    int insertSelective(EcsMgrUsers record);

    List<EcsMgrUsers> selectByExample(EcsMgrUsersCriteria example);

    EcsMgrUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EcsMgrUsers record, @Param("example") EcsMgrUsersCriteria example);

    int updateByExample(@Param("record") EcsMgrUsers record, @Param("example") EcsMgrUsersCriteria example);

    int updateByPrimaryKeySelective(EcsMgrUsers record);

    int updateByPrimaryKey(EcsMgrUsers record);
}