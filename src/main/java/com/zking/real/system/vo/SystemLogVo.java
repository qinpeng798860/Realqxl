package com.zking.real.system.vo;

import com.zking.real.system.model.SystemLog;

import java.util.HashMap;
import java.util.Map;

public class SystemLogVo extends SystemLog {
    private Map<String, Object> map = new HashMap<String, Object>();

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
