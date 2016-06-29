package com.chinasofti.cetp.admin.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasofti.cetp.admin.dao.CoinRecordMapper;
import com.chinasofti.cetp.admin.dao.ScoreRecordMapper;
import com.chinasofti.cetp.admin.dao.ScoreRuleMapper;
import com.chinasofti.cetp.admin.dao.StudentMapper;
import com.chinasofti.cetp.admin.dao.UserMapper;
import com.chinasofti.cetp.admin.model.CoinRecord;
import com.chinasofti.cetp.admin.model.DetailedScoreRecord;
import com.chinasofti.cetp.admin.model.PageModelScoreRecord;
import com.chinasofti.cetp.admin.model.ScoreRecord;
import com.chinasofti.cetp.admin.model.ScoreRecordExample;
import com.chinasofti.cetp.admin.model.ScoreRecordExample.Criteria;
import com.chinasofti.cetp.admin.model.ScoreRule;
import com.chinasofti.cetp.admin.model.StudentWithBLOBs;
import com.chinasofti.cetp.admin.model.UserWithBLOBs;
import com.chinasofti.cetp.utils.Constants;
import com.chinasofti.cetp.utils.SessionInfo;

@Service
public class ScoreRecordService {

	private ScoreRecordMapper scoreRecordMapper;
	private ScoreRuleMapper scoreRuleMapper;
	private StudentMapper studentMapper;
	private CoinRecordMapper coinRecordMapper;
	private UserMapper userMapper;
	public CoinRecordMapper getCoinRecordMapper() {
		return coinRecordMapper;
	}

	@Autowired
	public void setCoinRecordMapper(CoinRecordMapper coinRecordMapper) {
		this.coinRecordMapper = coinRecordMapper;
	}

	public ScoreRecordMapper getScoreRecordMapper() {
		return scoreRecordMapper;
	}

	@Autowired
	public void setScoreRecordMapper(ScoreRecordMapper scoreRecordMapper) {
		this.scoreRecordMapper = scoreRecordMapper;
	}

	public ScoreRuleMapper getScoreRuleMapper() {
		return scoreRuleMapper;
	}

	@Autowired
	public void setScoreRuleMapper(ScoreRuleMapper scoreRuleMapper) {
		this.scoreRuleMapper = scoreRuleMapper;
	}

	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

	@Autowired
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
   
	public UserMapper getUserMapper() {
		return userMapper;
	}
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public List<ScoreRecord> gerScoreRecordByExample(ScoreRecordExample example) {
		return scoreRecordMapper.selectByExample(example);
	}

	public List<DetailedScoreRecord> getByMap(Map<String, Object> map) {
		return scoreRecordMapper.getByMap(map);
	}

	public int addScoreRecord(ScoreRecord scoreRecord) {
		return scoreRecordMapper.insertSelective(scoreRecord);
	}

