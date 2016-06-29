package com.chinasofti.cetp.practice.dao;

import com.chinasofti.cetp.practice.model.TeamPhaseResult;
import com.chinasofti.cetp.practice.model.TeamPhaseResultExample;
import com.chinasofti.cetp.practice.model.TeamPlanResult;
import com.chinasofti.cetp.practice.model.TeamPlanResultExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TeamPhaseResultMapper {
    int countByExample(TeamPhaseResultExample example);

    int deleteByExample(TeamPhaseResultExample example);

    int deleteByPrimaryKey(Integer tphId);

    int insert(TeamPhaseResult record);

    int insertSelective(TeamPhaseResult record);

    List<TeamPhaseResult> selectByExample(TeamPhaseResultExample example);
    List<TeamPhaseResult> selectByExample(TeamPhaseResultExample example, RowBounds rowBounds);

    TeamPhaseResult selectByPrimaryKey(Integer tphId);

    int updateByExampleSelective(@Param("record") TeamPhaseResult record, @Param("example") TeamPhaseResultExample example);

    int updateByExample(@Param("record") TeamPhaseResult record, @Param("example") TeamPhaseResultExample example);

    int updateByPrimaryKeySelective(TeamPhaseResult record);

    int updateByPrimaryKey(TeamPhaseResult record);

}