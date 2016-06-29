package com.chinasofti.cetp.admin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.cetp.admin.model.CoinRecord;
import com.chinasofti.cetp.admin.model.CoinRecordExample;
import com.chinasofti.cetp.admin.model.PageModelScoreRecord;
import com.chinasofti.cetp.admin.model.ScoreRule;
import com.chinasofti.cetp.admin.model.StudentWithBLOBs;
import com.chinasofti.cetp.admin.model.UserGroup;
import com.chinasofti.cetp.admin.model.UserWithBLOBs;
import com.chinasofti.cetp.admin.service.CoinRecordService;
import com.chinasofti.cetp.admin.service.MyCenterService;
import com.chinasofti.cetp.admin.service.ScoreRecordService;
import com.chinasofti.cetp.admin.service.ScoreRuleService;
import com.chinasofti.cetp.admin.service.StuService;
import com.chinasofti.cetp.admin.service.UserGroupService;
import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.practice.model.MorePractice;
import com.chinasofti.cetp.practice.model.PersonAchivement;
import com.chinasofti.cetp.practice.model.PersonAchivementExample;
import com.chinasofti.cetp.practice.model.TeamAchivement;
import com.chinasofti.cetp.practice.model.TeamAchivementExample;
import com.chinasofti.cetp.practice.model.TeamMemberScore;
//import com.chinasofti.cetp.practice.service.AchivementService;
//import com.chinasofti.cetp.practice.service.PracticeScoreService;
import com.chinasofti.cetp.study.model.Chapter;
import com.chinasofti.cetp.study.model.CourseNote;
import com.chinasofti.cetp.study.model.MoreNote;
import com.chinasofti.cetp.study.model.Note;
import com.chinasofti.cetp.study.model.RealtimeQAExample;
import com.chinasofti.cetp.study.model.RealtimeQAExample.Criteria;
import com.chinasofti.cetp.study.model.RealtimeQAModel;
import com.chinasofti.cetp.study.model.RealtimeQAWithBLOBs;
import com.chinasofti.cetp.study.model.RqaCost;
import com.chinasofti.cetp.study.model.RqaParam;
import com.chinasofti.cetp.study.model.RqaParamExample;
import com.chinasofti.cetp.study.model.SpecCourseView;
//import com.chinasofti.cetp.study.service.RealtimeQAService;
import com.chinasofti.cetp.study.service.RqaParamService;
import com.chinasofti.cetp.utils.Constants;
import com.chinasofti.cetp.utils.Encrypt;
import com.chinasofti.cetp.utils.FCEvent;
import com.chinasofti.cetp.utils.Json;
import com.chinasofti.cetp.utils.LoginRequired;
import com.chinasofti.cetp.utils.Param;
import com.chinasofti.cetp.utils.ReaderXmlParam;
import com.chinasofti.cetp.utils.RecommendUtils;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;
import com.chinasofti.cetp.utils.SessionInfo;

@Scope("prototype")
@Controller
@RequestMapping("/myCenter")
public class MyCenterController extends BaseController {

	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MyCenterController.class);

	private static final Integer ROWS = 5;

//	@Autowired
//	private PracticeScoreService practiceScoreService;
//
	private RqaParamService rqaParamService;
//
//	public PracticeScoreService getPracticeScoreService() {
//		return practiceScoreService;
//	}
//
//	public void setPracticeScoreService(PracticeScoreService practiceScoreService) {
//		this.practiceScoreService = practiceScoreService;
//	}
//
//	@Autowired
//	private AchivementService achivementService;
//
//	public AchivementService getAchivementService() {
//		return achivementService;
//	}
//
//	public void setAchivementService(AchivementService achivementService) {
//		this.achivementService = achivementService;
//	}

	@Autowired
	private MyCenterService myCenterService;
	private ScoreRuleService scoreRuleService;
	private UserGroupService userGroupService;
	private ScoreRecordService scoreRecordService;
	private CoinRecordService coinRecordService;
	private StuService stuService;
