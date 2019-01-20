package com.zking.real.system.vo;

import com.zking.real.system.model.Role;


public class RoleModel extends Role {
    private String ModuleId;

    public String getModuleId() {
        return ModuleId;
    }

    public void setModuleId(String moduleId) {
        ModuleId = moduleId;
    }
}
