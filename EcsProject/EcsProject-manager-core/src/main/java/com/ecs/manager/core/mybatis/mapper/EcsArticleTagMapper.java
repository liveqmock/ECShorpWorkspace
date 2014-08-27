package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsArticleTagCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsArticleTagKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsArticleTagMapper {
    int countByExample(EcsArticleTagCriteria example);

    int deleteByExample(EcsArticleTagCriteria example);

    int deleteByPrimaryKey(EcsArticleTagKey key);

    int insert(EcsArticleTagKey record);

    int insertSelective(EcsArticleTagKey record);

    List<EcsArticleTagKey> selectByExample(EcsArticleTagCriteria example);

    int updateByExampleSelective(@Param("record") EcsArticleTagKey record, @Param("example") EcsArticleTagCriteria example);

    int updateByExample(@Param("record") EcsArticleTagKey record, @Param("example") EcsArticleTagCriteria example);
}