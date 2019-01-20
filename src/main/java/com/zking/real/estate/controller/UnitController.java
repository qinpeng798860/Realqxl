package com.zking.real.estate.controller;


import com.zking.real.estate.model.Room;
import com.zking.real.estate.model.Unit;
import com.zking.real.estate.service.IRoomService;
import com.zking.real.estate.service.IUnitService;
import com.zking.real.util.AppliUtils;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequestMapping("/unit")
@Controller
public class UnitController extends AppliUtils {

    @Autowired
    IUnitService unitService;

    @Autowired
    IRoomService roomService;


    @RequestMapping("/queryListUnit.shtml")
    public String toQueryListUnit(HttpServletRequest request){
        String lybh = request.getParameter("lybh");


        request.getSession().setAttribute("lybh",lybh);


        return "estate/queryListUint";
    }
    @RequestMapping("/addUnit.shtml")
    public String toAddUnit(HttpServletRequest request){
        Object lybh = request.getSession().getAttribute("lybh");
        request.setAttribute("lybh",lybh);
        return "estate/AddUnit";
    }
    @RequestMapping("/updateUnit.shtml")
    public String toupdateUnit(HttpServletRequest req){
        String dybh = req.getParameter("dybh");
        System.out.println("查询单个单元信息:"+dybh);

        req.setAttribute("dybh",dybh);
        Unit unit = new Unit();
        unit.setDybm(dybh);
        Unit unit1 = unitService.querySingUnit(unit);
        req.getSession().setAttribute("units",unit1);


        return "estate/updateUnit";
    }



    @RequestMapping("/queryListUnit")
    @ResponseBody
    public Map<String,Object> queryListUnit(HttpServletRequest request, Unit unit){

        Object lybh = request.getSession().getAttribute("lybh");
        unit.setLybh(lybh.toString());
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Unit> units = unitService.queryListUnit(unit, pageBean);
        this.mapUtils.put("rows",units);
        this.mapUtils.put("total",pageBean.getTotal());
        return this.mapUtils;
    }
    @RequestMapping("/addUnit")
    @ResponseBody
    public Map<String,Object> addUnit(Unit unit){
        System.out.println("添加信息："+unit);
        unit.setDybm(UUID.randomUUID().toString().replace("-",""));
        int i = unitService.addUnit(unit);

        if(i>0){
            this.mapUtils.put("message","添加成功");
        }else{
            this.mapUtils.put("message","添加失败");
        }


        return  this.mapUtils;
    }

    @RequestMapping("/updateUnit")
    @ResponseBody
    public Map<String,Object> updateUnit(Unit unit){

        System.out.println("修改单元："+unit);
        int i = unitService.updateUnit(unit);
        if(i>0){
            this.mapUtils.put("message","保存成功");
        }else{
            this.mapUtils.put("message","保存失败");
        }


        return this.mapUtils;

    }
    @RequestMapping("/delUnit")
    @ResponseBody
    public Map<String,Object> delUnit(Unit unit){
        Room room = new Room();
        unit.setLybh(unit.getDybm());
        List<Room> rooms = roomService.queryListRoom(room, null);
        if(null!=rooms&&!"".equals(rooms)){
            this.mapUtils.put("message","删除失败，该楼宇下有单元信息无法删除");
        }else{
            unitService.delUnit(unit);
            this.mapUtils.put("message","删除成功");

        }
        return this.mapUtils;
    }




}
