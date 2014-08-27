package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsCouponCode;
import com.ecs.manager.core.mybatis.pojo.EcsCouponCodeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsCouponCodeMapper {
    int countByExample(EcsCouponCodeCriteria example);

    int deleteByExample(EcsCouponCodeCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(EcsCouponCode record);

    int insertSelective(EcsCouponCode record);

    List<EcsCouponCode> selectByExample(EcsCouponCodeCriteria example);

    EcsCouponCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EcsCouponCode record, @Param("example") EcsCouponCodeCriteria example);

    int updateByExample(@Param("record") EcsCouponCode record, @Param("example") EcsCouponCodeCriteria example);

    int updateByPrimaryKeySelective(EcsCouponCode record);

    int updateByPrimaryKey(EcsCouponCode record);
}