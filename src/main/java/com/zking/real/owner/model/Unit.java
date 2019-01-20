package com.zking.real.owner.model;

import lombok.ToString;

import java.io.Serializable;

//单元
@ToString
public class Unit implements Serializable{
    private String dybm;

    private String lyid;

    private String dymc;

    private Integer kslc;

    private Integer jslc;

    private Integer ksfh;

    private Integer jsfh;

    private String node;

    private String fjbm;

    public Unit(String dybm, String lyid, String dymc, Integer kslc, Integer jslc, Integer ksfh, Integer jsfh, String node, String fjbm) {
        this.dybm = dybm;
        this.lyid = lyid;
        this.dymc = dymc;
        this.kslc = kslc;
        this.jslc = jslc;
        this.ksfh = ksfh;
        this.jsfh = jsfh;
        this.node = node;
        this.fjbm = fjbm;
    }

    public Unit() {
        super();
    }

    public String getDybm() {
        return dybm;
    }

    public void setDybm(String dybm) {
        this.dybm = dybm;
    }

    public String getLyid() {
        return lyid;
    }

    public void setLyid(String lyid) {
        this.lyid = lyid;
    }

    public String getDymc() {
        return dymc;
    }

    public void setDymc(String dymc) {
        this.dymc = dymc;
    }

    public Integer getKslc() {
        return kslc;
    }

    public void setKslc(Integer kslc) {
        this.kslc = kslc;
    }

    public Integer getJslc() {
        return jslc;
    }

    public void setJslc(Integer jslc) {
        this.jslc = jslc;
    }

    public Integer getKsfh() {
        return ksfh;
    }

    public void setKsfh(Integer ksfh) {
        this.ksfh = ksfh;
    }

    public Integer getJsfh() {
        return jsfh;
    }

    public void setJsfh(Integer jsfh) {
        this.jsfh = jsfh;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getFjbm() {
        return fjbm;
    }

    public void setFjbm(String fjbm) {
        this.fjbm = fjbm;
    }
}