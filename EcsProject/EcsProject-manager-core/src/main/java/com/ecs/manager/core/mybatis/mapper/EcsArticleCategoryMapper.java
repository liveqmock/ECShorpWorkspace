package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsArticleCategory;
import com.ecs.manager.core.mybatis.pojo.EcsArticleCategoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsArticleCategoryMapper {
    int countByExample(EcsArticleCategoryCriteria example);

    int deleteByExample(EcsArticleCategoryCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsArticleCategory record);

    int insertSelective(EcsArticleCategory record);

    List<EcsArticleCategory> selectByExample(EcsArticleCategoryCriteria example);

    EcsArticleCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsArticleCategory record, @Param("example") EcsArticleCategoryCriteria example);

    int updateByExample(@Param("record") EcsArticleCategory record, @Param("example") EcsArticleCategoryCriteria example);

    int updateByPrimaryKeySelective(EcsArticleCategory record);

    int updateByPrimaryKey(EcsArticleCategory record);
}