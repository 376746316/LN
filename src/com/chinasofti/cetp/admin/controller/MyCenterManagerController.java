package com.chinasofti.cetp.admin.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.cetp.admin.model.Redeem;
import com.chinasofti.cetp.admin.model.RedeemExample;
import com.chinasofti.cetp.admin.model.ScoreRule;
import com.chinasofti.cetp.admin.model.StudentExample;
import com.chinasofti.cetp.admin.model.StudentExample.Criteria;
import com.chinasofti.cetp.admin.model.StudentWithBLOBs;
import com.chinasofti.cetp.admin.model.User;
import com.chinasofti.cetp.admin.model.UserGroup;
import com.chinasofti.cetp.admin.service.RedeemService;
import com.chinasofti.cetp.admin.service.ScoreRuleService;
import com.chinasofti.cetp.admin.service.StuService;
import com.chinasofti.cetp.admin.service.UserGroupService;
import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.study.model.RqaParam;
import com.chinasofti.cetp.study.model.RqaParamExample;
import com.chinasofti.cetp.study.service.RqaParamService;
import com.chinasofti.cetp.survey.model.DataGrid;
import com.chinasofti.cetp.utils.CetpUtils;
import com.chinasofti.cetp.utils.Json;
import com.chinasofti.cetp.utils.ReadFile;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;

/**
 * 个人中心后台管理（包括：积分规则管理、用户组规则管理、学习币发行等。）
 * 
 * @author heyuqiang
 * 
 */
