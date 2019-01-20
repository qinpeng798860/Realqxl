package com.zking.real.vegetation.controller;

import com.zking.real.owner.model.Owner;
import com.zking.real.util.AppliUtils;
import com.zking.real.util.PageBean;
import com.zking.real.vegetation.model.Vegeinfrom;
import com.zking.real.vegetation.service.IVegeinfromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/vege")
@Controller
public class VegeinfromController extends AppliUtils {

    @Autowired
    private IVegeinfromService iVegeinfromService;


    //查询植被
    @RequestMapping("/queryVegeinfromPager")
    @ResponseBody
    public Map<String,Object> queryVegeinfromPager(Vegeinfrom vegeinfrom, HttpServletRequest request){
        this.bean.setRequest(request);
        List<Map<String, Object>> vege = iVegeinfromService.queryVegeinfromPager(vegeinfrom,this.bean);
        this.mapUtils.put("rows", vege);
        this.mapUtils.put("total", bean.getTotal());
        return mapUtils;
    }

    //查询
    @RequestMapping("gotoVegeinfromation.shtml")
    public String gotoVegeinfromation(){
        return "/vege/vegeinfromation";
    }


    //删除
    @RequestMapping("/delSingVege")
    @ResponseBody
    public Map<String, Object> delSingVege(Vegeinfrom vegeinfrom) {
        int i = iVegeinfromService.deleteSingVegeinfrom(vegeinfrom.getrZbbm());
        this.mapUtils.put("code",i);
        this.mapUtils.put("message","删除成功");
        return mapUtils;
    }

    //新增植被
    @RequestMapping("/insertVege")
    @ResponseBody
    public Map<String,Object> insertVege(Vegeinfrom vegeinfrom){
        vegeinfrom.setrZbbm(uuidRandom());
        int insert = iVegeinfromService.insert(vegeinfrom);
        this.mapUtils.put("code",insert);
        this.mapUtils.put("message","新增植被成功");
        return mapUtils;
    }

    //修改
    @RequestMapping("/updateVege")
    @ResponseBody
    public Map<String,Object> updateVege(Vegeinfrom vegeinfrom){
//        System.out.println("sout");
//        System.out.println(vegeinfrom+"==========");
        int uptVege = iVegeinfromService.updateVegeinfrom(vegeinfrom);
        this.mapUtils.put("code",uptVege);
        this.mapUtils.put("message","修改植被成功");
        return mapUtils;
    }

    //添加页面、修改
    @RequestMapping("gotoVegeAdd.shtml")
    public String gotoaddVege(Vegeinfrom vegeinfrom){
        return "/vege/addupdVegeinfrom";
    }


}
