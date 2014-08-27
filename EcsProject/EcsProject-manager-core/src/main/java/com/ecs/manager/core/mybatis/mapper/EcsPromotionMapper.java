package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsPromotion;
import com.ecs.manager.core.mybatis.pojo.EcsPromotionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPromotionMapper {
    int countByExample(EcsPromotionCriteria example);

    int deleteByExample(EcsPromotionCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsPromotion record);

    int insertSelective(EcsPromotion record);

    List<EcsPromotion> selectByExampleWithBLOBs(EcsPromotionCriteria example);

    List<EcsPromotion> selectByExample(EcsPromotionCriteria example);

    EcsPromotion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsPromotion record, @Param("example") EcsPromotionCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsPromotion record, @Param("example") EcsPromotionCriteria example);

    int updateByExample(@Param("record") EcsPromotion record, @Param("example") EcsPromotionCriteria example);

    int updateByPrimaryKeySelective(EcsPromotion record);

    int updateByPrimaryKeyWithBLOBs(EcsPromotion record);

    int updateByPrimaryKey(EcsPromotion record);
}