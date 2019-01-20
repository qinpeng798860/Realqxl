package com.zking.real.estate.controller;

import com.zking.real.estate.model.Room;
import com.zking.real.estate.service.IRoomService;
import com.zking.real.system.model.Model;
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

@RequestMapping("/room")
@Controller
public class RoomController extends AppliUtils{


    @Autowired
    IRoomService roomService;

    @RequestMapping("/queryListRoom.shtml")
    public String toQueryListRoom(HttpServletRequest request, Model model) {

        String dybh = request.getParameter("dybh");
        System.out.println("中转："+dybh);
        request.getSession().setAttribute("dybh",dybh);
        return "estate/queryListRoom";
    }
    @RequestMapping("/addRoom.shtml")
    public String toAddRoom(HttpServletRequest request){
        Object dybh = request.getSession().getAttribute("dybh");
        request.setAttribute("dybh",dybh);
        return "estate/AddRoom";
    }
    @RequestMapping("updateRoom.shtml")
    public String toUpdateRoom(HttpServletRequest request){
        String fjbm = request.getParameter("fjbm");
        Room room = new Room();
        room.setFjbm(fjbm);
        Room room1 = roomService.querySingRoom(room);
        System.out.println("查询单个房间："+room1);
        request.getSession().setAttribute("rooms",room1);
        return "estate/updateRoom";
    }



    @RequestMapping("/queryListRoom")
    @ResponseBody
    public Map<String,Object> queryListRoom(HttpServletRequest request, Room room){
        Object dybh = request.getSession().getAttribute("dybh");
        System.out.println("接收："+dybh);
        room.setDybh(dybh.toString());
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Room> rooms = roomService.queryListRoom(room, pageBean);

        for (Room room1 : rooms) {
            System.out.println("查询："+room1);
        }
        this.mapUtils.put("rows",rooms);
        this.mapUtils.put("total",pageBean.getTotal());
        return this.mapUtils;
    }
    @RequestMapping("/addRoom")
    @ResponseBody
    public Map<String,Object> addRoom(HttpServletRequest request,Room room){
        room.setFjbm(UUID.randomUUID().toString().replace("-",""));
        int i = roomService.addRoom(room);
        if(i>0){
            this.mapUtils.put("message","添加成功");
        }else{
            this.mapUtils.put("message","添加失败");

        }
        return this.mapUtils;
    }
    @RequestMapping("/updateRoom")
    @ResponseBody
    public Map<String,Object> updateRoom(Room room){
        int i = roomService.updateRoom(room);
        if(i>0){
            this.mapUtils.put("message","保存成功");
        }else{

            this.mapUtils.put("message","保存失败");
        }
        return null;
    }
    @RequestMapping("/delRoom")
    @ResponseBody
    public Map<String,Object> delRoom(Room room){
        int i = roomService.delRoom(room);
        if(i>0){
            this.mapUtils.put("message","删除成功");

        }else {
            this.mapUtils.put("message","删除失败");

        }
        return this.mapUtils;

    }


}