@Scope("prototype")
@Controller
@RequestMapping("/myCenter")
public class MyCenterManagerController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MyCenterManagerController.class);

	private ScoreRuleService scoreRuleService;
	private UserGroupService userGroupService;
	private StuService stuService;
	private RedeemService redeemService;
	private RqaParamService rqaParamService;

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

	public StuService getStuService() {
		return stuService;
	}

	@Autowired
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}

	@Autowired
	public void setUserGroupService(UserGroupService userGroupService) {
		this.userGroupService = userGroupService;
	}

	public RedeemService getRedeemService() {
		return redeemService;
	}

	@Autowired
	public void setRedeemService(RedeemService redeemService) {
		this.redeemService = redeemService;
	}

	public RqaParamService getRqaParamService() {
		return rqaParamService;
	}

	@Autowired
	public void setRqaParamService(RqaParamService rqaParamService) {
		this.rqaParamService = rqaParamService;
	}

	/**
	 * 积分规则管理
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping("/scoreRuleManager.do")
	public String scoreRuleManager(HttpServletRequest request, HttpServletResponse response) {
		return "admin/scoreRuleManager";
	}

	/**
	 * 获得积分规则列表
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping("/getScoreRuleList.do")
	public void getScoreRuleList(HttpServletRequest request, HttpServletResponse response, @RequestParam("rows") int rows, @RequestParam("page") int page) {

		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(rows, page);

		List<ScoreRule> scoreRules = scoreRuleService.selectByExample(null, rb);

		DataGrid date = new DataGrid();
		date.setRows(scoreRules);
		date.setTotal(rb.getTotalCount());

		writeJson(date);
	}

	/**
	 * 编辑积分规则
	 * 
	 * @param request
	 * @param response
	 * @param scoreRule
	 */
	@RequestMapping("/editScoreRule.do")
	public void editScoreRule(HttpServletRequest request, HttpServletResponse response, ScoreRule scoreRule) {

		Json json = new Json();
		if (scoreRuleService.updateByPrimaryKeySelective(scoreRule) > 0) {
			json.setSuccess(true);
			json.setMsg("操作成功!");
		} else {
			json.setMsg("操作失败!");
		}

		writeJson(json);
	}

	/**
	 * 删除积分规则信息
	 * 
	 * @param request
	 * @param response
	 * @param scoreRule
	 */
	@RequestMapping("/deleteScoreRule.do")
	public void deleteScoreRule(HttpServletRequest request, HttpServletResponse response, @RequestParam("srId") Integer srId) {

		Json json = new Json();
		if (scoreRuleService.delete(srId) > 0) {
			json.setSuccess(true);
			json.setMsg("操作成功!");
		} else {
			json.setMsg("操作失败!");
		}

		writeJson(json);
	}

	/**
	 * 用户组管理
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping("/userGropManager.do")
	public String userGropManager(HttpServletRequest request, HttpServletResponse response) {
		return "admin/userGropManager";
	}

	@RequestMapping("/getUserGropList.do")
	public void getUserGropList(HttpServletRequest request, HttpServletResponse response, @RequestParam("rows") int rows, @RequestParam("page") int page) {
		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(rows, page);

		List<UserGroup> userGroups = userGroupService.getUserGropList(null, rb);
		DataGrid date = new DataGrid();
		date.setRows(userGroups);
		date.setTotal(rb.getTotalCount());

		writeJson(date);
	}

	/**
	 * 编辑用户组规则
	 * 
	 * @param request
	 * @param response
	 * @param scoreRule
	 */
	@RequestMapping("/editUserGrop.do")
	public void editUserGrop(HttpServletRequest request, HttpServletResponse response, UserGroup userGroup) {

		Json json = new Json();
		if (userGroupService.updateByPrimaryKeySelective(userGroup) > 0) {
			json.setSuccess(true);
			json.setMsg("操作成功!");
		} else {
			json.setMsg("操作失败!");
		}

		writeJson(json);
	}

	/**
	 * 进入学习币发行
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping("/coinIssuanceManager.do")
	public String coinIssuanceManager(HttpServletRequest request, HttpServletResponse response) {
		
		RqaParamExample example = new RqaParamExample();
		example.createCriteria().andRpNameEqualTo("积分兑换比例");
		List<RqaParam> rqaParamList = rqaParamService.selectByExample(example);
		if(rqaParamList.size()>0){
			request.setAttribute("rqaParam", rqaParamList.get(0));
		}
		
		return "admin/coinIssuanceManager";
	}

	/**
	 * 学习币兑换码
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/coinCodeManager.do")
	public String coinCodeManager(HttpServletRequest request, HttpServletResponse response) {
		return "admin/coinCodeManager";
	}

	/**
	 * 学习币发行
	 * 
	 * @param request
	 * @param response
	 * @param stu
	 */
	@RequestMapping("/editCoinInfo.do")
	public void editCoin(HttpServletRequest request, HttpServletResponse response, @RequestParam("stuNo") Integer stuNo, @RequestParam("stuCoin") Integer stuCoin, @RequestParam("stuScore") Integer stuScore) {

		StudentWithBLOBs stu = stuService.selectByPrimaryKey(stuNo);
		stu.setStuCoin(stuCoin);
		stu.setStuScore(stuScore);

		Json j = new Json();
		if (stuService.updateStu(stu) > 0) {
			j.setSuccess(true);
			j.setMsg("修改成功!");
		} else {
			j.setMsg("修改失败");
		}
		super.writeJson(j);
	}

	/**
	 * 获取用户列表
	 * 
	 * @param request
	 * @param response
	 * @param rows
	 * @param page
	 */
	@RequestMapping("/getStudentList.do")
	public void getStudentList(HttpServletRequest request, HttpServletResponse response, @RequestParam("rows") int rows, @RequestParam("page") int page, @RequestParam(value = "stuUserid", required = false) String stuUserid, @RequestParam(value = "stuNickname", required = false) String stuNickname) {

		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(rows, page);
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();

		if (stuUserid != null) {
			criteria.andStuUseridLike("%" + stuUserid + "%");
		}
		if (stuNickname != null) {
			criteria.andStuNicknameLike("%" + stuNickname + "%");
		}

		List<StudentWithBLOBs> studentWithBLOBs = stuService.selectByExampleWithBLOBs(example, rb);
		DataGrid date = new DataGrid();
		date.setRows(studentWithBLOBs);
		date.setTotal(rb.getTotalCount());

		writeJson(date);
	}

	/**
	 * 获取学习币兑换码列表
	 * 
	 * @param request
	 * @param response
	 * @param rows
	 * @param page
	 */
	@RequestMapping("/getCoinCodeList.do")
	public void getCoinCodeList(@RequestParam("rows") int rows, @RequestParam("page") int page, @RequestParam("reStatus") Integer reStatus) {

		RowBoundsWithTotalCount rb = new RowBoundsWithTotalCount(rows, page);
		RedeemExample redeemExample = new RedeemExample();
		redeemExample.setOrderByClause("RE_CREATETIME DESC,RE_REDEEMCODE DESC");
		com.chinasofti.cetp.admin.model.RedeemExample.Criteria criteria = redeemExample.createCriteria();
		criteria.andReStatusEqualTo(reStatus); // 状态（1:正常，2:已使用，3:已过期）

		List<Redeem> redeemList = redeemService.selectByExample(redeemExample, rb);
		DataGrid date = new DataGrid();
		date.setRows(redeemList);
		date.setTotal(rb.getTotalCount());
		writeJson(date);
	}

	/**
	 * 生成学习币兑换码
	 * 
	 * @param request
	 * @param response
	 * @param generateCount
	 *            兑换码个数
	 * @param reValidity
	 *            有效期
	 * @param reCoinamount
	 *            学习币数量
	 */
	@RequestMapping("/generateRedeemCode.do")
	public void generateRedeemCode(@RequestParam("generateCount") Integer generateCount, 
			@RequestParam("reValidity") Date reValidity, 
			@RequestParam("reCoinamount") Integer reCoinamount,
			@RequestParam(value="sync", defaultValue="false", required=false) boolean sync) {

		logger.info(sync);
		
		Json json = new Json();
		User user = (User) request.getSession().getAttribute(CetpUtils.SESSION_USER_INFO_ID);
		List<Redeem> redeemList = null;
		redeemList = redeemService.generateRedeemCode(generateCount, reValidity, reCoinamount, user);
		if (redeemList != null) {
			if(sync){
				String realPath = request.getSession().getServletContext().getRealPath("//");
				String fileURL = File.separator + "temp" + File.separator + System.currentTimeMillis() + "_code.xls";
				
				try {
					// 清理距离当前时间一小时之前创建的文件
					ReadFile.readfile(realPath + File.separator + "temp" + File.separator);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				if (this.doExport(redeemList, realPath, fileURL)) {
					json.setSuccess(true);
					json.setObj(fileURL);
				}
			}
			json.setMsg("兑换码生成成功!");
			json.setSuccess(true);
		} else {
			json.setMsg("兑换码生成失败!");
		}

		writeJson(json);
	}

	/**
	 * 删除学习币兑换码
	 * 
	 * @param reIds
	 *            (如：1001,1002,1003,1004)
	 * @param request
	 * @param response
	 */
	@RequestMapping("/deleteRedeemByReIds.do")
	public void deleteRedeemByReIds(HttpServletRequest request, HttpServletResponse response, @RequestParam("reIds") String reIds) {
		Json j = new Json();
		if (redeemService.deleteRedeemByReIds(reIds)) {
			j.setSuccess(true);
			j.setMsg("删除成功!");
		} else {
			j.setMsg("删除失败!");
		}
		writeJson(j);
	}

	@RequestMapping("/exportRedeemCode.do")
	public void exportRedeemCode(@RequestParam(value = "exportAll", defaultValue = "false", required = false) boolean exportAll, @RequestParam(value = "exportReIds", required = false) String exportReIds, @RequestParam("reStatus") Integer reStatus) {

		Json j = new Json();
		String realPath = request.getSession().getServletContext().getRealPath("//");
		String fileURL = File.separator + "temp" + File.separator + System.currentTimeMillis() + "_code.xls";

		try {
			// 清理距离当前时间一小时之前创建的文件
			ReadFile.readfile(realPath + File.separator + "temp" + File.separator);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		RedeemExample redeemExample = new RedeemExample();
		redeemExample.setOrderByClause("RE_CREATETIME DESC,RE_REDEEMCODE DESC");
		com.chinasofti.cetp.admin.model.RedeemExample.Criteria criteria = redeemExample.createCriteria();
		if (exportAll) {
			criteria.andReStatusEqualTo(reStatus); // 状态（1:正常，2:已使用，3:已过期）
			List<Redeem> redeemList = redeemService.selectByExample(redeemExample);
			if (this.doExport(redeemList, realPath, fileURL)) {
				j.setSuccess(true);
				j.setObj(fileURL);
			}
		} else if (exportReIds != "" && reStatus < 0) {
			List<Integer> values = new ArrayList<Integer>();
			String[] reIdsArray = exportReIds.split(",");
			for (String reId : reIdsArray) {
				values.add(Integer.parseInt(reId));
			}
			criteria.andReIdIn(values);
			List<Redeem> redeemList = redeemService.selectByExample(redeemExample);
			if (this.doExport(redeemList, realPath, fileURL)) {
				j.setSuccess(true);
				j.setObj(fileURL);
			}
		} else {
			logger.info("参数错误!");
			j.setMsg("参数错误!");
		}

		writeJson(j);
	}

	/**
	 * 导出 Excel
	 * 
	 * @param redeemList
	 * @param realPath
	 * @param fileURL
	 * @return
	 */
	public boolean doExport(List<Redeem> redeemList, String realPath, String fileURL) {
		boolean flag = false;
		try {
			// 打开文件
			WritableWorkbook book = Workbook.createWorkbook(new File(realPath + fileURL));
			// 生成名为“sheet1”的工作表，参数0表示这是第一页
			WritableSheet sheet = book.createSheet("sheet1", 0);
			Label label_1 = new Label(0, 0, "邀请码");
			Label label_2 = new Label(1, 0, "学习币数量 ");
			Label label_3 = new Label(2, 0, "生成日期");
			Label label_4 = new Label(3, 0, "有效日期");
			sheet.addCell(label_1);
			sheet.addCell(label_2);
			sheet.addCell(label_3);
			sheet.addCell(label_4);

			for (int i = 0; i < redeemList.size(); i++) {
				Label reRedeemcode = new Label(0, i + 1, redeemList.get(i).getReRedeemcode());
				jxl.write.Number reCoinamount = new jxl.write.Number(1, i + 1, redeemList.get(i).getReCoinamount());
				DateTime createtime = new DateTime(2, i + 1, redeemList.get(i).getReCreatetime());
				DateTime providetime = new DateTime(3, i + 1, redeemList.get(i).getReValidity());
				sheet.addCell(reRedeemcode);
				sheet.addCell(reCoinamount);
				sheet.addCell(createtime);
				sheet.addCell(providetime);
			}
			book.write();
			book.close();
			flag = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}

	/**
	 * 根据学习币兑换码查询兑换码信息
	 * 
	 * @param reRedeemcode
	 */
	@RequestMapping("/coinExchange.do")
	public void coinExchange(@RequestParam("reRedeemcode") String reRedeemcode) {
		Json j = new Json();
		List<Redeem> redeems = redeemService.getRedeemByCode(reRedeemcode);
		if (redeems.size() > 0) {
			Redeem redeem = redeems.get(0);
			if (redeem.getReRedeemcode().equals(reRedeemcode)) {
				if (redeem.getReStatus() == 1) {
					j.setSuccess(true);
					j.setObj(redeem);
				} else if (redeem.getReStatus() == 2) {
					j.setMsg("兑换码已使用!");
				} else {
					j.setMsg("兑换码已过期!");
				}
			} else {
				j.setMsg("无效兑换码!");
			}
		} else {
			j.setMsg("无效兑换码!");
		}
		writeJson(j);
	}

	/**
	 * 根据兑换码执行学习币兑换
	 * 
	 * @param reRedeemcode
	 */
	@Transactional
	@RequestMapping("/doCoinExchange.do")
	public void doCoinExchange(@RequestParam("reRedeemcode") String reRedeemcode) {
		
		Json j = new Json();
		StudentWithBLOBs studentWithBLOBs = getSessionInfo().getStudent();
		List<Redeem> redeems = redeemService.getRedeemByCode(reRedeemcode);
		if (redeems.size() > 0) {
			Redeem redeem = redeems.get(0);
			if (redeem.getReStatus() == 1) {
				studentWithBLOBs.setStuCoin(studentWithBLOBs.getStuCoin() + redeem.getReCoinamount());
				if(stuService.updateStu(studentWithBLOBs)>0){
					redeem.setReStatus(2);// 状态：已使用
					redeemService.updateByPrimaryKeySelective(redeem);
				}
				getSessionInfo().setStudent(studentWithBLOBs);
				j.setSuccess(true);
				j.setObj(studentWithBLOBs.getStuCoin());
				j.setMsg("兑换成功!");
			}else{
				j.setMsg("兑换无效!");
			}
		}
		
		writeJson(j);
	}
	
	@RequestMapping("/getRqaParamByRpId.do")
	public void getRqaParamByRpId(@RequestParam(value="rpId") Integer rpId){
		rqaParamService.selectByPrimaryKey(rpId);
	} 
	
	/**
	 * 修改积分兑换学习币比例
	 * @param rqaParam
	 */
	@RequestMapping("/updateRqaParamByRpId.do")
	public void updateRqaParamByRpId(RqaParam rqaParam){
		Json j = new Json();
		if(rqaParamService.updateByPrimaryKeySelective(rqaParam)>0){
			j.setSuccess(true);
			j.setMsg("修改成功!");
			j.setObj(rqaParam);
		}else{
			j.setMsg("修改失败!");
		}
		writeJson(j);
	}

}
