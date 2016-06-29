package com.chinasofti.cetp.ability.dao;

import com.chinasofti.cetp.ability.model.Ability;
import com.chinasofti.cetp.ability.model.AbilityExample;
import com.chinasofti.cetp.ability.model.MoreAbility;
import com.chinasofti.cetp.ability.model.MoreWconAbitem;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AbilityMapper {
	/**
	 * <p>
	 * 		method:getAbilityTreeData
	 * 		<br>
	 * 		description:获取能力分类的方法
	 * </p>
	 * @param map HashMap
	 * @return List<MoreWconAbitem>
	 * */
	List<MoreAbility> getAbilityTreeData(HashMap map);
	
	/**
	 * <p>
	 * 		method:getMaxAbilityCode
	 * 		<br>
	 * 		description:获取能力分类最大编码的方法
	 * </p>
	 * @param selParent Integer
	 * @return String
	 * */
	String getMaxAbilityCode(Integer selParent);
	/**
	 * <p>
	 * 		method:getAbilityCode
	 * 		<br>
	 * 		description:获取能力分类编码的方法
	 * </p>
	 * @param selParent Integer
	 * @return String
	 * */
	String getAbilityCode(Integer selParent);
	/**
	 * <p>
	 * 		method:selectExistAbility
	 * 		<br>
	 * 		description:获取能力分类是否关联子类的方法
	 * </p>
	 * @param abiId Integer
	 * @return int
	 * */
	int selectExistAbility(Integer abiId);
	
    int countByExample(AbilityExample example);

    int deleteByExample(AbilityExample example);

    int deleteByPrimaryKey(Integer abiId);

    int insert(Ability record);

    int insertSelective(Ability record);
    List<Ability> selectByExample(AbilityExample example);
    List<Ability> selectByExample(AbilityExample example,RowBounds rowBounds);

    Ability selectByPrimaryKey(Integer abiId);

    int updateByExampleSelective(@Param("record") Ability record, @Param("example") AbilityExample example);

    int updateByExample(@Param("record") Ability record, @Param("example") AbilityExample example);

    int updateByPrimaryKeySelective(Ability record);

    int updateByPrimaryKey(Ability record);
}