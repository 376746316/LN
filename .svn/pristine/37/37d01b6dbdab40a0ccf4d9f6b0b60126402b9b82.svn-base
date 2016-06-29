package com.chinasofti.cetp.admin.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.chinasofti.cetp.admin.model.Class;
import com.chinasofti.cetp.admin.model.Major;
import com.chinasofti.cetp.admin.model.Org;
import com.chinasofti.cetp.admin.model.Student;
import com.chinasofti.cetp.admin.model.StudentWithBLOBs;
import com.chinasofti.cetp.admin.model.UserWithBLOBs;
import com.chinasofti.cetp.admin.pageModel.ModelXmlStudent;
import com.chinasofti.cetp.admin.service.StuService;
import com.chinasofti.cetp.admin.service.UserService;
import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.utils.CetpUtils;
import com.chinasofti.cetp.utils.Constants;
import com.chinasofti.cetp.utils.DocConverter;
import com.chinasofti.cetp.utils.Encrypt;
import com.chinasofti.cetp.utils.FileUploadHelper;
import com.chinasofti.cetp.utils.POIUtils;
import com.chinasofti.cetp.utils.Param;
import com.chinasofti.cetp.utils.ReaderXmlParam;
import com.chinasofti.cetp.utils.SessionInfo;
import com.chinasofti.cetp.utils.ZoomImage;
import com.google.gson.Gson;

/**
 * 
 * @TODO：学生管理控制器类
 * @Author：HuangQ
 * 
 * @Company:ChinaSofti
 * @Create：Since 2013-7-30上午9:25:33
 * @Version：1.0
 */
@Scope("prototype")
@Controller
public class StuController extends BaseController {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	// 注入stuService,服务层
	@Autowired
	private StuService stuService;

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// 请求转发
	@RequestMapping("stuMng.do")
	public String majorMng() {

		return "admin/stuMng";
	}

	@RequestMapping("toWebLogin.do")
	public String toWebLogin() {

		return "website_login/login";
	}

