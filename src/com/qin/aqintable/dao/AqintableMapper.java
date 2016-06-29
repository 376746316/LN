package com.qin.aqintable.dao;

import com.qin.aqintable.model.Aqintable;
import com.qin.aqintable.model.AqintableExample;
import com.qin.aqintable.model.Page;

import java.util.ArrayList;
import java.util.List;

public interface AqintableMapper {
	// 返回记录总数
	int countByExample(AqintableExample example);

	// 返回符合条件记录的总数
	int selectByPrimaryQueryLikeNameNumber(String name);

	int deleteByPrimaryKey(Integer id);

	int deleteByPrimaryKeyName(String name);

	int insert(Aqintable record);

	int insertSelective(Aqintable record);

	List<Aqintable> selectByExample(AqintableExample example);

	Aqintable selectByPrimaryKey(Integer id);

	Aqintable selectByPrimaryKeyName(String name);

	Aqintable selectByPrimaryKeyNameAndPwd(Aqintable aqintable);

	ArrayList<Aqintable> selectByPrimaryQueryLikeName(String name);

	// 模糊,limit
	ArrayList<Aqintable> selectByPrimaryQueryLimit(Page page);

	/**
	 * 全部结果limit
	 * 
	 * @param page
	 * @return
	 */
	ArrayList<Aqintable> selectByPrimaryQueryLimitALL(Page page);

	/**
	 * 全部结果
	 * 
	 * @return
	 */
	ArrayList<Aqintable> selectByPrimaryQueryAll();

	int updateByPrimaryKeySelective(Aqintable record);

	int updateByPrimaryKey(Aqintable record);

	int updateByPrimaryKeySelectiveIsName(Aqintable record);

}