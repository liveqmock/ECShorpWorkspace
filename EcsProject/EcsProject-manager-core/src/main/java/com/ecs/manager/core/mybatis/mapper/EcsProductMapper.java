package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsProduct;
import com.ecs.manager.core.mybatis.pojo.EcsProductCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsProductMapper {
    int countByExample(EcsProductCriteria example);

    int deleteByExample(EcsProductCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsProduct record);

    int insertSelective(EcsProduct record);

    List<EcsProduct> selectByExampleWithBLOBs(EcsProductCriteria example);

    List<EcsProduct> selectByExample(EcsProductCriteria example);

    EcsProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsProduct record, @Param("example") EcsProductCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsProduct record, @Param("example") EcsProductCriteria example);

    int updateByExample(@Param("record") EcsProduct record, @Param("example") EcsProductCriteria example);

    int updateByPrimaryKeySelective(EcsProduct record);

    int updateByPrimaryKeyWithBLOBs(EcsProduct record);

    int updateByPrimaryKey(EcsProduct record);
}