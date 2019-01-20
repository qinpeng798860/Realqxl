package com.zking.real.vegetation.model;

import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;

//植被信息
@ToString
public class Vegeinfrom implements Serializable {
    private String rZbbm;

    private String rZbmc;

    private String rZbzl;

    private String rZbsl;

    private String rSl;

    private String rZbdw;

    private String rZbxx;

    private String rZbtd;

    private String rZbnote;

    private Timestamp rZbsj;

    public Vegeinfrom(String rZbbm, String rZbmc, String rZbzl, String rZbsl, String rSl, String rZbdw, String rZbxx, String rZbtd, String rZbnote,Timestamp rZbsj) {
        this.rZbbm = rZbbm;
        this.rZbmc = rZbmc;
        this.rZbzl = rZbzl;
        this.rZbsl = rZbsl;
        this.rSl = rSl;
        this.rZbdw = rZbdw;
        this.rZbxx = rZbxx;
        this.rZbtd = rZbtd;
        this.rZbnote = rZbnote;
        this.rZbsj=rZbsj;
    }

    public Vegeinfrom() {
        super();
    }

    public String getrZbbm() {
        return rZbbm;
    }

    public void setrZbbm(String rZbbm) {
        this.rZbbm = rZbbm;
    }

    public String getrZbmc() {
        return rZbmc;
    }

    public void setrZbmc(String rZbmc) {
        this.rZbmc = rZbmc;
    }

    public String getrZbzl() {
        return rZbzl;
    }

    public void setrZbzl(String rZbzl) {
        this.rZbzl = rZbzl;
    }

    public String getrZbsl() {
        return rZbsl;
    }

    public void setrZbsl(String rZbsl) {
        this.rZbsl = rZbsl;
    }

    public String getrSl() {
        return rSl;
    }

    public void setrSl(String rSl) {
        this.rSl = rSl;
    }

    public String getrZbdw() {
        return rZbdw;
    }

    public void setrZbdw(String rZbdw) {
        this.rZbdw = rZbdw;
    }

    public String getrZbxx() {
        return rZbxx;
    }

    public void setrZbxx(String rZbxx) {
        this.rZbxx = rZbxx;
    }

    public String getrZbtd() {
        return rZbtd;
    }

    public void setrZbtd(String rZbtd) {
        this.rZbtd = rZbtd;
    }

    public String getrZbnote() {
        return rZbnote;
    }

    public void setrZbnote(String rZbnote) {
        this.rZbnote = rZbnote;
    }

    public Timestamp getrZbsj() {
        return rZbsj;
    }

    public void setrZbsj(Timestamp rZbsj) {
        this.rZbsj = rZbsj;
    }
}