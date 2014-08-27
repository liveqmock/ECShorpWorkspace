package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsSeo;
import com.ecs.manager.core.mybatis.pojo.EcsSeoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsSeoMapper {
    int countByExample(EcsSeoCriteria example);

    int deleteByExample(EcsSeoCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsSeo record);

    int insertSelective(EcsSeo record);

    List<EcsSeo> selectByExample(EcsSeoCriteria example);

    EcsSeo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsSeo record, @Param("example") EcsSeoCriteria example);

    int updateByExample(@Param("record") EcsSeo record, @Param("example") EcsSeoCriteria example);

    int updateByPrimaryKeySelective(EcsSeo record);

    int updateByPrimaryKey(EcsSeo record);
}