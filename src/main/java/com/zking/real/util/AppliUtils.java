package com.zking.real.util;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AppliUtils {
    /**
     * 分页Pagebean
     */
    protected PageBean bean = new PageBean();

    /**
     * 处理结果码
     */
    protected Map<String, Object> mapUtils = new HashMap<String, Object>();

    /**
     * 生成32位的id
     * @return
     */
    public static String uuidRandom(){
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }




}
