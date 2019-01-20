package com.zking.real.server.controller;

import com.zking.real.server.model.Allot;
import com.zking.real.server.model.Server;
import com.zking.real.server.service.IAllotService;
import com.zking.real.server.service.IServerService;
import com.zking.real.server.vo.ServerVo;
import com.zking.real.system.model.Model;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @Autowired
    private IAllotService iAllotService;


    /**
     * 前往服务信息页面
     * @return
     */
    @RequestMapping("gotoInfoServer.shtml")
    public String gotoServer(){

        return "/server/infoServer";
    }
    /**
     * 前往新增服务页面
     * @return
     */
    @RequestMapping("gotoaddServer.shtml")
    public String gotoaddServer(){

        return "/server/infoServer/addServer";
    }
    /**
     * 新增服务信息
     * @return
     */
    @RequestMapping("insertServer")
    @ResponseBody
    public Map<String,Object> insertServer(Server server, @RequestParam String createDate) throws ParseException {
        Date date = this.DateFormat(createDate);
        server.setrSqsj(date);
        server.setrZt(1+"");
        server.setId(this.uuidRandom());
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
    public Map<String, Object> queryServerPager(Server server, HttpServletRequest request){
        this.bean.setRequest(request);
        List<ServerVo> servers = iServerService.queryModelPager(server,this.bean);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", servers);
        map.put("total", bean.getTotal());
        return map;
    }
    /**
     * 删除服务信息
     * @return
     */
    @RequestMapping("delServer")
    @ResponseBody
    public Map<String,Object> delServer(Server server){
        int i = iServerService.delServer(server);
        this.mapUtils.put("code", i);
        this.mapUtils.put("message","删除成功");
            return this.mapUtils;
    }

    /**
     * 审核通过
     * @param server
     * @return
     */
    @RequestMapping("updateServerZt")
    @ResponseBody
    public Map<String,Object> updateServerZt(Server server){
        int i = iServerService.updateServerZt(server);
        this.mapUtils.put("code", i);
        this.mapUtils.put("message","审核通过");
        return this.mapUtils;
    }


    /**
     * 前往分配
     *
     * @return
     */
    @RequestMapping("allotServer.shtml")
    public String allotServer(ServerVo serverVo, org.springframework.ui.Model model){
        model.addAttribute("server", serverVo);

        return "server/infoServer/allotServer";
    }


   /**
     * 分配成功 添加数据进入分配表
     *
     * @return
     */
    @RequestMapping("addallotServer")
    @ResponseBody
    public Map<String, Object> addallotServer(Allot allot,@RequestParam float rDj){
        allot.setrAllid(uuidRandom());
        allot.setrFzr(1+"");//负责人 当前登陆人的id
        int insert = iAllotService.insert(allot);
        this.mapUtils.put("code",insert);
        this.mapUtils.put("message","分配成功");
        Server server = new Server();
        server.setrZt(3+"");
        server.setId(allot.getrFwbm());
        server.setrFwfy(rDj);
        server.setrSsgs(allot.getrGsbm());
        iServerService.updateManageServerZt(server);
        iServerService.updateServerFy(server);
        return this.mapUtils;
    }


    /**
     * 前往服务办理
     * @return
     */
    @RequestMapping("gotomanageServer")
    public String gotomanageServer(){
        return "server/manageServer";
    }



}
