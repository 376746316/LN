package com.chinasofti.cetp.resource.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.resource.dao.ReferenceMapper;
import com.chinasofti.cetp.resource.model.ReferenceExample;
import com.chinasofti.cetp.resource.model.ReferenceWithBLOBs;

@Service
public class ReferenceService {
	@Autowired
	private ReferenceMapper referenceMapper;

	public ReferenceMapper getReferenceMapper() {
		return referenceMapper;
	}

	public void setReferenceMapper(ReferenceMapper referenceMapper) {
		this.referenceMapper = referenceMapper;
	}

	public List<ReferenceWithBLOBs> selectReferenceByExample(
			ReferenceExample example, RowBounds rowBounds) {
		return referenceMapper.selectByExampleWithBLOBs(example, rowBounds);
	}

	public int insertReference(ReferenceWithBLOBs record) {
		return referenceMapper.insertSelective(record);
	}

	public int updateReference(ReferenceWithBLOBs record) {
		return referenceMapper.updateByPrimaryKeySelective(record);
	}
	public int deleteReference(Integer refId) {
		return referenceMapper.deleteByPrimaryKey(refId);
	}
}
