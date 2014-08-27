package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPromotionMemberRankCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsPromotionMemberRankKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPromotionMemberRankMapper {
    int countByExample(EcsPromotionMemberRankCriteria example);

    int deleteByExample(EcsPromotionMemberRankCriteria example);

    int deleteByPrimaryKey(EcsPromotionMemberRankKey key);

    int insert(EcsPromotionMemberRankKey record);

    int insertSelective(EcsPromotionMemberRankKey record);

    List<EcsPromotionMemberRankKey> selectByExample(EcsPromotionMemberRankCriteria example);

    int updateByExampleSelective(@Param("record") EcsPromotionMemberRankKey record, @Param("example") EcsPromotionMemberRankCriteria example);

    int updateByExample(@Param("record") EcsPromotionMemberRankKey record, @Param("example") EcsPromotionMemberRankCriteria example);
}