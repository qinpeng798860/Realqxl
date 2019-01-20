package com.zking.real.server.controller;

import com.zking.real.server.model.ServerType;
import com.zking.real.server.service.IServerTypeService;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务类型
 */
@RequestMapping("serverType")
@Controller
public class ServerTypeController extends AppliUtils{
    @Autowired
    private IServerTypeService iServerTypeService;

    /**
     * 前往服务类型页面
     * @return
     */
    @RequestMapping("gotoServerType")
    public  String gotoServerType(){
        return "server/typeServer";
    }

    /**
     * 前往编辑和新增类型页面
     *
     * @return
     */
    @RequestMapping("gotoEditServer")
    public String gotoEditServer(ServerType serverType, Model model) {
        System.out.println(serverType);

        model.addAttribute("serverType", serverType);

        return "server/typeServer/editServer";
    }

    /**
     * 分页查询服类型信息
     * @param serverType
     * @return
     */
    @RequestMapping("queryServerType")
    @ResponseBody
    public Map<String, Object> queryServerType(ServerType serverType, HttpServletRequest request){
        this.bean.setRequest(request);
        List<Map<String,Object>> serverTypes = iServerTypeService.queryServerTypePager(serverType,this.bean);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", serverTypes);
        map.put("total", bean.getTotal());
        return map;
    }
   /**
     * 新增服类型信息
     * @param serverType
     * @return
     */
    @RequestMapping("addServerType")
    @ResponseBody
    public Map<String, Object> addServerType(ServerType serverType, HttpServletRequest request){
        serverType.setId(uuidRandom());
        serverType.setrStatus(1+"");
        System.out.println(serverType);
        int insert = iServerTypeService.insert(serverType);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", insert);
        map.put("message", "新增成功");
        return map;
    }

    /**
     * 修改服务类型信息
     * @param serverType
     * @return
     */
    @RequestMapping("updateServerType")
    @ResponseBody
    public Map<String, Object> updateServerType(ServerType serverType){
//        System.out.println(serverType);

        int insert = iServerTypeService.updateServerType(serverType);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", insert);
        map.put("message", "修改成功");
        return map;
    }

}
