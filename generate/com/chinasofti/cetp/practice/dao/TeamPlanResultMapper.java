package com.chinasofti.cetp.practice.dao;

import com.chinasofti.cetp.practice.model.TeamPlanResult;
import com.chinasofti.cetp.practice.model.TeamPlanResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TeamPlanResultMapper {
    int countByExample(TeamPlanResultExample example);

    int deleteByExample(TeamPlanResultExample example);

    int deleteByPrimaryKey(Integer tprId);

    int insert(TeamPlanResult record);

    int insertSelective(TeamPlanResult record);

    List<TeamPlanResult> selectByExample(TeamPlanResultExample example);

	List<TeamPlanResult> selectByExample(TeamPlanResultExample example,
			RowBounds rowBounds);

    TeamPlanResult selectByPrimaryKey(Integer tprId);

    int updateByExampleSelective(@Param("record") TeamPlanResult record, @Param("example") TeamPlanResultExample example);

    int updateByExample(@Param("record") TeamPlanResult record, @Param("example") TeamPlanResultExample example);

    int updateByPrimaryKeySelective(TeamPlanResult record);

    int updateByPrimaryKey(TeamPlanResult record);
}