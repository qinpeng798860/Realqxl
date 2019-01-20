package com.zking.real.parking.service;

import com.zking.real.parking.mapper.ParkingMapper;
import com.zking.real.parking.model.Parking;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IParkingService {

    int insert(Parking record);

    List<Parking> queryParkingPage(Parking parking, PageBean pageBean);
    int updateParking(Parking parking);
    Parking querySingParking(Parking parking);
    int delParking(Parking parking);


}