package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsReturns;
import com.ecs.manager.core.mybatis.pojo.EcsReturnsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsReturnsMapper {
    int countByExample(EcsReturnsCriteria example);

    int deleteByExample(EcsReturnsCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsReturns record);

    int insertSelective(EcsReturns record);

    List<EcsReturns> selectByExample(EcsReturnsCriteria example);

    EcsReturns selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsReturns record, @Param("example") EcsReturnsCriteria example);

    int updateByExample(@Param("record") EcsReturns record, @Param("example") EcsReturnsCriteria example);

    int updateByPrimaryKeySelective(EcsReturns record);

    int updateByPrimaryKey(EcsReturns record);
}