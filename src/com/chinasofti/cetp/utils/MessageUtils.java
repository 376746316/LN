package com.chinasofti.cetp.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chinasofti.cetp.admin.dao.MessageMapper;
import com.chinasofti.cetp.admin.model.Message;
import com.chinasofti.cetp.admin.model.MessageExample;
import com.chinasofti.cetp.admin.model.MessageExample.Criteria;

public class MessageUtils {
	private static Map<String, List<Message>> map = new HashMap<String, List<Message>>();
	private static MessageMapper messageMapper = null;

	public static void add(Message message) {
		String key = "";
		if (message.getMsgStuNo() != null) {
			key = "s" + message.getMsgStuNo();
		}
		if (message.getMsgUserNo() != null) {
			key = "u" + message.getMsgUserNo();
		}
		List<Message> msgList = map.get(key);
		if (msgList != null) {
			msgList.add(message);
			map.put(key, msgList);
		}
	}

	public static void del(Integer stuNo, Integer userNo, Long messageId) {
		String key = "";
		if (stuNo != null) {
			key = "s" + stuNo;
		}
		if (userNo != null) {
			key = "u" + userNo;
		}
		List<Message> msgList = map.get(key);
		if (msgList != null) {
			Message dMsg = null;
			for (Message message : msgList) {
				if (message.getMsgId().longValue() == messageId.longValue()) {
					dMsg = message;
					break;
				}
			}
			if (dMsg != null) {
				msgList.remove(dMsg);
				map.put(key, msgList);
			}
		}
	}

	public static void addMessageInfo(Integer stuNo, Integer userNo) {
		MessageExample example = new MessageExample();
		Criteria crit = example.createCriteria();
		if (stuNo != null) {
			crit.andMsgStuNoEqualTo(stuNo);
		} else if (userNo != null) {
			crit.andMsgUserNoEqualTo(userNo);
		} else {
			return;
		}
		crit.andMsgStatusEqualTo("0");
		List<Message> msgList = getMessageMapper().selectByExample(example);
		if (msgList == null) {
			msgList = new ArrayList<Message>();
		}
		if (stuNo != null) {
			map.put("s" + stuNo, msgList);
		}
		if (userNo != null) {
			map.put("u" + userNo, msgList);
		}
	}

	public static List<Message> getMsgList(String key) {
		return map.get(key);
	}

	public static void clearMsgList(String key) {
		List<Message> msgList = map.get(key);
		msgList.clear();
		map.put(key, msgList);
	}

	public static void addMsg(Message msg) {
		add(msg);
		getMessageMapper().insertSelective(msg);
	}

	public static void addMsg(Integer stuNo, Integer userNo, String type, String content) {
		Message msg = new Message();
		msg.setMsgContent(content);
		msg.setMsgStatus("0");
		msg.setMsgStuNo(stuNo);
		msg.setMsgUserNo(userNo);
		msg.setMsgType(type);
		msg.setMsgTime(new Date());
		addMsg(msg);
	}

	private static MessageMapper getMessageMapper() {
		if (messageMapper == null) {
			messageMapper = BeanUtils.getBean("messageMapper", MessageMapper.class);

		}
		return messageMapper;
	}
}
