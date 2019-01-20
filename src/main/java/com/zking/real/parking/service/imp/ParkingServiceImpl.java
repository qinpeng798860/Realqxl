package com.zking.real.parking.service.imp;

import com.zking.real.parking.mapper.ParkingMapper;
import com.zking.real.parking.model.Parking;
import com.zking.real.parking.service.IParkingService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParkingServiceImpl implements IParkingService {
    @Autowired
    private ParkingMapper parkingMapper;


    @Override
    public int insert(Parking record) {
        return parkingMapper.insert(record);
    }

    @Override
    public List<Parking> queryParkingPage(Parking parking, PageBean pageBean) {
        return parkingMapper.queryParkingPage(parking);
    }

    @Override
    public int updateParking(Parking parking) {

        return parkingMapper.updateParking(parking);
    }

    @Override
    public Parking querySingParking(Parking parking) {
        return parkingMapper.querySingParking(parking);
    }

    @Override
    public int delParking(Parking parking) {
        return parkingMapper.delParking(parking);
    }
}
