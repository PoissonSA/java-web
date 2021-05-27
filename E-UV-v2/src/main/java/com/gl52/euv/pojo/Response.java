package com.gl52.euv.pojo;

import java.io.Serializable;
import java.util.Date;

public class Response implements Serializable {
    private Integer rid;

    private Date rcreated;

    private Integer revaluationId;

    private Integer rstudentId;

    private String rcontent;

    private static final long serialVersionUID = 1L;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Date getRcreated() {
        return rcreated;
    }

    public void setRcreated(Date rcreated) {
        this.rcreated = rcreated;
    }

    public Integer getRevaluationId() {
        return revaluationId;
    }

    public void setRevaluationId(Integer revaluationId) {
        this.revaluationId = revaluationId;
    }

    public Integer getRstudentId() {
        return rstudentId;
    }

    public void setRstudentId(Integer rstudentId) {
        this.rstudentId = rstudentId;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent == null ? null : rcontent.trim();
    }
}