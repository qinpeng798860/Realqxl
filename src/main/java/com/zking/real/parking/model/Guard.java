package com.zking.real.parking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import java.util.Date;
@ToString
public class Guard {
    private String rId;
    private String rSsgs;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date rKssj;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date rJssj;

    private String rBc;

    private String rSd;

    private String rDd;

    private String rGw;

    private String rZbry;

    private String rNote;

    public Guard(String rId, String rSsgs, Date rKssj, Date rJssj, String rBc, String rSd, String rDd, String rGw, String rZbry, String rNote) {
        this.rId = rId;
        this.rSsgs = rSsgs;
        this.rKssj = rKssj;
        this.rJssj = rJssj;
        this.rBc = rBc;
        this.rSd = rSd;
        this.rDd = rDd;
        this.rGw = rGw;
        this.rZbry = rZbry;
        this.rNote = rNote;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public Guard() {
        super();
    }

    public String getrSsgs() {
        return rSsgs;
    }

    public void setrSsgs(String rSsgs) {
        this.rSsgs = rSsgs;
    }

    public Date getrKssj() {
        return rKssj;
    }

    public void setrKssj(Date rKssj) {
        this.rKssj = rKssj;
    }

    public Date getrJssj() {
        return rJssj;
    }

    public void setrJssj(Date rJssj) {
        this.rJssj = rJssj;
    }

    public String getrBc() {
        return rBc;
    }

    public void setrBc(String rBc) {
        this.rBc = rBc;
    }

    public String getrSd() {
        return rSd;
    }

    public void setrSd(String rSd) {
        this.rSd = rSd;
    }

    public String getrDd() {
        return rDd;
    }

    public void setrDd(String rDd) {
        this.rDd = rDd;
    }

    public String getrGw() {
        return rGw;
    }

    public void setrGw(String rGw) {
        this.rGw = rGw;
    }

    public String getrZbry() {
        return rZbry;
    }

    public void setrZbry(String rZbry) {
        this.rZbry = rZbry;
    }

    public String getrNote() {
        return rNote;
    }

    public void setrNote(String rNote) {
        this.rNote = rNote;
    }
}