package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsMemberAttributeOption;
import com.ecs.manager.core.mybatis.pojo.EcsMemberAttributeOptionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMemberAttributeOptionMapper {
    int countByExample(EcsMemberAttributeOptionCriteria example);

    int deleteByExample(EcsMemberAttributeOptionCriteria example);

    int insert(EcsMemberAttributeOption record);

    int insertSelective(EcsMemberAttributeOption record);

    List<EcsMemberAttributeOption> selectByExample(EcsMemberAttributeOptionCriteria example);

    int updateByExampleSelective(@Param("record") EcsMemberAttributeOption record, @Param("example") EcsMemberAttributeOptionCriteria example);

    int updateByExample(@Param("record") EcsMemberAttributeOption record, @Param("example") EcsMemberAttributeOptionCriteria example);
}