package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsBrand;
import com.ecs.manager.core.mybatis.pojo.EcsBrandCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsBrandMapper {
    int countByExample(EcsBrandCriteria example);

    int deleteByExample(EcsBrandCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsBrand record);

    int insertSelective(EcsBrand record);

    List<EcsBrand> selectByExampleWithBLOBs(EcsBrandCriteria example);

    List<EcsBrand> selectByExample(EcsBrandCriteria example);

    EcsBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsBrand record, @Param("example") EcsBrandCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsBrand record, @Param("example") EcsBrandCriteria example);

    int updateByExample(@Param("record") EcsBrand record, @Param("example") EcsBrandCriteria example);

    int updateByPrimaryKeySelective(EcsBrand record);

    int updateByPrimaryKeyWithBLOBs(EcsBrand record);

    int updateByPrimaryKey(EcsBrand record);
}