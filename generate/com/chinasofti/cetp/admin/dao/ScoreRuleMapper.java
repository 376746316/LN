package com.chinasofti.cetp.admin.dao;

import com.chinasofti.cetp.admin.model.ScoreRule;
import com.chinasofti.cetp.admin.model.ScoreRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ScoreRuleMapper {
    int countByExample(ScoreRuleExample example);

    int deleteByExample(ScoreRuleExample example);

    int deleteByPrimaryKey(Integer srId);

    int insert(ScoreRule record);

    int insertSelective(ScoreRule record);

    List<ScoreRule> selectByExample(ScoreRuleExample example);

    ScoreRule selectByPrimaryKey(Integer srId);

    int updateByExampleSelective(@Param("record") ScoreRule record, @Param("example") ScoreRuleExample example);

    int updateByExample(@Param("record") ScoreRule record, @Param("example") ScoreRuleExample example);

    int updateByPrimaryKeySelective(ScoreRule record);

    int updateByPrimaryKey(ScoreRule record);
    
    // 后台管理分页
    List<ScoreRule> selectByExample(ScoreRuleExample example, RowBounds rb);
    
}