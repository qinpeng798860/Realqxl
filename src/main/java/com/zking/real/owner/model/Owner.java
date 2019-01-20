package com.zking.real.owner.model;

import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@ToString
public class Owner implements Serializable{
    private String rId;

    private String rEid;

    private String rYzlx;

    private String rYzbm;

    private String rYzxm;

    private String rXb;

    private String rCsrq;

    private String rMz;

    private String rXl;

    private String rGj;

    private String rJg;

    private String rZjlx;

    private String rZjhm;

    private String rGzdw;

    private String rZw;

    private String rSjhm;

    private String rYb;

    private String rLxdz;

    private String rJjlxr;

    private String rJjlxdh;

    private String rJjlxdz;

    private String rKhx;

    private String rYhzh;

    private String rSzpcs;

    private String rZt;

    private String rNote;

    private String rXp;

    private String rXshth;

    private Date rSj;
//    private String StringValue;
    public Owner(String rId, String rEid, String rYzlx, String rYzbm, String rYzxm,
                 String rXb, String rCsrq, String rMz, String rXl, String rGj, String rJg,
                 String rZjlx, String rZjhm, String rGzdw, String rZw, String rSjhm, String rYb,
                 String rLxdz, String rJjlxr, String rJjlxdh, String rJjlxdz, String rKhx, String rYhzh,
                 String rSzpcs, String rZt, String rNote, String rXp, String rXshth,Date rSj) {
        this.rId = rId;
        this.rEid = rEid;
        this.rYzlx = rYzlx;
        this.rYzbm = rYzbm;
        this.rYzxm = rYzxm;
        this.rXb = rXb;
        this.rCsrq = rCsrq;
        this.rMz = rMz;
        this.rXl = rXl;
        this.rGj = rGj;
        this.rJg = rJg;
        this.rZjlx = rZjlx;
        this.rZjhm = rZjhm;
        this.rGzdw = rGzdw;
        this.rZw = rZw;
        this.rSjhm = rSjhm;
        this.rYb = rYb;
        this.rLxdz = rLxdz;
        this.rJjlxr = rJjlxr;
        this.rJjlxdh = rJjlxdh;
        this.rJjlxdz = rJjlxdz;
        this.rKhx = rKhx;
        this.rYhzh = rYhzh;
        this.rSzpcs = rSzpcs;
        this.rZt = rZt;
        this.rNote = rNote;
        this.rXp = rXp;
        this.rXshth = rXshth;
        this.rSj=rSj;
//        this.StringValue=StringValue;
    }

    public Owner() {
        super();
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getrEid() {
        return rEid;
    }

    public void setrEid(String rEid) {
        this.rEid = rEid;
    }

    public String getrYzlx() {
        return rYzlx;
    }

    public void setrYzlx(String rYzlx) {
        this.rYzlx = rYzlx;
    }

    public String getrYzbm() {
        return rYzbm;
    }

    public void setrYzbm(String rYzbm) {
        this.rYzbm = rYzbm;
    }

    public String getrYzxm() {
        return rYzxm;
    }

    public void setrYzxm(String rYzxm) {
        this.rYzxm = rYzxm;
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

    public void setrCsrq(String rCsrq) {
        this.rCsrq = rCsrq;
    }

    public String getrMz() {
        return rMz;
    }

    public void setrMz(String rMz) {
        this.rMz = rMz;
    }

    public String getrXl() {
        return rXl;
    }

    public void setrXl(String rXl) {
        this.rXl = rXl;
    }

    public String getrGj() {
        return rGj;
    }

    public void setrGj(String rGj) {
        this.rGj = rGj;
    }

    public String getrJg() {
        return rJg;
    }

    public void setrJg(String rJg) {
        this.rJg = rJg;
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

    public String getrGzdw() {
        return rGzdw;
    }

    public void setrGzdw(String rGzdw) {
        this.rGzdw = rGzdw;
    }

    public String getrZw() {
        return rZw;
    }

    public void setrZw(String rZw) {
        this.rZw = rZw;
    }

    public String getrSjhm() {
        return rSjhm;
    }

    public void setrSjhm(String rSjhm) {
        this.rSjhm = rSjhm;
    }

    public String getrYb() {
        return rYb;
    }

    public void setrYb(String rYb) {
        this.rYb = rYb;
    }

    public String getrLxdz() {
        return rLxdz;
    }

    public void setrLxdz(String rLxdz) {
        this.rLxdz = rLxdz;
    }

    public String getrJjlxr() {
        return rJjlxr;
    }

    public void setrJjlxr(String rJjlxr) {
        this.rJjlxr = rJjlxr;
    }

    public String getrJjlxdh() {
        return rJjlxdh;
    }

    public void setrJjlxdh(String rJjlxdh) {
        this.rJjlxdh = rJjlxdh;
    }

    public String getrJjlxdz() {
        return rJjlxdz;
    }

    public void setrJjlxdz(String rJjlxdz) {
        this.rJjlxdz = rJjlxdz;
    }

    public String getrKhx() {
        return rKhx;
    }

    public void setrKhx(String rKhx) {
        this.rKhx = rKhx;
    }

    public String getrYhzh() {
        return rYhzh;
    }

    public void setrYhzh(String rYhzh) {
        this.rYhzh = rYhzh;
    }

    public String getrSzpcs() {
        return rSzpcs;
    }

    public void setrSzpcs(String rSzpcs) {
        this.rSzpcs = rSzpcs;
    }

    public String getrZt() {
        return rZt;
    }

    public void setrZt(String rZt) {
        this.rZt = rZt;
    }

    public String getrNote() {
        return rNote;
    }

    public void setrNote(String rNote) {
        this.rNote = rNote;
    }

    public String getrXp() {
        return rXp;
    }

    public void setrXp(String rXp) {
        this.rXp = rXp;
    }

    public String getrXshth() {
        return rXshth;
    }

    public void setrXshth(String rXshth) {
        this.rXshth = rXshth;
    }

    public Date getrSj() {
        return rSj;
    }
    public void setrSj(Date rSj) {
        this.rSj = rSj;
    }

}