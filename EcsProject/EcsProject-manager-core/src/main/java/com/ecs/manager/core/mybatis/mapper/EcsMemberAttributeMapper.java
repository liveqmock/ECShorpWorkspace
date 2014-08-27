package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsMemberAttribute;
import com.ecs.manager.core.mybatis.pojo.EcsMemberAttributeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMemberAttributeMapper {
    int countByExample(EcsMemberAttributeCriteria example);

    int deleteByExample(EcsMemberAttributeCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsMemberAttribute record);

    int insertSelective(EcsMemberAttribute record);

    List<EcsMemberAttribute> selectByExample(EcsMemberAttributeCriteria example);

    EcsMemberAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsMemberAttribute record, @Param("example") EcsMemberAttributeCriteria example);

    int updateByExample(@Param("record") EcsMemberAttribute record, @Param("example") EcsMemberAttributeCriteria example);

    int updateByPrimaryKeySelective(EcsMemberAttribute record);

    int updateByPrimaryKey(EcsMemberAttribute record);
}