package com.gl52.euv.pojo;

import java.io.Serializable;
import java.util.Date;

public class Evaluation implements Serializable {
    private Integer eid;

    private String etitle;

    private String edesp;

    private Date eduration;

    private Date ecreated;

    private Boolean evaild;

    private String econtent;

    private static final long serialVersionUID = 1L;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEtitle() {
        return etitle;
    }

    public void setEtitle(String etitle) {
        this.etitle = etitle == null ? null : etitle.trim();
    }

    public String getEdesp() {
        return edesp;
    }

    public void setEdesp(String edesp) {
        this.edesp = edesp == null ? null : edesp.trim();
    }

    public Date getEduration() {
        return eduration;
    }

    public void setEduration(Date eduration) {
        this.eduration = eduration;
    }

    public Date getEcreated() {
        return ecreated;
    }

    public void setEcreated(Date ecreated) {
        this.ecreated = ecreated;
    }

    public Boolean getEvaild() {
        return evaild;
    }

    public void setEvaild(Boolean evaild) {
        this.evaild = evaild;
    }

    public String getEcontent() {
        return econtent;
    }

    public void setEcontent(String econtent) {
        this.econtent = econtent == null ? null : econtent.trim();
    }
}