package com.zking.real.parking.controller;

import com.github.pagehelper.Page;
import com.zking.real.parking.mapper.ParkingMapper;
import com.zking.real.parking.model.Parking;
import com.zking.real.parking.service.IParkingService;
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

@RequestMapping("/parking")
@Controller
public class ParkingController extends AppliUtils {
    @Autowired
    private IParkingService parkingService;

    @RequestMapping("/ParkingList.shtml")
    public String parkingList() {


        return "parking/parkingList";
    }

    @RequestMapping("/addParking.shtml")
    public String addParking(){


        return "parking/addParking";
    }
    @RequestMapping("/updateParking.shtml")
    public String updateParking(HttpServletRequest request){

        String cwbh = request.getParameter("cwbh");
        System.out.println("编码："+cwbh);
        Parking parking = new Parking();
        parking.setCwbh(cwbh);
        Parking parking3 = parkingService.querySingParking(parking);

        request.getSession().setAttribute("parking",parking3);

        return "parking/updateParking";

    }



    @RequestMapping("/queryParkingPage")
    @ResponseBody
    public Map<String, Object> queryParkingPage(Parking parking, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Parking> parkings = parkingService.queryParkingPage(parking, pageBean);

        this.mapUtils.put("rows",parkings);
        this.mapUtils.put("total",pageBean.getTotal());
        return this.mapUtils;
    }

    @RequestMapping("/updateParkingssss")
    @ResponseBody
    public Map<String,Object> updateParking(Parking parking){
       System.out.println(parking);
        int i = parkingService.updateParking(parking);
        if(i>0){
            this.mapUtils.put("message","修改成功");
        }else{
            this.mapUtils.put("message","修改失败");

        }
        return  this.mapUtils;
    }
    @RequestMapping("/addParking")
    @ResponseBody
    public  Map<String,Object> addParking(Parking parking){
        parking.setCwbh(UUID.randomUUID().toString().replace("-",""));



        if(null==parking.getNote()&&"".equals(parking.getNote())){
                parking.setNote("无");
        }
        parking.setSsfc("金钟房产");
        parking.setGsbh("1");
        int insert = parkingService.insert(parking);
        if(insert>0){
            this.mapUtils.put("message","添加成功");
        }else{

            this.mapUtils.put("message","添加失败");
        }
        return this.mapUtils;
    }

    @RequestMapping("/delParkingss")
    @ResponseBody
    public Map<String,Object> delParking(Parking parking){
        System.out.println("删除信息："+parking);
        int i = parkingService.delParking(parking);
        if(i>0){
            this.mapUtils.put("message","删除成功");
        }else {

            this.mapUtils.put("message","删除失败");
        }


        return this.mapUtils;

    }



}
