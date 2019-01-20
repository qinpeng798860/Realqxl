package com.zking.real.server.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Allot implements Serializable{
    private String rAllid;

    private String rFwbm;

    private String rFzr;

    private String rGsbm;

    public Allot(String rAllid, String rFwbm, String rFzr, String rGsbm) {
        this.rAllid = rAllid;
        this.rFwbm = rFwbm;
        this.rFzr = rFzr;
        this.rGsbm = rGsbm;
    }

    public Allot() {
        super();
    }

    public String getrAllid() {
        return rAllid;
    }

    public void setrAllid(String rAllid) {
        this.rAllid = rAllid;
    }

    public String getrFwbm() {
        return rFwbm;
    }

    public void setrFwbm(String rFwbm) {
        this.rFwbm = rFwbm;
    }

    public String getrFzr() {
        return rFzr;
    }

    public void setrFzr(String rFzr) {
        this.rFzr = rFzr;
    }

    public String getrGsbm() {
        return rGsbm;
    }

    public void setrGsbm(String rGsbm) {
        this.rGsbm = rGsbm;
    }
}