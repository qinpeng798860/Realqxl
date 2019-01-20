package com.zking.real.system.model;

import lombok.ToString;

import java.util.List;

@ToString
public class User {
    private String rUserid;

    private String rUsername;

    private String rRoleId;

    private List<Model> modelList;

    public String getrRoleId() {
        return rRoleId;
    }

    public void setrRoleId(String rRoleId) {
        this.rRoleId = rRoleId;
    }

    public List<Model> getModelList() {
        return modelList;
    }

    public void setModelList(List<Model> modelList) {
        this.modelList = modelList;
    }

    private String rPassword;

    public User(String rUserid, String rUsername, String rPassword) {
        this.rUserid = rUserid;
        this.rUsername = rUsername;
        this.rPassword = rPassword;
    }

    public User() {
        super();
    }

    public String getrUserid() {
        return rUserid;
    }

    public void setrUserid(String rUserid) {
        this.rUserid = rUserid;
    }

    public String getrUsername() {
        return rUsername;
    }

    public void setrUsername(String rUsername) {
        this.rUsername = rUsername;
    }

    public String getrPassword() {
        return rPassword;
    }

    public void setrPassword(String rPassword) {
        this.rPassword = rPassword;
    }
}