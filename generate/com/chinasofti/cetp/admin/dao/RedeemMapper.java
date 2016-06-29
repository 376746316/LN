package com.chinasofti.cetp.admin.dao;

import com.chinasofti.cetp.admin.model.Redeem;
import com.chinasofti.cetp.admin.model.RedeemExample;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedeemMapper {
    int countByExample(RedeemExample example);

    int deleteByExample(RedeemExample example);

    int deleteByPrimaryKey(Integer reId);

    int insert(Redeem record);

    int insertSelective(Redeem record);

    List<Redeem> selectByExample(RedeemExample example);

    Redeem selectByPrimaryKey(Integer reId);

    int updateByExampleSelective(@Param("record") Redeem record, @Param("example") RedeemExample example);

    int updateByExample(@Param("record") Redeem record, @Param("example") RedeemExample example);

    int updateByPrimaryKeySelective(Redeem record);

    int updateByPrimaryKey(Redeem record);

	List<Redeem> selectByExample(RedeemExample redeemExample, RowBoundsWithTotalCount rb);
}