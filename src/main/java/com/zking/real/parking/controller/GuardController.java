package com.zking.real.parking.controller;

import com.zking.real.parking.model.Guard;
import com.zking.real.parking.service.IGuardService;
import com.zking.real.util.AppliUtils;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/guard")
@Controller
public class GuardController extends AppliUtils {
    @Autowired
    IGuardService guardService;

    @RequestMapping("/queryGuardList.shtml")
    public String toQueryGuardList(){

        return "parking/parkingGurdList";
    }


    @RequestMapping("/updateGuard.shtml")
    public String updateGurad(HttpServletRequest request,Guard guard){
        String rid = request.getParameter("rid");
        guard.setrId(rid);
        Guard guard1 = guardService.querySingGurad(guard);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
         ParsePosition pos = new ParsePosition(0);
         Date strtodate = formatter.parse(guard1.getrKssj().toString(), pos);
        System.out.println("转换后的时间格式："+strtodate);
        System.out.println("单个信息："+guard1);
        request.getSession().setAttribute("guards",guard1);
        return "parking/updateGuard";
    }
    @RequestMapping("/queryGuradList")
    @ResponseBody
    public Map<String,Object> queryGuardList(Guard guard, HttpServletRequest request){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Guard> guards = guardService.queryGuarList(guard, pageBean);
        this.mapUtils.put("rows",guards);
        this.mapUtils.put("total",pageBean.getTotal());
        return this.mapUtils;
    }


    @RequestMapping("/updateGurad")
    @ResponseBody
    public Map<String,Object> updateGurad(Guard guard){
        int i = guardService.updateGuard(guard);
        if(i>0){
            this.mapUtils.put("message","保存成功");
        }else{
            this.mapUtils.put("message","保存失败");
        }
        return this.mapUtils;
    }










}
