package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsProductProductImage;
import com.ecs.manager.core.mybatis.pojo.EcsProductProductImageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsProductProductImageMapper {
    int countByExample(EcsProductProductImageCriteria example);

    int deleteByExample(EcsProductProductImageCriteria example);

    int insert(EcsProductProductImage record);

    int insertSelective(EcsProductProductImage record);

    List<EcsProductProductImage> selectByExample(EcsProductProductImageCriteria example);

    int updateByExampleSelective(@Param("record") EcsProductProductImage record, @Param("example") EcsProductProductImageCriteria example);

    int updateByExample(@Param("record") EcsProductProductImage record, @Param("example") EcsProductProductImageCriteria example);
}