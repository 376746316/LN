package com.chinasofti.cetp.ability.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.chinasofti.cetp.ability.model.MoreProfessionPability;
import com.chinasofti.cetp.ability.model.ProfessionPability;
import com.chinasofti.cetp.ability.model.ProfessionPabilityExample;
import com.chinasofti.cetp.ability.model.ProfessionPabilityKey;

public interface ProfessionPabilityMapper {
	/**
	 * <p>
	 * 		method:getProfessionPabilitygriddata
	 * 		<br>
	 * 		description:获取职业功能列表的方法
	 * </p>
	 * @return List<MoreProfessionPability>
	 * */
	List<MoreProfessionPability> getProfessionPabilitygriddata(Integer profId,RowBounds rowBounds);
	/**
	 * <p>
	 * 		method:getProfessionAbilitygriddata1
	 * 		<br>
	 * 		description:获取职业功能列表的方法
	 * </p>
	 * @return List<MoreProfessionPability>
	 * */
	List<MoreProfessionPability> getProfessionAbilitygriddata1(HashMap map,RowBounds rowBounds);
	/**
	 * <p>
	 * 		method:getselWorkContentgriddata
	 * 		<br>
	 * 		description:获取工作内容列表的方法
	 * </p>
	 * @return List<MoreProfessionPability>
	 * */
	List<MoreProfessionPability> getselWorkContentgriddata(HashMap map,RowBounds rowBounds);
	/**
	 * <p>
	 * 		method:getselWorkContentgriddata
	 * 		<br>
	 * 		description:获取能力项列表的方法
	 * </p>
	 * @return List<MoreProfessionPability>
	 * */
	List<MoreProfessionPability> getselAbilityItemgriddata(HashMap map,RowBounds rowBounds);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int countByExample(ProfessionPabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int deleteByExample(ProfessionPabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int deleteByPrimaryKey(ProfessionPabilityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int insert(ProfessionPability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int insertSelective(ProfessionPability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    List<ProfessionPability> selectByExample(ProfessionPabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    ProfessionPability selectByPrimaryKey(ProfessionPabilityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int updateByExampleSelective(@Param("record") ProfessionPability record, @Param("example") ProfessionPabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int updateByExample(@Param("record") ProfessionPability record, @Param("example") ProfessionPabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int updateByPrimaryKeySelective(ProfessionPability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_profession_pability
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    int updateByPrimaryKey(ProfessionPability record);
}