package com.zking.real.owner.controller;

import com.zking.real.owner.model.Room;
import com.zking.real.owner.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/room")
@Controller
public class RoomController {

    @Autowired
    private IRoomService iRoomService;


    @RequestMapping("/queryRoomKey")
    @ResponseBody
    public List<Room> queryRoomKey(Room room){
        List<Room> rooms = iRoomService.queryRoomKey(room);
        return rooms;
    }

}
