package com.chinasofti.cetp.admin.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.ScoreRuleMapper;
import com.chinasofti.cetp.admin.model.ScoreRule;
import com.chinasofti.cetp.admin.model.ScoreRuleExample;
import com.chinasofti.cetp.admin.model.ScoreRuleExample.Criteria;

/**
 * 我的积分
 * 
 * @author heyuqiang
 * 
 */
@Service
public class ScoreRuleService {

	private ScoreRuleMapper scoreRuleMapper;

	public ScoreRuleMapper getScoreRuleMapper() {
		return scoreRuleMapper;
	}

	@Autowired
	public void setScoreRuleMapper(ScoreRuleMapper scoreRuleMapper) {
		this.scoreRuleMapper = scoreRuleMapper;
	}

	public List<ScoreRule> selectByExample(ScoreRuleExample example, RowBounds rb) {
		return scoreRuleMapper.selectByExample(example, rb);
	}

	public ScoreRule selectByPrimaryKey(Integer srId) {
		return scoreRuleMapper.selectByPrimaryKey(srId);
	}

	public List<ScoreRule> getScoreRuleList() {
		ScoreRuleExample scoreRuleExample = new ScoreRuleExample();
		Criteria criteria = scoreRuleExample.createCriteria();
		criteria.andSrFlagEqualTo("1"); // 启用
		return scoreRuleMapper.selectByExample(scoreRuleExample);
	}

	public int updateByPrimaryKeySelective(ScoreRule scoreRule) {
		return scoreRuleMapper.updateByPrimaryKeySelective(scoreRule);
	}

	public int delete(Integer srId) {
		return scoreRuleMapper.deleteByPrimaryKey(srId);
	}

}