	/**
	 * 学生积分得分管理【通用方法】
	 * 
	 * @param stuNo
	 *            学生编号
	 * @param srId
	 *            规则编号
	 */
	public void addScore(Integer stuNo, Integer srId) {

		StudentWithBLOBs student  = studentMapper.selectByPrimaryKey(stuNo);
		
		ScoreRule scoreRule = scoreRuleMapper.selectByPrimaryKey(srId); // 积分规则
		ScoreRecordExample scoreRecordExample = new ScoreRecordExample();
		Criteria criteria = scoreRecordExample.createCriteria();

		if (scoreRule.getSrFlag().equals("1")) { // 规则是否启用
			if (scoreRule.getSrCycle().equals("0")) { // 一次性

				criteria.andSrecStuNoEqualTo(student.getStuNo());
				criteria.andSrecRuleEqualTo(srId);
				List<ScoreRecord> scoreRecords = scoreRecordMapper.selectByExample(scoreRecordExample);

				if (scoreRule.getSrTimes() > scoreRecords.size()) {

					ScoreRecord scoreRecord = new ScoreRecord(); // 积分记录
					scoreRecord.setSrecRule(srId); // 规则编号
					scoreRecord.setSrecScore(scoreRule.getSrScore()); // 分数
					scoreRecord.setSrecStuNo(student.getStuNo());// 学生编号
					scoreRecord.setSrecReason(scoreRule.getSrName());// 积分变更理由
					scoreRecord.setSrecRegtime(new Date());// 记录创建时间

					if (scoreRecordMapper.insertSelective(scoreRecord) > 0) {// 保存积分记录
						student.setStuScore(student.getStuScore() + scoreRule.getSrScore());
						studentMapper.updateByPrimaryKeySelective(student);
					}
				}

			} else if (scoreRule.getSrCycle().equals("1")) { // 每天
				SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date currentTime = new Date(); // 当前时间
				try {
					criteria.andSrecRuleEqualTo(srId);
					criteria.andSrecStuNoEqualTo(student.getStuNo());
					criteria.andSrecRegtimeBetween(sf2.parse(sf1.format(currentTime) + " 00:00:00"), sf2.parse(sf1.format(currentTime) + " 23:59:59"));
					List<ScoreRecord> scoreRecords = scoreRecordMapper.selectByExample(scoreRecordExample);
					if (scoreRule.getSrTimes() > scoreRecords.size()) {

						ScoreRecord scoreRecord = new ScoreRecord(); // 积分记录
						scoreRecord.setSrecRule(srId); // 规则编号
						scoreRecord.setSrecScore(scoreRule.getSrScore()); // 分数
						scoreRecord.setSrecStuNo(student.getStuNo());// 学生编号
						scoreRecord.setSrecReason(scoreRule.getSrName());// 积分变更理由
						scoreRecord.setSrecRegtime(new Date());// 记录创建时间

						if (scoreRecordMapper.insertSelective(scoreRecord) > 0) {// 保存积分记录
							student.setStuScore(student.getStuScore() + scoreRule.getSrScore());
							studentMapper.updateByPrimaryKeySelective(student);
						}
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	/**
	 * 企业用户积分得分管理【通用方法】
	 * 
	 * @param user
	 *            企业信息
	 * @param usId
	 *            规则编号
	 */
	
	public void addUserScore(UserWithBLOBs user, Integer usId) {

		ScoreRule scoreRule = scoreRuleMapper.selectByPrimaryKey(usId); // 积分规则
		ScoreRecordExample scoreRecordExample = new ScoreRecordExample();
		Criteria criteria = scoreRecordExample.createCriteria();

		if (scoreRule.getSrFlag().equals("1")) { // 规则是否启用
			if (scoreRule.getSrCycle().equals("0")) { // 一次性

				criteria.andSrecUserNoEqualTo(user.getUserNo());
				criteria.andSrecRuleEqualTo(usId);
				List<ScoreRecord> scoreRecords = scoreRecordMapper.selectByExample(scoreRecordExample);

				if (scoreRule.getSrTimes() > scoreRecords.size()) {

					ScoreRecord scoreRecord = new ScoreRecord(); // 积分记录
					scoreRecord.setSrecRule(usId); // 规则编号
					scoreRecord.setSrecScore(scoreRule.getSrScore()); // 分数
					scoreRecord.setSrecUserNo(user.getUserNo());// 企业编号
					scoreRecord.setSrecReason(scoreRule.getSrName());// 积分变更理由
					scoreRecord.setSrecRegtime(new Date());// 记录创建时间

					if (scoreRecordMapper.insertSelective(scoreRecord) > 0) {// 保存积分记录
						user.setUserScore(user.getUserScore() + scoreRule.getSrScore());
						userMapper.updateByPrimaryKeySelective(user);
					}
				}

			} else if (scoreRule.getSrCycle().equals("1")) { // 每天
				SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date currentTime = new Date(); // 当前时间
				try {
					criteria.andSrecRuleEqualTo(usId);
					criteria.andSrecStuNoEqualTo(user.getUserNo());
					criteria.andSrecRegtimeBetween(sf2.parse(sf1.format(currentTime) + " 00:00:00"), sf2.parse(sf1.format(currentTime) + " 23:59:59"));
					List<ScoreRecord> scoreRecords = scoreRecordMapper.selectByExample(scoreRecordExample);
					if (scoreRule.getSrTimes() > scoreRecords.size()) {

						ScoreRecord scoreRecord = new ScoreRecord(); // 积分记录
						scoreRecord.setSrecRule(usId); // 规则编号
						scoreRecord.setSrecScore(scoreRule.getSrScore()); // 分数
						scoreRecord.setSrecUserNo(user.getUserNo());// 企业编号
						scoreRecord.setSrecReason(scoreRule.getSrName());// 积分变更理由
						scoreRecord.setSrecRegtime(new Date());// 记录创建时间

						if (scoreRecordMapper.insertSelective(scoreRecord) > 0) {// 保存积分记录
							user.setUserScore(user.getUserScore() + scoreRule.getSrScore());
							userMapper.updateByPrimaryKeySelective(user);
						}
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	public List<PageModelScoreRecord> getPageModelScoreRecordByStuNo(Map<String, Object> map) {
		return scoreRecordMapper.getPageModelScoreRecordByStuNo(map);
	}

	/**
	 * 学习币消费【通用方法】
	 * 
	 * @param student
	 *            学生信息
	 * @param stuCoin
	 *            消费学习币数量
	 * @param request
	 * @return true-处理成功，false-学习币余额不足，处理失败
	 */
	@Transactional
	public boolean subtractCoin(Integer stuNo, Integer stuCoin, String reason, HttpServletRequest request) {
		boolean flag = false;
		StudentWithBLOBs student = studentMapper.selectByPrimaryKey(stuNo);
		if (student.getStuCoin() >= stuCoin) {
			student.setStuCoin(student.getStuCoin() - stuCoin);
			if (studentMapper.updateByPrimaryKeySelective(student) > 0) {

				CoinRecord coinRecord = new CoinRecord();
				coinRecord.setCrecCoin(0 - stuCoin);
				coinRecord.setCrecStuNo(student.getStuNo());
				coinRecord.setCrecReason(reason);
				coinRecord.setCrecRegtime(new Date());

				if (coinRecordMapper.insertSelective(coinRecord) > 0) {
					flag = true;
				}
			}
		}
		// 更新session信息
		SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(Constants.SESSIONINFO);
		sessionInfo.setStuUserid(student.getStuUserid()); // 用户登陆名
		sessionInfo.setStuNo(student.getStuNo()); // 主键
		sessionInfo.setStudent(student);
		request.getSession().setAttribute(Constants.SESSIONINFO, sessionInfo);

		return flag;
	}
}
