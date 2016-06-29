package com.chinasofti.cetp.admin.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.CoinRecordMapper;
import com.chinasofti.cetp.admin.model.CoinRecord;
import com.chinasofti.cetp.admin.model.CoinRecordExample;

/**
 * 学习币
 * 
 * @author heyuqiang
 * 
 */
@Service
public class CoinRecordService {

	private CoinRecordMapper coinRecordMapper;

	public CoinRecordMapper getCoinRecordMapper() {
		return coinRecordMapper;
	}

	@Autowired
	public void setCoinRecordMapper(CoinRecordMapper coinRecordMapper) {
		this.coinRecordMapper = coinRecordMapper;
	}

	public int insertSelective(CoinRecord record) {
		return coinRecordMapper.insertSelective(record);
	}

	public List<CoinRecord> selectByExampleWithBLOBs(CoinRecordExample example, RowBounds rb) {
		return coinRecordMapper.selectByExampleWithBLOBs(example ,rb);
	}

	public int updateByPrimaryKeyWithBLOBs(CoinRecord record) {
		return coinRecordMapper.updateByPrimaryKeyWithBLOBs(record);
	}
}
