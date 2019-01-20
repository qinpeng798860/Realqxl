package com.zking.real.owner.model;

import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

//家庭
@ToString
public class Members implements Serializable{
    private String rMid;

    private String rYzid;

    private String rCyxm;

    private String rLxdh;

    private String rXb;

    private String rCsrq;

    private String rZjlx;

    private String rZjhm;

    private String rGx;

    private String rXl;

    private String rGzdw;

    private String rXp;

    private Date rSj;

    private String rNote;

    public Members(String rMid,String rYzid, String rCyxm, String rLxdh, String rXb,
                   String rCsrq, String rZjlx, String rZjhm, String rGx, String rXl, String rGzdw, String rXp, String rNote,Date rSj) {
        this.rMid = rMid;
        this.rYzid=rYzid;
        this.rCyxm = rCyxm;
        this.rLxdh = rLxdh;
        this.rXb = rXb;
        this.rCsrq = rCsrq;
        this.rZjlx = rZjlx;
        this.rZjhm = rZjhm;
        this.rGx = rGx;
        this.rXl = rXl;
        this.rGzdw = rGzdw;
        this.rXp = rXp;
        this.rNote = rNote;
        this.rSj = rSj;
    }

    public Members() {
        super();
    }

    public String getrMid() {
        return rMid;
    }

    public void setrYzid(String rYzid) {
        this.rYzid = rYzid;
    }

    public String getrYzid() {
        return rYzid;
    }

    public void setrMid(String rMid) {
        this.rMid = rMid;
    }
    public String getrCyxm() {
        return rCyxm;
    }

    public void setrCyxm(String rCyxm) {
        this.rCyxm = rCyxm;
    }

    public String getrLxdh() {
        return rLxdh;
    }

    public void setrLxdh(String rLxdh) {
        this.rLxdh = rLxdh;
    }

    public String getrXb() {
        return rXb;
    }

    public void setrXb(String rXb) {
        this.rXb = rXb;
    }

    public String getrCsrq() {
        return rCsrq;
    }

    public void setrCsrq (String rCsrq) {
        this.rCsrq = rCsrq;
    }

    public String getrZjlx() {
        return rZjlx;
    }

    public void setrZjlx(String rZjlx) {
        this.rZjlx = rZjlx;
    }

    public String getrZjhm() {
        return rZjhm;
    }

    public void setrZjhm(String rZjhm) {
        this.rZjhm = rZjhm;
    }

    public String getrGx() {
        return rGx;
    }

    public void setrGx(String rGx) {
        this.rGx = rGx;
    }

    public String getrXl() {
        return rXl;
    }

    public void setrXl(String rXl) {
        this.rXl = rXl;
    }

    public String getrGzdw() {
        return rGzdw;
    }

    public void setrGzdw(String rGzdw) {
        this.rGzdw = rGzdw;
    }

    public String getrXp() {
        return rXp;
    }

    public void setrXp(String rXp) {
        this.rXp = rXp;
    }

    public String getrNote() {
        return rNote;
    }

    public void setrNote(String rNote) {
        this.rNote = rNote;
    }

    public Date getrSj() {
        return rSj;
    }

    public void setrSj(Date rSj) {
        this.rSj = rSj;
    }
}