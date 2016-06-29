package com.chinasofti.cetp.admin.dao;

import com.chinasofti.cetp.admin.model.JobIntent;
import com.chinasofti.cetp.admin.model.JobIntentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobIntentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int countByExample(JobIntentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int deleteByExample(JobIntentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int deleteByPrimaryKey(Integer jiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int insert(JobIntent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int insertSelective(JobIntent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    List<JobIntent> selectByExampleWithBLOBs(JobIntentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    List<JobIntent> selectByExample(JobIntentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    JobIntent selectByPrimaryKey(Integer jiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int updateByExampleSelective(@Param("record") JobIntent record, @Param("example") JobIntentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int updateByExampleWithBLOBs(@Param("record") JobIntent record, @Param("example") JobIntentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int updateByExample(@Param("record") JobIntent record, @Param("example") JobIntentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int updateByPrimaryKeySelective(JobIntent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int updateByPrimaryKeyWithBLOBs(JobIntent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_job_intent
     *
     * @mbggenerated Thu Jul 25 19:01:39 CST 2013
     */
    int updateByPrimaryKey(JobIntent record);
}