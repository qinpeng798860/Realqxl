package com.zking.real.server.controller;

import com.zking.real.server.model.Server;
import com.zking.real.server.service.IServerService;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务信息
 */
@RequestMapping("server")
@Controller
public class ServerController extends AppliUtils {
    @Autowired
    private IServerService iServerService;


    /**
     * 前往新增服务页面
     * @return
     */
    @RequestMapping("gotoInfoServer")
    public String gotoServer(){

        return "/server/infoServer";
    }
    /**
     * 新增服务信息
     * @return
     */
    @RequestMapping("insertServer")
    @ResponseBody
    public Map<String,Object> insertServer(Server server){
        int insert = iServerService.insert(server);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code",insert);
        map.put("message","服务新增成功");
        return map;
    }
    /**
     * 查询服务信息
     * @return
     */
    @RequestMapping("queryServer")
    @ResponseBody
    public List<Server> queryServerPager(Server server, HttpServletRequest request){
        this.bean.setRequest(request);
        List<Server> servers = iServerService.queryModelPager(server,this.bean);

        return servers;
    }
}
