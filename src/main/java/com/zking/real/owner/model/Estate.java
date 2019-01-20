package com.zking.real.owner.model;

import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

//f房产
@ToString
public class Estate implements Serializable{
    private String rId;

    private String rYzid;

    private String rLy;

    private String rLc;

    private String rFczh;

    private String rRgzh;

    private Integer rZcpxh;

    private String rNote;

    private String rFczt;

    private String rFcsj;

    private String rFjmc;

    public Estate(String rId,String rYzid, String rLy, String rLc, String rFczh, String rRgzh, Integer rZcpxh, String rNote,String rFczt,String rFcsj,String rFjmc) {
        this.rId = rId;
        this.rYzid=rYzid;
        this.rLy = rLy;
        this.rLc = rLc;
        this.rFczh = rFczh;
        this.rRgzh = rRgzh;
        this.rZcpxh = rZcpxh;
        this.rNote = rNote;
        this.rFczt=rFczt;
        this.rFcsj=rFcsj;
        this.rFjmc=rFjmc;
    }

    public Estate() {
        super();
    }

    public String getrId() {
        return rId;
    }

    public void setrYzid(String rYzid) {
        this.rYzid = rYzid;
    }

    public String getrYzid() {
        return rYzid;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getrLy() {
        return rLy;
    }

    public void setrLy(String rLy) {
        this.rLy = rLy;
    }

    public String getrLc() {
        return rLc;
    }

    public void setrLc(String rLc) {
        this.rLc = rLc;
    }

    public String getrFczh() {
        return rFczh;
    }

    public void setrFczh(String rFczh) {
        this.rFczh = rFczh;
    }

    public String getrRgzh() {
        return rRgzh;
    }

    public void setrRgzh(String rRgzh) {
        this.rRgzh = rRgzh;
    }

    public Integer getrZcpxh() {
        return rZcpxh;
    }

    public void setrZcpxh(Integer rZcpxh) {
        this.rZcpxh = rZcpxh;
    }

    public String getrNote() {
        return rNote;
    }

    public void setrNote(String rNote) {
        this.rNote = rNote;
    }

    public String getrFczt() {
        return rFczt;
    }

    public void setrFczt(String rFczt) {
        this.rFczh = rFczt;
    }

    public String getrFcsj() {
        return rFcsj;
    }

    public void setrFcsj(String rFcsj) {
        this.rFcsj = rFcsj;
    }

    public String getrFjmc() {
        return rFjmc;
    }

    public void setrFjmc(String rFjmc) {
        this.rFjmc = rFjmc;
    }
}