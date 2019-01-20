package com.zking.real.server.controller;

import com.zking.real.server.model.ManageServer;
import com.zking.real.server.model.Server;
import com.zking.real.server.service.IManageServerMapperService;
import com.zking.real.server.service.IServerService;
import com.zking.real.server.vo.ServerVo;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

@Controller
@RequestMapping("serverManage")
public class ServerManageController extends AppliUtils{

    @Autowired
    private IServerService iServerService;
    @Autowired
    private IManageServerMapperService iManageServerMapperService;





    /**
     * 查询服务办理信息
     * @param server
     * @return
     */
    @RequestMapping("queryServerManage")
    @ResponseBody
    public Map<String, Object> queryServerManage(Server server, HttpServletRequest request){
        this.bean.setRequest(request);
        List<ServerVo> serverVos = iServerService.queryManagerPager(server, this.bean);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", serverVos);
        map.put("total", bean.getTotal());
        return map;
    }

    /**
     * 前往办理进度
     * @param server
     * @param model
     * @return
     */
    @RequestMapping("gotoSingServerManage.shtml")
    public String gotoSingServerManage(Server server, Model model){
        ServerVo server1 = iServerService.selectSingManageServer(server);

        model.addAttribute("server", server1);
        return "server/manageServer/editServerManage";
    }


    /**
     * 开始办理
     * @param server
     * @param model
     * @return
     */
   @RequestMapping("addServerManage")
   @ResponseBody
    public Map<String, Object> addServerManage(ManageServer server, Model model) throws ParseException {
        server.setrBlid(uuidRandom());

       Date date2 = SystemnewDate();
       server.setrBlsj(date2);
      int insert = iManageServerMapperService.insert(server);
      if(insert>0){
          Server s = new Server();
          s.setId(server.getrSerid());
          s.setrZt(5+"");
          int i = iServerService.updateManageServerZt(s);
      }
       this.mapUtils.put("code", insert);
       this.mapUtils.put("message","办理成功");
       return this.mapUtils;
    }
    /**
     * 办理成功
     * @param server
     *
     * @return
     */
   @RequestMapping("updateManagebljg")
   @ResponseBody
    public Map<String, Object> updateManagebljg(ManageServer server,@RequestParam String ide) throws ParseException {
       Date date = SystemnewDate();
        server.setrJssj(date);
       int i = iManageServerMapperService.updateManagebljg(server);
       if(i!=-1){
           Server server1 = new Server();
           server1.setrZt(6+"");
           server1.setId(ide);
           int i1 = iServerService.updateManageServerZt(server1);
       }

       this.mapUtils.put("code", i);
       this.mapUtils.put("message","办理成功");
       return this.mapUtils;
    }

 /**
     * 退回重审
     * @param server
     *
     * @return
     */
   @RequestMapping("manageBack")
   @ResponseBody
    public Map<String, Object> manageBack(ServerVo server) throws ParseException {

       int i = iServerService.updateManageServerZt(server);

       int i1 = iServerService.deleteManageServer(server);
       this.mapUtils.put("code", i);
       this.mapUtils.put("message","退回成功");
       return this.mapUtils;
    }








}

