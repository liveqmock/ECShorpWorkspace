package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsShipping;
import com.ecs.manager.core.mybatis.pojo.EcsShippingCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsShippingMapper {
    int countByExample(EcsShippingCriteria example);

    int deleteByExample(EcsShippingCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsShipping record);

    int insertSelective(EcsShipping record);

    List<EcsShipping> selectByExample(EcsShippingCriteria example);

    EcsShipping selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsShipping record, @Param("example") EcsShippingCriteria example);

    int updateByExample(@Param("record") EcsShipping record, @Param("example") EcsShippingCriteria example);

    int updateByPrimaryKeySelective(EcsShipping record);

    int updateByPrimaryKey(EcsShipping record);
}