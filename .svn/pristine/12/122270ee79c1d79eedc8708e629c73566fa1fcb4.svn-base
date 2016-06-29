package com.chinasofti.cetp.admin.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.admin.model.Message;
import com.chinasofti.cetp.admin.model.Student;
import com.chinasofti.cetp.admin.service.MessageService;
import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.utils.LoginRequired;
import com.chinasofti.cetp.utils.MessageUtils;
import com.google.gson.JsonObject;

@Scope("prototype")
@Controller
public class MessageController extends BaseController {

	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(MessageController.class);

	@Autowired
	private MessageService messageService;

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	@LoginRequired
	@RequestMapping("toMessageCenter.do")
	public String toMessageCenter(
			@RequestParam(value = "activeType", required = false, defaultValue = "00") String activeType) {
		try {
			List<Message> allMsgList = new ArrayList<Message>();
			Integer stuNo;
			Integer userNo;
           if(this.getSessionInfo().getStudent()!=null&&this.getSessionInfo().getUser()==null){
        	  stuNo = this.getSessionInfo().getStuNo();
        	   allMsgList = messageService.getMsgList(stuNo, null);
        	   Integer unreadAll = 0;
   			Integer unreadCourse = 0;
   			Integer unreadPrac = 0;
   			Integer unreadQA = 0;
   			Integer unreadJob = 0;
   			Integer unreadSys = 0;
   			List<Message> courseMsgList = new ArrayList<Message>();
   			List<Message> pracMsgList = new ArrayList<Message>();
   			List<Message> qaMsgList = new ArrayList<Message>();
   			List<Message> jobMsgList = new ArrayList<Message>();
   			List<Message> sysMsgList = new ArrayList<Message>();
   			for (Message message : allMsgList) {
   				if ("01".equals(message.getMsgType())) {
   					courseMsgList.add(message);
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   						unreadCourse++;
   					}
   				} else if ("02".equals(message.getMsgType())) {
   					pracMsgList.add(message);
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   						unreadPrac++;
   					}
   				} else if ("03".equals(message.getMsgType())) {
   					qaMsgList.add(message);
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   						unreadQA++;
   					}
   				} else if ("04".equals(message.getMsgType())) {
   					jobMsgList.add(message);
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   						unreadJob++;
   					}
   				} else if ("05".equals(message.getMsgType())) {
   					sysMsgList.add(message);
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   						unreadSys++;
   					}
   				} else {
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   					}
   				}
   			}
   			this.request.setAttribute("allMsgList", allMsgList);
   			this.request.setAttribute("courseMsgList", courseMsgList);
   			this.request.setAttribute("pracMsgList", pracMsgList);
   			this.request.setAttribute("qaMsgList", qaMsgList);
   			this.request.setAttribute("jobMsgList", jobMsgList);
   			this.request.setAttribute("sysMsgList", sysMsgList);
   			this.request.setAttribute("unreadAll", unreadAll);
   			this.request.setAttribute("unreadCourse", unreadCourse);
   			this.request.setAttribute("unreadPrac", unreadPrac);
   			this.request.setAttribute("unreadQA", unreadQA);
   			this.request.setAttribute("unreadJob", unreadJob);
   			this.request.setAttribute("unreadSys", unreadSys);
   			this.request.setAttribute("unreadSys", unreadSys);
   			this.request.setAttribute("activeType", activeType);
   				MessageUtils.clearMsgList("s" + stuNo);
   			
        	   
           }else if(this.getSessionInfo().getUser()!=null&&this.getSessionInfo().getStudent()==null){
        	   userNo = this.getSessionInfo().getUser().getUserNo();
        	   allMsgList = messageService.getMsgList(null,userNo);
        	   Integer unreadAll = 0;
   			Integer unreadCourse = 0;
   			Integer unreadPrac = 0;
   			Integer unreadQA = 0;
   			Integer unreadJob = 0;
   			Integer unreadSys = 0;
   			List<Message> courseMsgList = new ArrayList<Message>();
   			List<Message> pracMsgList = new ArrayList<Message>();
   			List<Message> qaMsgList = new ArrayList<Message>();
   			List<Message> jobMsgList = new ArrayList<Message>();
   			List<Message> sysMsgList = new ArrayList<Message>();
   			for (Message message : allMsgList) {
   				if ("01".equals(message.getMsgType())) {
   					courseMsgList.add(message);
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   						unreadCourse++;
   					}
   				} else if ("02".equals(message.getMsgType())) {
   					pracMsgList.add(message);
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   						unreadPrac++;
   					}
   				} else if ("03".equals(message.getMsgType())) {
   					qaMsgList.add(message);
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   						unreadQA++;
   					}
   				} else if ("04".equals(message.getMsgType())) {
   					jobMsgList.add(message);
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   						unreadJob++;
   					}
   				} else if ("05".equals(message.getMsgType())) {
   					sysMsgList.add(message);
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   						unreadSys++;
   					}
   				} else {
   					if ("0".equals(message.getMsgStatus())) {
   						unreadAll++;
   					}
   				}
   			}
   			this.request.setAttribute("allMsgList", allMsgList);
   			this.request.setAttribute("courseMsgList", courseMsgList);
   			this.request.setAttribute("pracMsgList", pracMsgList);
   			this.request.setAttribute("qaMsgList", qaMsgList);
   			this.request.setAttribute("jobMsgList", jobMsgList);
   			this.request.setAttribute("sysMsgList", sysMsgList);
   			this.request.setAttribute("unreadAll", unreadAll);
   			this.request.setAttribute("unreadCourse", unreadCourse);
   			this.request.setAttribute("unreadPrac", unreadPrac);
   			this.request.setAttribute("unreadQA", unreadQA);
   			this.request.setAttribute("unreadJob", unreadJob);
   			this.request.setAttribute("unreadSys", unreadSys);
   			this.request.setAttribute("unreadSys", unreadSys);
   			this.request.setAttribute("activeType", activeType);
   				MessageUtils.clearMsgList("u" + userNo);
   			
           }
			
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}
		return "admin/messageCenter";
	}

	@RequestMapping("readMsg.do")
	public void readMsg(@RequestParam("msgId") String msgId) {
		try {
			messageService.readMsg(Long.valueOf(msgId.substring(3)));
			writeString(msgId);
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
			writeString("error");
		}
	}

	@RequestMapping("delMsg.do")
	public void delMsg(@RequestParam("msgId") String msgId) {
		try {
			messageService.delMsg(Long.valueOf(msgId.substring(3)));
			writeString(msgId);
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
			writeString("error");
		}
	}

	@RequestMapping("readAllMsg.do")
	public void readAllMsg(@RequestParam("msgType") String msgType) {
		try {
			
			if(this.getSessionInfo().getStudent()!=null&&this.getSessionInfo().getUser()==null){
				Integer stuNo = this.getSessionInfo().getStuNo();
				messageService.readAllMsg(msgType, stuNo, null);
			}else if(this.getSessionInfo().getUser()!=null&&this.getSessionInfo().getStudent()==null){
				Integer userNo = this.getSessionInfo().getUser().getUserNo();
				messageService.readAllMsg(msgType, userNo, null);
			}
			
			writeString(msgType);
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
			writeString("error");
		}
	}

	@RequestMapping("getNewMsg.do")
	public void getNewMsg() {
		try {
			List<Message> msgList = new ArrayList<Message>();
			Integer stuNo;
			Integer userNo;
			StringBuffer sb = new StringBuffer();
			String num = "";
			if (this.getSessionInfo() != null
					&& this.getSessionInfo().getStuNo() != null) {
				stuNo = this.getSessionInfo().getStuNo();

				 msgList = MessageUtils.getMsgList("s" + stuNo);

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				for (Message message : msgList) {
					sb.append("<li><span>");
					sb.append(sdf.format(message.getMsgTime()));
					sb.append("</span><a href=\"toMessageCenter.do?activeType="
							+ message.getMsgType() + "\">");
					sb.append(message.getMsgContent());
					sb.append("</a></li>");
				}
				if (sb.length() > 0) {
					num = "" + msgList.size();
				}
			}else if(this.getSessionInfo()!=null&&this.getSessionInfo().getUser()!=null){
				userNo = this.getSessionInfo().getUser().getUserNo();
				 msgList = MessageUtils.getMsgList("u" + userNo);
				 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					for (Message message : msgList) {
						sb.append("<li><span>");
						sb.append(sdf.format(message.getMsgTime()));
						sb.append("</span><a href=\"toMessageCenter.do?activeType="
								+ message.getMsgType() + "\">");
						sb.append(message.getMsgContent());
						sb.append("</a></li>");
					}
					if (sb.length() > 0) {
						num = "" + msgList.size();
					}
				 
			}
			JsonObject jo = new JsonObject();
			jo.addProperty("html", sb.toString());
			jo.addProperty("num", num);
			writeString(jo.toString());
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
			writeString("error");
		}
	}
	
 
	
}
