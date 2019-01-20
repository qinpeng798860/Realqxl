package com.zking.real.vegetation.controller;

import com.zking.real.util.AppliUtils;
import com.zking.real.vegetation.model.CleanArrangement;
import com.zking.real.vegetation.service.ICleanArrangementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/arrangement")
@Controller
public class CleanArrangementController extends AppliUtils {

    @Autowired
    private ICleanArrangementService iCleanArrangementService;

    //查询
    @RequestMapping("/queryCleanArrangementPager")
    @ResponseBody
    public Map<String,Object> queryCleanArrangementPager(CleanArrangement cleanArrangement, HttpServletRequest request){
        this.bean.setRequest(request);
        List<Map<String, Object>> arrangement = iCleanArrangementService.queryCleanArrangementPager(cleanArrangement,this.bean);
        this.mapUtils.put("rows", arrangement);
        this.mapUtils.put("total", bean.getTotal());
        return mapUtils;
    }

    //查询
    @RequestMapping("gotoqueryCleanArrangement.shtml")
    public String gotoVegeinfromation(){
        return "vege/arrangement/ListCleanArrangement";
    }


    //删除
    @RequestMapping("/delSingArrangement")
    @ResponseBody
    public Map<String, Object> delSingArrangement(CleanArrangement cleanArrangement) {
        int i = iCleanArrangementService.deleteSingCleanArrangement(cleanArrangement.getrAbm());
        this.mapUtils.put("code",i);
        this.mapUtils.put("message","删除成功");
        return mapUtils;
    }

    //新增清洁安排
    @RequestMapping("/insertArangement")
    @ResponseBody
    public Map<String,Object> insertArangement(CleanArrangement cleanArrangement){
        cleanArrangement.setrAbm(uuidRandom());
        cleanArrangement.setrAid(uuidRandom());
        int insert = iCleanArrangementService.insert(cleanArrangement);
        this.mapUtils.put("code",insert);
        this.mapUtils.put("message","新增安排成功");
        return mapUtils;
    }

    //修改
    @RequestMapping("/updateArrangement")
    @ResponseBody
    public Map<String,Object> updateCleanArrangement(CleanArrangement cleanArrangement){
//        System.out.println("sout");
//        System.out.println(cleanArrangement+"==========");
        int uptArrange = iCleanArrangementService.updateCleanArrangement(cleanArrangement);
        this.mapUtils.put("code",uptArrange);
        this.mapUtils.put("message","修改安排成功");
        return mapUtils;
    }

    //添加页面、修改
    @RequestMapping("gotoArrangementAdd.shtml")
    public String gotoArrangementAdd(CleanArrangement cleanArrangement){
        return "vege/arrangement/adduptArrangement";
    }
}
