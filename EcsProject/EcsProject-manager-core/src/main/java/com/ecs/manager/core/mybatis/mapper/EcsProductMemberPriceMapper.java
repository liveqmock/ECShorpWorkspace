package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsProductMemberPrice;
import com.ecs.manager.core.mybatis.pojo.EcsProductMemberPriceCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsProductMemberPriceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsProductMemberPriceMapper {
    int countByExample(EcsProductMemberPriceCriteria example);

    int deleteByExample(EcsProductMemberPriceCriteria example);

    int deleteByPrimaryKey(EcsProductMemberPriceKey key);

    int insert(EcsProductMemberPrice record);

    int insertSelective(EcsProductMemberPrice record);

    List<EcsProductMemberPrice> selectByExample(EcsProductMemberPriceCriteria example);

    EcsProductMemberPrice selectByPrimaryKey(EcsProductMemberPriceKey key);

    int updateByExampleSelective(@Param("record") EcsProductMemberPrice record, @Param("example") EcsProductMemberPriceCriteria example);

    int updateByExample(@Param("record") EcsProductMemberPrice record, @Param("example") EcsProductMemberPriceCriteria example);

    int updateByPrimaryKeySelective(EcsProductMemberPrice record);

    int updateByPrimaryKey(EcsProductMemberPrice record);
}