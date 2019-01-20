package com.zking.real.server.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@ToString
public class Server implements Serializable{
    private String id;

    private String rFc;

    private String rSsgs;

    private String rLymc;

    private String rDy;

    private String rFjmc;

    private String rSqr;

    private String rLxdh;

    /*时间格式转换*/
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date rSqsj;

    private String rFwlx;

    private String rZt;

    private Float rLjqfze;

    private String rSqsx;

    private Float rFwfy;

    private String rSpyj;


    public String getrSsgs() {
        return rSsgs;
    }

    public void setrSsgs(String rSsgs) {
        this.rSsgs = rSsgs;
    }

    public Server(String id, String rFc, String rLymc, String rDy, String rFjmc, String rSqr, String rLxdh, Date rSqsj, String rFwlx, String rZt, Float rLjqfze, String rSqsx, Float rFwfy, String rSpyj) {
        this.id = id;
        this.rFc = rFc;
        this.rLymc = rLymc;
        this.rDy = rDy;
        this.rFjmc = rFjmc;
        this.rSqr = rSqr;
        this.rLxdh = rLxdh;
        this.rSqsj = rSqsj;
        this.rFwlx = rFwlx;
        this.rZt = rZt;
        this.rLjqfze = rLjqfze;
        this.rSqsx = rSqsx;
        this.rFwfy = rFwfy;
        this.rSpyj = rSpyj;
    }

    public Server() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getrFc() {
        return rFc;
    }

    public void setrFc(String rFc) {
        this.rFc = rFc;
    }

    public String getrLymc() {
        return rLymc;
    }

    public void setrLymc(String rLymc) {
        this.rLymc = rLymc;
    }

    public String getrDy() {
        return rDy;
    }

    public void setrDy(String rDy) {
        this.rDy = rDy;
    }

    public String getrFjmc() {
        return rFjmc;
    }

    public void setrFjmc(String rFjmc) {
        this.rFjmc = rFjmc;
    }

    public String getrSqr() {
        return rSqr;
    }

    public void setrSqr(String rSqr) {
        this.rSqr = rSqr;
    }

    public String getrLxdh() {
        return rLxdh;
    }

    public void setrLxdh(String rLxdh) {
        this.rLxdh = rLxdh;
    }

    public Date getrSqsj() {
        return rSqsj;
    }

    public void setrSqsj(Date rSqsj) {
        this.rSqsj = rSqsj;
    }

    public String getrFwlx() {
        return rFwlx;
    }

    public void setrFwlx(String rFwlx) {
        this.rFwlx = rFwlx;
    }

    public String getrZt() {
        return rZt;
    }

    public void setrZt(String rZt) {
        this.rZt = rZt;
    }

    public Float getrLjqfze() {
        return rLjqfze;
    }

    public void setrLjqfze(Float rLjqfze) {
        this.rLjqfze = rLjqfze;
    }

    public String getrSqsx() {
        return rSqsx;
    }

    public void setrSqsx(String rSqsx) {
        this.rSqsx = rSqsx;
    }

    public Float getrFwfy() {
        return rFwfy;
    }

    public void setrFwfy(Float rFwfy) {
        this.rFwfy = rFwfy;
    }

    public String getrSpyj() {
        return rSpyj;
    }

    public void setrSpyj(String rSpyj) {
        this.rSpyj = rSpyj;
    }
}