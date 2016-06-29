package com.chinasofti.cetp.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.MessageMapper;
import com.chinasofti.cetp.admin.model.Message;
import com.chinasofti.cetp.admin.model.MessageExample;
import com.chinasofti.cetp.admin.model.MessageExample.Criteria;

@Service
public class MessageService {
	@Autowired
	private MessageMapper messageMapper;

	public MessageMapper getMessageMapper() {
		return messageMapper;
	}

	public void setMessageMapper(MessageMapper messageMapper) {
		this.messageMapper = messageMapper;
	}

	public List<Message> getMsgList(Integer stuNo, Integer userNo) {
		MessageExample example = new MessageExample();
		if (stuNo != null) {
			example.createCriteria().andMsgStuNoEqualTo(stuNo);
		} else if (userNo != null) {
			example.createCriteria().andMsgUserNoEqualTo(userNo);
		} else {
			return null;
		}
		example.setOrderByClause("MSG_TIME DESC");
		return messageMapper.selectByExample(example);
	}

	public int readMsg(Long msgId) {
		Message record = new Message();
		record.setMsgId(msgId);
		record.setMsgStatus("1");
		return messageMapper.updateByPrimaryKeySelective(record);
	}

	public int readAllMsg(String msgType, Integer stuNo, Integer userNo) {
		Message record = new Message();
		record.setMsgStatus("1");
		MessageExample example = new MessageExample();
		Criteria crit = example.createCriteria();
		if (stuNo != null) {
			crit.andMsgStuNoEqualTo(stuNo);
		} else if (userNo != null) {
			crit.andMsgUserNoEqualTo(userNo);
		} else {
			return 0;
		}
		if (!"00".equals(msgType)) {
			crit.andMsgTypeEqualTo(msgType);
		}
		return messageMapper.updateByExampleSelective(record, example);
	}

	public int delMsg(Long msgId) {
		return messageMapper.deleteByPrimaryKey(msgId);
	}
}
