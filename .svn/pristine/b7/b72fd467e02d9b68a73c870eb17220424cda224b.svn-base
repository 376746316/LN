package com.chinasofti.cetp.practice.dao;

import com.chinasofti.cetp.practice.model.PersonPlanResult;
import com.chinasofti.cetp.practice.model.PersonPlanResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PersonPlanResultMapper {
	int countByExample(PersonPlanResultExample example);

	int deleteByExample(PersonPlanResultExample example);

	int deleteByPrimaryKey(Integer prpId);

	int insert(PersonPlanResult record);

	int insertSelective(PersonPlanResult record);

	List<PersonPlanResult> selectByExample(PersonPlanResultExample example);

	List<PersonPlanResult> selectByExample(PersonPlanResultExample example,
			RowBounds rowBounds);

	PersonPlanResult selectByPrimaryKey(Integer prpId);

	int updateByExampleSelective(@Param("record") PersonPlanResult record,
			@Param("example") PersonPlanResultExample example);

	int updateByExample(@Param("record") PersonPlanResult record,
			@Param("example") PersonPlanResultExample example);

	int updateByPrimaryKeySelective(PersonPlanResult record);

	int updateByPrimaryKey(PersonPlanResult record);
}