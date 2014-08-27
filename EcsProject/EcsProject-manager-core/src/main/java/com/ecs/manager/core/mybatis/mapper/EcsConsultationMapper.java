package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsConsultation;
import com.ecs.manager.core.mybatis.pojo.EcsConsultationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsConsultationMapper {
    int countByExample(EcsConsultationCriteria example);

    int deleteByExample(EcsConsultationCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsConsultation record);

    int insertSelective(EcsConsultation record);

    List<EcsConsultation> selectByExample(EcsConsultationCriteria example);

    EcsConsultation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsConsultation record, @Param("example") EcsConsultationCriteria example);

    int updateByExample(@Param("record") EcsConsultation record, @Param("example") EcsConsultationCriteria example);

    int updateByPrimaryKeySelective(EcsConsultation record);

    int updateByPrimaryKey(EcsConsultation record);
}