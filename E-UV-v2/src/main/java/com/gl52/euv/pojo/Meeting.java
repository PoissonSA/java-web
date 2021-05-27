package com.gl52.euv.pojo;

import java.io.Serializable;
import java.util.Date;

public class Meeting implements Serializable {
    private Integer mid;

    private Integer groupid;

    private Date mdate;

    private static final long serialVersionUID = 1L;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }
}