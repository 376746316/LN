package com.chinasofti.cetp.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.study.dao.RqaParamMapper;
import com.chinasofti.cetp.study.model.RqaParam;
import com.chinasofti.cetp.study.model.RqaParamExample;

@Service
public class RqaParamService {
	
	private static List<RqaParam> rqaParams = null;

	private RqaParamMapper rqaParamMapper;

	public RqaParamMapper getRqaParamMapper() {
		return rqaParamMapper;
	}

	@Autowired
	public void setRqaParamMapper(RqaParamMapper rqaParamMapper) {
		this.rqaParamMapper = rqaParamMapper;
	}

	public RqaParam selectByPrimaryKey(Integer rpId) {
		return rqaParamMapper.selectByPrimaryKey(rpId);
	}

	public int updateByPrimaryKeySelective(RqaParam rqaParam) {
		return rqaParamMapper.updateByPrimaryKeySelective(rqaParam);
	}

	public List<RqaParam> selectByExample(RqaParamExample example) {
		return rqaParamMapper.selectByExample(example);
	}

	public List<RqaParam> getRqaParamListByRpName(String rpName) {
		RqaParamExample example = new RqaParamExample();
		example.createCriteria().andRpNameLike("%" + rpName + "%");
		if(rqaParams==null){
			rqaParams = rqaParamMapper.selectByExample(example);
		}
		return rqaParams;
	}
	
	public static void cleanRqaParams(){
		rqaParams=null;
	}

}
