package com.zking.real.owner.mapper;

import com.zking.real.owner.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomMapper {

    List<Room> queryRoomKey(Room room);

}