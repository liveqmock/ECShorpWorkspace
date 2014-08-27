package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsReview;
import com.ecs.manager.core.mybatis.pojo.EcsReviewCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsReviewMapper {
    int countByExample(EcsReviewCriteria example);

    int deleteByExample(EcsReviewCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsReview record);

    int insertSelective(EcsReview record);

    List<EcsReview> selectByExample(EcsReviewCriteria example);

    EcsReview selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsReview record, @Param("example") EcsReviewCriteria example);

    int updateByExample(@Param("record") EcsReview record, @Param("example") EcsReviewCriteria example);

    int updateByPrimaryKeySelective(EcsReview record);

    int updateByPrimaryKey(EcsReview record);
}