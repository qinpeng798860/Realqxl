package com.zking.real.server.model;

import lombok.ToString;

@ToString
public class ServerType {
    private String id;

    private String rSsgs;

    private String rLxmc;

    private Float rDj;

    private String rNote;

    private String rStatus;

    public String getrStatus() {
        return rStatus;
    }

    public void setrStatus(String rStatus) {
        this.rStatus = rStatus;
    }

    public ServerType(String id, String rSsgs, String rLxmc, Float rDj, String rNote, String rStatus) {
        this.id = id;
        this.rSsgs = rSsgs;
        this.rLxmc = rLxmc;
        this.rDj = rDj;
        this.rNote = rNote;
        this.rStatus = rStatus;
    }

    public ServerType() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getrSsgs() {
        return rSsgs;
    }

    public void setrSsgs(String rSsgs) {
        this.rSsgs = rSsgs;
    }

    public String getrLxmc() {
        return rLxmc;
    }

    public void setrLxmc(String rLxmc) {
        this.rLxmc = rLxmc;
    }

    public Float getrDj() {
        return rDj;
    }

    public void setrDj(Float rDj) {
        this.rDj = rDj;
    }

    public String getrNote() {
        return rNote;
    }

    public void setrNote(String rNote) {
        this.rNote = rNote;
    }
}