package com.ecs.manager.core.mybatis.mapper;

import com.ecs.manager.core.mybatis.pojo.EcsMemberFavoriteProductCriteria;
import com.ecs.manager.core.mybatis.pojo.EcsMemberFavoriteProductKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMemberFavoriteProductMapper {
    int countByExample(EcsMemberFavoriteProductCriteria example);

    int deleteByExample(EcsMemberFavoriteProductCriteria example);

    int deleteByPrimaryKey(EcsMemberFavoriteProductKey key);

    int insert(EcsMemberFavoriteProductKey record);

    int insertSelective(EcsMemberFavoriteProductKey record);

    List<EcsMemberFavoriteProductKey> selectByExample(EcsMemberFavoriteProductCriteria example);

    int updateByExampleSelective(@Param("record") EcsMemberFavoriteProductKey record, @Param("example") EcsMemberFavoriteProductCriteria example);

    int updateByExample(@Param("record") EcsMemberFavoriteProductKey record, @Param("example") EcsMemberFavoriteProductCriteria example);
}