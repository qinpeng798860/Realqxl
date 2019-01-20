package com.zking.real.vegetation.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@ToString
public class CleanRecord implements Serializable{
    private String rQbm;

    private String rQid;

    private String rQqjr;

    private String rQqjsj;

    private String rQqjqk;

    private String rQnote;

    private Date rQsj;

    public CleanRecord(String rQbm, String rQid, String rQqjr, String rQqjsj, String rQqjqk, String rQnote, Date rQsj) {
        this.rQbm = rQbm;
        this.rQid = rQid;
        this.rQqjr = rQqjr;
        this.rQqjsj = rQqjsj;
        this.rQqjqk = rQqjqk;
        this.rQnote = rQnote;
        this.rQsj = rQsj;
    }

    public CleanRecord() {
        super();
    }

    public String getrQbm() {
        return rQbm;
    }

    public void setrQbm(String rQbm) {
        this.rQbm = rQbm;
    }

    public String getrQid() {
        return rQid;
    }

    public void setrQid(String rQid) {
        this.rQid = rQid;
    }

    public String getrQqjr() {
        return rQqjr;
    }

    public void setrQqjr(String rQqjr) {
        this.rQqjr = rQqjr;
    }

    public String getrQqjsj() {
        return rQqjsj;
    }

    public void setrQqjsj(String rQqjsj) {
        this.rQqjsj = rQqjsj;
    }

    public String getrQqjqk() {
        return rQqjqk;
    }

    public void setrQqjqk(String rQqjqk) {
        this.rQqjqk = rQqjqk;
    }

    public String getrQnote() {
        return rQnote;
    }

    public void setrQnote(String rQnote) {
        this.rQnote = rQnote;
    }

    public Date getrQsj() {
        return rQsj;
    }

    public void setrQsj(Date rQsj) {
        this.rQsj = rQsj;
    }
}