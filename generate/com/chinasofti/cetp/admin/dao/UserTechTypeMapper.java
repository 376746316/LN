package com.chinasofti.cetp.admin.dao;

import com.chinasofti.cetp.admin.model.UserTechTypeExample;
import com.chinasofti.cetp.admin.model.UserTechTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTechTypeMapper {
	int countByExample(UserTechTypeExample example);

	int deleteByExample(UserTechTypeExample example);

	int deleteByPrimaryKey(UserTechTypeKey key);

	int insert(UserTechTypeKey record);

	int insertSelective(UserTechTypeKey record);

	List<UserTechTypeKey> selectByExample(UserTechTypeExample example);

	int updateByExampleSelective(@Param("record") UserTechTypeKey record, @Param("example") UserTechTypeExample example);

	int updateByExample(@Param("record") UserTechTypeKey record, @Param("example") UserTechTypeExample example);

	int insertList(@Param("userNo") Integer userNo, @Param("userTechTypes") String[] userTechTypes);
}