	/**
	 * 前台网站学生登录方法
	 * 
	 * @param stuName
	 * @param stuPwd
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	// @RequestMapping("stuLogin.do")
	// public void stuLogin(@RequestParam("stuLoginName") String stuName,
	// @RequestParam("stuLoginPwd") String stuPwd,
	// HttpServletRequest request, HttpServletResponse response)
	// throws Exception {
	//
	// Address address = new Address();
	//
	// ReaderXmlParam.getInstance().markHard(address.getVolume());
	//
	// HttpSession session = request.getSession();
	// // 设置Session失效为120分钟，防止用户操作时间过长
	// session.setMaxInactiveInterval(120 * 60);
	//
	// Student record = new Student();
	//
	// record.setStuUserid(stuName);
	// record.setStuPwd(stuPwd);
	//
	// List<Student> list = userService.loginByStudentExample(record);
	//
	// Json json = new Json();
	// if (list.size() == 1) {
	//
	// // 登录成功
	// json.setSuccess(true);
	// json.setMsg("登录成功!");
	//
	// final Student stu = list.get(0);
	//
	// Integer stuNo = stu.getStuNo();
	// String stuUserNameId = stu.getStuUserid();
	// String stulName = stu.getStuName();
	//
	// // 学生编号，仅是主键，实训或提交信息，应取此数据
	// session.setAttribute("stuNo", stuNo);
	// session.setAttribute(CetpUtils.SESSION_STUDENT_INFO_ID, stu);
	// // 学生用户信息，用作登录的登录账号。
	// session.setAttribute("stuUserId", stuUserNameId);
	// session.setAttribute("stuName", stulName);
	// // 未选项目的组长
	// Integer TeamLeaderNo = stuService.isTeamLeader(stuNo);
	// session.setAttribute("TeamLeaderNo", TeamLeaderNo);
	//
	// // 已选项目的组长
	// Integer selectedProTeamLeader = stuService
	// .selectedProTeamLeader(stuNo);
	// session.setAttribute("selectedProTeamLeader", selectedProTeamLeader);
	//
	// PracticeTeam pt = stuService.getPtByStuNo(stuNo);
	//
	// // #### 该学生已经参加团队实训
	// if (pt != null) {
	// // 所属实训 组编号
	// session.setAttribute("teamId", pt.getTeamId());
	// // 组长编号
	// session.setAttribute("teamLeaderNo", pt.getTeamLeaderNo());
	// // 所属实训 编号
	// session.setAttribute("pracId", pt.getTeamPracId());
	// // 所属实训案例项目编号
	// session.setAttribute("proId", pt.getTeamProId());
	//
	// session.setAttribute("pracIsTeam", "2");
	//
	// logger.info("teamId--->>" + pt.getTeamId());
	// logger.info("pracId--->>" + pt.getTeamPracId());
	// logger.info("proId--->>" + pt.getTeamProId());
	// logger.info("pracIsTeam--->>"
	// + session.getAttribute("pracIsTeam"));
	// logger.info("teamLeaderNo--->>" + pt.getTeamLeaderNo());
	// } else {
	// // #### 该学生已经参加个人实训
	// PracPersonKey pp = stuService.getProIdByStuNo(stuNo);
	// if (pp != null) {
	// // 所属实训 编号
	// session.setAttribute("pracId", pp.getPpPracId());
	// // 所属实训案例项目编号
	// session.setAttribute("proId", pp.getPpProId());
	//
	// session.setAttribute("pracIsTeam", "1");
	//
	// logger.info("pracId--->>" + pp.getPpPracId());
	// logger.info("proId--->>" + pp.getPpProId());
	// logger.info("pracIsTeam--->>"
	// + session.getAttribute("pracIsTeam"));
	//
	// } else {
	// // #### 该学生没参加实训
	// session.setAttribute("pracIsTeam", "0");
	// logger.info("prac is null");
	// }
	// }
	//
	// } else {
	// json.setMsg("登录失败,用户名或密码错误!");
	// logger.info("---------->>" + "学生登录失败");
	// }
	//
	// Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
	// response.getWriter().write(gson.toJson(json));
	// }

	/*
	 * 修改密码
	 */
	// @RequestMapping("updateStuPwd.do")
	// public void updateStuPwd(HttpServletRequest request,
	// HttpServletResponse response, HttpSession session,
	// @RequestParam("old_pwd") String old_pwd,
	// @RequestParam("new_pwd") String new_pwd) throws IOException {
	//
	// Integer stuNo = (Integer) session.getAttribute("stuNo");
	//
	// String success = "";
	//
	// if (this.stuService.queryStuPwd(stuNo, old_pwd).size() > 0) {
	// if (this.stuService.updateStuPwd(stuNo, new_pwd) > 0) {
	// success = "success";
	// } else
	// success = "updateError";
	// } else {
	// success = "queryError";
	// }
	// response.getWriter().write(success);
	//
	// }

	/*
	 * 逐个清空当前用户Session中数据
	 */
	@RequestMapping("clearAllSession.do")
	public String claerSession(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

		session.removeAttribute("stuNo");
		session.removeAttribute(CetpUtils.SESSION_USER_INFO_ID);
		session.removeAttribute("stuUserId");
		session.removeAttribute("stuName");
		session.removeAttribute("teamId");
		session.removeAttribute("pracId");
		session.removeAttribute("proId");

		return "websiteindex";

	}

	@RequestMapping("redirect.do")
	public String redirect() {

		return "redirect";
	}

	@RequestMapping("loginSuccess.do")
	public String loginSuccess() {

		return "loginSuccess";
	}

	/*
	 * 删除一条
	 */
	@RequestMapping("deleteStu.do")
	public String deleteStu(@RequestParam("stuNo") Integer stuNo) {

		stuService.deleteByPrimaryKey(stuNo);

		return "admin/stuMng";
	}

