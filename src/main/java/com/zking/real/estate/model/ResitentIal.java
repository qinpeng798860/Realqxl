package com.zking.real.estate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class ResitentIal implements Serializable{
    private String rEid;


    private String rSsgs;

    @JsonProperty("id")
    private String rZzbh;

    @JsonProperty("text")
    private String rZzmc;

    private Float rZdmj;

    private Float rJzmj;

    private Float rLdmj;

    private Float rDlmj;

    private String rFzr;

    private String rZzdz;

    private String rGsmc;

    private String rFrdb;

    private String rLxr;

    private String rLxdh;

    private String rLxdz;

    private String rNote;

    public ResitentIal(String rEid, String rSsgs, String rZzbh, String rZzmc, Float rZdmj, Float rJzmj, Float rLdmj, Float rDlmj, String rFzr, String rZzdz, String rGsmc, String rFrdb, String rLxr, String rLxdh, String rLxdz, String rNote) {
        this.rEid = rEid;
        this.rSsgs = rSsgs;
        this.rZzbh = rZzbh;
        this.rZzmc = rZzmc;
        this.rZdmj = rZdmj;
        this.rJzmj = rJzmj;
        this.rLdmj = rLdmj;
        this.rDlmj = rDlmj;
        this.rFzr = rFzr;
        this.rZzdz = rZzdz;
        this.rGsmc = rGsmc;
        this.rFrdb = rFrdb;
        this.rLxr = rLxr;
        this.rLxdh = rLxdh;
        this.rLxdz = rLxdz;
        this.rNote = rNote;
    }

    public ResitentIal() {
        super();
    }

    public String getrEid() {
        return rEid;
    }

    public void setrEid(String rEid) {
        this.rEid = rEid;
    }

    public String getrSsgs() {
        return rSsgs;
    }

    public void setrSsgs(String rSsgs) {
        this.rSsgs = rSsgs;
    }

    public String getrZzbh() {
        return rZzbh;
    }

    public void setrZzbh(String rZzbh) {
        this.rZzbh = rZzbh;
    }

    public String getrZzmc() {
        return rZzmc;
    }

    public void setrZzmc(String rZzmc) {
        this.rZzmc = rZzmc;
    }

    public Float getrZdmj() {
        return rZdmj;
    }

    public void setrZdmj(Float rZdmj) {
        this.rZdmj = rZdmj;
    }

    public Float getrJzmj() {
        return rJzmj;
    }

    public void setrJzmj(Float rJzmj) {
        this.rJzmj = rJzmj;
    }

    public Float getrLdmj() {
        return rLdmj;
    }

    public void setrLdmj(Float rLdmj) {
        this.rLdmj = rLdmj;
    }

    public Float getrDlmj() {
        return rDlmj;
    }

    public void setrDlmj(Float rDlmj) {
        this.rDlmj = rDlmj;
    }

    public String getrFzr() {
        return rFzr;
    }

    public void setrFzr(String rFzr) {
        this.rFzr = rFzr;
    }

    public String getrZzdz() {
        return rZzdz;
    }

    public void setrZzdz(String rZzdz) {
        this.rZzdz = rZzdz;
    }

    public String getrGsmc() {
        return rGsmc;
    }

    public void setrGsmc(String rGsmc) {
        this.rGsmc = rGsmc;
    }

    public String getrFrdb() {
        return rFrdb;
    }

    public void setrFrdb(String rFrdb) {
        this.rFrdb = rFrdb;
    }

    public String getrLxr() {
        return rLxr;
    }

    public void setrLxr(String rLxr) {
        this.rLxr = rLxr;
    }

    public String getrLxdh() {
        return rLxdh;
    }

    public void setrLxdh(String rLxdh) {
        this.rLxdh = rLxdh;
    }

    public String getrLxdz() {
        return rLxdz;
    }

    public void setrLxdz(String rLxdz) {
        this.rLxdz = rLxdz;
    }

    public String getrNote() {
        return rNote;
    }

    public void setrNote(String rNote) {
        this.rNote = rNote;
    }
}