package com.zking.real.estate.mapper;

import com.zking.real.estate.model.Building;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingMapper {
    List<Building> queryListBuilding(Building building);
    int addBuilding(Building building);

    int delBuilding(Building building);

    Building querySingBuilding(Building building);
    int updateBuilding(Building building);






}