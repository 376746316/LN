package com.chinasofti.cetp.admin.service;

import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.FeedbackMapper;
import com.chinasofti.cetp.admin.model.Feedback;

/**
 * 意见反馈
 * 
 * @author heyuqiang
 * 
 */
@Service
public class FeedbackService {

	private FeedbackMapper feedbackMapper;

	public FeedbackMapper getFeedbackMapper() {
		return feedbackMapper;
	}

	public void setFeedbackMapper(FeedbackMapper feedbackMapper) {
		this.feedbackMapper = feedbackMapper;
	}

	public int insert(Feedback feedback) {
		return feedbackMapper.insertSelective(feedback);
	}

	public int updateByPrimaryKeySelective(Feedback feedback) {
		return feedbackMapper.updateByPrimaryKeySelective(feedback);
	}

	public Feedback selectByPrimaryKey(Integer fbId) {
		return feedbackMapper.selectByPrimaryKey(fbId);
	}
}
