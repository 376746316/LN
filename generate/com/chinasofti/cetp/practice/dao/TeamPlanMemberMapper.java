package com.chinasofti.cetp.practice.dao;

import com.chinasofti.cetp.practice.model.TeamPlanMemberExample;
import com.chinasofti.cetp.practice.model.TeamPlanMemberKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamPlanMemberMapper {
    int countByExample(TeamPlanMemberExample example);

    int deleteByExample(TeamPlanMemberExample example);

    int deleteByPrimaryKey(TeamPlanMemberKey key);

    int insert(TeamPlanMemberKey record);

    int insertSelective(TeamPlanMemberKey record);

    List<TeamPlanMemberKey> selectByExample(TeamPlanMemberExample example);

    int updateByExampleSelective(@Param("record") TeamPlanMemberKey record, @Param("example") TeamPlanMemberExample example);

    int updateByExample(@Param("record") TeamPlanMemberKey record, @Param("example") TeamPlanMemberExample example);
    
    int insertList(@Param("planId") Integer planId, @Param("plMemberNo") String[] plMemberNo);
}