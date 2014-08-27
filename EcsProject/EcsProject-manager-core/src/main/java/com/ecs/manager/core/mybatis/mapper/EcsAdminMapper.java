package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsAdmin;
import com.ecs.manager.core.mybatis.pojo.EcsAdminCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAdminMapper {
    int countByExample(EcsAdminCriteria example);

    int deleteByExample(EcsAdminCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsAdmin record);

    int insertSelective(EcsAdmin record);

    List<EcsAdmin> selectByExample(EcsAdminCriteria example);

    EcsAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsAdmin record, @Param("example") EcsAdminCriteria example);

    int updateByExample(@Param("record") EcsAdmin record, @Param("example") EcsAdminCriteria example);

    int updateByPrimaryKeySelective(EcsAdmin record);

    int updateByPrimaryKey(EcsAdmin record);
}