package com.zking.real.estate.service.imp;

import com.zking.real.estate.mapper.BuildingMapper;
import com.zking.real.estate.model.Building;
import com.zking.real.estate.service.IBuildingService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BuildingServiceImpl implements IBuildingService {
    @Autowired
    BuildingMapper buildingMapper;
    @Override
    public List<Building> queryListBuilding(Building building, PageBean pageBean) {
        return buildingMapper.queryListBuilding(building);
    }

    @Override
    public int delBuilding(Building building) {
        return buildingMapper.delBuilding(building);
    }

    @Override
    public Building querySingBuilding(Building building) {
        return buildingMapper.querySingBuilding(building);
    }

    @Override
    public int addBuilding(Building building) {
        return buildingMapper.addBuilding(building);
    }

    @Override
    public int updateBuilding(Building building) {
        return buildingMapper.updateBuilding(building);
    }
}
