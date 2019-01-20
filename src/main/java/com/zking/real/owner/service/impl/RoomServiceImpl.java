package com.zking.real.owner.service.impl;

import com.zking.real.owner.mapper.RoomMapper;
import com.zking.real.owner.model.Room;
import com.zking.real.owner.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService {

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<Room> queryRoomKey(Room room) {
        return roomMapper.queryRoomKey(room);
    }
}
