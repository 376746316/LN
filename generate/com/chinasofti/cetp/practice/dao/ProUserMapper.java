package com.chinasofti.cetp.practice.dao;

import com.chinasofti.cetp.practice.model.ProUser;
import com.chinasofti.cetp.practice.model.ProUserExample;
import com.chinasofti.cetp.practice.model.ProUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProUserMapper {
	int countByExample(ProUserExample example);

	int deleteByExample(ProUserExample example);

	int deleteByPrimaryKey(ProUserKey key);

	int insert(ProUserKey record);

	int insertSelective(ProUserKey record);

	List<ProUserKey> selectByExample(ProUserExample example);

	int updateByExampleSelective(@Param("record") ProUserKey record, @Param("example") ProUserExample example);

	int updateByExample(@Param("record") ProUserKey record, @Param("example") ProUserExample example);

	List<ProUser> getProUser(Integer proId, RowBounds rowBounds);

	List<ProUser> getProUserUnselected(@Param("proId") Integer proId, @Param("techType") Integer techType, @Param("userId") String userId, @Param("userNickName") String userNickName, @Param("orgName") String orgName, RowBounds rowBounds);

	int insProUser(@Param("proId") Integer proId,@Param("users") String[] users);
}