package com.gl52.euv.pojo;

import java.io.Serializable;
import java.util.Date;

public class Subject implements Serializable {
    private Integer subjectid;

    private String description;

    private String subjectname;

    private Date createTime;

    private Integer numberMin;

    private Integer numberMax;

    private static final long serialVersionUID = 1L;

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname == null ? null : subjectname.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getNumberMin() {
        return numberMin;
    }

    public void setNumberMin(Integer numberMin) {
        this.numberMin = numberMin;
    }

    public Integer getNumberMax() {
        return numberMax;
    }

    public void setNumberMax(Integer numberMax) {
        this.numberMax = numberMax;
    }
}