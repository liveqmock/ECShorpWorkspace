package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsGoods;
import com.ecs.manager.core.mybatis.pojo.EcsGoodsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsGoodsMapper {
    int countByExample(EcsGoodsCriteria example);

    int deleteByExample(EcsGoodsCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsGoods record);

    int insertSelective(EcsGoods record);

    List<EcsGoods> selectByExample(EcsGoodsCriteria example);

    EcsGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsGoods record, @Param("example") EcsGoodsCriteria example);

    int updateByExample(@Param("record") EcsGoods record, @Param("example") EcsGoodsCriteria example);

    int updateByPrimaryKeySelective(EcsGoods record);

    int updateByPrimaryKey(EcsGoods record);
}