package com.zking.real.server.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@ToString
public class ManageServer implements Serializable {
    private String rBlid;

    private String rSerid;

    private String rBlr;

    private String rBldw;

    private String rLxdh;

    private Date rBlsj;

    private Date rJssj;

    private String rBljg;

    private String rFj;

    public ManageServer(String rBlr, String rBldw, String rLxdh, Date rBlsj, Date rJssj, String rBljg, String rFj) {
        this.rBlr = rBlr;
        this.rBldw = rBldw;
        this.rLxdh = rLxdh;
        this.rBlsj = rBlsj;
        this.rJssj = rJssj;
        this.rBljg = rBljg;
        this.rFj = rFj;
    }

    public String getrSerid() {
        return rSerid;
    }

    public void setrSerid(String rSerid) {
        this.rSerid = rSerid;
    }

    public String getrBlid() {
        return rBlid;
    }

    public void setrBlid(String rBlid) {
        this.rBlid = rBlid;
    }

    public ManageServer() {
        super();
    }

    public String getrBlr() {
        return rBlr;
    }

    public void setrBlr(String rBlr) {
        this.rBlr = rBlr;
    }

    public String getrBldw() {
        return rBldw;
    }

    public void setrBldw(String rBldw) {
        this.rBldw = rBldw;
    }

    public String getrLxdh() {
        return rLxdh;
    }

    public void setrLxdh(String rLxdh) {
        this.rLxdh = rLxdh;
    }

    public Date getrBlsj() {
        return rBlsj;
    }

    public void setrBlsj(Date rBlsj) {
        this.rBlsj = rBlsj;
    }

    public Date getrJssj() {
        return rJssj;
    }

    public void setrJssj(Date rJssj) {
        this.rJssj = rJssj;
    }

    public String getrBljg() {
        return rBljg;
    }

    public void setrBljg(String rBljg) {
        this.rBljg = rBljg;
    }

    public String getrFj() {
        return rFj;
    }

    public void setrFj(String rFj) {
        this.rFj = rFj;
    }
}