package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsDeliveryTemplate;
import com.ecs.manager.core.mybatis.pojo.EcsDeliveryTemplateCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsDeliveryTemplateMapper {
    int countByExample(EcsDeliveryTemplateCriteria example);

    int deleteByExample(EcsDeliveryTemplateCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsDeliveryTemplate record);

    int insertSelective(EcsDeliveryTemplate record);

    List<EcsDeliveryTemplate> selectByExampleWithBLOBs(EcsDeliveryTemplateCriteria example);

    List<EcsDeliveryTemplate> selectByExample(EcsDeliveryTemplateCriteria example);

    EcsDeliveryTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsDeliveryTemplate record, @Param("example") EcsDeliveryTemplateCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsDeliveryTemplate record, @Param("example") EcsDeliveryTemplateCriteria example);

    int updateByExample(@Param("record") EcsDeliveryTemplate record, @Param("example") EcsDeliveryTemplateCriteria example);

    int updateByPrimaryKeySelective(EcsDeliveryTemplate record);

    int updateByPrimaryKeyWithBLOBs(EcsDeliveryTemplate record);

    int updateByPrimaryKey(EcsDeliveryTemplate record);
}