//	private RealtimeQAService realtimeQAService;

	public MyCenterService getMyCenterService() {
		return myCenterService;
	}

	public void setMyCenterService(MyCenterService myCenterService) {
		this.myCenterService = myCenterService;
	}

	public ScoreRuleService getScoreRuleService() {
		return scoreRuleService;
	}

	@Autowired
	public void setScoreRuleService(ScoreRuleService scoreRuleService) {
		this.scoreRuleService = scoreRuleService;
	}

	public UserGroupService getUserGroupService() {
		return userGroupService;
	}

	@Autowired
	public void setUserGroupService(UserGroupService userGroupService) {
		this.userGroupService = userGroupService;
	}

	public ScoreRecordService getScoreRecordService() {
		return scoreRecordService;
	}

	@Autowired
	public void setScoreRecordService(ScoreRecordService scoreRecordService) {
		this.scoreRecordService = scoreRecordService;
	}

	public CoinRecordService getCoinRecordService() {
		return coinRecordService;
	}

	@Autowired
	public void setCoinRecordService(CoinRecordService coinRecordService) {
		this.coinRecordService = coinRecordService;
	}

	public StuService getStuService() {
		return stuService;
	}

	@Autowired
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}

	public RqaParamService getRqaParamService() {
		return rqaParamService;
	}

	@Autowired
	public void setRqaParamService(RqaParamService rqaParamService) {
		this.rqaParamService = rqaParamService;
	}

//	public RealtimeQAService getRealtimeQAService() {
//		return realtimeQAService;
//	}
//
//	@Autowired
//	public void setRealtimeQAService(RealtimeQAService realtimeQAService) {
//		this.realtimeQAService = realtimeQAService;
//	}

	@LoginRequired
	@RequestMapping("/view.do")
	public String view(@RequestParam(value = "active", required = false, defaultValue = "") String active) {
		if (this.isUser()) {
			active = "".equals(active) ? "w_wddy" : active;
			request.setAttribute("active", active);
			return "admin/myUserCenter";
		} else {
			active = "".equals(active) ? "w_wdkc" : active;
			request.setAttribute("active", active);
			return "admin/myCenter";
		}
	}

	/**
	 * 我的课程
	 * 
	 * @return
	 */
	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdkc")
	@RequestMapping("/course.do")
	public String course() {
		Integer stuNo = this.getSessionInfo().getStuNo();
		List<SpecCourseView> studingCourseList = myCenterService.selectStudingCourse(stuNo);
		this.request.setAttribute("studingCourseList", studingCourseList);
		List<SpecCourseView> studiedCourseList = myCenterService.selectStudiedCourse(stuNo);
		this.request.setAttribute("studiedCourseList", studiedCourseList);
		List<SpecCourseView> collectedCourseList = myCenterService.selectCollectedCourse(stuNo);
		this.request.setAttribute("collectedCourseList", collectedCourseList);
		List<SpecCourseView> recommendedCourseList = myCenterService.selectRecommendByStu(this.getSessionInfo().getStudent().getStuProf(), stuNo);
		this.request.setAttribute("recommendedCourseList", recommendedCourseList);
		return "admin/myCenterCourse";
	}

	/**
	 * 我的实训
	 * 
	 * @return
	 */
	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdsx")
	@RequestMapping("/prac.do")
	public String prac() {
		Integer stuNo = this.getSessionInfo().getStuNo();
		List<MorePractice> pracList = myCenterService.getStuPracList(stuNo);
		this.request.setAttribute("pracList", pracList);
		List<MorePractice> perPracList = new ArrayList<MorePractice>();
		List<MorePractice> teamPracList = new ArrayList<MorePractice>();

		for (MorePractice morePractice : pracList) {
			if ("1".equals(morePractice.getPracIsTeam())) {
				perPracList.add(morePractice);
			} else {
				teamPracList.add(morePractice);
			}
		}

		this.request.setAttribute("perPracList", perPracList);
		this.request.setAttribute("teamPracList", teamPracList);
		return "admin/myCenterPrac";
	}

