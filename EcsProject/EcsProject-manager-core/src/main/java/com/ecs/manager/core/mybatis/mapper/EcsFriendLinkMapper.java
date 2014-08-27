package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsFriendLink;
import com.ecs.manager.core.mybatis.pojo.EcsFriendLinkCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsFriendLinkMapper {
    int countByExample(EcsFriendLinkCriteria example);

    int deleteByExample(EcsFriendLinkCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsFriendLink record);

    int insertSelective(EcsFriendLink record);

    List<EcsFriendLink> selectByExample(EcsFriendLinkCriteria example);

    EcsFriendLink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsFriendLink record, @Param("example") EcsFriendLinkCriteria example);

    int updateByExample(@Param("record") EcsFriendLink record, @Param("example") EcsFriendLinkCriteria example);

    int updateByPrimaryKeySelective(EcsFriendLink record);

    int updateByPrimaryKey(EcsFriendLink record);
}