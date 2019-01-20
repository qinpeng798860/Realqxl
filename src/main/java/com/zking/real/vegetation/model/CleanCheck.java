package com.zking.real.vegetation.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@ToString
public class CleanCheck implements Serializable{
    private String rQbm;

    private String rQjcrq;

    private String rQjcr;

    private String rQjcdd;

    private String rQqjr;

    private String rQjcqk;

    private String rQnote;

    private Date rQsj;

    public CleanCheck(String rQbm, String rQjcrq,String rQjcdd, String rQjcr, String rQqjr,String rQjcqk, String rQnote, Date rQsj) {
        this.rQbm = rQbm;
        this.rQjcrq = rQjcrq;
        this.rQjcdd=rQjcdd;
        this.rQjcr = rQjcr;
        this.rQqjr=rQqjr;
        this.rQjcqk = rQjcqk;
        this.rQnote = rQnote;
        this.rQsj = rQsj;
    }

    public CleanCheck() {
        super();
    }

    public String getrQbm() {
        return rQbm;
    }

    public void setrQbm(String rQbm) {
        this.rQbm = rQbm;
    }

    public String getrQjcrq() {
        return rQjcrq;
    }

    public void setrQjcrq(String rQjcrq) {
        this.rQjcrq = rQjcrq;
    }

    public String getrQjcdd() {
        return rQjcdd;
    }

    public void setrQjcdd(String rQjcdd) {
        this.rQjcdd = rQjcdd;
    }

    public String getrQjcr() {
        return rQjcr;
    }

    public void setrQjcr(String rQjcr) {
        this.rQjcr = rQjcr;
    }

    public void setrQqjr(String rQqjr) {
        this.rQqjr = rQqjr;
    }
    public String getrQqjr() {
        return rQqjr;
    }

    public String getrQjcqk() {
        return rQjcqk;
    }

    public void setrQjcqk(String rQjcqk) {
        this.rQjcqk = rQjcqk;
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