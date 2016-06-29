package com.chinasofti.cetp.admin.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.cetp.admin.model.Feedback;
import com.chinasofti.cetp.admin.model.StuTechTypeKey;
import com.chinasofti.cetp.admin.model.Student;
import com.chinasofti.cetp.admin.model.StudentExample;
import com.chinasofti.cetp.admin.model.StudentExample.Criteria;
import com.chinasofti.cetp.admin.model.StudentWithBLOBs;
import com.chinasofti.cetp.admin.pageModel.ModelNotification;
import com.chinasofti.cetp.admin.pageModel.ModelStudent;
import com.chinasofti.cetp.admin.service.CoinRecordService;
import com.chinasofti.cetp.admin.service.FeedbackService;
import com.chinasofti.cetp.admin.service.ScoreRecordService;
import com.chinasofti.cetp.admin.service.ScoreRuleService;
import com.chinasofti.cetp.admin.service.StuService;
import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.core.service.EmailService;
import com.chinasofti.cetp.practice.model.PracPersonKey;
import com.chinasofti.cetp.practice.model.Practice;
import com.chinasofti.cetp.practice.model.PracticeTeam;
import com.chinasofti.cetp.study.model.TechType;
import com.chinasofti.cetp.utils.Constants;
import com.chinasofti.cetp.utils.DesUtils;
import com.chinasofti.cetp.utils.Encrypt;
import com.chinasofti.cetp.utils.FileUploadHelper;
import com.chinasofti.cetp.utils.FileUrl;
import com.chinasofti.cetp.utils.Json;
import com.chinasofti.cetp.utils.LoginRequired;
import com.chinasofti.cetp.utils.MessageUtils;
import com.chinasofti.cetp.utils.Param;
import com.chinasofti.cetp.utils.ReaderXmlParam;
import com.chinasofti.cetp.utils.SessionInfo;
import com.chinasofti.cetp.utils.SessionListener;
import com.chinasofti.cetp.utils.TechTypeUtils;
import com.chinasofti.cetp.utils.ValidCodeUtils;
import com.chinasofti.cetp.utils.PropertiesUtil;

/**
 * 前台学生（个人用户）控制器
 * 
 * @author heyuqiang
 * 
 */