	// --- >> 加载 所属专业 下拉框 from db
	@RequestMapping("getStuOrgIdCbox.do")
	public void getMajorParentCbox(HttpServletRequest request, HttpServletResponse response) {

		Gson gson = new Gson();
		List<Org> list = stuService.loadStuOrg();

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

	// --- 加载学生所属专业 cbx form db
	@RequestMapping("getStuMajorCbx.do")
	public void getStuMajorCbx(HttpServletRequest request, HttpServletResponse response) {

		Gson gson = new Gson();
		List<Major> list = stuService.loadStuMajor();

		logger.info("Major list:------>>" + list.size());
		String json = gson.toJson(list);
		logger.info("Major json:------>>" + json);

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

	// --- 加载学生所属班级 cbx form db
	@RequestMapping("getStuClassCbx.do")
	public void getStuClassCbx(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "orgId", required = false) Integer orgId) {

		Gson gson = new Gson();
		List<Class> list = stuService.loadStuClass(orgId);

		logger.info("Class list:------>>" + list.size());
		String json = gson.toJson(list);
		logger.info("Class json:------>>" + json);

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

	// ---加载学生性质Cbx form xml
	@RequestMapping("getStuTypeCbx.do")
	public void getStuTypeCbx(HttpServletRequest request, HttpServletResponse response, @RequestParam("parentparamid") String parentparamid, @RequestParam(value = "required", required = false) Boolean iRequired) {

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

	// ---->> 加载 技术方向 from xml
	@RequestMapping("getStuTechDirCbx.do")
	public void getStuTechDirCbx(HttpServletRequest request, HttpServletResponse response, @RequestParam("parentparamid") String parentparamid, @RequestParam(value = "required", required = false) Boolean iRequired) {

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

	public StuService getStuService() {
		return stuService;
	}

	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}

	@Autowired
	private FileUploadHelper fileUploadHelper;

	public FileUploadHelper getFileUploadHelper() {
		return fileUploadHelper;
	}

	public void setFileUploadHelper(FileUploadHelper fileUploadHelper) {
		this.fileUploadHelper = fileUploadHelper;
	}

	/*
	 * 上传excel
	 */

	// @RequestMapping("stumngupload.do")
	// public void uploadDemo(
	// HttpServletRequest request,
	// HttpServletResponse response,
	// @RequestParam(value = "classId", required = false) Integer classId,
	// @RequestParam(value = "orgId", required = false) Integer orgId,
	// @RequestParam(value = "classMajor", required = false) String classMajor)
	// {
	//
	// String responseStr = "";
	//
	// MultipartHttpServletRequest multipartRequest =
	// (MultipartHttpServletRequest) request;
	// Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
	// String ctxPath1 = fileUploadHelper.getSavePath();
	//
	// // 创建文件夹
	// File file = new File(ctxPath1);
	// if (!file.exists()) {
	// file.mkdirs();
	// }
	// String fileName = null;
	// String path = null;
	// for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
	// MultipartFile mf = entity.getValue();
	// fileName = mf.getOriginalFilename();
	//
	// path = ctxPath1 + "/" + fileName;
	//
	// File uploadFile1 = new File(path);
	// try {
	// FileCopyUtils.copy(mf.getBytes(), uploadFile1);
	// logger.info("file path:---------->>" + path);
	// List<Student> list = null;
	//
	// try {
	// list = excleTOVO(path, multipartRequest, response, orgId,
	// classId, classMajor);
	// Student insStu = new Student();
	// try {
	// stuService.insertStuList(list, insStu);
	// responseStr = "成功导入" + list.size() + "个学生";
	// } catch (DuplicateKeyException dke) {
	// responseStr = "第" + insStu.getStuNo()
	// + "行数据出错，用户名重复，请修改Excel重新导入！";
	// dke.printStackTrace();
	// } catch (Exception insE) {
	// responseStr = "第" + insStu.getStuNo()
	// + "行数据出错， 请修改Excel重新导入！";
	// insE.printStackTrace();
	// }
	// } catch (MyException e) {
	// logger.info(e.getMessage());
	// responseStr = e.getMessage();
	// } catch (Exception e) {
	// responseStr = "导入失败";
	// e.printStackTrace();
	// StringWriter sw = new StringWriter();
	// e.printStackTrace(new PrintWriter(sw, true));
	// String str = sw.toString();
	// logger.error(str);
	// }
	//
	// } catch (IOException e) {
	// responseStr = "上传失败";
	// e.printStackTrace();
	// StringWriter sw = new StringWriter();
	// e.printStackTrace(new PrintWriter(sw, true));
	// String str = sw.toString();
	// logger.error(str);
	// } finally {
	// if (file.exists()) {
	// file.delete();
	// }
	// }
	// }
	//
	// try {
	// response.getWriter().write(responseStr);
	// } catch (IOException e) {
	// e.printStackTrace();
	// StringWriter sw = new StringWriter();
	// e.printStackTrace(new PrintWriter(sw, true));
	// String str = sw.toString();
	// logger.error(str);
	// }
	// }

	/*
	 * POI解析Excel
	 */
	@SuppressWarnings("deprecation")
	public List<Student> readXls(String fileName, HttpServletRequest request, HttpServletResponse response, Integer orgId, Integer classId, String classMajor) {
		File file = new File(fileName);
		List<Student> list = new ArrayList<Student>();
		Workbook fis = null;

		// 同时支持Excel2003和2007,引入XSSFWorkbook 和 HSSHWorkbook
		try {
			fis = new XSSFWorkbook(fileName);
		} catch (Exception ex) {
			try {
				fis = new HSSFWorkbook(new FileInputStream(fileName));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				StringWriter sw = new StringWriter();
				e.printStackTrace(new PrintWriter(sw, true));
				String str = sw.toString();
				logger.error(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				StringWriter sw = new StringWriter();
				e.printStackTrace(new PrintWriter(sw, true));
				String str = sw.toString();
				logger.error(str);
			}
		}

		if (fis != null) {
			Sheet sheet = fis.getSheetAt(0);
			if (sheet != null) {
				if (sheet.getFirstRowNum() != sheet.getLastRowNum()) {

					int startRow = 0;
					Row row = null;
					for (int i = startRow + 1; i <= sheet.getLastRowNum(); i++) {
						row = sheet.getRow(i);
						if (row != null) {
							Student student = new Student();

							// 所属组织
							student.setStuOrgid(orgId);
							student.setStuMajor(classMajor);
							logger.info("所属组织:----->>" + orgId);
							// 所属班级
							student.setStuClassId(classId);
							logger.info("班级Id:----->>" + classId);
							student.setStuSex("1");

							// 学号
							student.setStuNum(row.getCell(0).toString());

							// 学生姓名
							student.setStuName(row.getCell(1).toString());

							// 学生登录账号
							student.setStuUserid(row.getCell(0).toString() + "swtp");

							// 密码
							student.setStuPwd(row.getCell(2).toString());

							// 手机
							student.setStuPhone(row.getCell(3).toString());

							// 邮箱
							student.setStuMail(row.getCell(4).toString());

							// QQ
							student.setStuQq(row.getCell(5).toString());

							// 家庭住址
							student.setStuAddress(row.getCell(6).toString());

							// 身份证号
							student.setStuIdcard(row.getCell(7).toString());

							// 家庭联系人
							student.setStuLink(row.getCell(8).toString());

							// 家庭联系方式
							student.setStuLinkTel(row.getCell(9).toString());

							// 备注
							student.setStuMark(row.getCell(10).toString());

							list.add(student);
						}
					}
				}
			}
		}
		return list;
	}

	/**
	 * 解析excel文件到list<Student></> [完美支持97-03-07-10]
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @time: 上午10:15:11 2013-8-1
	 */
	public static List<Student> excleTOVO(String FileName, HttpServletRequest request, HttpServletResponse response, Integer orgId, Integer classId, String classMajor) throws MyException {
		String suffix = FileName.substring(FileName.lastIndexOf(".")); // 文件后辍.
		// List<Map<String, String>> excelSheets = null;
		File file = new File(FileName);
		List<Student> studentList = null;
		if (file.exists()) {
			try {
				Workbook workBook = null;
				InputStream is = new FileInputStream(new File(FileName));
				try {
					if (".xls".equals(suffix)) { // 97-03
						workBook = new HSSFWorkbook(is);
					} else if (".xlsx".equals(suffix)) { // 2007
						workBook = new XSSFWorkbook(is);
					} else {
						throw new Exception("不支持的文件类型");
					}
				} catch (Exception e) {
					throw new MyException("解析文件出错");
				} finally {
					try {
						is.close();
					} catch (Exception e2) {
						e2.printStackTrace();
						StringWriter sw = new StringWriter();
						e2.printStackTrace(new PrintWriter(sw, true));
						String str = sw.toString();
						logger.error(str);
					}
				}
				Sheet sheet = workBook.getSheetAt(0); // 读取第一个sheet
				int rows = sheet.getPhysicalNumberOfRows(); // 获得行数
				studentList = new ArrayList<Student>();
				if (rows > 1) { // 第一行默认为标题
					for (int j = 1; j < rows; j++) {
						int k = 0;
						Student student = new Student();
						student.setStuNo(j);
						student.setStuOrgid(orgId); // 所属组织 作为方法参数 传进来得到
						student.setStuClassId(classId);// 所属班级 作为方法参数 传进来得到
						student.setStuMajor(classMajor);// 专业
						Row row = sheet.getRow(j);
						int cells = row.getLastCellNum();// 获得列数
						if (cells > 0) {
							try {

								for (k = 0; k < cells; k++) {
									Cell cell = row.getCell(k);

									if (cell != null) {
										cell.setCellType(Cell.CELL_TYPE_STRING);
										String headName = sheet.getRow(0).getCell(k).getStringCellValue();
										setStudentProperty(headName, cell.getStringCellValue(), student);
									}
								}
							} catch (Exception e) {
								throw new MyException("第" + j + "行第" + k + "列出现错误，请检查");

							}

						} else {
							throw new MyException("没有数据");
						}
						if (student.getStuNum() != null && !"".equals(student.getStuNum().trim())) {
							studentList.add(student);
						}
					}
				} else {
					throw new MyException("Excel表格无数据！");
				}

			} catch (Exception ex) {
				ex.printStackTrace();
				StringWriter sw = new StringWriter();
				ex.printStackTrace(new PrintWriter(sw, true));
				String str = sw.toString();
				logger.error(str);
				throw new MyException(ex.getMessage());
			}
		} else {
			throw new MyException("文件不存在");
		}
		return studentList;

	}

	private static void setStudentProperty(String headName, String value, Student student) {

		if (headName.equals("学号")) {
			student.setStuNum(value);
		}
		if (headName.equals("昵称")) {
			student.setStuNickname(value);
		}
		if (headName.equals("登录账号")) {
			student.setStuUserid(value.toLowerCase());
		}
		if (headName.equals("登录密码")) {
			student.setStuPwd(value);
		}
		if (headName.equals("姓名")) {
			student.setStuName(value);
		}
		if (headName.equals("身份证")) {
			student.setStuIdcard(value);
		}
		if (headName.equals("出生日期")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			try {
				student.setStuBirth(sdf.parse(value));
			} catch (ParseException e) {
				e.printStackTrace();
				StringWriter sw = new StringWriter();
				e.printStackTrace(new PrintWriter(sw, true));
				String str = sw.toString();
				logger.error(str);
			}

		}
		if (headName.equals("性别")) {
			student.setStuSex(ReaderXmlParam.getInstance().getConvertParammain(headName, value));
		}
		if (headName.equals("省份")) {
			student.setStuAddress(value);
		}
		if (headName.equals("市县区")) {
			student.setStuAddress(student.getStuAddress() + value);
		}
		if (headName.equals("家庭住址")) {
			student.setStuAddress(student.getStuAddress() + value);
		}
		if (headName.equals("所属组织")) {
			// student.setStuOrgid(Integer.valueOf(value));
		}
		if (headName.equals("学校")) {
			// student.setStuSchoolId();
		}
		if (headName.equals("专业")) {
			// student.setStuMajor(value);
		}
		if (headName.equals("班级")) {
			// student.setStuClassId();
		}
		if (headName.equals("政治面貌")) {
			student.setStuPolitic(ReaderXmlParam.getInstance().getConvertParammain(headName, value));
		}
		if (headName.equals("移动电话")) {
			student.setStuMobile(value);
		}
		if (headName.equals("工作电话")) {
			student.setStuPhone(value);
		}
		if (headName.equals("电子邮件")) {
			student.setStuMail(value);
		}
		if (headName.equals("QQ")) {
			student.setStuQq(value);
		}
		if (headName.equals("家庭联系人")) {
			student.setStuLink(value);
		}
		if (headName.equals("家庭联系方式")) {
			student.setStuLinkTel(value);
		}
		if (headName.equals("邮编")) {
			student.setStuPostcode(value);
		}
		if (headName.equals("qq群")) {
			student.setStuGrpQq(value);
		}
		if (headName.equals("是否为班干部")) {
			student.setStuIsLeader(ReaderXmlParam.getInstance().getConvertParammain("是否", value));
		}
		if (headName.equals("职务")) {
			student.setStuTitle(value);
		}
		if (headName.equals("用户性质")) {
			student.setStuType(ReaderXmlParam.getInstance().getConvertParammain(headName, value));
		}
		if (headName.equals("学历")) {
			student.setStuEduLevel(ReaderXmlParam.getInstance().getConvertParammain(headName, value));
		}
		if (headName.equals("备注")) {
			student.setStuMark(value);
		}

	}

	static class MyException extends Exception {
		public MyException() {
		}

		public MyException(String smg) {
			super(smg);
		}
	}

	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));
	}

	// add by YF 2013-12-18
	@RequestMapping("toValidStuUserId.do")
	public void toValidStuUserId(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "userId", required = false, defaultValue = "") String userId) {
		String ret = "false";
		userId = userId.toLowerCase();
		Pattern p = Pattern.compile("^[a-z0-9_]{6,16}$");
		Matcher m = p.matcher(userId);
		if (m.find() && stuService.validStuUserId(userId)) {
			ret = "true";
		}

		try {
			response.getWriter().write(ret);
		} catch (IOException e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
		}
	}

