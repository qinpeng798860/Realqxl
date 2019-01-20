package com.zking.real.parking.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Parking implements Serializable {
    private String cwbh;

    private String ssfc;

    private String cwlb;

    private String gllb;

    private String cwlx;

    private Float ysjg;

    private Float yzjg;

    private String cwwz;

    private Float cwmj;

    private String zt;

    private String note;
    private String gsbh;

    public Parking(String cwbh, String ssfc, String cwlb, String gllb, String cwlx, Float ysjg, Float yzjg, String cwwz, Float cwmj, String zt, String note, String gsbh) {
        this.cwbh = cwbh;
        this.ssfc = ssfc;
        this.cwlb = cwlb;
        this.gllb = gllb;
        this.cwlx = cwlx;
        this.ysjg = ysjg;
        this.yzjg = yzjg;
        this.cwwz = cwwz;
        this.cwmj = cwmj;
        this.zt = zt;
        this.note = note;
        this.gsbh = gsbh;
    }

    public String getGsbh() {
        return gsbh;
    }

    public void setGsbh(String gsbh) {
        this.gsbh = gsbh;
    }

    public Parking() {
        super();
    }

    public String getCwbh() {
        return cwbh;
    }

    public void setCwbh(String cwbh) {
        this.cwbh = cwbh;
    }

    public String getSsfc() {
        return ssfc;
    }

    public void setSsfc(String ssfc) {
        this.ssfc = ssfc;
    }

    public String getCwlb() {
        return cwlb;
    }

    public void setCwlb(String cwlb) {
        this.cwlb = cwlb;
    }

    public String getGllb() {
        return gllb;
    }

    public void setGllb(String gllb) {
        this.gllb = gllb;
    }

    public String getCwlx() {
        return cwlx;
    }

    public void setCwlx(String cwlx) {
        this.cwlx = cwlx;
    }

    public Float getYsjg() {
        return ysjg;
    }

    public void setYsjg(Float ysjg) {
        this.ysjg = ysjg;
    }

    public Float getYzjg() {
        return yzjg;
    }

    public void setYzjg(Float yzjg) {
        this.yzjg = yzjg;
    }

    public String getCwwz() {
        return cwwz;
    }

    public void setCwwz(String cwwz) {
        this.cwwz = cwwz;
    }

    public Float getCwmj() {
        return cwmj;
    }

    public void setCwmj(Float cwmj) {
        this.cwmj = cwmj;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}