//	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdsx")
//	@RequestMapping("/pracTeamScore.do")
//	public String pracTeamScore(@RequestParam("teamId") Integer teamId, @RequestParam("proId") Integer proId) {
//		request.setAttribute("teamId", teamId);
//		request.setAttribute("proId", proId);
//		List<TeamMemberScore> tmsList = this.practiceScoreService.getTeamMemberScore(teamId);
//		request.setAttribute("tmsList", tmsList);
//		List<Param> typeList = ReaderXmlParam.getInstance().getParamList("39");
//		request.setAttribute("typeList", typeList);
//		TeamAchivementExample example = new TeamAchivementExample();
//		example.createCriteria().andAchTeamIdEqualTo(teamId);
//		List<TeamAchivement> list = this.achivementService.getTeamAchivements(example);
//		for (TeamAchivement teamAchivement : list) {
//			teamAchivement.setAchResultType(ReaderXmlParam.getInstance().getParammain("65", teamAchivement.getAchResultType()));
//		}
//		request.setAttribute("achList", list);
//		return "admin/myCenterTeamScore";
//	}

//	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdsx")
//	@RequestMapping("/pracPersonalScore.do")
//	public String pracPersonalScore(@RequestParam("proId") Integer proId, @RequestParam("pracId") Integer pracId) {
//		request.setAttribute("proId", proId);
//		List<Param> typeList = ReaderXmlParam.getInstance().getParamList("39");
//		request.setAttribute("typeList", typeList);
//		PersonAchivementExample example = new PersonAchivementExample();
//		Integer stuNo = this.getSessionInfo().getStuNo();
//		example.createCriteria().andPaPracIdEqualTo(pracId).andPaProIdEqualTo(proId).andPaStuIdEqualTo(stuNo);
//		List<PersonAchivement> list = this.achivementService.getPersonalAchivements(example);
//		for (PersonAchivement personAchivement : list) {
//			personAchivement.setPaResultType(ReaderXmlParam.getInstance().getParammain("65", personAchivement.getPaResultType()));
//		}
//		request.setAttribute("achList", list);
//		return "admin/myCenterStuScore";
//	}

	/**
	 * 我的积分
	 * 
	 * @param request
	 * @param response
	 */
	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdjf")
	@RequestMapping("/integralManager.do")
	public ModelAndView integralManager(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "active", required = false) String active) {
		ModelAndView mv = new ModelAndView("/admin/integralManager");

		// 从Session 中读取用户信息
		SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO);
		// StudentWithBLOBs stu = (StudentWithBLOBs) sessionInfo.getStudent();

		// 积分规则列表
		List<ScoreRule> scoreRuleList = scoreRuleService.getScoreRuleList();
		mv.addObject("scoreRuleList", scoreRuleList);

		// 用户则规则
		List<UserGroup> userGroupList = userGroupService.getUserGropList();
		mv.addObject("userGroupList", userGroupList);

		// 积分记录
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("stuNo", sessionInfo.getStuNo());
		List<PageModelScoreRecord> pageModelScoreRecordList = scoreRecordService.getPageModelScoreRecordByStuNo(map);
		mv.addObject("pageModelScoreRecordList", pageModelScoreRecordList);
		mv.addObject("active", active);

		RqaParamExample example = new RqaParamExample();
		example.createCriteria().andRpNameEqualTo("积分兑换比例");
		List<RqaParam> rqaParamList = rqaParamService.selectByExample(example);
		if (rqaParamList.size() > 0) {
			request.setAttribute("rqaParam", rqaParamList.get(0));
		}

		return mv;
	}

	/**
	 * 积分兑换
	 * 
	 * @param request
	 * @param response
	 * @param stuPwd
	 * @param exchangeScore
	 */
	@Transactional
	@RequestMapping("/scoreExchange.do")
	public void scoreExchange(HttpServletRequest request, HttpServletResponse response, @RequestParam("stuPwd") String stuPwd, Integer exchangeScore) {

		Json json = new Json();
		SessionInfo sessionInfo = getSessionInfo();
		StudentWithBLOBs student = stuService.selectByPrimaryKey(sessionInfo.getStuNo());
		if (student.getStuPwd().equals(Encrypt.md5(stuPwd))) { // 判断密码是否正确
			if (student.getStuScore() > exchangeScore) {
				student.setStuScore(student.getStuScore() - exchangeScore); // 减积分
				student.setStuCoin(student.getStuCoin() + (exchangeScore / 10)); // 增加学习币

				CoinRecord coinRecord = new CoinRecord();
				coinRecord.setCrecCoin(exchangeScore / 10);
				coinRecord.setCrecStuNo(student.getStuNo());
				coinRecord.setCrecReason("积分兑换");
				coinRecord.setCrecRegtime(new Date());

				stuService.updateStu(student);
				coinRecordService.insertSelective(coinRecord);
				json.setSuccess(true);
				json.setMsg("兑换成功");
				// 更新session信息
				sessionInfo.setStuUserid(student.getStuUserid()); // 用户登陆名
				sessionInfo.setStuNo(student.getStuNo()); // 主键
				sessionInfo.setStudent(student);
				request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);
			}
		} else {
			json.setMsg("密码错误");
		}
		writeJson(json);
	}

	// 我的笔记
	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdbj")
	@RequestMapping("/note.do")
	public String note() {
		Integer stuNo = this.getSessionInfo().getStuNo();
		List<CourseNote> noteCourseList = myCenterService.getCourses(stuNo);
		this.request.setAttribute("noteCourseList", noteCourseList);
		return "admin/myCenterNote";
	}

	// 我的笔记章节
	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdbj")
	@RequestMapping("/noteChapter.do")
	public String noteChapter(@RequestParam(value = "specId") Integer specId, @RequestParam(value = "chapId", required = false) Integer chapId, @RequestParam(value = "chapName", required = false) String chapName, @RequestParam(value = "page", required = false, defaultValue = "1") Integer page, @RequestParam(value = "search", required = false, defaultValue = "") String search) {

		List<Chapter> noteChapterList = myCenterService.getChapterList(specId);
		this.request.setAttribute("noteChapterList", noteChapterList);
		if (chapId == null) {
			chapId = noteChapterList.get(0).getChapId();
			chapName = noteChapterList.get(0).getChapName();
		}
		this.request.setAttribute("specId", specId);
		this.request.setAttribute("chapId", chapId);
		this.request.setAttribute("chapName", chapName);

		Integer stuNo = this.getSessionInfo().getStuNo();
		RowBoundsWithTotalCount rowBounds = new RowBoundsWithTotalCount(ROWS, page);

		List<MoreNote> noteList = myCenterService.getNoteList(stuNo, chapId, "".equals(search.trim()) ? null : ("%" + search + "%"), rowBounds);

		this.request.setAttribute("noteList", noteList);
		this.request.setAttribute("search", search);
		this.request.setAttribute("pno", 1);

		this.request.setAttribute("total", Double.valueOf(Math.ceil(rowBounds.getTotalCount() / ROWS.doubleValue())).intValue());

		this.request.setAttribute("totalRecords", rowBounds.getTotalCount());
		return "admin/myCenterNoteChapter";
	}

	// 我的笔记章节-学习中心
	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdbj")
	@RequestMapping("/noteChapterCourse.do")
	public String noteChapterCourse(@RequestParam(value = "specId") Integer specId, @RequestParam(value = "chapId", required = false) Integer chapId, @RequestParam(value = "chapName", required = false) String chapName, @RequestParam(value = "page", required = false, defaultValue = "1") Integer page, @RequestParam(value = "search", required = false, defaultValue = "") String search) {
		List<Chapter> noteChapterList = myCenterService.getChapterList(specId);
		this.request.setAttribute("noteChapterList", noteChapterList);
		if (chapId == null) {
			chapId = noteChapterList.get(0).getChapId();
			chapName = noteChapterList.get(0).getChapName();
		}
		this.request.setAttribute("specId", specId);
		this.request.setAttribute("chapId", chapId);
		this.request.setAttribute("chapName", chapName);

		Integer stuNo = this.getSessionInfo().getStuNo();
		RowBoundsWithTotalCount rowBounds = new RowBoundsWithTotalCount(ROWS, page);
		List<MoreNote> noteList = myCenterService.getNoteList(stuNo, chapId, "".equals(search.trim()) ? null : ("%" + search + "%"), rowBounds);
		this.request.setAttribute("noteList", noteList);
		this.request.setAttribute("search", search);
		this.request.setAttribute("pno", 1);
		this.request.setAttribute("total", Double.valueOf(Math.ceil(rowBounds.getTotalCount() / ROWS.doubleValue())).intValue());
		this.request.setAttribute("totalRecords", rowBounds.getTotalCount());
		return "study/online/course/courseNoteChapter";
	}

	// 笔记列表
	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdbj")
	@RequestMapping("/noteList.do")
	public String noteList(@RequestParam(value = "chapId") Integer chapId, @RequestParam(value = "page", required = false, defaultValue = "1") Integer page, @RequestParam(value = "search", required = false, defaultValue = "") String search) {
		Integer stuNo = this.getSessionInfo().getStuNo();
		RowBoundsWithTotalCount rowBounds = new RowBoundsWithTotalCount(ROWS, page);
		if ("".equals(search.trim())) {
			search = null;
		} else {
			search = "%" + search + "%";
		}
		List<MoreNote> noteList = myCenterService.getNoteList(stuNo, chapId, search, rowBounds);
		this.request.setAttribute("noteList", noteList);
		this.request.setAttribute("rb", rowBounds);
		return "admin/myCenterNoteList";
	}

	// 编辑笔记
	@RequestMapping("/editNote.do")
	public void editNote(Note note) {
		note.setNoteRegtime(new Date());
		if (myCenterService.editNote(note) > 0) {
			this.writeString("success");
		}
	}

	// 删除笔记
	@RequestMapping("/delNote.do")
	public void editNote(Integer noteId) {
		myCenterService.delNote(noteId);
		try {
			this.request.getRequestDispatcher("/myCenter/noteChapter.do").forward(request, response);
		} catch (ServletException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	// 删除笔记
	@RequestMapping("/delNoteCourse.do")
	public void delNoteCourse(Integer noteId) {
		myCenterService.delNote(noteId);
		try {
			this.request.getRequestDispatcher("/myCenter/noteChapterCourse.do").forward(request, response);
		} catch (ServletException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * 我的账户(学习币充值)
	 * 
	 * @param request
	 * @param response
	 */
	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdzh")
	@RequestMapping("/myAccountManager.do")
	public ModelAndView myAccountManager(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/myAccountManager");

		// 学习币交易记录
		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(10, 1);
		CoinRecordExample recordExample = new CoinRecordExample();
		recordExample.createCriteria().andCrecStuNoEqualTo(getSessionInfo().getStudent().getStuNo());
		recordExample.setOrderByClause("CREC_REGTIME DESC");
		List<CoinRecord> coinRecords = coinRecordService.selectByExampleWithBLOBs(recordExample, rb);
		mv.addObject("coinRecords", coinRecords);

		return mv;
	}

	/**
	 * 判断是stu还是user
	 * 
	 * @return true：user；false：stu；null：null；
	 */
	private Boolean isUser() {
		if (this.getSessionInfo() != null) {
			if (this.getSessionInfo().getUser() != null) {
				return true;
			}
			if (this.getSessionInfo().getStudent() != null) {
				return false;
			}
		}
		return null;
	}

	/**
	 * 辅导中心
	 * 
	 * @return
	 */
//	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wddy")
//	@RequestMapping("/coach.do")
//	public String coach() {
//		UserWithBLOBs user = this.getSessionInfo().getUser();
//		String userOnline = this.myCenterService.userOnline(user.getUserNo());
//		user.setUserOnline(userOnline);
//		this.request.setAttribute("userOnline", userOnline);
//
//		List<RealtimeQAModel> qaModelList = realtimeQAService.getRealtimeQAModelByRqaUserNo(getSessionInfo().getUserNo());// 收入明细
//		request.setAttribute("qaModelList", qaModelList);
//
//		return "admin/myUserCenterCoach";
//	}

	// 我的答疑
	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wddy")
	@RequestMapping("/stuRqa.do")
	public String stuRqa(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page, @RequestParam(value = "search", required = false, defaultValue = "") String search) {
		Integer stuNo = this.getSessionInfo().getStuNo();
		RealtimeQAExample example = new RealtimeQAExample();
		Criteria crit = example.createCriteria();
		crit.andRqaStuNoEqualTo(stuNo);
		crit.andRqaStatusGreaterThan("5");
		example.setOrderByClause("RQA_REGTIME DESC");

		RowBoundsWithTotalCount rowBounds = new RowBoundsWithTotalCount(ROWS, page);
		if (!"".equals(search.trim())) {
			crit.andRqaTitleLike("%" + search.trim() + "%");
		}
		List<RealtimeQAWithBLOBs> rqaList = myCenterService.getRealtimeQAs(example, rowBounds);
		this.request.setAttribute("rqaList", rqaList);
		this.request.setAttribute("search", search);
		this.request.setAttribute("pno", page);
		this.request.setAttribute("total", Double.valueOf(Math.ceil(rowBounds.getTotalCount() / ROWS.doubleValue())).intValue());
		this.request.setAttribute("totalRecords", rowBounds.getTotalCount());
		return "admin/myCenterRealtimeQA";
	}

	/**
	 * 为FullCalendar生成用户答疑记录数据
	 * 
	 * @param start
	 * @param end
	 */
	@RequestMapping("/getUserRqaEvents.do")
	public void getUserRqaEvents(@RequestParam("start") Date start, @RequestParam("end") Date end) {
		List<FCEvent> list = this.myCenterService.getUserRqaEvents(this.getSessionInfo().getUser().getUserNo(), start, end);
		writeJson(list);
	}

	/**
	 * 教师实训
	 * 
	 * @return
	 */
	@LoginRequired(redirectTo="/myCenter/view.do?active=w_wdsx")
	@RequestMapping("/userPrac.do")
	public String userPrac() {
		UserWithBLOBs user = this.getSessionInfo().getUser();
		List<MorePractice> pracList = this.myCenterService.getUserPracList(user.getUserNo());
		/*
		 * for (MorePractice morePractice : pracList) {
		 * morePractice.setPracIsTeam
		 * (ReaderXmlParam.getInstance().getParammain("34",
		 * morePractice.getPracIsTeam()));
		 * morePractice.setPracStatus(ReaderXmlParam
		 * .getInstance().getParammain("43", morePractice.getPracStatus())); }
		 */
		this.request.setAttribute("pracList", pracList);
		return "admin/myUserCenterPrac";
	}

	@RequestMapping("getRqaCostByQacount.do")
	public void getRqaCostByQacount(@RequestParam(value = "qAcount") Integer qAcount) {
		Json j = new Json();
		RqaCost rqaCost = myCenterService.getRqaCostByQacount(qAcount);
		if (rqaCost != null) {
			j.setSuccess(true);
			j.setObj(rqaCost);
		}
		writeJson(j);
	}

	/**
	 * 学习币购买答疑次数
	 * 
	 * @param qAcount
	 *            购买次数
	 * @param stuPwd
	 *            当前登录密码
	 */
	@RequestMapping("buy.do")
	public void buy(@RequestParam(value = "qAcount") Integer qAcount, @RequestParam(value = "stuPwd") String stuPwd) {

		Json j = new Json();

		if (qAcount > 0) {
			// 验证密码
			StudentWithBLOBs student = getSessionInfo().getStudent();
			if (student.getStuPwd().equals(Encrypt.md5(stuPwd))) {
				// 根据购买次数查询优惠规则
				RqaCost rqaCost = myCenterService.getRqaCostByQacount(qAcount);
				if ((rqaCost.getRcCoinCost() * qAcount) < student.getStuCoin()) {
					student.setStuCoin(student.getStuCoin() - (rqaCost.getRcCoinCost() * qAcount));
					student.setStuQacount(student.getStuQacount() + qAcount);
					if (stuService.updateStu(student) > 0) {
						// 更新session信息
						SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO);
						sessionInfo.setStuUserid(student.getStuUserid()); // 用户登陆名
						sessionInfo.setStuNo(student.getStuNo()); // 主键
						sessionInfo.setStudent(student);
						request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);
						// 返回结果
						j.setSuccess(true);
						j.setMsg("购买成功");
						j.setObj(student);
					}
				} else {
					j.setMsg("余额不足，请充值!");
				}
			} else {
				j.setMsg("密码错误,请重试!");
			}
		} else {
			j.setMsg("违法操作!");
		}

		writeJson(j);
	}
}
