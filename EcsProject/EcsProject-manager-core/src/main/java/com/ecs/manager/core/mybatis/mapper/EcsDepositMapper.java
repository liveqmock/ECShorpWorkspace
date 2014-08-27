package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsDeposit;
import com.ecs.manager.core.mybatis.pojo.EcsDepositCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsDepositMapper {
    int countByExample(EcsDepositCriteria example);

    int deleteByExample(EcsDepositCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsDeposit record);

    int insertSelective(EcsDeposit record);

    List<EcsDeposit> selectByExample(EcsDepositCriteria example);

    EcsDeposit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsDeposit record, @Param("example") EcsDepositCriteria example);

    int updateByExample(@Param("record") EcsDeposit record, @Param("example") EcsDepositCriteria example);

    int updateByPrimaryKeySelective(EcsDeposit record);

    int updateByPrimaryKey(EcsDeposit record);
}