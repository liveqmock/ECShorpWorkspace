package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsRoleAuthority;
import com.ecs.manager.core.mybatis.pojo.EcsRoleAuthorityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsRoleAuthorityMapper {
    int countByExample(EcsRoleAuthorityCriteria example);

    int deleteByExample(EcsRoleAuthorityCriteria example);

    int insert(EcsRoleAuthority record);

    int insertSelective(EcsRoleAuthority record);

    List<EcsRoleAuthority> selectByExample(EcsRoleAuthorityCriteria example);

    int updateByExampleSelective(@Param("record") EcsRoleAuthority record, @Param("example") EcsRoleAuthorityCriteria example);

    int updateByExample(@Param("record") EcsRoleAuthority record, @Param("example") EcsRoleAuthorityCriteria example);
}