package com.chinasofti.cetp.admin.dao;

import com.chinasofti.cetp.admin.model.StuTechTypeExample;
import com.chinasofti.cetp.admin.model.StuTechTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuTechTypeMapper {
	int countByExample(StuTechTypeExample example);

	int deleteByExample(StuTechTypeExample example);

	int deleteByPrimaryKey(StuTechTypeKey key);

	int insert(StuTechTypeKey record);

	int insertSelective(StuTechTypeKey record);

	List<StuTechTypeKey> selectByExample(StuTechTypeExample example);

	int updateByExampleSelective(@Param("record") StuTechTypeKey record, @Param("example") StuTechTypeExample example);

	int updateByExample(@Param("record") StuTechTypeKey record, @Param("example") StuTechTypeExample example);

	int insertList(@Param("stuNo") Integer stuNo, @Param("stuTechTypes") String[] stuTechTypes);
}