	@RequestMapping("uploadhead.do")
	public void uploadhead(HttpServletRequest request, HttpServletResponse response) {
		try {

			String savePath = request.getSession().getServletContext().getRealPath("upload/head");
			File uploadDir = new File(savePath);
			if (!uploadDir.isDirectory()) {
				uploadDir.mkdirs();
			}

			File file;
			String url;
			File fileM;
			String urlM;
			File fileS;
			String urlS;
			ImageInputStream ii;
			BufferedImage br;
			if (((SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO)).getStudent() != null && ((SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO)).getUser() == null) {

				Integer stuNo = ((SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO)).getStuNo();

				file = new File(uploadDir, "s" + stuNo + ".png");
				url = "upload/head/" + file.getName();
				fileM = new File(uploadDir, "s" + stuNo + "_m.png");
				urlM = "upload/head/" + fileM.getName();
				fileS = new File(uploadDir, "s" + stuNo + "_s.png");
				urlS = "upload/head/" + fileS.getName();
				ii = ImageIO.createImageInputStream(request.getInputStream());

				br = ImageIO.read(ii);
				if (!file.exists()) {
					file.createNewFile();
				}
				// 将BufferedImage变量写入文件中。
				ImageIO.write(br, "png", file);

				ZoomImage.createZoomSizeImage(br, fileM.getAbsolutePath(), 0.45);
				ZoomImage.createZoomSizeImage(br, fileS.getAbsolutePath(), 0.3);

				StudentWithBLOBs record = new StudentWithBLOBs();
				record.setStuNo(stuNo);
				record.setStuHead(url);
				record.setStuHeadM(urlM);
				record.setStuHeadS(urlS);
				stuService.updateStu(record);

				System.out.println("用户设置头像路径：" + urlM);
				response.getWriter().append("{\"status\":1,\"url\":\"" + url + "\"}");
				response.getWriter().flush();
				response.getWriter().close();

				// 更新session内容

				StudentWithBLOBs stu = ((SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO)).getStudent();
				stu.setStuHead(url);
				stu.setStuHeadM(urlM);
				stu.setStuHeadS(urlS);

			} else if (((SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO)).getUser() != null && ((SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO)).getStudent() == null) {

				Integer userNo = ((SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO)).getUser().getUserNo();
				file = new File(uploadDir, "u" + userNo + ".png");
				url = "upload/head/" + file.getName();
				fileM = new File(uploadDir, "u" + userNo + "_m.png");
				urlM = "upload/head/" + fileM.getName();
				fileS = new File(uploadDir, "u" + userNo + "_s.png");
				urlS = "upload/head/" + fileS.getName();
				ii = ImageIO.createImageInputStream(request.getInputStream());

				br = ImageIO.read(ii);
				if (!file.exists()) {
					file.createNewFile();
				}
				// 将BufferedImage变量写入文件中。
				ImageIO.write(br, "png", file);

				ZoomImage.createZoomSizeImage(br, fileM.getAbsolutePath(), 0.45);
				ZoomImage.createZoomSizeImage(br, fileS.getAbsolutePath(), 0.3);

				UserWithBLOBs record = new UserWithBLOBs();
				record.setUserNo(userNo);
				record.setUserHead(url);
				record.setUserHeadM(urlM);
				record.setUserHeadS(urlS);
				userService.updateUser(record);

				System.out.println("头像路径：" + url);
				System.out.println("头像M：" + urlM);
				System.out.println("头像S：" + urlS);

				response.getWriter().append("{\"status\":1,\"url\":\"" + url + "\"}");
				response.getWriter().flush();
				response.getWriter().close();

				// 更新session信息
				UserWithBLOBs user = ((SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO)).getUser();
				user.setUserHead(url);
				user.setUserHeadM(urlM);
				user.setUserHeadS(urlS);
			}
		} catch (Exception e) {
			e.printStackTrace();
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw, true));
			String str = sw.toString();
			logger.error(str);
			try {
				response.getWriter().append("{\"status\":-2}");
				response.getWriter().flush();
				response.getWriter().close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * 根据用户ID 返回用户头像URL XML格式 【玉强：保留代码】
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getHeadImgUrlByStuNo", method = RequestMethod.GET)
	public @ResponseBody
	ModelXmlStudent getUsers() {
		// 模拟从数据库中获得数据....
		ModelXmlStudent modelXmlStudent = new ModelXmlStudent();
		modelXmlStudent.setStuHead("aaaa");
		modelXmlStudent.setStuHeadM("bbbb");
		modelXmlStudent.setStuHeadS("cccc");
		modelXmlStudent.setStuUserid("heyuqiang");
		return modelXmlStudent;
	}

	@RequestMapping("importStuByExcel.do")
	public void importStu() {
		// 解析请求对象
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		// 接收请求中上传的对象
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();

		// 配置服务器地址
		String serverPath = fileUploadHelper.getTempPath();
		logger.info("服务器地址：" + serverPath);
		File tempFile = new File(serverPath);
		if (!tempFile.exists()) {
			tempFile.mkdirs();
		}

		String fileName = null;
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile mf = entity.getValue();
			fileName = mf.getOriginalFilename();
			File uploadFile = new File(tempFile, fileName);
			try {

				FileCopyUtils.copy(mf.getBytes(), uploadFile);

				Workbook workBook = null;
				InputStream is = new FileInputStream(uploadFile);
				try {
					if (fileName.toLowerCase().endsWith(".xls")) { // 97-03
						workBook = new HSSFWorkbook(mf.getInputStream());
					} else if (fileName.toLowerCase().endsWith(".xlsx")) { // 2007
						workBook = new XSSFWorkbook(mf.getInputStream());
					} else {
						throw new Exception("不支持的文件类型");
					}
				} catch (Exception e) {
					throw new MyException("解析文件出错");
				} finally {
					try {
						is.close();
					} catch (Exception e2) {
						e2.printStackTrace();
						StringWriter sw = new StringWriter();
						e2.printStackTrace(new PrintWriter(sw, true));
						String str = sw.toString();
						logger.error(str);
					}
				}

				Sheet sheet = workBook.getSheetAt(0); // 读取第一个sheet
				int rows = sheet.getPhysicalNumberOfRows(); // 获得行数
				Sheet sheetOut = workBook.createSheet("导入结果");

				int sheetMergerCount = sheet.getNumMergedRegions();
				for (int i = 0; i < sheetMergerCount; i++) {
					CellRangeAddress mergedRegionAt = sheet.getMergedRegion(i);
					sheetOut.addMergedRegion(mergedRegionAt);
				}
				for (Iterator<Row> rowIt = sheet.rowIterator(); rowIt.hasNext();) {

					Row tmpRow = rowIt.next();
					Row newRow = sheetOut.createRow(tmpRow.getRowNum());
					System.out.println("RowNum: " + tmpRow.getRowNum());
					// 行复制
					// copyRow(wb, tmpRow, newRow, copyValueFlag);

					Cell resultCell = newRow.createCell(0);
					Cell userIdCell = newRow.createCell(1);

					if (tmpRow.getRowNum() == 1) {
						resultCell.setCellValue("导入结果");
						userIdCell.setCellValue("登录id");
					} else if (tmpRow.getRowNum() > 1) {
						resultCell.setCellValue("");
					}

					StudentWithBLOBs stu = new StudentWithBLOBs();

					for (Iterator<Cell> cellIt = tmpRow.cellIterator(); cellIt.hasNext();) {
						Cell tmpCell = (Cell) cellIt.next();
						Cell newCell = newRow.createCell(tmpCell.getColumnIndex() + 2);
						POIUtils.copyCell(workBook, tmpCell, newCell, true, false, false);

						if (tmpRow.getRowNum() > 1) {

							String headName = "";
							try {
								headName = sheetOut.getRow(1).getCell(newCell.getColumnIndex()).getStringCellValue().trim();
							} catch (Exception e) {
								continue;
							}
							newCell.setCellType(Cell.CELL_TYPE_STRING);
							String value = newCell.getStringCellValue();
							stu.setStuEduBg(" ");
							if ("昵称".equalsIgnoreCase(headName)) {
								try {
									stu.setStuName(value);
									stu.setStuNickname(value);
									String userid = POIUtils.getPingYin(value, true);
									int i = 0;
									String stuUserid = userid;
									while (stuService.chackUserNameForRecover(stuUserid)) {
										stuUserid = userid + "_" + ++i;
									}
									stu.setStuUserid(stuUserid);
									userIdCell.setCellValue(stuUserid);
								} catch (Exception e) {
									resultCell.setCellValue(resultCell.getStringCellValue() + "昵称非法;");
								}

							} else if ("技术方向".equalsIgnoreCase(headName)) {
								stu.setStuHobby(value);
								if (value.toLowerCase().indexOf("java") >= 0) {
									stu.setStuProf(1);
								} else if ((value.toLowerCase().indexOf("c++") >= 0) || (value.toLowerCase().indexOf("嵌入式") >= 0)) {
									stu.setStuProf(10);
								} else if (value.toLowerCase().indexOf(".net") >= 0) {
									stu.setStuProf(4);
								} else if (value.toLowerCase().indexOf("android") >= 0) {
									stu.setStuProf(23);
								} else if (value.toLowerCase().indexOf("ios") >= 0) {
									stu.setStuProf(24);
								}
							} else if ("性别".equalsIgnoreCase(headName)) {
								stu.setStuSex(ReaderXmlParam.getInstance().getConvertParammain(headName, value));
							} else if ("学校".equalsIgnoreCase(headName)) {
								stu.setStuEduBg(value + stu.getStuEduBg());
							} else if ("专业".equalsIgnoreCase(headName)) {
								stu.setStuEduBg(stu.getStuEduBg() + value);
							} else if ("邮箱".equalsIgnoreCase(headName)) {
								Pattern pattern = Pattern.compile("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+", Pattern.CASE_INSENSITIVE);
								Matcher matcher = pattern.matcher(value);
								if (matcher.matches() && stuService.chackEmailAvailable(value)) {
									stu.setStuMail(value);
								} else {
									resultCell.setCellValue(resultCell.getStringCellValue() + "邮箱格式非法或邮箱已被注册;");
								}
							} else if ("qq".equalsIgnoreCase(headName) && !"".equals(value.trim())) {
								stu.setStuQq(value);
							} else if ("电话".equalsIgnoreCase(headName) && !"".equals(value.trim())) {
								stu.setStuMobile(value);
							}
						}
					}

					if (tmpRow.getRowNum() > 1) {
						if ("".equals(resultCell.getStringCellValue())) {
							try {
								stu.setStuPwd(Encrypt.md5("123456"));
								stu.setStuMailCfg("0"); // 默认设置接收邮件
								stu.setStuGroupId(1); // 默认用户组
								stu.setStuScore(0); // 默认积分
								stu.setStuCoin(0); // 默认学习币
								stu.setStuHeadS("images/yhtx.png"); // 设置个人头像图片（小）
								stu.setStuHeadM("images/rwtx.png");
								stu.setStuHead("images/mruserimg.png");
								stu.setStuRegtime(new Date());// 注册时间
								stu.setStuIsactivate(1); // 是否被激活（0：未激活、1：已激活）
								stu.setStuFlag("-2");
								stuService.saveStudent(stu);
								resultCell.setCellValue("成功");
							} catch (Exception e) {
								e.printStackTrace();
								StringWriter sw = new StringWriter();
								e.printStackTrace(new PrintWriter(sw, true));
								String str = sw.toString();
								logger.error(str);
								resultCell.setCellValue("失败：" + e.getMessage());
							}
						} else {
							resultCell.setCellValue("失败：" + resultCell.getStringCellValue());
						}
					}

				}

				workBook.write(new FileOutputStream(uploadFile));
				writeString("导入完成，结果输出文件：<a href='" + request.getContextPath() + "/download.do?fileurl=" + uploadFile.getAbsolutePath() + "'>" + uploadFile.getName() + "</a>");
			} catch (Exception e) {
				e.printStackTrace();
				StringWriter sw = new StringWriter();
				e.printStackTrace(new PrintWriter(sw, true));
				String str = sw.toString();
				logger.error(str);
				writeString("导入出错：" + e.getMessage());
			}
		}
	}
}
