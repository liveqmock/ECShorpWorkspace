package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsMemberRank;
import com.ecs.manager.core.mybatis.pojo.EcsMemberRankCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMemberRankMapper {
    int countByExample(EcsMemberRankCriteria example);

    int deleteByExample(EcsMemberRankCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsMemberRank record);

    int insertSelective(EcsMemberRank record);

    List<EcsMemberRank> selectByExample(EcsMemberRankCriteria example);

    EcsMemberRank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsMemberRank record, @Param("example") EcsMemberRankCriteria example);

    int updateByExample(@Param("record") EcsMemberRank record, @Param("example") EcsMemberRankCriteria example);

    int updateByPrimaryKeySelective(EcsMemberRank record);

    int updateByPrimaryKey(EcsMemberRank record);
}