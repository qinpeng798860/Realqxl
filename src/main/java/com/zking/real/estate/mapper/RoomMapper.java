package com.zking.real.estate.mapper;

import com.zking.real.estate.model.Room;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomMapper {

    List<Room> queryListRoom(Room room);
    int addRoom(Room room);

    int delRoom(Room room);
    Room querySingRoom(Room room);
    int updateRoom(Room room);

}