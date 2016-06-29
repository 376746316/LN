package com.chinasofti.cetp.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.chinasofti.cetp.admin.dao.StudentMapper;
import com.chinasofti.cetp.admin.dao.UserMapper;
import com.chinasofti.cetp.admin.model.StudentWithBLOBs;
import com.chinasofti.cetp.admin.model.UserWithBLOBs;
import com.chinasofti.cetp.practice.dao.PracticeMapper;
import com.chinasofti.cetp.practice.dao.PracticeTeamMapper;
import com.chinasofti.cetp.practice.model.PracPersonKey;
import com.chinasofti.cetp.practice.model.Practice;
import com.chinasofti.cetp.practice.model.PracticeTeam;

public class SessionListener implements HttpSessionListener {

	private static Map<String, HttpSession> sessionMap = new ConcurrentHashMap<String, HttpSession>();
	private final static String OFFLINE = "0";

	public static Map<String, HttpSession> getSessionMap() {
		return sessionMap;
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		String key = getKey(session);
		if (key == null) {
			return;
		}

		if (sessionMap.containsValue(session)) {
			sessionMap.remove(key);
		}

		// 用户下线
		if (key.startsWith("u")) {
			UserMapper userMapper = BeanUtils.getBean("userMapper", UserMapper.class);
			UserWithBLOBs record = new UserWithBLOBs();
			record.setUserNo(((SessionInfo) session.getAttribute(Constants.SESSIONINFO)).getUserNo());
			record.setUserOnline(OFFLINE);
			userMapper.updateByPrimaryKeySelective(record);
		}
	}

	public static String getKey(HttpSession session) {
		SessionInfo sessionInfo = (SessionInfo) session.getAttribute(Constants.SESSIONINFO);
		if (sessionInfo == null) {
			return null;
		}
		StudentWithBLOBs stu = sessionInfo.getStudent();
		UserWithBLOBs user = sessionInfo.getUser();
		if (stu != null) {
			return "s" + stu.getStuNo();
		} else if (user != null) {
			return "u" + user.getUserNo();
		}
		return null;
	}

	public static void updStuPracInfo(Integer stuNo) {

		// 实训相关
		HttpSession session;
		if (sessionMap.containsKey("s" + stuNo.toString())) {
			session = sessionMap.get("s" + stuNo.toString());
		} else {
			return;
		}

		StudentMapper studentMapper = BeanUtils.getBean("studentMapper", StudentMapper.class);
		PracticeMapper practiceMapper = BeanUtils.getBean("practiceMapper", PracticeMapper.class);
		PracticeTeamMapper practiceTeamMapper = BeanUtils.getBean("practiceTeamMapper", PracticeTeamMapper.class);

		StudentWithBLOBs stu = studentMapper.selectByPrimaryKey(stuNo);
		Practice prac = practiceMapper.getPracByClassId(stu.getStuClassId());
		if (prac != null) {

			// 所属实训 编号
			session.setAttribute("pracId", prac.getPracId());

			// #### 该学生已经参加团队实训
			if (prac.getPracIsTeam().equals("2")) {
//				// 未选项目的组长
//				Integer TeamLeaderNo = practiceTeamMapper.isTeamLeader(stuNo);
//				session.setAttribute("TeamLeaderNo", TeamLeaderNo);
//
//				// 已选项目的组长
//				Integer selectedProTeamLeader = practiceTeamMapper.fullTeamLeader(stuNo);
//				session.setAttribute("selectedProTeamLeader", selectedProTeamLeader);

				PracticeTeam pt = practiceTeamMapper.getTeamIdByStuNo(stuNo);

				if (pt != null) {
					// 所属实训 组编号
					session.setAttribute("teamId", pt.getTeamId());
					// 组长编号
					session.setAttribute("teamLeaderNo", pt.getTeamLeaderNo());

					// 所属实训案例项目编号
					session.setAttribute("proId", pt.getTeamProId());
				}

				session.setAttribute("pracIsTeam", "2");

			} else {
				// #### 该学生已经参加个人实训
				PracPersonKey pp = practiceTeamMapper.getProIdByStuNo(stuNo);
				if (pp != null) {
					// 所属实训案例项目编号
					session.setAttribute("proId", pp.getPpProId());

					session.setAttribute("pracIsTeam", "1");

				} else {
					// #### 该学生没参加实训
					session.setAttribute("pracIsTeam", "0");
				}
			}
		}else{
			session.removeAttribute("pracId");
			session.removeAttribute("teamId");
			session.removeAttribute("teamLeaderNo");
			session.removeAttribute("proId");
			session.removeAttribute("pracIsTeam");
		}
	}
}
