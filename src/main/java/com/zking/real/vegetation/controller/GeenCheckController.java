package com.zking.real.vegetation.controller;

import com.zking.real.util.AppliUtils;
import com.zking.real.vegetation.model.GeenCheck;
import com.zking.real.vegetation.service.IGeenCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/check")
@Controller
public class GeenCheckController extends AppliUtils {

    @Autowired
    private IGeenCheckService iGeenCheckService;


    //查询植被
    @RequestMapping("/queryGeenCheckPager")
    @ResponseBody
    public Map<String,Object> queryGeenCheckPager(GeenCheck geenCheck, HttpServletRequest request){
        this.bean.setRequest(request);
        List<Map<String, Object>> Check = iGeenCheckService.queryGeenCheckPager(geenCheck,this.bean);
        this.mapUtils.put("rows", Check);
        this.mapUtils.put("total", bean.getTotal());
        return mapUtils;
    }

    //查询
    @RequestMapping("gotoListGeenCheck.shtml")
    public String gotoListGeenSet(){
        return "vege/check/ListGeenCheck";
    }


    //删除
    @RequestMapping("/deleteSingGeenCheck")
    @ResponseBody
    public Map<String, Object> deleteSingGeenCheck(GeenCheck geenCheck) {
        int i = iGeenCheckService.deleteSingGeenCheck(geenCheck.getrCbm());
        this.mapUtils.put("code",i);
        this.mapUtils.put("message","删除成功");
        return mapUtils;
    }

    //新增植被
    @RequestMapping("/insertGeenCheck")
    @ResponseBody
    public Map<String,Object> insertGeenCheck(GeenCheck geenCheck){
//        System.out.println(geenCheck+"====");
        geenCheck.setrCbm(uuidRandom());

//        System.out.println(geenCheck.getrClvmc()+"==================================");
        int insert = iGeenCheckService.insert(geenCheck);
        this.mapUtils.put("code",insert);
        this.mapUtils.put("message","新增绿化设置成功");
        return mapUtils;
    }

    //修改
    @RequestMapping("/updateGeenCheck")
    @ResponseBody
    public Map<String,Object> updateGeenSet(GeenCheck geenCheck){
//        System.out.println("sout");
//        System.out.println(vegeinfrom+"==========");
        int uptGeenSet = iGeenCheckService.updateGeenCheck(geenCheck);
        this.mapUtils.put("code",uptGeenSet);
        this.mapUtils.put("message","修改绿化设置成功");
        return mapUtils;
    }

    //添加页面、修改
    @RequestMapping("gotoGeenCheckAdd.shtml")
    public String gotoGeenCheckAdd(GeenCheck geenCheck){
        return "vege/check/adduptGeenCheck";
    }
}
