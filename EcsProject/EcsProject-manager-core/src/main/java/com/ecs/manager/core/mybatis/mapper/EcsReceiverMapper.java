package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsReceiver;
import com.ecs.manager.core.mybatis.pojo.EcsReceiverCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsReceiverMapper {
    int countByExample(EcsReceiverCriteria example);

    int deleteByExample(EcsReceiverCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsReceiver record);

    int insertSelective(EcsReceiver record);

    List<EcsReceiver> selectByExample(EcsReceiverCriteria example);

    EcsReceiver selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsReceiver record, @Param("example") EcsReceiverCriteria example);

    int updateByExample(@Param("record") EcsReceiver record, @Param("example") EcsReceiverCriteria example);

    int updateByPrimaryKeySelective(EcsReceiver record);

    int updateByPrimaryKey(EcsReceiver record);
}