package com.zking.real.system.vo;

import com.zking.real.system.model.User;

public class UserVo extends User {
    private String rolename;

    private String roleid;


    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
