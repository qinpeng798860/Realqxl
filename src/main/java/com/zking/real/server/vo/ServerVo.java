package com.zking.real.server.vo;

import com.zking.real.server.model.Server;
import lombok.ToString;

import java.util.Date;

@ToString
public class ServerVo extends Server {
    //服务id
    private String rFwId;
    //状态id
    private String rZtid;
    //公司id
    private String rGsid;
    //公司联系方式
    private String rLxfs;
    //办理id
    private String rBlid;
    //办理结果
    private String rBljg;
    //办理时间
    private Date rBlsj;
    //结束时间
    private Date rJssj;

    public String getrBljg() {
        return rBljg;
    }

    public void setrBljg(String rBljg) {
        this.rBljg = rBljg;
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

    public String getrBlid() {
        return rBlid;
    }

    public void setrBlid(String rBlid) {
        this.rBlid = rBlid;
    }

    public String getrLxfs() {
        return rLxfs;
    }

    public void setrLxfs(String rLxfs) {
        this.rLxfs = rLxfs;
    }

    public String getrGsid() {
        return rGsid;
    }

    public void setrGsid(String rGsid) {
        this.rGsid = rGsid;
    }

    public String getrFwId() {
        return rFwId;
    }

    public void setrFwId(String rFwId) {
        this.rFwId = rFwId;
    }

    public String getrZtid() {
        return rZtid;
    }

    public void setrZtid(String rZtid) {
        this.rZtid = rZtid;
    }
}
