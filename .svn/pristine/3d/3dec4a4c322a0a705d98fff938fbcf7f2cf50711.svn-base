package com.chinasofti.cetp.admin.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.admin.model.MoreUser;
import com.chinasofti.cetp.admin.model.MoreUserWithBLOBs;
import com.chinasofti.cetp.admin.model.User;
import com.chinasofti.cetp.admin.model.UserExample;
import com.chinasofti.cetp.admin.model.UserWithBLOBs;
import com.chinasofti.cetp.study.model.RqaUser;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	int countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Integer userNo);

	int insert(UserWithBLOBs record);

	int insertSelective(UserWithBLOBs record);

	List<UserWithBLOBs> selectByExampleWithBLOBs(UserExample example);

	List<User> selectByExample(UserExample example);

	UserWithBLOBs selectByPrimaryKey(Integer userNo);

	MoreUserWithBLOBs selectMoreByPrimaryKey(Integer userNo);
	List<MoreUserWithBLOBs> selectMoreByExample(UserExample example);

	int updateByExampleSelective(@Param("record") UserWithBLOBs record, @Param("example") UserExample example);

	int updateByExampleWithBLOBs(@Param("record") UserWithBLOBs record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(UserWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

	int updateByPrimaryKey(User record);

	List<User> queryUserPwd(@Param("userNo") Integer userNo, @Param("old_pwd") String old_pwd);

	int updateUserPwd(@Param("userNo") Integer userNo, @Param("new_pwd") String new_pwd);

	// 加载当前教师所属组织Id
	User getOrgIdByUserNo(Integer userNo);

	List<MoreUser> getNoRoleUser();

	// 用户性别下拉框
	List<MoreUser> loadUserType();

	// 地区编码下拉框
	List<MoreUser> loadUserAreaCode();

	// 用户性别下拉框
	List<MoreUser> loadUserEduLev();

	// 所属组织下拉框
	List<MoreUser> loadUserOrg();

	// 用户性别下拉框
	List<MoreUser> loadUserSex();

	// 模糊查询
	List<MoreUser> queryUser(HashMap<String, Object> map);

	List<MoreUser> selectUserList(HashMap<String, Object> map, RowBounds rowBounds);

	List<User> loginByExample(User record);

	int validUserId(String vUserId);

	/**
	 * 加载答疑工程师列表
	 * 
	 * @param techType
	 *            技术方向
	 * @param orderBy
	 *            排序方式 "count"/"quality"
	 * @return
	 */
	List<RqaUser> getRqaUser(@Param("techType") Integer techType, @Param("orderBy") String orderBy, RowBounds rowBounds);
	
	List<User> selectTeachCourseUser();
}