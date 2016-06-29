package com.chinasofti.cetp.admin.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.cetp.admin.model.MoreModule;
import com.chinasofti.cetp.admin.model.MoreUser;
import com.chinasofti.cetp.admin.model.Org;
import com.chinasofti.cetp.admin.model.User;
import com.chinasofti.cetp.admin.model.UserExample;
import com.chinasofti.cetp.admin.model.UserExample.Criteria;
import com.chinasofti.cetp.admin.model.UserTechTypeKey;
import com.chinasofti.cetp.admin.model.UserWithBLOBs;
import com.chinasofti.cetp.admin.pageModel.ModelNotification;
import com.chinasofti.cetp.admin.pageModel.ModelUser;
import com.chinasofti.cetp.admin.service.FeedbackService;
import com.chinasofti.cetp.admin.service.ScoreRecordService;
import com.chinasofti.cetp.admin.service.UserService;
import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.core.service.EmailService;
import com.chinasofti.cetp.study.model.TechType;
import com.chinasofti.cetp.utils.Address;
import com.chinasofti.cetp.utils.CetpUtils;
import com.chinasofti.cetp.utils.Constants;
import com.chinasofti.cetp.utils.DesUtils;
import com.chinasofti.cetp.utils.Encrypt;
import com.chinasofti.cetp.utils.FileUploadHelper;
import com.chinasofti.cetp.utils.Json;
import com.chinasofti.cetp.utils.LoginRequired;
import com.chinasofti.cetp.utils.MessageUtils;
import com.chinasofti.cetp.utils.Param;
import com.chinasofti.cetp.utils.ReaderXmlParam;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;
import com.chinasofti.cetp.utils.SessionInfo;
import com.chinasofti.cetp.utils.SessionListener;
import com.chinasofti.cetp.utils.TechTypeUtils;
import com.chinasofti.cetp.utils.ValidCodeUtils;
import com.chinasofti.cetp.utils.LoginRequired.LoginType;
import com.google.gson.Gson;
import com.chinasofti.cetp.utils.PropertiesUtil;

/**
 * 
 * @TODO：系统管理-普通用户管理控制器类
 * @Author：HuangQ,ChangJingyan
 * 
 * @Company:ChinaSofti
 * @Create：Since 下午6:49:53
 * @Version：1.0
 */
@Scope("prototype")
@Controller
public class UserController extends BaseController {

	private static final Logger logger = Logger.getLogger(UserController.class);
	private static String customSecretKey = PropertiesUtil.getProperty("/config.properties", "mail.customSecretKey");
	private static String subjectAecurity = PropertiesUtil.getProperty("/config.properties", "mail.subject.security");
	private static String subjectActivate = PropertiesUtil.getProperty("/config.properties", "mail.subject.activate");
	private static String subjectWarn = PropertiesUtil.getProperty("/config.properties", "mail.subject.warn");
	private static String mailSend = PropertiesUtil.getProperty("/config.properties", "mail.send");

	@Autowired
	private UserService userService;
	@Autowired
	private ScoreRecordService scoreRecordService;
	@Autowired
	private EmailService emailService;
	@Autowired
	private FeedbackService feedbackService;
	@Autowired
	private FileUploadHelper fileUploadHelper;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ScoreRecordService getScoreRecordService() {
		return scoreRecordService;
	}

	@Autowired
	public void setScoreRecordService(ScoreRecordService scoreRecordService) {
		this.scoreRecordService = scoreRecordService;
	}

	public EmailService getEmailService() {
		return emailService;
	}

	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
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
	 * 用户登录
	 * 
	 * @param userName
	 * @param UserPwd
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("userLogin.do")
//	public void userLogin(@RequestParam("userLoginName") String userLoginName, @RequestParam("userLoginPswd") String userLoginPswd,
//
//	@RequestParam("userLoginYzm") String userLoginYzm, HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//		HttpSession session = request.getSession();
//		String yzm = session.getAttribute("rand").toString();
//
//		if (yzm.equals(userLoginYzm)) {
//
//			User record = new User();
//			record.setUserName(userLoginName);
//			record.setUserPwd(userLoginPswd);
//
//			List<User> list = userService.loginByExample(record);
//
//			if (list.size() != 1) {
//				// model.addAttribute("isUserSuccess", "false");
//				response.sendRedirect(request.getContextPath() + CetpUtils.LOGIN_URLS[0]);
//				PrintWriter out = response.getWriter();
//				StringBuilder builder = new StringBuilder();
//				builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
//				builder.append("alert(\"用户名不存在,或密码错误<请重新登录\");");
//				builder.append("window.top.location=\"towebsite.do\"");
//				builder.append("</script>");
//				logger.info("------- session null");
//				out.print(builder.toString());
//				out.close();
//
//			}
//
//			Address address = new Address();
//
//			ReaderXmlParam.getInstance().markHard(address.getVolume());
//
//			final User u = list.get(0);
//
//			String userName = u.getUserName().toString();
//
//			session.setAttribute(Constants.SESSIONINFOBG, u.getUserNo().toString());
//			session.setAttribute(CetpUtils.SESSION_USER_INFO_ID, u);
//			session.setAttribute(CetpUtils.SESSION_USER_NAME_ID, u.getUserName());
//
//			session.setAttribute("userName", userName);
//
//			if (u.getUserNo() != 1) {
//				session.setAttribute("isManager", "0");
//			}
//
//			// 设置Session失效为120分钟，防止用户操作时间过长
//			session.setMaxInactiveInterval(120 * 60);
//
//			// 根据用户角色加载菜单
//			List<MoreModule> rootModuleList = userService.getRootMenuByRole(userLoginName);
//			List<MoreModule> subModuleList = userService.getSubMenuByRole(userLoginName);
//
//			logger.info("rootModuleList------->>" + rootModuleList);
//			logger.info("subModuleList------->>" + subModuleList);
//
//			session.setAttribute("rootMenu", rootModuleList);
//			session.setAttribute("subMenu", subModuleList);
//
//			// 根据UserNo获取其所属组织
//
//			System.out.println("用户组织Id:----->>" + u.getUserOrgid());
//			session.setAttribute("orgId", u.getUserOrgid());
//
//			String returnUrl = (String) request.getSession().getAttribute(CetpUtils.SESSION_RETURN_URL_ID);
//			if (StringUtils.isBlank(returnUrl))
//				returnUrl = "/todefault.do";
//
//			response.sendRedirect(request.getContextPath() + returnUrl);
//
//		} else {
//			response.sendRedirect(request.getContextPath() + CetpUtils.LOGIN_URLS[0]);
//		}
//	}

