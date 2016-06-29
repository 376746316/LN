package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.MoreStudyQuestion;
import com.chinasofti.cetp.study.model.StudyQuestion;
import com.chinasofti.cetp.study.model.StudyQuestionExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StudyQuestionMapper {
	int countByExample(StudyQuestionExample example);

	int deleteByPrimaryKey(Integer sqQuestionId);

	int insert(StudyQuestion record);

	int insertSelective(StudyQuestion record);

	List<StudyQuestion> selectByExampleWithBLOBs(StudyQuestionExample example);

	List<StudyQuestion> selectByExample(StudyQuestionExample example);

	StudyQuestion selectByPrimaryKey(Integer sqQuestionId);

	int updateByPrimaryKeySelective(StudyQuestion record);

	int updateByPrimaryKeyWithBLOBs(StudyQuestion record);

	int updateByPrimaryKey(StudyQuestion record);

	/*自定义接口*/
	List<MoreStudyQuestion> selectStudyQuestionForShow(
			@Param("stuNo") Integer stuNo, @Param("specId") Integer specId);

	MoreStudyQuestion selectStudyQuestionBySqQuestionId(Integer sqId);
	
	int getQuestionAnswerCount(Integer sqId);
	
	List<MoreStudyQuestion> getMyAnswerQuestion(@Param("stuNo") Integer stuNo, @Param("specId") Integer specId);
	List<MoreStudyQuestion> getMyBestAnswerQuestion(@Param("stuNo") Integer stuNo, @Param("specId") Integer specId);

	List<MoreStudyQuestion> getAllQuestionForSpecId(Integer specId);
}