@Scope("prototype")
@Controller
@RequestMapping("/student.do")
public class StudentController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(StudentController.class);
	private static String customSecretKey = PropertiesUtil.getProperty("/config.properties", "mail.customSecretKey");

	private static String subjectAecurity = PropertiesUtil.getProperty("/config.properties", "mail.subject.security");
	private static String subjectActivate = PropertiesUtil.getProperty("/config.properties", "mail.subject.activate");
	private static String subjectWarn = PropertiesUtil.getProperty("/config.properties", "mail.subject.warn");
	private static String mailSend = PropertiesUtil.getProperty("/config.properties", "mail.send");

	private StuService stuService;
	private EmailService emailService;
	private ScoreRecordService scoreRecordService;
	private ScoreRuleService scoreRuleService;
	private CoinRecordService coinRecordService;
	private FeedbackService feedbackService;
	private FileUploadHelper fileUploadHelper;

	public StuService getStuService() {
		return stuService;
	}

	@Autowired
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}

	public EmailService getEmailService() {
		return emailService;
	}

	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public ScoreRecordService getScoreRecordService() {
		return scoreRecordService;
	}

	@Autowired
	public void setScoreRecordService(ScoreRecordService scoreRecordService) {
		this.scoreRecordService = scoreRecordService;
	}

	public ScoreRuleService getScoreRuleService() {
		return scoreRuleService;
	}

	@Autowired
	public void setScoreRuleService(ScoreRuleService scoreRuleService) {
		this.scoreRuleService = scoreRuleService;
	}

	public CoinRecordService getCoinRecordService() {
		return coinRecordService;
	}

	@Autowired
	public void setCoinRecordService(CoinRecordService coinRecordService) {
		this.coinRecordService = coinRecordService;
	}

	public FeedbackService getFeedbackService() {
		return feedbackService;
	}

	@Autowired
	public void setFeedbackService(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}

	public FileUploadHelper getFileUploadHelper() {
		return fileUploadHelper;
	}

	@Autowired
	public void setFileUploadHelper(FileUploadHelper fileUploadHelper) {
		this.fileUploadHelper = fileUploadHelper;
	}

	/**
	 * 个人用户登录
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 * @return
	 */
	@RequestMapping(params = "method=login")
	public void login(HttpServletRequest request, HttpServletResponse response, ModelStudent modelStudent) {
		Json json = new Json();
		// 获取系统生成的验证码
		String verifyCode = (String) request.getSession().getAttribute(ValidCodeUtils.RANDOMCODEKEY);

		if (verifyCode.equalsIgnoreCase(modelStudent.getVerifyCode())) { // 判断输入的验证码是否正确
			Student student = new Student();
			BeanUtils.copyProperties(modelStudent, student, new String[] {});
			List<StudentWithBLOBs> stuList = stuService.login(student);

			if (stuList.size() > 0) { // 用户名或邮箱存在
				StudentWithBLOBs stu = stuList.get(0);
				if (stu.getStuPwd().equals(Encrypt.md5(student.getStuPwd()))) { // 密码正确
					if (stu.getStuIsactivate() == 1) { // 账号已激活
						SessionInfo sessionInfo = new SessionInfo();
						sessionInfo.setStuUserid(stu.getStuUserid()); // 用户登陆名
						sessionInfo.setStuNo(stu.getStuNo()); // 主键
						sessionInfo.setStudent(stu);

						request.getSession().removeAttribute(Constants.SESSIONINFO);
						request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

						HttpSession session = request.getSession();
						String key = "s" + stu.getStuNo().toString();
						Map<String, HttpSession> sessionMap = SessionListener.getSessionMap();
						if (sessionMap.containsKey(key)) {
							HttpSession oldSession = sessionMap.get(key);
							try {
								if (session != oldSession) {
									oldSession.invalidate();
								}
							} catch (Exception e) {
							}
						}

						sessionMap.put(key, session);

						// 读取未读过的消息
						MessageUtils.addMessageInfo(stu.getStuNo(), null);
						// 登录积分管理
						scoreRecordService.addScore(stu.getStuNo(), 1);
						// 修改最后登录时间
						stu.setStuLastlogin(new Date());
						stuService.updateStu(stu);

						// 实训相关
						Integer stuNo = stu.getStuNo();
						Practice prac = stuService.getPracByClassId(stu.getStuClassId());
						if (prac != null) {

							// 所属实训 编号
							session.setAttribute("pracId", prac.getPracId());

							// #### 该学生已经参加团队实训
							if (prac.getPracIsTeam().equals("2")) {
								// // 未选项目的组长
								// Integer TeamLeaderNo =
								// stuService.isTeamLeader(stuNo);
								// session.setAttribute("TeamLeaderNo",
								// TeamLeaderNo);
								//
								// // 已选项目的组长
								// Integer selectedProTeamLeader =
								// stuService.selectedProTeamLeader(stuNo);
								// session.setAttribute("selectedProTeamLeader",
								// selectedProTeamLeader);

								PracticeTeam pt = stuService.getPtByStuNo(stuNo);

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
								PracPersonKey pp = stuService.getProIdByStuNo(stuNo);
								if (pp != null) {
									// 所属实训案例项目编号
									session.setAttribute("proId", pp.getPpProId());

									session.setAttribute("pracIsTeam", "1");

									logger.info("pracId--->>" + pp.getPpPracId());
									logger.info("proId--->>" + pp.getPpProId());
									logger.info("pracIsTeam--->>" + session.getAttribute("pracIsTeam"));

								} else {
									// #### 该学生没参加实训
									session.setAttribute("pracIsTeam", "0");
									logger.info("prac is null");
								}
							}
						}
						json.setMsg("登录成功");
						json.setSuccess(true);
					} else if (stu.getStuIsactivate() == 0) {
						json.setMsg("该账号未激活!请查收邮件!");
					}
				} else {
					json.setMsg("密码错误!");
				}
			} else {
				json.setMsg("用户名或邮箱不存在!");
			}
		} else {
			json.setMsg("验证码输入错误!");
		}

		super.writeJson(json);
	}

	/**
	 * 个人用户注销登录
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 * @return
	 */
	@RequestMapping(params = "method=logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		Json json = new Json();
		try {
			request.getSession().invalidate();
			request.getSession(true);
			json.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			json.setSuccess(false);
		}
		super.writeJson(json);
	}

	/**
	 * 个人用户注册
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	@RequestMapping(params = "method=register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response, ModelStudent modelStudent) {

		ModelAndView mv = new ModelAndView();

		// 获取系统生成的验证码
		String verifyCode = (String) request.getSession().getAttribute(ValidCodeUtils.RANDOMCODEKEY);

		if (verifyCode.equalsIgnoreCase(modelStudent.getVerifyCode())) { // 判断输入的验证码是否正确
			StudentWithBLOBs student = new StudentWithBLOBs();
			BeanUtils.copyProperties(modelStudent, student, new String[] { "stuPwd" });
			student.setStuPwd(Encrypt.md5(modelStudent.getStuPwd()));
			student.setStuMailCfg("1"); // 默认设置接收邮件
			student.setStuGroupId(1); // 默认用户组
			student.setStuScore(0); // 默认积分
			student.setStuCoin(0); // 默认学习币
			student.setStuHeadS("images/yhtx.png"); // 设置个人头像图片（小）
			student.setStuHeadM("images/rwtx.png");
			student.setStuHead("images/mruserimg.png");
			student.setStuRegtime(new Date());// 注册时间
			// 注：修复新博前台大量使用stuName字段
			student.setStuName(modelStudent.getStuUserid());

			if (mailSend.equalsIgnoreCase("on")) { // 系统邮件系统开关
				student.setStuIsactivate(0); // 是否被激活（0：未激活、1：已激活）
				try {
					StringBuffer securityVerifyCode = new StringBuffer();
					int verifyCodeCount = 6; // 设置生成验证码个数
					for (int i = 0; i < verifyCodeCount; i++) {
						securityVerifyCode.append(ValidCodeUtils.getRandomChar());
					}
					DesUtils des = new DesUtils(customSecretKey); // 自定义密钥
					student.setStuFlag(des.encrypt(securityVerifyCode.toString()));
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (stuService.saveStudent(student) > 0) { // 保存数据返回结果
					// 发送邮件
					if (emailService.sendEmail(student.getStuMail(),
							emailService.getActivateAccountMessage(student.getStuUserid(),
									this.getActivateAccountURL(student.getStuUserid(), student.getStuFlag())),
							subjectActivate)) { // 邮件发送成功

						StringBuffer emailLoginURL = new StringBuffer();
						emailLoginURL.append("http://mail.");
						emailLoginURL.append(student.getStuMail().substring(student.getStuMail().indexOf("@") + 1));

						mv.addObject("sendEmail", student.getStuMail());
						List<Param> paramList = ReaderXmlParam.getInstance().getParamList("67");
						boolean flag = false;

						for (Param param : paramList) {
							if (emailLoginURL.toString().indexOf(param.getParam_name()) > 0) {
								flag = true;
								break;
							}
						}

						if (flag) {
							mv.addObject("emailLoginURL", emailLoginURL.toString());
						}

						mv.addObject("flag", flag);

						mv.setViewName("/register_succ");
					} else { // 邮件发送失败
						mv.setViewName("/register_fail");
					}
				} else {
					mv.setViewName("/register_fail");
				}
			} else {
				student.setStuIsactivate(1); // 是否被激活（0：未激活、1：已激活）
				student.setStuFlag("-1");
				if (stuService.saveStudent(student) > 0) {
					SessionInfo sessionInfo = new SessionInfo();
					sessionInfo.setStuUserid(student.getStuUserid()); // 用户登陆名
					sessionInfo.setStuNo(student.getStuNo()); // 主键
					sessionInfo.setStudent(student);
					request.getSession().removeAttribute(Constants.SESSIONINFO);
					request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

					HttpSession session = request.getSession();
					String key = "s" + student.getStuNo().toString();
					Map<String, HttpSession> sessionMap = SessionListener.getSessionMap();
					sessionMap.put(key, session);

					// 读取未读过的消息
					MessageUtils.addMessageInfo(student.getStuNo(), null);
				}
				mv.setViewName("/activate_success");
			}
		} else {
			mv.setViewName("/register");
		}
		return mv;
	}

	/**
	 * 账号激活
	 * 
	 * @return
	 */
	@RequestMapping(params = "method=activateAccount", method = RequestMethod.GET)
	public String activateAccount() {

		try {
			DesUtils des = new DesUtils(customSecretKey); // 自定义密钥
			String stuUserid = des.decrypt(request.getParameter("vstr"));
			String flag = des.decrypt(request.getParameter("merge"));

			StudentWithBLOBs student = stuService.activateAccount(stuUserid, flag);
			if (student != null) {
				SessionInfo sessionInfo = new SessionInfo();
				sessionInfo.setStuUserid(student.getStuUserid()); // 用户登陆名
				sessionInfo.setStuNo(student.getStuNo()); // 主键
				sessionInfo.setStudent(student);
				request.getSession().removeAttribute(Constants.SESSIONINFO);
				request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

				HttpSession session = request.getSession();
				String key = "s" + student.getStuNo().toString();
				Map<String, HttpSession> sessionMap = SessionListener.getSessionMap();
				sessionMap.put(key, session);

				// 读取未读过的消息
				MessageUtils.addMessageInfo(student.getStuNo(), null);

				logger.info("激活成功!");
				return "/activate_success";
			} else {
				logger.info("激活失败，连接失效");
				return "/activate_lose";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/index";
	}

	/**
	 * 获得激活账号URL
	 * 
	 * @param userName
	 *            登录名
	 * @param flag
	 *            验证码
	 * @return
	 */
	public String getActivateAccountURL(@RequestParam("stuUserid") String stuUserid,
			@RequestParam("flag") String flag) {

		StringBuffer sb = new StringBuffer();
		String requestURL = request.getRequestURL().toString();
		String contextPath = request.getContextPath();
		sb.append(requestURL.substring(0, requestURL.indexOf(contextPath)));
		sb.append(contextPath);
		sb.append("/student.do?method=activateAccount");
		sb.append("&vstr=");
		try {
			DesUtils des = new DesUtils(customSecretKey); // 自定义密钥
			sb.append(des.encrypt(stuUserid));
			sb.append("&tpl=mn&u=http%3A%2F%2Fwww.zhaikexueyuan.com");
			sb.append("&merge=");
			sb.append(des.encrypt(flag));
			sb.append("&subpro=");
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info(sb.toString());
		return sb.toString();
	}

	/**
	 * 注册成功跳转页面
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(params = "method=registerSucc")
	public ModelAndView registerSucc(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("/admin/register_succ");
		return mv;
	}

	/**
	 * 检查用户是否可用
	 * 
	 * @param requestSf
	 * @param response
	 * @param stuName用户名
	 */
	@RequestMapping(params = "method=chackUserNameAvailable")
	public void chackUserNameAvailable(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("stuName") String stuName) {
		Json json = new Json();
		if (stuService.chackStuNameAvailable(stuName)) {
			json.setSuccess(true);
		} else {
			json.setMsg("用户名 " + stuName + " 已经被注册了，请更换!");
		}
		super.writeJson(json);
	}

	/**
	 * 检查用户是否可用(用于密码找回)
	 * 
	 * @param requestSf
	 * @param response
	 * @param stuName用户名
	 */
	@RequestMapping(params = "method=chackUserNameForRecover")
	public void chackUserNameForRecover(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("stuName") String stuName) {
		Json json = new Json();
		if (stuService.chackUserNameForRecover(stuName)) {
			json.setSuccess(true);
		} else {
			json.setMsg("用户名 " + stuName + " 不存在!");
		}
		super.writeJson(json);
	}

	/**
	 * 检查邮箱是否可用
	 * 
	 * @param request
	 * @param response
	 * @param email
	 *            邮箱
	 */
	@RequestMapping(params = "method=chackEmailAvailable")
	public void chackEmailAvailable(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("email") String email) {
		Json json = new Json();
		if (stuService.chackEmailAvailable(email)) {
			json.setSuccess(true);
		} else {
			json.setMsg("邮箱 " + email + " 已经被注册了，请更换!");
		}
		super.writeJson(json);
	}

	/**
	 * 检查验证码是否正确
	 * 
	 * @param request
	 * @param response
	 * @param verifyCode
	 *            验证码
	 */
	@RequestMapping(params = "method=chackVerifyCode")
	public void chackVerifyCode(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("verifyCode") String verifyCode) {
		// 获取系统生成的验证码
		String code = (String) request.getSession().getAttribute(ValidCodeUtils.RANDOMCODEKEY);
		Json json = new Json();
		if (code.equalsIgnoreCase(verifyCode)) {
			json.setSuccess(true);
		} else {
			json.setMsg("* 验证码不正确");
		}
		super.writeJson(json);
	}

	/**
	 * 个人用户-资料设置
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@LoginRequired
	@RequestMapping(params = "method=dataSet")
	public ModelAndView dataSet(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "flag", required = false, defaultValue = "false") Boolean flag) {
		ModelAndView mv = new ModelAndView("/admin/dataSet");

		// 获取时间列表
		List<Integer> calendar = this.getCalendar(1970);
		mv.addObject("calendar", calendar);
		mv.addObject("flag", flag);
		// 从Session 中读取用户信息
		SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO);
		StudentWithBLOBs stu = (StudentWithBLOBs) sessionInfo.getStudent();

		int number = 5000; // 页面元素ID标识
		// 教育背景
		String stuEdBg = stu.getStuEduBg();
		if (stuEdBg != null) {
			if (stuEdBg.length() > 0) {
				String[] stuEdBgArray = stuEdBg.split(",");
				List<String> stuEdBgList = new ArrayList<String>();
				for (int i = 0; i < stuEdBgArray.length; i++) {
					stuEdBgList.add("<li id='" + number + "'><span class='left'>" + stuEdBgArray[i]
							+ "</span><a href=\"" + "javascript:removeStuEduBg('#" + number + "')"
							+ "\"' class='close left'>close</a></li>");
					number++;
				}
				mv.addObject("stuEdBgList", stuEdBgList);
			}
		}
		// 工作经验
		/*
		 * String stuWorkExp = stu.getStuWorkExp(); if (stuEdBg != null) { if
		 * (stuWorkExp.length() > 0) { String[] stuWorkExpArray =
		 * stuWorkExp.split(","); List<String> stuWorkExpList = new
		 * ArrayList<String>(); for (int i = 0; i < stuWorkExpArray.length; i++)
		 * { stuWorkExpList.add("<li id='" + number + "'><span class='left'>" +
		 * stuWorkExpArray[i] + "</span><a href=\"" +
		 * "javascript:removeStuEduBg('#" + number + "')" +
		 * "\"' class='close left'>close</a></li>"); number++; }
		 * mv.addObject("stuWorkExpList", stuWorkExpList); } }
		 */

		// 方向设置
		List<TechType> techTypeList = this.getTechTypeList();
		mv.addObject("techTypeList", techTypeList);
		List<StuTechTypeKey> stuTechTypeList = this.stuService.getStuTechtypes(stu.getStuNo());
		mv.addObject("stuTechTypeList", stuTechTypeList);

		// 通知设置
		List<ModelNotification> modelNotificationList = this.getModelNotificationList();
		mv.addObject("modelNotificationList", modelNotificationList);

		return mv;
	}

	/**
	 * 获取时间日历（年份列表）
	 * 
	 * @param startTime
	 *            起始时间（例如：1970 年）
	 * @return
	 */
	public List<Integer> getCalendar(int startTime) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy");
		int currentTime = Integer.parseInt(sf.format(new Date())); // 入学结束时间（当前时间的年部分）
		List<Integer> calendar = new ArrayList<Integer>();
		for (int i = 0; i <= currentTime - startTime; i++) {
			calendar.add(startTime + i);
		}
		return calendar;
	}

	/**
	 * 个人信息完善
	 * 
	 * @param request
	 * @param response
	 * @param studentWithBLOBs
	 */
	@RequestMapping(params = "method=perfectionInfo")
	public void perfectionInfo(HttpServletRequest request, HttpServletResponse response,
			StudentWithBLOBs studentWithBLOBs) {
		Json json = new Json();

		// 注：修复新博前台大量使用stuName字段
		if (studentWithBLOBs.getStuNickname() != null && !"".equals(studentWithBLOBs.getStuNickname())) {
			studentWithBLOBs.setStuName(studentWithBLOBs.getStuNickname());
		} else {
			studentWithBLOBs.setStuName(studentWithBLOBs.getStuUserid());
		}

		if (stuService.updateStu(studentWithBLOBs) > 0) {
			json.setSuccess(true);
			json.setMsg("保存成功");
			// 更新session信息
			StudentWithBLOBs stu = stuService.selectByPrimaryKey(studentWithBLOBs.getStuNo());
			SessionInfo sessionInfo = new SessionInfo();
			sessionInfo.setStuUserid(stu.getStuUserid()); // 用户登陆名
			sessionInfo.setStuNo(stu.getStuNo()); // 主键
			sessionInfo.setStudent(stu);
			request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

			// 首次完善个人信息加积分
			scoreRecordService.addScore(stu.getStuNo(), 6);
		} else {
			json.setMsg("保存失败");
		}

		super.writeJson(json);
	}

	/**
	 * 账户设置-邮箱
	 * 
	 * @param request
	 * @param response
	 * @param studentWithBLOBs
	 */
	@RequestMapping(params = "method=modifiStuMail")
	public void modifiStuMail(HttpServletRequest request, HttpServletResponse response,
			StudentWithBLOBs studentWithBLOBs) {

		Json json = new Json();
		// 从Session 中读取用户信息
		SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO);
		StudentWithBLOBs student = (StudentWithBLOBs) sessionInfo.getStudent();
		if (student.getStuPwd().equals(Encrypt.md5(studentWithBLOBs.getStuPwd()))) { // 密码输入正确
			student.setStuMail(studentWithBLOBs.getStuMail());
			if (stuService.updateStu(student) > 0) {
				json.setSuccess(true);
				json.setMsg("保存成功");
				// 更新session信息
				StudentWithBLOBs stu = stuService.selectByPrimaryKey(studentWithBLOBs.getStuNo());
				sessionInfo.setStuUserid(stu.getStuUserid()); // 用户登陆名
				sessionInfo.setStuNo(stu.getStuNo()); // 主键
				sessionInfo.setStudent(stu);
				request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);
			} else {
				json.setMsg("保存失败");
			}
		} else {
			json.setMsg("密码错误");
		}

		logger.info(super.toJSONString(studentWithBLOBs));
		super.writeJson(json);
	}

	/**
	 * 密码设置-修改密码
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@RequestMapping(params = "method=modifiStuPwd")
	public void modifiStuPwd(HttpServletRequest request, HttpServletResponse response, ModelStudent modelStudent) {
		Json json = new Json();
		// 从Session 中读取用户信息
		SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO);
		StudentWithBLOBs student = (StudentWithBLOBs) sessionInfo.getStudent();
		if (student.getStuPwd().equals(Encrypt.md5(modelStudent.getStuPwd()))) { // 密码输入正确
			student.setStuPwd(Encrypt.md5(modelStudent.getNewStuPwd()));
			if (stuService.updateStu(student) > 0) {
				json.setSuccess(true);
				json.setMsg("保存成功");
				// 更新session信息
				StudentWithBLOBs stu = stuService.selectByPrimaryKey(modelStudent.getStuNo());
				sessionInfo.setStuUserid(stu.getStuUserid()); // 用户登陆名
				sessionInfo.setStuNo(stu.getStuNo()); // 主键
				sessionInfo.setStudent(stu);
				request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

				if (mailSend.equalsIgnoreCase("on")) { // 系统邮件系统开关
					// 修改密码成功后向用户发送邮件提醒
					emailService.sendEmail(stu.getStuMail(), emailService.getUpdatePwdMessage(stu.getStuUserid()),
							subjectWarn);
				}
			} else {
				json.setMsg("保存失败");
			}
		} else {
			json.setMsg("原密码错误");
		}

		logger.info(super.toJSONString(modelStudent));
		super.writeJson(json);
	}

	/**
	 * 密码设置-密码找回 步骤1
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@RequestMapping(params = "method=pwdRecoverFirst")
	public ModelAndView pwdRecoverFirst(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("/admin/pwdRecoverFirst");
	}

	/**
	 * 密码设置-密码找回 步骤2
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@RequestMapping(params = "method=pwdRecoverSecond")
	public ModelAndView pwdRecoverSecond(HttpServletRequest request, HttpServletResponse response,
			ModelStudent modelStudent) {

		ModelAndView mv = new ModelAndView();
		// 获取系统生成的验证码
		String verifyCode = (String) request.getSession().getAttribute(ValidCodeUtils.RANDOMCODEKEY);
		if (verifyCode.equalsIgnoreCase(modelStudent.getVerifyCode())) { // 判断输入的验证码是否正确

			StudentExample example = new StudentExample();
			Criteria criteria = example.createCriteria();

			// ◆验证是否为邮箱地址
			Pattern pattern = Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+", Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(modelStudent.getStuUserid());

			if (matcher.matches()) { // 判断用户名是否为邮箱格式
				criteria.andStuMailEqualTo(modelStudent.getStuUserid());
			} else {
				criteria.andStuUseridEqualTo(modelStudent.getStuUserid());
			}

			List<StudentWithBLOBs> studentWithBLOBList = stuService.selectByExampleWithBLOBs(example);
			if (studentWithBLOBList.size() > 0) {
				StudentWithBLOBs studentWithBLOBs = studentWithBLOBList.get(0);

				// 获取邮箱地址并加密 例如：78****00@qq.com 形式
				String mail = studentWithBLOBs.getStuMail(); // 加密前
				String prefixEmail = mail.substring(0, 2);
				String star = "";
				for (int i = 0; i < mail.substring(0, mail.indexOf("@")).length() - 5; i++) {
					star += "*";
				}
				String suffixEmail = mail.substring(mail.substring(0, mail.indexOf("@")).length() - 3);
				mail = prefixEmail + star + suffixEmail; // 加密后

				StringBuffer securityVerifyCode = new StringBuffer();

				int verifyCodeCount = 6; // 设置生成验证码个数
				for (int i = 0; i < verifyCodeCount; i++) {
					securityVerifyCode.append(ValidCodeUtils.getRandomChar());
				}

				// 安全验证码
				request.getSession().removeAttribute("securityVerifyCode");
				request.getSession().setAttribute("securityVerifyCode", securityVerifyCode.toString());

				// 发送邮件
				if (emailService.sendEmail(studentWithBLOBs.getStuMail(),
						emailService.getFindPwdMessage(mail, securityVerifyCode.toString()), subjectAecurity)) { // 邮件发送成功
					request.getSession().removeAttribute("stuNo");
					request.getSession().setAttribute("stuNo", studentWithBLOBs.getStuNo());
					mv.addObject("mail", mail);
					mv.addObject("stuUserid", modelStudent.getStuUserid());
					mv.setViewName("/admin/pwdRecoverSecond");
				} else { // 邮件发送失败
					mv.addObject("errorMsg", "邮件发送失败!");
					mv.setViewName("/admin/pwdRecoverFirst");
				}
			}
		} else {
			mv.addObject("errorMsg", "验证码错误!");
			mv.setViewName("/admin/pwdRecoverFirst");
		}

		return mv;
	}

	/**
	 * 密码设置-密码找回 校验找回密码验证码
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@RequestMapping(params = "method=checkSecurityVerifyCode")
	public void checkSecurityVerifyCode(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("securityVerifyCode") String securityVerifyCode) {

		Json json = new Json();
		String sessionSecurityVerifyCode = (String) request.getSession().getAttribute("securityVerifyCode");
		if (sessionSecurityVerifyCode.equalsIgnoreCase(securityVerifyCode)) {
			json.setSuccess(true);
		} else {
			json.setMsg("验证码错误，请核对后重新输入");
		}

		super.writeJson(json);
	}

	/**
	 * 密码设置-密码找回 重发邮件
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@RequestMapping(params = "method=retransmission")
	public void retransmission(HttpServletRequest request, HttpServletResponse response, ModelStudent modelStudent) {

		Json json = new Json();

		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();

		criteria.andStuUseridEqualTo(modelStudent.getStuUserid());

		List<StudentWithBLOBs> studentWithBLOBList = stuService.selectByExampleWithBLOBs(example);
		if (studentWithBLOBList.size() > 0) {
			StudentWithBLOBs studentWithBLOBs = studentWithBLOBList.get(0);

			// 获取邮箱地址并加密 例如：78****00@qq.com 形式
			String mail = studentWithBLOBs.getStuMail(); // 加密前
			String prefixEmail = mail.substring(0, 2);
			String star = "";
			for (int i = 0; i < mail.substring(0, mail.indexOf("@")).length() - 5; i++) {
				star += "*";
			}
			String suffixEmail = mail.substring(mail.substring(0, mail.indexOf("@")).length() - 3);
			mail = prefixEmail + star + suffixEmail; // 加密后

			StringBuffer securityVerifyCode = new StringBuffer();

			int verifyCodeCount = 6; // 设置生成验证码个数
			for (int i = 0; i < verifyCodeCount; i++) {
				securityVerifyCode.append(ValidCodeUtils.getRandomChar());
			}

			// 安全验证码
			request.getSession().removeAttribute("securityVerifyCode");
			request.getSession().setAttribute("securityVerifyCode", securityVerifyCode.toString());

			// 发送邮件
			if (emailService.sendEmail(studentWithBLOBs.getStuMail(),
					emailService.getFindPwdMessage(mail, securityVerifyCode.toString()), subjectAecurity)) { // 邮件发送成功
				json.setSuccess(true);
				json.setMsg("邮件发送成功!");
			} else {
				json.setMsg("邮件发送失败!");
			}

			super.writeJson(json);
		}
	}

	/**
	 * 密码设置-密码找回 步骤3
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@RequestMapping(params = "method=pwdRecoverThirdly")
	public ModelAndView pwdRecoverThirdly(HttpServletRequest request, HttpServletResponse response,
			ModelStudent modelStudent) {

		ModelAndView mv = new ModelAndView();

		if (modelStudent.getVerifyCode() != null) {
			String sessionSecurityVerifyCode = (String) request.getSession().getAttribute("securityVerifyCode");
			if (sessionSecurityVerifyCode.equalsIgnoreCase(modelStudent.getVerifyCode())) {
				// 身份验证标识
				String uuid = UUID.randomUUID().toString();
				request.getSession().removeAttribute("uuid");
				request.getSession().setAttribute("uuid", uuid);

				mv.addObject("uuid", uuid);
				mv.setViewName("/admin/pwdRecoverThirdly");
			} else {
				mv.addObject("errorMsg", "验证码错误!");
				mv.setViewName("/admin/pwdRecoverSecond");
			}
		}

		return mv;
	}

	/**
	 * 密码设置-密码找回 步骤4
	 * 
	 * @param request
	 * @param response
	 * @param studentWithBLOBs
	 * @param uuid
	 */
	@RequestMapping(params = "method=pwdRecoverFourthly")
	public ModelAndView pwdRecoverFourthly(HttpServletRequest request, HttpServletResponse response,
			StudentWithBLOBs studentWithBLOBs, @RequestParam("uuid") String uuid) {

		ModelAndView mv = new ModelAndView();
		if (uuid.equals((String) request.getSession().getAttribute("uuid"))) {
			Integer stuNo = (Integer) session.getAttribute("stuNo");
			if (stuNo != null) {
				studentWithBLOBs.setStuNo(stuNo);
				studentWithBLOBs.setStuPwd(Encrypt.md5(studentWithBLOBs.getStuPwd()));
				if (stuService.updateStu(studentWithBLOBs) > 0) {
					// 用户登录状态保持
					StudentWithBLOBs stu = stuService.selectByPrimaryKey(stuNo);
					System.out.println("学生用户名：" + stu.getStuUserid());
					SessionInfo sessionInfo = new SessionInfo();
					sessionInfo.setStuUserid(stu.getStuUserid()); // 用户登陆名
					sessionInfo.setStuNo(stu.getStuNo()); // 主键
					sessionInfo.setStudent(stu);
					request.getSession().removeAttribute(Constants.SESSIONINFO);
					request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

					HttpSession session = request.getSession();
					String key = "s" + stu.getStuNo().toString();
					Map<String, HttpSession> sessionMap = SessionListener.getSessionMap();
					if (sessionMap.containsKey(key)) {
						HttpSession oldSession = sessionMap.get(key);
						try {
							oldSession.invalidate();
						} catch (Exception e) {
						}
					}
					sessionMap.put(key, session);

					// 读取未读过的消息
					MessageUtils.addMessageInfo(stu.getStuNo(), null);

					// 登录积分管理
					scoreRecordService.addScore(stu.getStuNo(), 1);
					// 修改最后登录时间
					stu.setStuLastlogin(new Date());
					stuService.updateStu(stu);
					// 修改密码成功后向用户发送邮件提醒
					emailService.sendEmail(stu.getStuMail(), emailService.getUpdatePwdMessage(stu.getStuUserid()),
							subjectWarn);

					mv.setViewName("/admin/pwdRecoverFourthly");
				}
			} else {
				mv.addObject("errorMsg", "验证码错误!");
				mv.setViewName("/admin/pwdRecoverThirdly");
			}
		}
		return mv;
	}

	/**
	 * 去往意见反馈
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(params = "method=toFeedback")
	public ModelAndView toFeedback(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/feedback");
		return mv;
	}

	/**
	 * 提交意见反馈
	 * 
	 * @param request
	 * @param response
	 * @param feedback
	 */
	@Transactional
	@RequestMapping(params = "method=doFeedback")
	public void doFeedback(HttpServletRequest request, HttpServletResponse response, Feedback feedback) {

		// 设置创建时间
		feedback.setFbRegtime(new Date());

		Json json = new Json();
		if (feedbackService.insert(feedback) > 0) {
			json.setSuccess(true);
			json.setObj(feedback.getFbId());
			json.setMsg("保存成功!");
		} else {
			json.setMsg("保存失败!");
		}
		super.writeJson(json);
	}

	/**
	 * 意见反馈提价附件
	 * 
	 * @param request
	 * @param response
	 * @param upload
	 *            文件
	 * @param uploadFileName
	 *            文件名
	 * @throws IOException
	 * @throws ServletException
	 */
	@RequestMapping(params = "method=doFeedbackUpLoad")
	public void upLoadImg(HttpServletRequest request, HttpServletResponse response, @RequestParam("fbId") Integer fbId)
			throws ServletException, IOException {

		String responseStr = "";

		String path = null;

		path = File.separator + "feedback" + File.separator;
		try {
			List<FileUrl> fileNameList = fileUploadHelper.uploadFiles(request, path, false, null);
			FileUrl fileUrl = fileNameList.get(0);
			Feedback feedback = feedbackService.selectByPrimaryKey(fbId);
			feedback.setFbAttachment(fileUrl.getDownloadUrl());
			feedbackService.updateByPrimaryKeySelective(feedback);
		} catch (IOException e) {
			responseStr = "上传失败";
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

		try {
			response.getWriter().write(responseStr);
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}
	}

	/**
	 * 构建技术方向数据项----->以后读数据库再次修改
	 * 
	 * @return
	 */
	public List<TechType> getTechTypeList() {

		List<TechType> techTypeList = new ArrayList<TechType>();
		List<TechType> rootList = TechTypeUtils.getSubList(0);
		techTypeList.addAll(rootList);
		for (TechType techType : rootList) {
			techTypeList.addAll(TechTypeUtils.getSubList(techType.getTechTypeId()));
		}

		return techTypeList;
	}

	/**
	 * 构建通知设置数据项----->以后读数据库再次修改
	 * 
	 * @return
	 */
	public List<ModelNotification> getModelNotificationList() {

		List<ModelNotification> modelNotificationList = new ArrayList<ModelNotification>();

		ModelNotification notification1 = new ModelNotification();
		notification1.setNotificationName("我的回答被采纳");
		notification1.setNotificationValue("01");

		ModelNotification notification2 = new ModelNotification();
		notification2.setNotificationName("别人回答我的问题");
		notification2.setNotificationValue("02");

		ModelNotification notification3 = new ModelNotification();
		notification3.setNotificationName("最新课程提醒");
		notification3.setNotificationValue("03");

		ModelNotification notification4 = new ModelNotification();
		notification4.setNotificationName("考试提醒");
		notification4.setNotificationValue("04");

		ModelNotification notification5 = new ModelNotification();
		notification5.setNotificationName("测验提醒");
		notification5.setNotificationValue("05");

		ModelNotification notification6 = new ModelNotification();
		notification6.setNotificationName("作业提醒");
		notification6.setNotificationValue("06");

		modelNotificationList.add(notification1);
		modelNotificationList.add(notification2);
		modelNotificationList.add(notification3);
		modelNotificationList.add(notification4);
		modelNotificationList.add(notification5);
		modelNotificationList.add(notification6);

		return modelNotificationList;
	}

	/**
	 * 技术方向设置
	 * 
	 * @param request
	 * @param response
	 * @param stuTechType
	 *            技术方向字串 逗号分隔
	 */
	@RequestMapping(params = "method=setTechType")
	public void setTechType(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("stuTechType") String stuTechType) {
		Json json = new Json();
		String[] stuTechTypes = stuTechType.substring(1).split(",");
		StudentWithBLOBs stu = this.getSessionInfo().getStudent();
		if (stuService.setStuTechTypes(stu.getStuNo(), stuTechTypes) > 0) {
			json.setSuccess(true);
			json.setMsg("保存成功");
		} else {
			json.setMsg("保存失败");
		}

		super.writeJson(json);
	}

	/**
	 * 岗位方向设置
	 * 
	 * @param request
	 * @param response
	 * @param stuProf
	 */
	@RequestMapping(params = "method=setProf")
	public void setProf(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("stuProf") Integer stuProf) {
		Json json = new Json();
		StudentWithBLOBs stu = this.getSessionInfo().getStudent();
		stu.setStuProf(stuProf);
		if (stuService.updateStu(stu) > 0) {
			json.setSuccess(true);
			json.setMsg("保存成功");
		} else {
			json.setMsg("保存失败");
		}

		super.writeJson(json);
	}

}
