package com.chinasofti.cetp.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chinasofti.cetp.admin.model.DetailedScoreRecord;
import com.chinasofti.cetp.admin.model.PageModelScoreRecord;
import com.chinasofti.cetp.admin.model.ScoreRecord;
import com.chinasofti.cetp.admin.model.ScoreRecordExample;

public interface ScoreRecordMapper {
    int countByExample(ScoreRecordExample example);

    int deleteByExample(ScoreRecordExample example);

    int deleteByPrimaryKey(Long srecId);

    int insert(ScoreRecord record);

    int insertSelective(ScoreRecord record);

    List<ScoreRecord> selectByExample(ScoreRecordExample example);

    ScoreRecord selectByPrimaryKey(Long srecId);

    int updateByExampleSelective(@Param("record") ScoreRecord record, @Param("example") ScoreRecordExample example);

    int updateByExample(@Param("record") ScoreRecord record, @Param("example") ScoreRecordExample example);

    int updateByPrimaryKeySelective(ScoreRecord record);

    int updateByPrimaryKey(ScoreRecord record);
    
    // ========================================================新增========================================================
    
    List<DetailedScoreRecord> getByMap(Map<String, Object> map);
    
    List<PageModelScoreRecord> getPageModelScoreRecordByStuNo(Map<String, Object> map);
    
}