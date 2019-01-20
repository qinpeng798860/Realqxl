package com.zking.real.owner.service;

import com.zking.real.owner.model.Room;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IRoomService {

    List<Room> queryRoomKey(Room room);

}