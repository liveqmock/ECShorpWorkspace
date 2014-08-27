package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsAd;
import com.ecs.manager.core.mybatis.pojo.EcsAdCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAdMapper {
    int countByExample(EcsAdCriteria example);

    int deleteByExample(EcsAdCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsAd record);

    int insertSelective(EcsAd record);

    List<EcsAd> selectByExampleWithBLOBs(EcsAdCriteria example);

    List<EcsAd> selectByExample(EcsAdCriteria example);

    EcsAd selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsAd record, @Param("example") EcsAdCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsAd record, @Param("example") EcsAdCriteria example);

    int updateByExample(@Param("record") EcsAd record, @Param("example") EcsAdCriteria example);

    int updateByPrimaryKeySelective(EcsAd record);

    int updateByPrimaryKeyWithBLOBs(EcsAd record);

    int updateByPrimaryKey(EcsAd record);
}