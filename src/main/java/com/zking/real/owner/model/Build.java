package com.zking.real.owner.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

//楼宇
@ToString
public class Build implements Serializable{
    private String lybm;

    private String lymc;

    private String lygn;

    private String jglb;

    private String wsdj;

    private Float jzmj;

    private Float symj;

    private String jzxkz;

    private String ysxkz;

    private Date jgrq;

    private Date fdrq;

    private String note;

    public Build(String lybm, String lymc, String lygn, String jglb, String wsdj, Float jzmj, Float symj, String jzxkz, String ysxkz, Date jgrq, Date fdrq, String note) {
        this.lybm = lybm;
        this.lymc = lymc;
        this.lygn = lygn;
        this.jglb = jglb;
        this.wsdj = wsdj;
        this.jzmj = jzmj;
        this.symj = symj;
        this.jzxkz = jzxkz;
        this.ysxkz = ysxkz;
        this.jgrq = jgrq;
        this.fdrq = fdrq;
        this.note = note;
    }

    public Build() {
        super();
    }

    public String getLybm() {
        return lybm;
    }

    public void setLybm(String lybm) {
        this.lybm = lybm;
    }

    public String getLymc() {
        return lymc;
    }

    public void setLymc(String lymc) {
        this.lymc = lymc;
    }

    public String getLygn() {
        return lygn;
    }

    public void setLygn(String lygn) {
        this.lygn = lygn;
    }

    public String getJglb() {
        return jglb;
    }

    public void setJglb(String jglb) {
        this.jglb = jglb;
    }

    public String getWsdj() {
        return wsdj;
    }

    public void setWsdj(String wsdj) {
        this.wsdj = wsdj;
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

    public String getJzxkz() {
        return jzxkz;
    }

    public void setJzxkz(String jzxkz) {
        this.jzxkz = jzxkz;
    }

    public String getYsxkz() {
        return ysxkz;
    }

    public void setYsxkz(String ysxkz) {
        this.ysxkz = ysxkz;
    }

    public Date getJgrq() {
        return jgrq;
    }

    public void setJgrq(Date jgrq) {
        this.jgrq = jgrq;
    }

    public Date getFdrq() {
        return fdrq;
    }

    public void setFdrq(Date fdrq) {
        this.fdrq = fdrq;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}