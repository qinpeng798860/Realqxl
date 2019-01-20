package com.zking.real.estate.service.imp;

import com.zking.real.estate.mapper.RoomMapper;
import com.zking.real.estate.model.Room;
import com.zking.real.estate.service.IRoomService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceImpl implements IRoomService {

    @Autowired
    RoomMapper roomMapper;
    @Override
    public List<Room> queryListRoom(Room room, PageBean pageBean) {
        return roomMapper.queryListRoom(room);
    }

    @Override
    public int addRoom(Room room) {
        return roomMapper.addRoom(room);
    }

    @Override
    public int delRoom(Room room) {
        return roomMapper.delRoom(room);
    }

    @Override
    public Room querySingRoom(Room room) {

        return  roomMapper.querySingRoom(room);
    }

    @Override
    public int updateRoom(Room room) {
        return roomMapper.updateRoom(room);
    }
}
