package com.zking.real.system.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
@ToString
public class SystemLog  implements Serializable{
    private String logid;

    private String logmethod;

    private String logpath;

    private String logparam;

    /*时间格式转换*/
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date logdate;

    private String logcontext;

    public SystemLog(String logid, String logmethod, String logpath, String logparam, Timestamp logdate, String logcontext) {
        this.logid = logid;
        this.logmethod = logmethod;
        this.logpath = logpath;
        this.logparam = logparam;
        this.logdate = logdate;
        this.logcontext = logcontext;
    }

    public SystemLog() {
        super();
    }

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid;
    }

    public String getLogmethod() {
        return logmethod;
    }

    public void setLogmethod(String logmethod) {
        this.logmethod = logmethod;
    }

    public String getLogpath() {
        return logpath;
    }

    public void setLogpath(String logpath) {
        this.logpath = logpath;
    }

    public String getLogparam() {
        return logparam;
    }

    public void setLogparam(String logparam) {
        this.logparam = logparam;
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public String getLogcontext() {
        return logcontext;
    }

    public void setLogcontext(String logcontext) {
        this.logcontext = logcontext;
    }
}