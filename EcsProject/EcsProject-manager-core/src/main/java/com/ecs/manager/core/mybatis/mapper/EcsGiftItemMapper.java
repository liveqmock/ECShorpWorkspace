package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsGiftItem;
import com.ecs.manager.core.mybatis.pojo.EcsGiftItemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsGiftItemMapper {
    int countByExample(EcsGiftItemCriteria example);

    int deleteByExample(EcsGiftItemCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsGiftItem record);

    int insertSelective(EcsGiftItem record);

    List<EcsGiftItem> selectByExample(EcsGiftItemCriteria example);

    EcsGiftItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsGiftItem record, @Param("example") EcsGiftItemCriteria example);

    int updateByExample(@Param("record") EcsGiftItem record, @Param("example") EcsGiftItemCriteria example);

    int updateByPrimaryKeySelective(EcsGiftItem record);

    int updateByPrimaryKey(EcsGiftItem record);
}