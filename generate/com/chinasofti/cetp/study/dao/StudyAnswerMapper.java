package com.chinasofti.cetp.study.dao;

import java.util.List;

import com.chinasofti.cetp.study.model.MoreStudyAnswer;
import com.chinasofti.cetp.study.model.StudyAnswer;
import com.chinasofti.cetp.study.model.StudyAnswerExample;

public interface StudyAnswerMapper {
    int countByExample(StudyAnswerExample example);

    int deleteByPrimaryKey(Integer saAnswerId);

    int insert(StudyAnswer record);

    int insertSelective(StudyAnswer record);

    List<StudyAnswer> selectByExampleWithBLOBs(StudyAnswerExample example);

    List<StudyAnswer> selectByExample(StudyAnswerExample example);

    StudyAnswer selectByPrimaryKey(Integer saAnswerId);

    int updateByPrimaryKeySelective(StudyAnswer record);

    int updateByPrimaryKeyWithBLOBs(StudyAnswer record);

    int updateByPrimaryKey(StudyAnswer record);
    
    /*自定义接口*/

	List<MoreStudyAnswer> selectStudyAnswerBySqQuestionId(Integer sqId);

	List<MoreStudyAnswer> selsectMoreStudyAnswerByParentSaId(Integer saId);
	MoreStudyAnswer selsectMoreStudyAnswerByParimaryKey(Integer saId);

	List<MoreStudyAnswer> selectStudyAnswerNotBestAnswer(Integer sqId);
}