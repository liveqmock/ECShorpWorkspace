package com.ecs.sso.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ecs.sso.model.UserInfoModel;

/**
 * @Description: 用户基本信息DAO
 * @author toney.li
 * @date 2013-8-6 上午11:13:49
 * 
 */
@Repository("userInfoDao")
public interface UserInfoDao {
	public UserInfoModel getById(@Param("userId") Long userId);

	public UserInfoModel getByUsernameAndPwd(@Param("userName") String userName, @Param("password") String password);

	public UserInfoModel getByMobileAndPwd(@Param("mobile") String mobile, @Param("password") String password);

	/**
	 * 
	 * <b>功能：</b>根据用户名查询<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-7 <br/>
	 * 
	 * @param userName
	 * @return
	 */
	public UserInfoModel getByUserName(@Param("userName") String userName);

	/**
	 * 
	 * <b>功能：</b>统计用userName注册的用户数量<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-7 <br/>
	 * 
	 * @param userName
	 * @return
	 */
	public Integer countByUserName(@Param("userName") String userName);

	/**
	 * 
	 * <b>功能：</b>根据手机号码查询<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-7 <br/>
	 * @param mobile
	 * @return
	 */
	public UserInfoModel getByMobile(@Param("mobile") String mobile);

	/**
	 * 
	 * <b>功能：</b>统计用mobile注册的用户数量<br/>
	 * <b>作者：</b> toney.li<br/>
	 * <b>日期：</b>2013-8-7 <br/>
	 * 
	 * @param userName
	 * @return
	 */
	public Integer countByMobile(@Param("mobile") String mobile);

	public void updateById(UserInfoModel userInfoModel);

	public void insert(UserInfoModel userInfomodel);
}
