package com.zking.real.system.controller;

import com.zking.real.system.model.SystemLog;
import com.zking.real.system.service.ISystemLog;
import com.zking.real.system.vo.SystemLogVo;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("systemLog")
@Controller
public class SystemLogController extends AppliUtils {
    @Autowired
    private ISystemLog iSystemLogService;


    /**
     * 前往日志首页
     * @return
     */
    @RequestMapping("gotoSystemlog")
    public String gotoSystemlog(){

        return "system/log/systemLog";
    }


    /**
     * 日志查询
     * @return
     */
    @RequestMapping("querySystemLog")
    @ResponseBody
    public Map<String, Object> querySystemLog(@RequestParam String dateA,@RequestParam String dateB,HttpServletRequest request) throws ParseException {
        this.bean.setRequest(request);
        SystemLogVo systemLogVo = new SystemLogVo();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("dateA", dateA);
        params.put("dateB", dateB);
        systemLogVo.setMap(params);

        List<SystemLog> systemLogs = iSystemLogService.queryLogPager(systemLogVo, this.bean);

        this.mapUtils.put("rows", systemLogs);
        this.mapUtils.put("total", this.bean.getTotal());

        return this.mapUtils;
    }






}
