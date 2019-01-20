package com.zking.real.vegetation.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

//清洁安排
@ToString
public class CleanArrangement implements Serializable{
    private String rAbm;

    private String rAmc;

    private String rAqjdd;

    private String rAfzr;

    private String rAqjsj;

    private String rAqjnr;

    private String rAnote;

    private Date rAsj;

    private String rAid;

    public CleanArrangement(String rAbm, String rAmc, String rAqjdd, String rAfzr, String rAqjsj, String rAqjnr, String rAnote, Date rAsj, String rAid) {
        this.rAbm = rAbm;
        this.rAmc = rAmc;
        this.rAqjdd = rAqjdd;
        this.rAfzr = rAfzr;
        this.rAqjsj = rAqjsj;
        this.rAqjnr = rAqjnr;
        this.rAnote = rAnote;
        this.rAsj = rAsj;
        this.rAid = rAid;
    }

    public CleanArrangement() {
        super();
    }

    public String getrAbm() {
        return rAbm;
    }

    public void setrAbm(String rAbm) {
        this.rAbm = rAbm;
    }

    public String getrAmc() {
        return rAmc;
    }

    public void setrAmc(String rAmc) {
        this.rAmc = rAmc;
    }

    public String getrAqjdd() {
        return rAqjdd;
    }

    public void setrAqjdd(String rAqjdd) {
        this.rAqjdd = rAqjdd;
    }

    public String getrAfzr() {
        return rAfzr;
    }

    public void setrAfzr(String rAfzr) {
        this.rAfzr = rAfzr;
    }

    public String getrAqjsj() {
        return rAqjsj;
    }

    public void setrAqjsj(String rAqjsj) {
        this.rAqjsj = rAqjsj;
    }

    public String getrAqjnr() {
        return rAqjnr;
    }

    public void setrAqjnr(String rAqjnr) {
        this.rAqjnr = rAqjnr;
    }

    public String getrAnote() {
        return rAnote;
    }

    public void setrAnote(String rAnote) {
        this.rAnote = rAnote;
    }

    public Date getrAsj() {
        return rAsj;
    }

    public void setrAsj(Date rAsj) {
        this.rAsj = rAsj;
    }

    public String getrAid() {
        return rAid;
    }

    public void setrAid(String rAid) {
        this.rAid = rAid;
    }
}