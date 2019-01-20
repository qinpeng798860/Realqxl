package com.zking.real.estate.controller;

import com.fasterxml.jackson.databind.Module;
import com.zking.real.estate.model.Building;
import com.zking.real.estate.model.Residential;
import com.zking.real.estate.service.IBuildingService;
import com.zking.real.estate.service.IResidentialService;
import com.zking.real.util.AppliUtils;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/estate")
@Controller
public class EstateController extends AppliUtils {
    @Autowired
    private IResidentialService residentialService;
    @Autowired
    private IBuildingService buildingService;


    @RequestMapping("/addHomes.shtml")
    public String addHome() {

        return "estate/AddHomes";
    }

    @RequestMapping("/updateHonmes.shtml")
    public String updateHonmes() {

        return "estate/updateHomes";
    }


    @RequestMapping("/HomesMaintenance.shtml")

    public String HomesMaintenance() {

        return "estate/HomesMaintenance";
    }

    @RequestMapping("/addHomes")
    public int addHomes(Residential residential) {

        return residentialService.addHomes(residential);

    }

    @RequestMapping("/queryListResidential")
    @ResponseBody
    public Map<String, Object> queryListResidential(Residential residential, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Residential> residentials = residentialService.queryListResidential(residential, pageBean);
        this.mapUtils.put("rows", residentials);
        this.mapUtils.put("total", this.bean.getTotal());
        return this.mapUtils;
    }

    @RequestMapping("/delResidential")
    @ResponseBody
    public Map<String, Object> delResidential(Residential residential, HttpServletRequest request) {
        String zzbh1 = request.getParameter("zzbh");
        Building building = new Building();
        residential.setrZzbh(zzbh1);

        if (null != zzbh1 && !"".equals(zzbh1)) {
            building.setZzbh(zzbh1);

        } else {
            building.setZzbh(residential.getrZzbh());

        }
        String zzbh = building.getZzbh();
        System.out.println("住宅编号：" + zzbh);
        List<Building> buildings = buildingService.queryListBuilding(building, null);
        for (Building building1 : buildings) {
            System.out.println("住宅信息：" + building1);

        }

        if (null != buildingService.queryListBuilding(building, null) && buildingService.queryListBuilding(building, null).size() != 0) {

            this.mapUtils.put("message", "删除失败,此住宅下已有楼宇信息！");
        } else {
            int i = residentialService.DelResidential(residential);
            this.mapUtils.put("message", "删除成功");

        }


        return this.mapUtils;
    }


}
