package com.chinasofti.cetp.study.dao;

import com.chinasofti.cetp.study.model.RecommendSpec;
import com.chinasofti.cetp.study.model.RecommendSpecExample;
import com.chinasofti.cetp.study.model.RecommendSpecKey;
import com.chinasofti.cetp.study.model.SpecCourseWithBLOBs;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommendSpecMapper {
    int countByExample(RecommendSpecExample example);

    int deleteByExample(RecommendSpecExample example);

    int deleteByPrimaryKey(RecommendSpecKey key);

    int insert(RecommendSpec record);

    int insertSelective(RecommendSpec record);

    List<RecommendSpec> selectByExample(RecommendSpecExample example);

    RecommendSpec selectByPrimaryKey(RecommendSpecKey key);

    int updateByExampleSelective(@Param("record") RecommendSpec record, @Param("example") RecommendSpecExample example);

    int updateByExample(@Param("record") RecommendSpec record, @Param("example") RecommendSpecExample example);

    int updateByPrimaryKeySelective(RecommendSpec record);

    int updateByPrimaryKey(RecommendSpec record);
    /**
     * 特别推荐列表 按分类获取
     * @param type  0：开发  1:设计  2：职业   3：管理
     * @return
     */
	List<SpecCourseWithBLOBs> getSpecsByType(Integer type);
	List<SpecCourseWithBLOBs> getNotWithRsTypeList(@Param("rsType")Integer rsType,@Param("typeId")Integer typeId, RowBoundsWithTotalCount rb);
}