package com.zking.real.estate.service;

import com.zking.real.estate.model.Room;
import com.zking.real.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IRoomService {

    List<Room> queryListRoom(Room room, PageBean pageBean);

    int addRoom(Room room);

    int delRoom(Room room);
    Room querySingRoom(Room room);
    int updateRoom(Room room);

}