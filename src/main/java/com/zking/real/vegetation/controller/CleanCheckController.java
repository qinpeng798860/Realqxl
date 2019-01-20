package com.zking.real.vegetation.controller;

import com.zking.real.util.AppliUtils;
import com.zking.real.vegetation.model.CleanCheck;
import com.zking.real.vegetation.service.ICleanCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/Cleancheck")
@Controller
public class CleanCheckController extends AppliUtils{

    @Autowired
    private ICleanCheckService iCleanCheckService;

    //查询植被
    @RequestMapping("/queryCleanCheckPager")
    @ResponseBody
    public Map<String,Object> queryCleanCheckPager(CleanCheck cleanCheck, HttpServletRequest request){
        this.bean.setRequest(request);
        List<Map<String, Object>> Ch = iCleanCheckService.queryCleanCheckPager(cleanCheck,this.bean);
        this.mapUtils.put("rows", Ch);
        this.mapUtils.put("total", bean.getTotal());
        return mapUtils;
    }

    //查询
    @RequestMapping("gotoListCleanCheck.shtml")
    public String gotoListGeenSet(){
        return "vege/cleancheck/ListCleanCheck";
    }


    //删除
    @RequestMapping("/deleteSingCleanCheck")
    @ResponseBody
    public Map<String, Object> deleteSingCleanCheck(CleanCheck cleanCheck) {
        int i = iCleanCheckService.deleteSingCleanCheck(cleanCheck.getrQbm());
        this.mapUtils.put("code",i);
        this.mapUtils.put("message","删除成功");
        return mapUtils;
    }

    //新增植被
    @RequestMapping("/insertCleanCheck")
    @ResponseBody
    public Map<String,Object> insertCleanCheck(CleanCheck cleanCheck){
        cleanCheck.setrQbm(uuidRandom());
        int insert = iCleanCheckService.insert(cleanCheck);
        this.mapUtils.put("code",insert);
        this.mapUtils.put("message","新增检查纪录成功");
        return mapUtils;
    }

    //修改
    @RequestMapping("/updateCleanCheck")
    @ResponseBody
    public Map<String,Object> updateCleanCheck(CleanCheck cleanCheck){
//        System.out.println("sout");
//        System.out.println(vegeinfrom+"==========");
        int updCleanCheck = iCleanCheckService.updateCleanCheck(cleanCheck);
        this.mapUtils.put("code",updCleanCheck);
        this.mapUtils.put("message","修改检查记录成功");
        return mapUtils;
    }

    //添加页面、修改
    @RequestMapping("gotoCleanCheckAdd.shtml")
    public String gotoCleanCheckAdd(CleanCheck cleanCheck){
        return "vege/cleancheck/adduptCleanCheck";
    }
}
