package com.zking.real.vegetation.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

//绿化
@ToString
public class GeenSet implements Serializable{
    private String rGbm;

    private String rGszmc;

    private String rGmj;

    private String rGdd;

    private String rGzrr;

    private String rGlhsj;

    private String rGzyzb;

    private String rGnote;

    private Date rGsj;

    private String rGid;

    public GeenSet(String rGbm, String rGszmc, String rGmj, String rGdd, String rGzrr, String rGlhsj, String rGzyzb, String rGnote, Date rGsj,String rGid) {
        this.rGbm = rGbm;
        this.rGszmc = rGszmc;
        this.rGmj = rGmj;
        this.rGdd = rGdd;
        this.rGzrr = rGzrr;
        this.rGlhsj = rGlhsj;
        this.rGzyzb = rGzyzb;
        this.rGnote = rGnote;
        this.rGsj = rGsj;
        this.rGid=rGid;
    }

    public GeenSet() {
        super();
    }

    public String getrGbm() {
        return rGbm;
    }

    public void setrGbm(String rGbm) {
        this.rGbm = rGbm;
    }

    public String getrGszmc() {
        return rGszmc;
    }

    public void setrGszmc(String rGszmc) {
        this.rGszmc = rGszmc;
    }

    public String getrGmj() {
        return rGmj;
    }

    public void setrGmj(String rGmj) {
        this.rGmj = rGmj;
    }

    public String getrGdd() {
        return rGdd;
    }

    public void setrGdd(String rGdd) {
        this.rGdd = rGdd;
    }

    public String getrGzrr() {
        return rGzrr;
    }

    public void setrGzrr(String rGzrr) {
        this.rGzrr = rGzrr;
    }

    public String getrGlhsj() {
        return rGlhsj;
    }

    public void setrGlhsj(String rGlhsj) {
        this.rGlhsj = rGlhsj;
    }

    public String getrGzyzb() {
        return rGzyzb;
    }

    public void setrGzyzb(String rGzyzb) {
        this.rGzyzb = rGzyzb;
    }

    public String getrGnote() {
        return rGnote;
    }

    public void setrGnote(String rGnote) {
        this.rGnote = rGnote;
    }

    public Date getrGsj() {
        return rGsj;
    }

    public void setrGsj(Date rGsj) {
        this.rGsj = rGsj;
    }

    public String getrGid() {
        return rGid;
    }

    public void setrGid(String rGid) {
        this.rGid = rGid;
    }
}