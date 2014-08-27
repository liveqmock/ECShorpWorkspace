package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsAttributeOption;
import com.ecs.manager.core.mybatis.pojo.EcsAttributeOptionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAttributeOptionMapper {
    int countByExample(EcsAttributeOptionCriteria example);

    int deleteByExample(EcsAttributeOptionCriteria example);

    int insert(EcsAttributeOption record);

    int insertSelective(EcsAttributeOption record);

    List<EcsAttributeOption> selectByExample(EcsAttributeOptionCriteria example);

    int updateByExampleSelective(@Param("record") EcsAttributeOption record, @Param("example") EcsAttributeOptionCriteria example);

    int updateByExample(@Param("record") EcsAttributeOption record, @Param("example") EcsAttributeOptionCriteria example);
}