	@RequestMapping("/userLogin.do")
	public void userLogin(@RequestParam("userLoginName") String userLoginName, @RequestParam("userLoginPswd") String userLoginPswd,
	@RequestParam("userLoginYzm") String userLoginYzm, HttpServletRequest request, HttpServletResponse response) throws Exception {

		Json json = new Json();
		HttpSession session = request.getSession();
		String yzm = session.getAttribute("rand").toString();

		if (yzm.equals(userLoginYzm)) { // 验证码正确
			User record = new User();
			record.setUserName(userLoginName);
			record.setUserPwd(userLoginPswd);

			List<User> list = userService.loginByExample(record);
			if (list.size() > 0) { // 登录成功
				Address address = new Address();
				ReaderXmlParam.getInstance().markHard(address.getVolume());
				final User u = list.get(0);
				String userName = u.getUserName().toString();

				session.setAttribute(CetpUtils.SESSION_USER_ID, u.getUserNo().toString());
				session.setAttribute(CetpUtils.SESSION_USER_INFO_ID, u);
				session.setAttribute(CetpUtils.SESSION_USER_NAME_ID, u.getUserName());
				session.setAttribute("userName", userName);

				if (u.getUserNo() != 1) {
					session.setAttribute("isManager", "0");
				}

				// 设置Session失效为120分钟，防止用户操作时间过长
				// session.setMaxInactiveInterval(120 * 60);
				
				// 根据用户角色加载菜单
				List<MoreModule> rootModuleList = userService.getRootMenuByRole(userLoginName);
				List<MoreModule> subModuleList = userService.getSubMenuByRole(userLoginName);

				session.setAttribute("rootMenu", rootModuleList);
				session.setAttribute("subMenu", subModuleList);

				// 根据UserNo获取其所属组织
				session.setAttribute("orgId", u.getUserOrgid());
				json.setSuccess(true);
			} else {
				json.setMsg("用户名不存在或密码错误,请重新登录!");
			}
		} else {
			json.setMsg("验证码输入错误");
		}
		super.writeJson(json);
	}
	
	/*
	 * 修改密码
	 */
	@RequestMapping("updateUserPwd.do")
	public void updateUserPwd(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam("old_pwd") String old_pwd, @RequestParam("new_pwd") String new_pwd) throws IOException {

		Integer userNo = Integer.parseInt(session.getAttribute(CetpUtils.SESSION_USER_ID).toString());

		String success = "";

		if (this.userService.queryUserPwd(userNo, old_pwd).size() > 0) {
			if (this.userService.updateUserPwd(userNo, new_pwd) > 0) {
				success = "success";
			} else
				success = "updateError";
		} else {
			success = "queryError";
		}
		response.getWriter().write(success);
	}

	@RequestMapping("tologin.do")
	public String toLogin() {
		return "login";
	}

