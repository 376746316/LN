package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.SubCourseware;
import com.chinasofti.cetp.study.model.SubCoursewareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubCoursewareMapper {
    int countByExample(SubCoursewareExample example);

    int deleteByExample(SubCoursewareExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(SubCourseware record);

    int insertSelective(SubCourseware record);

    List<SubCourseware> selectByExample(SubCoursewareExample example);

    SubCourseware selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") SubCourseware record, @Param("example") SubCoursewareExample example);

    int updateByExample(@Param("record") SubCourseware record, @Param("example") SubCoursewareExample example);

    int updateByPrimaryKeySelective(SubCourseware record);

    int updateByPrimaryKey(SubCourseware record);

	List<SubCourseware> selectSubCourseBySpecId(Integer specId);
	
	List<SubCourseware> selectSubCourseByChapId(Integer chapId);

}