package com.zking.real.estate.mapper;

import com.zking.real.estate.model.Building;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BuildingMapper {
    int deleteByPrimaryKey(String lybm);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(String lybm);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);

    List<Building> queryBuilding(String paramId);

}