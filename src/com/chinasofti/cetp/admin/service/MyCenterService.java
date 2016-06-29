package com.chinasofti.cetp.admin.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.UserMapper;
import com.chinasofti.cetp.practice.dao.PracticeMapper;
import com.chinasofti.cetp.practice.model.MorePractice;
import com.chinasofti.cetp.study.dao.ChapterMapper;
import com.chinasofti.cetp.study.dao.NoteMapper;
import com.chinasofti.cetp.study.dao.RealtimeQAMapper;
import com.chinasofti.cetp.study.dao.RqaCostMapper;
import com.chinasofti.cetp.study.dao.SpecCourseViewMapper;
import com.chinasofti.cetp.study.model.Chapter;
import com.chinasofti.cetp.study.model.ChapterExample;
import com.chinasofti.cetp.study.model.CourseNote;
import com.chinasofti.cetp.study.model.MoreNote;
import com.chinasofti.cetp.study.model.Note;
import com.chinasofti.cetp.study.model.RealtimeQAExample;
import com.chinasofti.cetp.study.model.RealtimeQAWithBLOBs;
import com.chinasofti.cetp.study.model.RqaCost;
import com.chinasofti.cetp.study.model.SpecCourseView;
import com.chinasofti.cetp.utils.FCEvent;

@Service
public class MyCenterService {
	private static final Logger logger = Logger.getLogger(MyCenterService.class);

	@Autowired
	private SpecCourseViewMapper specCourseViewMapper;

	public SpecCourseViewMapper getSpecCourseViewMapper() {
		return specCourseViewMapper;
	}

	public void setSpecCourseViewMapper(SpecCourseViewMapper specCourseViewMapper) {
		this.specCourseViewMapper = specCourseViewMapper;
	}

	@Autowired
	private NoteMapper noteMapper;

	public NoteMapper getNoteMapper() {
		return noteMapper;
	}

	public void setNoteMapper(NoteMapper noteMapper) {
		this.noteMapper = noteMapper;
	}

	@Autowired
	private ChapterMapper chapterMapper;

	public ChapterMapper getChapterMapper() {
		return chapterMapper;
	}

	public void setChapterMapper(ChapterMapper chapterMapper) {
		this.chapterMapper = chapterMapper;
	}

	public List<SpecCourseView> selectStudingCourse(Integer stuNo) {
		return specCourseViewMapper.selectStudingCourse(stuNo);
	}

	public List<SpecCourseView> selectStudiedCourse(Integer stuNo) {
		return specCourseViewMapper.selectStudiedCourse(stuNo);
	}

	public List<SpecCourseView> selectCollectedCourse(Integer stuNo) {
		return specCourseViewMapper.selectCollectedCourse(stuNo);
	}

	public List<SpecCourseView> selectRecommendByStu(Integer profId, Integer stuNo) {
		return specCourseViewMapper.selectRecommendByStu(profId, stuNo);
	}

	public List<CourseNote> getCourses(Integer stuNo) {
		return noteMapper.getCourses(stuNo);
	}

	public List<Chapter> getChapterList(Integer specId) {
		ChapterExample example = new ChapterExample();
		example.createCriteria().andChapSpecIdEqualTo(specId);
		example.setOrderByClause("CHAP_ID ASC");
		return chapterMapper.selectByExample(example);
	}

	public List<MoreNote> getNoteList(Integer stuNo, Integer chapId, String search, RowBounds rowBounds) {
		return noteMapper.selectWithSC(stuNo, chapId, search, rowBounds);
	}

	public int editNote(Note note) {
		return noteMapper.updateByPrimaryKeySelective(note);
	}

	public int delNote(Integer noteId) {
		return noteMapper.deleteByPrimaryKey(noteId);
	}

	@Autowired
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public String userOnline(Integer userNo) {
		return userMapper.selectByPrimaryKey(userNo).getUserOnline();
	}

	@Autowired
	private RealtimeQAMapper realtimeQAMapper;

	public RealtimeQAMapper getRealtimeQAMapper() {
		return realtimeQAMapper;
	}

	public void setRealtimeQAMapper(RealtimeQAMapper realtimeQAMapper) {
		this.realtimeQAMapper = realtimeQAMapper;
	}

	private RqaCostMapper rqaCostMapper;

	public RqaCostMapper getRqaCostMapper() {
		return rqaCostMapper;
	}

	@Autowired
	public void setRqaCostMapper(RqaCostMapper rqaCostMapper) {
		this.rqaCostMapper = rqaCostMapper;
	}

	public List<RealtimeQAWithBLOBs> getRealtimeQAs(RealtimeQAExample example, RowBounds rowBounds) {
		List<RealtimeQAWithBLOBs> list = this.realtimeQAMapper.selectByExampleWithBLOBs(example, rowBounds);
		// for (RealtimeQAWithBLOBs realtimeQAWithBLOBs : list) {
		// if (realtimeQAWithBLOBs.getRqaLog() != null &&
		// !"".equals(realtimeQAWithBLOBs.getRqaLog())) {
		// List<Message> msgList = new
		// Gson().fromJson(realtimeQAWithBLOBs.getRqaLog(), new
		// TypeToken<List<Message>>() {
		// }.getType());
		// realtimeQAWithBLOBs.setMsgList(msgList);
		// }
		// }
		return list;
	}

	public List<FCEvent> getUserRqaEvents(Integer userNo, Date start, Date end) {
		RealtimeQAExample example = new RealtimeQAExample();
		example.createCriteria().andRqaStartTimeBetween(start, end).andRqaUserNoEqualTo(userNo);
		return this.realtimeQAMapper.getUserRqaEvents(example);
	}

	// add by YF 2014-7-22
	@Autowired
	private PracticeMapper practiceMapper;

	public PracticeMapper getPracticeMapper() {
		return practiceMapper;
	}

	public void setPracticeMapper(PracticeMapper practiceMapper) {
		this.practiceMapper = practiceMapper;
	}

	public List<MorePractice> getStuPracList(Integer stuNo) {
		return this.practiceMapper.getStuPracList(stuNo);
	}

	public List<MorePractice> getUserPracList(Integer userNo) {
		return this.practiceMapper.getPracListByTeacher(userNo);
	}

	/**
	 * 根据购买次数查询规则信息
	 * 
	 * @param qAcount
	 *            购买次数
	 * @return
	 */
	public RqaCost getRqaCostByQacount(Integer qAcount) {
		return rqaCostMapper.getRqaCostByQacount(qAcount);
	}

}
