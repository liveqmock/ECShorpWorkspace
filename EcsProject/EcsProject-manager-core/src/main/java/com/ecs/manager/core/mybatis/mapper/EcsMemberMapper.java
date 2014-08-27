package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsMember;
import com.ecs.manager.core.mybatis.pojo.EcsMemberCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMemberMapper {
    int countByExample(EcsMemberCriteria example);

    int deleteByExample(EcsMemberCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsMember record);

    int insertSelective(EcsMember record);

    List<EcsMember> selectByExample(EcsMemberCriteria example);

    EcsMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsMember record, @Param("example") EcsMemberCriteria example);

    int updateByExample(@Param("record") EcsMember record, @Param("example") EcsMemberCriteria example);

    int updateByPrimaryKeySelective(EcsMember record);

    int updateByPrimaryKey(EcsMember record);
}