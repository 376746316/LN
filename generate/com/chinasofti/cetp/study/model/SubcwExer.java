package com.chinasofti.cetp.study.model;

import java.util.Date;

public class SubcwExer extends SubcwExerKey {
    private Integer seExerSeq;

    private Integer seUserNo;

    private Date seRegtime;

    public Integer getSeExerSeq() {
        return seExerSeq;
    }

    public void setSeExerSeq(Integer seExerSeq) {
        this.seExerSeq = seExerSeq;
    }

    public Integer getSeUserNo() {
        return seUserNo;
    }

    public void setSeUserNo(Integer seUserNo) {
        this.seUserNo = seUserNo;
    }

    public Date getSeRegtime() {
        return seRegtime;
    }

    public void setSeRegtime(Date seRegtime) {
        this.seRegtime = seRegtime;
    }
}