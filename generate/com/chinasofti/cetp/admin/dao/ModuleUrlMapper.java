package com.chinasofti.cetp.admin.dao;

import com.chinasofti.cetp.admin.model.ModuleUrl;
import com.chinasofti.cetp.admin.model.ModuleUrlExample;
import com.chinasofti.cetp.admin.model.ModuleUrlKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModuleUrlMapper {
	
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int countByExample(ModuleUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int deleteByExample(ModuleUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int deleteByPrimaryKey(ModuleUrlKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int insert(ModuleUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int insertSelective(ModuleUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    List<ModuleUrl> selectByExample(ModuleUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    ModuleUrl selectByPrimaryKey(ModuleUrlKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int updateByExampleSelective(@Param("record") ModuleUrl record, @Param("example") ModuleUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int updateByExample(@Param("record") ModuleUrl record, @Param("example") ModuleUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int updateByPrimaryKeySelective(ModuleUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_module_url
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int updateByPrimaryKey(ModuleUrl record);
}