package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsArticle;
import com.ecs.manager.core.mybatis.pojo.EcsArticleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsArticleMapper {
    int countByExample(EcsArticleCriteria example);

    int deleteByExample(EcsArticleCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsArticle record);

    int insertSelective(EcsArticle record);

    List<EcsArticle> selectByExampleWithBLOBs(EcsArticleCriteria example);

    List<EcsArticle> selectByExample(EcsArticleCriteria example);

    EcsArticle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsArticle record, @Param("example") EcsArticleCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsArticle record, @Param("example") EcsArticleCriteria example);

    int updateByExample(@Param("record") EcsArticle record, @Param("example") EcsArticleCriteria example);

    int updateByPrimaryKeySelective(EcsArticle record);

    int updateByPrimaryKeyWithBLOBs(EcsArticle record);

    int updateByPrimaryKey(EcsArticle record);
}