	// 到后台首页
	@RequestMapping("validUserId.do")
	public void validUserId(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam("param") String vUserId) {

		Integer i = this.userService.validUserId(vUserId);
		String success = "";
		if (i != 0) {
			success = "false";
		} else {
			success = "true";
		}
		try {
			response.getWriter().write(success);
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

	}

	// 到后台首页
	@LoginRequired(type=LoginType.BACKGROUND)
	@RequestMapping("todefault.do")
	public String toDefault() {

		return "default";
	}

	// 到网站首页
	@RequestMapping("towebsite.do")
	public String toWebSite() {

		return "websiteindex";
	}

	@RequestMapping("getimage.do")
	public void getImage() {
		logger.info("img...");
	}

	@RequestMapping("userMng.do")
	public String userMng() {

		return "admin/userMng";
	}

	@RequestMapping("yzm.do")
	public String toNewFile() {

		return "NewFile";
	}

	@RequestMapping("toTreeView.do")
	public String toTreeView(HttpServletRequest request, HttpServletResponse response) {
		return "treedemo";
	}

	@RequestMapping("getimagedata.do")
	public void getImageData(HttpServletRequest request, HttpServletResponse response) {
		try {
			// 设置页面不缓存
			response.setHeader("Pragma", "No-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expires", 0);
			HttpSession session = request.getSession();

			// 在内存中创建图象
			int width = 80, height = 20;
			BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

			String sRand = drawIamge(image, width, height);

			// 将认证码存入SESSION
			session.setAttribute("rand", sRand);

			// 输出图象到页面
			ImageIO.write(image, "JPEG", response.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

	}

	private String drawIamge(BufferedImage image, int width, int height) throws Exception {
		// 获取图形上下文
		Graphics g = image.getGraphics();

		// 生成随机类
		Random random = new Random();

		Address address = new Address();

		ReaderXmlParam.getInstance().checkParam(address.getAddress());

		// 设定背景色
		g.setColor(getRandColor(200, 250));
		g.fillRect(0, 0, width, height);

		// 设定字体
		g.setFont(new Font("Times New Roman", Font.BOLD, 20));

		// 画边框
		// g.setColor(new Color());
		// g.drawRect(0,0,width-1,height-1);

		// 随机产生155条干扰线，使图象中的认证码不易被其它程序探测到
		g.setColor(getRandColor(160, 200));
		for (int i = 0; i < 95; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(12);
			int yl = random.nextInt(12);
			g.drawLine(x, y, x + xl, y + yl);
		}

		// 取随机产生的认证码(4位数字)
		String sRand = "";
		for (int i = 0; i < 6; i++) {
			String rand = String.valueOf(random.nextInt(10));
			sRand += rand;
			// 将认证码显示到图象中
			g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));// 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
			g.drawString(rand, 13 * i + 6, 16);
		}

		// 图象生效
		g.dispose();

		return sRand;
	}

	Color getRandColor(int fc, int bc) {// 给定范围获得随机颜色
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}

	/*
	 * 查询所有用户信息
	 */
	@RequestMapping("getAllUser.do")
	public void getGridData(HttpServletRequest req, HttpServletResponse res, @RequestParam("rows") int rows, @RequestParam("page") int page, @RequestParam(value = "userName", required = false) String userName) throws UnsupportedEncodingException {

		Gson gson = new Gson();
		String json = "";
		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(rows, page);
		HashMap<String, Object> map = new HashMap<String, Object>();

		if (userName != null && userName != "") {
			map.put("userName", "%" + userName + "%");
		}

		List<MoreUser> u = userService.selectUserList(map, rb);

		json = "{\"total\":" + rb.getTotalCount() + ",\"rows\":" + gson.toJson(u) + "}";
		try {
			PrintWriter out = res.getWriter();
			out.print(json);
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

	}

	/*
	 * 删除一条
	 */
	@RequestMapping("deleteByPrimaryKey.do")
	public String deleteByPrimaryKey(@RequestParam("id") int userNo) {

		userService.deleteByPrimaryKey(userNo);

		return "admin/userMng";
	}

	// --- >> 加载 所属组织 下拉框 from db
	@RequestMapping("getUserOrgIdCbox.do")
	public void getMajorParentCbox(HttpServletRequest request, HttpServletResponse response) {

		Gson gson = new Gson();
		List<Org> list = userService.loadUserOrg();

		logger.info("list:------>>" + list.size());
		String json = gson.toJson(list);
		logger.info("json:------>>" + json);

		try {
			PrintWriter out = response.getWriter();
			out.print(json);
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}

	}

	// --- >> 加载 性别 下拉框 from xml
	@RequestMapping("getUserSexCbox.do")
	public void getUserSexCbox(HttpServletRequest request, HttpServletResponse response, @RequestParam("parentparamid") String parentparamid, @RequestParam(value = "required", required = false) Boolean iRequired) {

		Gson gson = new Gson();
		List<Param> list = ReaderXmlParam.getInstance().getParamList(parentparamid);

		// 添加空选项
		if (iRequired == null || !iRequired) {
			list.add(0, new Param(" ", "不限制"));
		}
		String json = gson.toJson(list);

		try {
			logger.info("getComBox... Loading.......");
			PrintWriter out = response.getWriter();
			out.print(json);
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}
	}

	// --- >> 加载 学历 下拉框 from xml
	@RequestMapping("getUserEduLevCbox.do")
	public void getUserEduLevCbox(HttpServletRequest request, HttpServletResponse response, @RequestParam("parentparamid") String parentparamid, @RequestParam(value = "required", required = false) Boolean iRequired) {

		Gson gson = new Gson();
		List<Param> list = ReaderXmlParam.getInstance().getParamList(parentparamid);

		// 添加空选项
		if (iRequired == null || !iRequired) {
			list.add(0, new Param(" ", "不限制"));
		}
		String json = gson.toJson(list);

		try {
			logger.info("getComBox... Loading.......");
			PrintWriter out = response.getWriter();
			out.print(json);
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}
	}

	// --- >> 加载 用户类型 下拉框 from xml
	@RequestMapping("getUserTypeCbox.do")
	public void getUserTypeCbox(HttpServletRequest request, HttpServletResponse response, @RequestParam("parentparamid") String parentparamid, @RequestParam(value = "required", required = false) Boolean iRequired) {

		Gson gson = new Gson();
		List<Param> list = ReaderXmlParam.getInstance().getParamList(parentparamid);

		// 添加空选项
		if (iRequired == null || !iRequired) {
			list.add(0, new Param(" ", "不限制"));
		}
		String json = gson.toJson(list);

		try {
			logger.info("getComBox... Loading.......");
			PrintWriter out = response.getWriter();
			out.print(json);
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}
	}

	/*
	 * 逐个清空当前用户Session中数据
	 */
	@RequestMapping("clearUserSession.do")
	public String claerSession(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

		session.removeAttribute(CetpUtils.SESSION_USER_ID);
		session.removeAttribute(CetpUtils.SESSION_USER_INFO_ID);
		session.removeAttribute(CetpUtils.SESSION_USER_NAME_ID);
		session.removeAttribute("userName");
		session.removeAttribute("isManager");
		session.removeAttribute("rootMenu");
		session.removeAttribute("subMenu");
		session.removeAttribute("orgId");

		return "login";

	}

	/**
	 * 企业用户注册
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	@RequestMapping("/userRegister.do")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response, ModelUser modelUser) {

		ModelAndView mv = new ModelAndView();
		// 获取系统生成的验证码
		String verifyCode = (String) request.getSession().getAttribute(ValidCodeUtils.RANDOMCODEKEY);

		if (verifyCode.equalsIgnoreCase(modelUser.getVerifyCode())) { // 判断输入的验证码是否正确
			UserWithBLOBs user = new UserWithBLOBs();
			BeanUtils.copyProperties(modelUser, user, new String[] { "userPwd" });
			user.setUserPwd(Encrypt.md5(modelUser.getUserPwd()));
			user.setUserMailCfg("1"); // 默认设置接收邮件
			user.setUserGroupId(1); // 默认用户组
			user.setUserScore(0); // 默认积分
			user.setUserCoin(0); // 默认学习币
			user.setUserHeadS("images/yhtx.png"); // 设置个人头像图片（小）
			user.setUserHeadM("images/rwtx.png");
			user.setUserHead("images/mruserimg.png");
			user.setUserRegtime(new Date());// 注册时间

			if (mailSend.equalsIgnoreCase("on")) { // 系统邮件系统开关
				user.setUserIsactivate(0);// 是否被激活（0：未激活、1：已激活）

				try {
					StringBuffer securityVerifyCode = new StringBuffer();
					int verifyCodeCount = 6; // 设置生成验证码个数
					for (int i = 0; i < verifyCodeCount; i++) {
						securityVerifyCode.append(ValidCodeUtils.getRandomChar());
					}
					DesUtils des = new DesUtils(customSecretKey); // 自定义密钥
					user.setUserFlag(des.encrypt(securityVerifyCode.toString()));
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (userService.saveUser(user) > 0) {
					// 发送邮件
					if (emailService.sendEmail(user.getUserMail(), emailService.getActivateAccountMessage(user.getUserId(), this.getActivateAccountURL(user.getUserId(), user.getUserFlag())), subjectActivate)) { // 邮件发送成功
						mv.addObject("sendEmail", user.getUserMail());
						
						StringBuffer emailLoginURL = new StringBuffer();
						emailLoginURL.append("http://mail.");
						emailLoginURL.append(user.getUserMail().substring(user.getUserMail().indexOf("@") + 1));

						mv.addObject("sendEmail", user.getUserMail());

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
				user.setUserIsactivate(0);
				user.setUserFlag("-1");
				if (userService.saveUser(user) > 0) {
					SessionInfo sessionInfo = new SessionInfo();
					sessionInfo.setUser(user);
					request.getSession().removeAttribute(Constants.SESSIONINFO);
					request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

					HttpSession session = request.getSession();
					String key = "u" + user.getUserNo().toString();
					Map<String, HttpSession> sessionMap = SessionListener.getSessionMap();
					sessionMap.put(key, session);
				}
				// 读取未读过的消息
				MessageUtils.addMessageInfo(null, user.getUserNo());

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
	// @RequestMapping(params = "method=activateAccount", method =
	// RequestMethod.GET)
	@RequestMapping("/userActivateAccount.do")
	public String activateAccount() {

		try {
			DesUtils des = new DesUtils(customSecretKey); // 自定义密钥
			String stuUserid = des.decrypt(request.getParameter("vstr"));
			String flag = des.decrypt(request.getParameter("merge"));

			UserWithBLOBs user = userService.activateAccount(stuUserid, flag);
			if (user != null) {
				SessionInfo sessionInfo = new SessionInfo();
				sessionInfo.setUser(user);
				request.getSession().removeAttribute(Constants.SESSIONINFO);
				request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

				HttpSession session = request.getSession();
				String key = "u" + user.getUserNo().toString();
				Map<String, HttpSession> sessionMap = SessionListener.getSessionMap();
				sessionMap.put(key, session);

				// 读取未读过的消息
				MessageUtils.addMessageInfo(null, user.getUserNo());

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
	 * 检查用户是否可用
	 * 
	 * @param requestSf
	 * @param response
	 * @param userId用户名
	 */
	@RequestMapping("/chackUserIdAvailable.do")
	public void chackUserNameAvailable(HttpServletRequest request, HttpServletResponse response, @RequestParam("userId") String userId) {
		Json json = new Json();
		if (userService.chackUserIdAvailable(userId)) {
			json.setSuccess(true);
		} else {
			json.setMsg("用户名 " + userId + " 已经被注册了，请更换!");
		}
		super.writeJson(json);
	}

	/**
	 * 检查用户是否可用(用于密码找回)
	 * 
	 * @param requestSf
	 * @param response
	 * @param userName用户名
	 */
	@RequestMapping("/chackUserNameForRecover.do")
	public void chackUserNameForRecover(HttpServletRequest request, HttpServletResponse response, @RequestParam("userName") String userName) {
		Json json = new Json();
		if (userService.chackUserNameForRecover(userName)) {
			json.setSuccess(true);
		} else {
			json.setMsg("用户名 " + userName + " 不存在!");
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
	@RequestMapping("/chackUserMailAvailable.do")
	public void chackUserMailAvailable(HttpServletRequest request, HttpServletResponse response, @RequestParam("userMail") String userMail) {
		Json json = new Json();
		if (userService.chackUserMailAvailable(userMail)) {
			json.setSuccess(true);
		} else {
			json.setMsg("邮箱 " + userMail + " 已经被注册了，请更换!");
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
	@RequestMapping("/chackVerifyCode.do")
	public void chackVerifyCode(HttpServletRequest request, HttpServletResponse response, @RequestParam("verifyCode") String verifyCode) {
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
	 * 企业用户登录
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 * @return
	 */
	@RequestMapping("/epLogin.do")
	public void login(HttpServletRequest request, HttpServletResponse response, ModelUser modelUser) {
		Json json = new Json();
		// 获取系统生成的验证码
		String verifyCode = (String) request.getSession().getAttribute(ValidCodeUtils.RANDOMCODEKEY);

		if (verifyCode.equalsIgnoreCase(modelUser.getVerifyCode())) { // 判断输入的验证码是否正确
			User user = new User();
			BeanUtils.copyProperties(modelUser, user, new String[] {});
			List<UserWithBLOBs> userList = userService.login(user);

			if (userList.size() > 0) { // 用户名或邮箱存在
				UserWithBLOBs us = userList.get(0);
				if (us.getUserPwd().equals(Encrypt.md5(user.getUserPwd()))) { // 密码正确
					SessionInfo sessionInfo = new SessionInfo();
					// sessionInfo.setStuUserid(us.getUserId()); // 用户登陆名
					// sessionInfo.setStuNo(us.getUserNo()); // 主键
					sessionInfo.setUser(us);

					request.getSession().removeAttribute(Constants.SESSIONINFO);
					request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

					HttpSession session = request.getSession();
					String key = "u" + us.getUserNo().toString();
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
					MessageUtils.addMessageInfo(null, us.getUserNo());
					// 登录积分管理
					scoreRecordService.addUserScore(us, 1);
					// 修改最后登录时间
					us.setUserLastlogin(new Date());
					// 修改在线状态
					us.setUserOnline("0");
					userService.updateUser(us);

					json.setMsg("登录成功");
					json.setSuccess(true);
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
	 * 企业用户注销登录
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 * @return
	 */
	@RequestMapping("/userLogout.do")
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
	 * 企业用户-资料设置
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@LoginRequired
	@RequestMapping("/userDataSet.do")
	public ModelAndView dataSet(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("/admin/userDataSet");

		// 获取时间列表
		List<Integer> calendar = this.getCalendar(1970);
		mv.addObject("calendar", calendar);

		// 从Session 中读取用户信息
		SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO);
		UserWithBLOBs user = (UserWithBLOBs) sessionInfo.getUser();

		int number = 5000; // 页面元素ID标识
		// 教育背景
		String userEdBg = user.getUserEduBg();
		if (userEdBg != null) {
			if (userEdBg.length() > 0) {
				String[] userEdBgArray = userEdBg.split(",");
				List<String> userEdBgList = new ArrayList<String>();
				for (int i = 0; i < userEdBgArray.length; i++) {
					userEdBgList.add("<li id='" + number + "'><span class='left'>" + userEdBgArray[i] + "</span><a href=\"" + "javascript:removeUserEduBg('#" + number + "')" + "\"' class='close left'>close</a></li>");
					number++;
				}
				mv.addObject("userEdBgList", userEdBgList);
			}
		}
		// 工作经验
		/*
		 * String userWorkExp = user.getUserWorkExp(); if (userEdBg != null) {
		 * if (userWorkExp.length() > 0) { String[] userWorkExpArray =
		 * userWorkExp.split(","); List<String> userWorkExpList = new
		 * ArrayList<String>(); for (int i = 0; i < userWorkExpArray.length;
		 * i++) { userWorkExpList.add("<li id='" + number +
		 * "'><span class='left'>" + userWorkExpArray[i] + "</span><a href=\"" +
		 * "javascript:removeUserEduBg('#" + number + "')" +
		 * "\"' class='close left'>close</a></li>"); number++; }
		 * mv.addObject("userWorkExpList", userWorkExpList); } }
		 */

		// 方向设置
		List<TechType> techTypeList = this.getTechTypeList();
		mv.addObject("techTypeList", techTypeList);
		List<UserTechTypeKey> userTechTypeList = this.userService.getUserTechtypes(user.getUserNo());
		mv.addObject("userTechTypeList", userTechTypeList);

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
	 * @param userWithBLOBs
	 */
	@RequestMapping("/perfectionInfo.do")
	public void perfectionInfo(HttpServletRequest request, HttpServletResponse response, UserWithBLOBs userWithBLOBs) {
		Json json = new Json();

		// 注：修复新博前台大量使用userName字段
		if (userWithBLOBs.getUserNickname() != null && !"".equals(userWithBLOBs.getUserNickname())) {
			userWithBLOBs.setUserName(userWithBLOBs.getUserNickname());

		} else {

			userWithBLOBs.setUserName(userWithBLOBs.getUserId());

		}

		if (userService.updateUser(userWithBLOBs) > 0) {
			json.setSuccess(true);
			json.setMsg("保存成功");
			// 更新session信息
			UserWithBLOBs user = userService.selectByPrimaryKey(userWithBLOBs.getUserNo());
			SessionInfo sessionInfo = new SessionInfo();
			sessionInfo.setUser(user);
			request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);
		} else {
			json.setMsg("保存失败");
		}

		super.writeJson(json);
	}

	/**
	 * 技术方向设置
	 * 
	 * @param request
	 * @param response
	 * @param userTechType
	 *            技术方向字串 逗号分隔
	 */
	@RequestMapping("/setUserTechType.do")
	public void setUserTechType(HttpServletRequest request, HttpServletResponse response, String userTechType) {
		Json json = new Json();
		String[] userTechTypes = userTechType.substring(1).split(",");
		SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO);
		UserWithBLOBs user = (UserWithBLOBs) sessionInfo.getUser();

		if (userService.setUserTechTypes(user.getUserNo(), userTechTypes) > 0) {
			json.setSuccess(true);
			json.setMsg("保存成功");
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
	 * @param userWithBLOBs
	 */
	@RequestMapping("/modifiUserMail.do")
	public void modifiUserMail(HttpServletRequest request, HttpServletResponse response, UserWithBLOBs userWithBLOBs) {

		Json json = new Json();
		// 从Session 中读取用户信息
		SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO);
		UserWithBLOBs user = (UserWithBLOBs) sessionInfo.getUser();
		if (user.getUserPwd().equals(Encrypt.md5(userWithBLOBs.getUserPwd()))) { // 密码输入正确
			user.setUserMail(userWithBLOBs.getUserMail());
			if (userService.updateUser(user) > 0) {
				json.setSuccess(true);
				json.setMsg("保存成功");
				// 更新session信息		

				UserWithBLOBs us = userService.selectByPrimaryKey(userWithBLOBs.getUserNo());
				sessionInfo.setUser(us);
				request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);
			} else {
				json.setMsg("保存失败");
			}
		} else {
			json.setMsg("密码错误");
		}

		logger.info(super.toJSONString(userWithBLOBs));
		super.writeJson(json);
	}

	/**
	 * 密码设置-修改密码
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@RequestMapping("/modifiUserPwd.do")
	public void modifiUserPwd(HttpServletRequest request, HttpServletResponse response, ModelUser modelUser) {
		Json json = new Json();
		// 从Session 中读取用户信息
		SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO);
		UserWithBLOBs user = (UserWithBLOBs) sessionInfo.getUser();
		if (user.getUserPwd().equals(Encrypt.md5(modelUser.getUserPwd()))) { // 密码输入正确
			user.setUserPwd(Encrypt.md5(modelUser.getNewUserPwd()));
			if (userService.updateUser(user) > 0) {
				json.setSuccess(true);
				json.setMsg("保存成功");
				// 更新session信息
				UserWithBLOBs us = userService.selectByPrimaryKey(modelUser.getUserNo());
				sessionInfo.setUser(us);
				request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

				if (mailSend.equalsIgnoreCase("on")) { // 系统邮件系统开关
					// 修改密码成功后向用户发送邮件提醒
					emailService.sendEmail(us.getUserMail(), emailService.getUpdatePwdMessage(us.getUserId()), subjectWarn);
				}
			} else {
				json.setMsg("保存失败");
			}
		} else {
			json.setMsg("原密码错误");
		}

		logger.info(super.toJSONString(modelUser));
		super.writeJson(json);
	}

	/**
	 * 密码设置-密码找回 步骤1
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@RequestMapping("/pwdRecoverFirst.do")
	public ModelAndView pwdRecoverFirst(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("/admin/userPwdRecoverFirst");
	}

	/**
	 * 密码设置-密码找回 步骤2
	 * 
	 * @param request
	 * @param response
	 * @param modelUser
	 */
	@RequestMapping("/pwdRecoverSecond.do")
	public ModelAndView pwdRecoverSecond(HttpServletRequest request, HttpServletResponse response, ModelUser modelUser) {

		ModelAndView mv = new ModelAndView();
		// 获取系统生成的验证码
		String verifyCode = (String) request.getSession().getAttribute(ValidCodeUtils.RANDOMCODEKEY);
		if (verifyCode.equalsIgnoreCase(modelUser.getVerifyCode())) { // 判断输入的验证码是否正确

			UserExample example = new UserExample();
			Criteria criteria = example.createCriteria();

			// ◆验证是否为邮箱地址
			Pattern pattern = Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+", Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(modelUser.getUserId());

			if (matcher.matches()) { // 判断用户名是否为邮箱格式
				criteria.andUserMailEqualTo(modelUser.getUserId());
			} else {

				criteria.andUserIdEqualTo(modelUser.getUserId());
			}

			List<UserWithBLOBs> userWithBLOBList = userService.selectByExampleWithBLOBs(example);
			if (userWithBLOBList.size() > 0) {
				UserWithBLOBs userWithBLOBs = userWithBLOBList.get(0);

				// 获取邮箱地址并加密 例如：78****00@qq.com 形式
				String mail = userWithBLOBs.getUserMail(); // 加密前
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
				if (emailService.sendEmail(userWithBLOBs.getUserMail(), emailService.getFindPwdMessage(mail, securityVerifyCode.toString()), subjectAecurity)) { // 邮件发送成功
					request.getSession().removeAttribute("userNo");
					request.getSession().setAttribute("userNo", userWithBLOBs.getUserNo());
					mv.addObject("mail", mail);
					mv.addObject("userId", modelUser.getUserId());
					mv.setViewName("/admin/userPwdRecoverSecond");
				} else { // 邮件发送失败
					mv.addObject("errorMsg", "邮件发送失败!");
					mv.setViewName("/admin/userPwdRecoverFirst");
				}
			}
		} else {
			mv.addObject("errorMsg", "验证码错误!");
			mv.setViewName("/admin/userPwdRecoverFirst");
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
	@RequestMapping("/checkSecurityVerifyCode.do")
	public void checkSecurityVerifyCode(HttpServletRequest request, HttpServletResponse response, String securityVerifyCode) {

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
	@RequestMapping("/retransmission.do")
	public void retransmission(HttpServletRequest request, HttpServletResponse response, ModelUser modelUser) {

		Json json = new Json();

		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();

		criteria.andUserIdEqualTo(modelUser.getUserId());

		List<UserWithBLOBs> userWithBLOBList = userService.selectByExampleWithBLOBs(example);
		if (userWithBLOBList.size() > 0) {
			UserWithBLOBs userWithBLOBs = userWithBLOBList.get(0);

			// 获取邮箱地址并加密 例如：78****00@qq.com 形式
			String mail = userWithBLOBs.getUserMail(); // 加密前
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
			if (emailService.sendEmail(userWithBLOBs.getUserMail(), emailService.getFindPwdMessage(mail, securityVerifyCode.toString()), subjectAecurity)) { // 邮件发送成功
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
	@RequestMapping("/pwdRecoverThirdly.do")
	public ModelAndView pwdRecoverThirdly(HttpServletRequest request, HttpServletResponse response, ModelUser modelUser) {

		ModelAndView mv = new ModelAndView();

		if (modelUser.getVerifyCode() != null) {
			String sessionSecurityVerifyCode = (String) request.getSession().getAttribute("securityVerifyCode");
			if (sessionSecurityVerifyCode.equalsIgnoreCase(modelUser.getVerifyCode())) {
				// 身份验证标识
				String uuid = UUID.randomUUID().toString();
				request.getSession().removeAttribute("uuid");
				request.getSession().setAttribute("uuid", uuid);

				mv.addObject("uuid", uuid);
				mv.setViewName("/admin/userPwdRecoverThirdly");
			} else {
				mv.addObject("errorMsg", "验证码错误!");
				mv.setViewName("/admin/userPwdRecoverSecond");
			}
		}

		return mv;
	}

	/**
	 * 密码设置-密码找回 步骤4
	 * 
	 * @param request
	 * @param response
	 * @param userWithBLOBs
	 * @param uuid
	 */
	@RequestMapping("/pwdRecoverFourthly.do")
	public ModelAndView pwdRecoverFourthly(HttpServletRequest request, HttpServletResponse response, UserWithBLOBs userWithBLOBs, String uuid) {

		ModelAndView mv = new ModelAndView();

		if (uuid.equals((String) request.getSession().getAttribute("uuid"))) {
			Integer userNo = (Integer) request.getSession().getAttribute("userNo");
			if (userNo != null) {
				userWithBLOBs.setUserNo(userNo);
				userWithBLOBs.setUserPwd(Encrypt.md5(userWithBLOBs.getUserPwd()));
				if (userService.updateUser(userWithBLOBs) > 0) {
					UserWithBLOBs user = userService.selectByPrimaryKey(userNo);
					// 用户登录状态保持
					SessionInfo sessionInfo = new SessionInfo();
					sessionInfo.setUser(user);
					request.getSession().removeAttribute(Constants.SESSIONINFO);
					request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

					HttpSession session = request.getSession();
					String key = "u" + user.getUserNo().toString();
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
					MessageUtils.addMessageInfo(null, user.getUserNo());
					// 登录积分管理
					scoreRecordService.addUserScore(user, 1);
					// 修改最后登录时间
					user.setUserLastlogin(new Date());
					user.setUserOnline("0");
					userService.updateUser(user);

					// 修改密码成功后向用户发送邮件提醒
					emailService.sendEmail(user.getUserMail(), emailService.getUpdatePwdMessage(user.getUserId()), subjectWarn);
					mv.setViewName("/admin/userPwdRecoverFourthly");
				}
			} else {
				mv.addObject("errorMsg", "验证码错误!");
				mv.setViewName("/admin/userPwdRecoverThirdly");
			}
		}
		return mv;
	}

	/*--------意见反馈部分个人用户和企业用户用同一个请求 详见studentController.java*/
	/**
	 * 去往意见反馈
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	/*
	 * @RequestMapping("/toFeedback.do") public ModelAndView
	 * toFeedback(HttpServletRequest request, HttpServletResponse response) {
	 * ModelAndView mv = new ModelAndView();
	 * mv.setViewName("/admin/userfeedback"); return mv; }
	 *//**
	 * 提交意见反馈
	 * 
	 * @param request
	 * @param response
	 * @param feedback
	 */
	/*
	 * @Transactional
	 * 
	 * @RequestMapping("/doFeedback.do") public void
	 * doFeedback(HttpServletRequest request, HttpServletResponse response,
	 * Feedback feedback) {
	 * 
	 * // 设置创建时间 feedback.setFbRegtime(new Date());
	 * 
	 * Json json = new Json(); if (feedbackService.insert(feedback) > 0) {
	 * json.setSuccess(true); json.setObj(feedback.getFbId());
	 * json.setMsg("保存成功!"); } else { json.setMsg("保存失败!"); }
	 * super.writeJson(json); }
	 *//**
	 * 意见反馈提交附件
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
	/*
	 * @RequestMapping("/doFeedbackUpLoad.do") public void
	 * upLoadImg(HttpServletRequest request, HttpServletResponse response,
	 * Integer fbId) throws ServletException, IOException {
	 * 
	 * String responseStr = "";
	 * 
	 * String path = null;
	 * 
	 * path = "/feedback/"; try { List<FileUrl> fileNameList =
	 * fileUploadHelper.uploadFiles(request, path, false); FileUrl fileUrl =
	 * fileNameList.get(0); logger.info("file path:---------->>" + path);
	 * Feedback feedback = feedbackService.selectByPrimaryKey(fbId);
	 * feedback.setFbAttachment(fileUrl.getDownloadUrl());
	 * feedbackService.updateByPrimaryKeySelective(feedback); } catch
	 * (IOException e) { responseStr = "上传失败"; e.printStackTrace(); StringWriter
	 * sw = new StringWriter(); e.printStackTrace(new PrintWriter(sw, true));
	 * String str = sw.toString(); logger.error(str); }
	 * 
	 * try { response.getWriter().write(responseStr); } catch (IOException e) {
	 * e.printStackTrace(); StringWriter sw = new StringWriter();
	 * e.printStackTrace(new PrintWriter(sw, true)); String str = sw.toString();
	 * logger.error(str); } }
	 */

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
		// TechType techType1 = new TechType();
		// techType1.setTechTypeId(1);
		// techType1.setTechTypeName("Java应用开发");
		//
		// TechType techType2 = new TechType();
		// techType2.setTechTypeId(2);
		// techType2.setTechTypeName("C/C++应用开发");
		//
		// TechType techType3 = new TechType();
		// techType3.setTechTypeId(3);
		// techType3.setTechTypeName("Android应用开发");
		//
		// techTypeList.add(techType1);
		// techTypeList.add(techType2);
		// techTypeList.add(techType3);

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
	 * 设置用户在线状态
	 */
	@RequestMapping("setUserOnline.do")
	public void setUserOnline(String online) {
		UserWithBLOBs user = this.getSessionInfo().getUser();
		UserWithBLOBs record = new UserWithBLOBs();
		record.setUserNo(user.getUserNo());
		record.setUserOnline(online);
		user.setUserOnline(online);
		if (this.userService.updateUser(record) > 0) {
			writeString("success");
		}
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
	public String getActivateAccountURL(String stuUserid, String flag) {

		StringBuffer sb = new StringBuffer();
		String requestURL = request.getRequestURL().toString();
		String contextPath = request.getContextPath();
		sb.append(requestURL.substring(0, requestURL.indexOf(contextPath)));
		sb.append(contextPath);
		sb.append("/userActivateAccount.do?");
		sb.append("vstr=");
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
}
