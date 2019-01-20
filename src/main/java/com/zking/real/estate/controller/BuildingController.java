package com.zking.real.estate.controller;

import com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerOutput;
import com.zking.real.estate.model.Building;
import com.zking.real.estate.model.Unit;
import com.zking.real.estate.service.IBuildingService;
import com.zking.real.estate.service.IUnitService;
import com.zking.real.util.AppliUtils;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequestMapping("/building")
@Controller
public class BuildingController extends AppliUtils {
    @Autowired
    IBuildingService buildingService;

    @Autowired
    IUnitService unitService;


    @RequestMapping("/queryListBuilding.shtml")
    public String toqueryListBuildong(Model model, HttpServletRequest request) {
        String zzbh = request.getParameter("zzbh");
        request.getSession().setAttribute("zzbh", zzbh);
        return "estate/queryListBuilding";

    }

    @RequestMapping("/addBuilding.shtml")
    public String toAddBuikding(Model model,HttpServletRequest request){


        return "estate/AddBuilding";
    }

    @RequestMapping("/updateBuilding.shtml")
    public String toUpdateBuilding(Model model,Building building, HttpServletRequest request){

        String lybh = request.getParameter("lybh");
        System.out.println("获取到的楼宇编号："+lybh);
        request.getSession().setAttribute("lybh",lybh);
        building.setLybm(lybh);

        System.out.println("赋值楼宇编号的楼宇实体:"+building);
        Building building1 = buildingService.querySingBuilding(building);
        System.out.println("查询到的楼宇："+building1);
        request.getSession().setAttribute("buidings",building1);
        return "estate/updateBuilding";
    }

    @RequestMapping("/addBuilding")
    @ResponseBody
    public Map<String,Object> addBuilding(HttpServletRequest request,Building building){
        System.out.println("来了");
        building.setLybm(UUID.randomUUID().toString().replace("-",""));
        int i = buildingService.addBuilding(building);
        if(i>0){
            this.mapUtils.put("message","添加成功");
        }else{
            this.mapUtils.put("message","添加失败");

        }



        return this.mapUtils;
    }


    @RequestMapping("/queryListBuilding")
    @ResponseBody
    public Map<String, Object> queryListBuilding(Building building, HttpServletRequest req) {

        Object zzbh = req.getSession().getAttribute("zzbh");

        building.setZzbh(zzbh.toString());
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<Building> buildings = buildingService.queryListBuilding(building, pageBean);

        this.mapUtils.put("rows", buildings);
        this.mapUtils.put("total", pageBean.getTotal());

        return this.mapUtils;
    }

    @RequestMapping("/delBuilding")
    @ResponseBody
    public Map<String,Object> delBuilding(Building building, HttpServletRequest request) {
        System.out.println("删除的信息："+building);

        Unit unit = new Unit();
        unit.setLybh(building.getLybm());
        Unit unit1 = unitService.querySingUnit(unit);
        if(null!=unit1&&!"".equals(unit1)){
            this.mapUtils.put("message","删除失败，该楼宇下有单元信息无法删除");
        }else{
            int i = buildingService.delBuilding(building);
            this.mapUtils.put("message","删除成功");

        }
        return this.mapUtils;
    }

    @RequestMapping("/updateBuilding")
    @ResponseBody
    public Map<String,Object> updateBuilding(Building building,HttpServletRequest req){
        Object lybh = req.getSession().getAttribute("lybh");
        building.setLybm(lybh.toString());
        int i = buildingService.updateBuilding(building);
        if(i>0){
            this.mapUtils.put("message","保存成功");

        }else{

            this.mapUtils.put("message","保存失败");
        }


            return this.mapUtils;
    }
}
