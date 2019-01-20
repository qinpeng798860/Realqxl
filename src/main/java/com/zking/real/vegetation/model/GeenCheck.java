package com.zking.real.vegetation.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class GeenCheck implements Serializable{
    private String rCbm;

    private String rClvmc;

    private String rClvsj;

    private String rCjcr;

    private String rCjcqk;

    private String rCclqk;

    private String rCnote;

    private String rCsj;

    public GeenCheck(String rCbm, String rClvmc, String rClvsj, String rCjcr, String rCjcqk, String rCclqk, String rCnote,String rCsj) {
        this.rCbm = rCbm;
        this.rClvmc = rClvmc;
        this.rClvsj = rClvsj;
        this.rCjcr = rCjcr;
        this.rCjcqk = rCjcqk;
        this.rCclqk = rCclqk;
        this.rCnote = rCnote;
        this.rCsj=rCsj;

    }

    public GeenCheck() {
        super();
    }

    public String getrCbm() {
        return rCbm;
    }

    public void setrCbm(String rCbm) {
        this.rCbm = rCbm;
    }

    public String getrClvmc() {
        return rClvmc;
    }

    public void setrClvmc(String rClvmc) {
        this.rClvmc = rClvmc;
    }

    public String getrClvsj() {
        return rClvsj;
    }

    public void setrClvsj(String rClvsj) {
        this.rClvsj = rClvsj;
    }

    public String getrCjcr() {
        return rCjcr;
    }

    public void setrCjcr(String rCjcr) {
        this.rCjcr = rCjcr;
    }

    public String getrCjcqk() {
        return rCjcqk;
    }

    public void setrCjcqk(String rCjcqk) {
        this.rCjcqk = rCjcqk;
    }

    public String getrCclqk() {
        return rCclqk;
    }

    public void setrCclqk(String rCclqk) {
        this.rCclqk = rCclqk;
    }

    public String getrCnote() {
        return rCnote;
    }

    public void setrCnote(String rCnote) {
        this.rCnote = rCnote;
    }

    public void setrCsj(String rCsj) {
        this.rCsj = rCsj;
    }

    public String getrCsj() {
        return rCsj;
    }

}