package com.zking.real.estate.mapper;

import com.zking.real.estate.model.Room;

import java.util.List;
import java.util.Map;

public interface RoomMapper {
    int deleteByPrimaryKey(String fjbm);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(String fjbm);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);

    List<Room> queryUnitSelect(String paramId);

}