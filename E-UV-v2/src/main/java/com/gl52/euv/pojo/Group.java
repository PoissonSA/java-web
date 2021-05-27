package com.gl52.euv.pojo;

import java.io.Serializable;

public class Group implements Serializable {
    private Integer groupid;

    private String groupname;

    private Integer projectmanager;

    private Integer subjectid;

    private Integer isValid;

    private String filename;

    private byte[] file;

    private static final long serialVersionUID = 1L;

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Integer getProjectmanager() {
        return projectmanager;
    }

    public void setProjectmanager(Integer projectmanager) {
        this.projectmanager = projectmanager;
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}