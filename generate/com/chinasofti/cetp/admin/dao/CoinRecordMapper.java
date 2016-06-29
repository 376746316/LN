package com.chinasofti.cetp.admin.dao;

import com.chinasofti.cetp.admin.model.CoinRecord;
import com.chinasofti.cetp.admin.model.CoinRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CoinRecordMapper {
    int countByExample(CoinRecordExample example);

    int deleteByExample(CoinRecordExample example);

    int deleteByPrimaryKey(Long crecId);

    int insert(CoinRecord record);

    int insertSelective(CoinRecord record);

    List<CoinRecord> selectByExampleWithBLOBs(CoinRecordExample example);

    List<CoinRecord> selectByExample(CoinRecordExample example);

    CoinRecord selectByPrimaryKey(Long crecId);

    int updateByExampleSelective(@Param("record") CoinRecord record, @Param("example") CoinRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") CoinRecord record, @Param("example") CoinRecordExample example);

    int updateByExample(@Param("record") CoinRecord record, @Param("example") CoinRecordExample example);

    int updateByPrimaryKeySelective(CoinRecord record);

    int updateByPrimaryKeyWithBLOBs(CoinRecord record);

    int updateByPrimaryKey(CoinRecord record);
    
    List<CoinRecord> selectByExampleWithBLOBs(CoinRecordExample example, RowBounds rb);
}