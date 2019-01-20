package com.zking.real.vegetation.controller;

import com.zking.real.util.AppliUtils;
import com.zking.real.vegetation.model.GeenSet;
import com.zking.real.vegetation.service.IGeenSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/geen")
@Controller
public class GeenSetController extends AppliUtils {

    @Autowired
    private IGeenSetService iGeenSetService;


    //查询植被
    @RequestMapping("/queryGeenSetPager")
    @ResponseBody
    public Map<String,Object> queryGeenSetPager(GeenSet geenSet, HttpServletRequest request){
        this.bean.setRequest(request);
        List<Map<String, Object>> geenset = iGeenSetService.queryGeenSetPager(geenSet,this.bean);
        this.mapUtils.put("rows", geenset);
        this.mapUtils.put("total", bean.getTotal());
        return mapUtils;
    }

    //查询
    @RequestMapping("gotoListGeenSet.shtml")
    public String gotoListGeenSet(){
        return "vege/GeenSet/ListGeenSet";
    }


    //删除
    @RequestMapping("/deleteSingGeenSet")
    @ResponseBody
    public Map<String, Object> deleteSingGeenSet(GeenSet geenSet) {
        int i = iGeenSetService.deleteSingGeenSet(geenSet.getrGbm());
        this.mapUtils.put("code",i);
        this.mapUtils.put("message","删除成功");
        return mapUtils;
    }

    //新增绿化设置
    @RequestMapping("/insertGeenSet")
    @ResponseBody
    public Map<String,Object> insertGeenSet(GeenSet geenSet){
        geenSet.setrGbm(uuidRandom());
        geenSet.setrGid(uuidRandom());
        int insert = iGeenSetService.insert(geenSet);
        this.mapUtils.put("code",insert);
        this.mapUtils.put("message","新增绿化设置成功");
        return mapUtils;
    }

    //修改
    @RequestMapping("/updateGeenSet")
    @ResponseBody
    public Map<String,Object> updateGeenSet(GeenSet geenSet){
//        System.out.println("sout");
//        System.out.println(vegeinfrom+"==========");
        int uptGeenSet = iGeenSetService.updateGeenSet(geenSet);
        this.mapUtils.put("code",uptGeenSet);
        this.mapUtils.put("message","修改绿化设置成功");
        return mapUtils;
    }

    //添加页面、修改
    @RequestMapping("gotoGeensetAdd.shtml")
    public String gotoGeensetAdd(GeenSet geenSet){
        return "vege/GeenSet/adduptGeenSet";
    }
}
