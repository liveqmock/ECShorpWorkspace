package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsMessage;
import com.ecs.manager.core.mybatis.pojo.EcsMessageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMessageMapper {
    int countByExample(EcsMessageCriteria example);

    int deleteByExample(EcsMessageCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsMessage record);

    int insertSelective(EcsMessage record);

    List<EcsMessage> selectByExampleWithBLOBs(EcsMessageCriteria example);

    List<EcsMessage> selectByExample(EcsMessageCriteria example);

    EcsMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsMessage record, @Param("example") EcsMessageCriteria example);

    int updateByExampleWithBLOBs(@Param("record") EcsMessage record, @Param("example") EcsMessageCriteria example);

    int updateByExample(@Param("record") EcsMessage record, @Param("example") EcsMessageCriteria example);

    int updateByPrimaryKeySelective(EcsMessage record);

    int updateByPrimaryKeyWithBLOBs(EcsMessage record);

    int updateByPrimaryKey(EcsMessage record);
}