package com.chinasofti.cetp.practice.model;

import java.util.Date;

public class TaskKnow extends TaskKnowKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_task_know.TK_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    private Date tkRegtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_task_know.TK_REGTIME
     *
     * @return the value of tp_task_know.TK_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public Date getTkRegtime() {
        return tkRegtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_task_know.TK_REGTIME
     *
     * @param tkRegtime the value for tp_task_know.TK_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setTkRegtime(Date tkRegtime) {
        this.tkRegtime = tkRegtime;
    }
}