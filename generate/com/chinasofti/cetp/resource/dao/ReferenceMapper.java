package com.chinasofti.cetp.resource.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.resource.model.Reference;
import com.chinasofti.cetp.resource.model.ReferenceExample;
import com.chinasofti.cetp.resource.model.ReferenceWithBLOBs;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;

public interface ReferenceMapper {
    int countByExample(ReferenceExample example);

    int deleteByPrimaryKey(Integer refId);

    int insert(ReferenceWithBLOBs record);

    int insertSelective(ReferenceWithBLOBs record);

    List<ReferenceWithBLOBs> selectByExampleWithBLOBs(ReferenceExample example);

    List<Reference> selectByExample(ReferenceExample example);

    ReferenceWithBLOBs selectByPrimaryKey(Integer refId);

    int updateByPrimaryKeySelective(ReferenceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ReferenceWithBLOBs record);

    int updateByPrimaryKey(Reference record);

    /**
     * 以课程编号查询参考资料(分页)
     * @param specId
     * @param rowBounds
     * @return
     */
    List<ReferenceWithBLOBs> selectBySpecId(Integer specId,RowBounds rowBounds);
    /**
     * 以课程编号查询参考资料（不考虑分页）
     * @param specId
     * @return
     */
    List<ReferenceWithBLOBs> selectBySpecId(Integer specId);
    /**
     * 查询条件以外的参考资料（分页与不分页）
     * @param specId
     * @param rowBounds
     * @return
     */
    List<ReferenceWithBLOBs> selectReferenceNotWithSpecId(@Param("specId")Integer specId, @Param("userNo")Integer userNo,RowBounds rowBounds);
	List<ReferenceWithBLOBs> selectReferenceNotWithSpecId(Integer specId);
    /**
     * 以班次编号查询参考资料
     * @param liveclassId
     * @param rowBounds
     * @return
     */
    List<ReferenceWithBLOBs> selectByLiveClassId(Integer liveClassId,RowBounds rowBounds);
    
    List<ReferenceWithBLOBs> selectByExampleWithBLOBs(ReferenceExample example,RowBounds rowBounds);

	List<ReferenceWithBLOBs> selectNotWithSpecId(HashMap<String, Object> map, RowBoundsWithTotalCount rb);
	List<ReferenceWithBLOBs> selectNotWithClassId(@Param("liveClassId")Integer liveClassId, @Param("userNo")Integer userNo,RowBounds rowBounds);
	List<ReferenceWithBLOBs> selectNotWithClassId(Integer liveClassId);
    List<ReferenceWithBLOBs> selectByLiveClassId(Integer liveClassId);
}