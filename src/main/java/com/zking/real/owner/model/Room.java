package com.zking.real.owner.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Room implements Serializable{
    private String fjbm;

    private String dyid;

    private String fjmc;

    private String hx;

    private String cx;

    private String zx;

    private Integer lcx;

    private Float jzmj;

    private Float symj;

    private String cph;

    private Float cwmj;

    private String cwh;

    private String ccsh;

    private Float ccsmj;

    private Float glmj;

    private String fjzt;

    private Float cd;

    private Float kd;

    private String yt;

    private String wylx;

    private String fjxz;

    private String node;

    public Room(String fjbm, String dyid, String fjmc, String hx, String cx, String zx, Integer lcx, Float jzmj, Float symj, String cph, Float cwmj, String cwh, String ccsh, Float ccsmj, Float glmj, String fjzt, Float cd, Float kd, String yt, String wylx, String fjxz, String node) {
        this.fjbm = fjbm;
        this.dyid = dyid;
        this.fjmc = fjmc;
        this.hx = hx;
        this.cx = cx;
        this.zx = zx;
        this.lcx = lcx;
        this.jzmj = jzmj;
        this.symj = symj;
        this.cph = cph;
        this.cwmj = cwmj;
        this.cwh = cwh;
        this.ccsh = ccsh;
        this.ccsmj = ccsmj;
        this.glmj = glmj;
        this.fjzt = fjzt;
        this.cd = cd;
        this.kd = kd;
        this.yt = yt;
        this.wylx = wylx;
        this.fjxz = fjxz;
        this.node = node;
    }

    public Room() {
        super();
    }

    public String getFjbm() {
        return fjbm;
    }

    public void setFjbm(String fjbm) {
        this.fjbm = fjbm;
    }

    public String getDyid() {
        return dyid;
    }

    public void setDyid(String dyid) {
        this.dyid = dyid;
    }

    public String getFjmc() {
        return fjmc;
    }

    public void setFjmc(String fjmc) {
        this.fjmc = fjmc;
    }

    public String getHx() {
        return hx;
    }

    public void setHx(String hx) {
        this.hx = hx;
    }

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    public String getZx() {
        return zx;
    }

    public void setZx(String zx) {
        this.zx = zx;
    }

    public Integer getLcx() {
        return lcx;
    }

    public void setLcx(Integer lcx) {
        this.lcx = lcx;
    }

    public Float getJzmj() {
        return jzmj;
    }

    public void setJzmj(Float jzmj) {
        this.jzmj = jzmj;
    }

    public Float getSymj() {
        return symj;
    }

    public void setSymj(Float symj) {
        this.symj = symj;
    }

    public String getCph() {
        return cph;
    }

    public void setCph(String cph) {
        this.cph = cph;
    }

    public Float getCwmj() {
        return cwmj;
    }

    public void setCwmj(Float cwmj) {
        this.cwmj = cwmj;
    }

    public String getCwh() {
        return cwh;
    }

    public void setCwh(String cwh) {
        this.cwh = cwh;
    }

    public String getCcsh() {
        return ccsh;
    }

    public void setCcsh(String ccsh) {
        this.ccsh = ccsh;
    }

    public Float getCcsmj() {
        return ccsmj;
    }

    public void setCcsmj(Float ccsmj) {
        this.ccsmj = ccsmj;
    }

    public Float getGlmj() {
        return glmj;
    }

    public void setGlmj(Float glmj) {
        this.glmj = glmj;
    }

    public String getFjzt() {
        return fjzt;
    }

    public void setFjzt(String fjzt) {
        this.fjzt = fjzt;
    }

    public Float getCd() {
        return cd;
    }

    public void setCd(Float cd) {
        this.cd = cd;
    }

    public Float getKd() {
        return kd;
    }

    public void setKd(Float kd) {
        this.kd = kd;
    }

    public String getYt() {
        return yt;
    }

    public void setYt(String yt) {
        this.yt = yt;
    }

    public String getWylx() {
        return wylx;
    }

    public void setWylx(String wylx) {
        this.wylx = wylx;
    }

    public String getFjxz() {
        return fjxz;
    }

    public void setFjxz(String fjxz) {
        this.fjxz = fjxz;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }
}