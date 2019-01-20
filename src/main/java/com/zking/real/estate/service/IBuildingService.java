package com.zking.real.estate.service;

import com.zking.real.estate.model.Building;
import com.zking.real.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IBuildingService {
    List<Building> queryListBuilding(Building building, PageBean pageBean);

    int delBuilding(Building building);
    Building querySingBuilding(Building building);
    int addBuilding(Building building);
    int updateBuilding(Building building);

}