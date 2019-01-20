package com.zking.real.parking.mapper;

import com.zking.real.parking.model.Parking;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ParkingMapper {


    int insert(Parking record);

    List<Parking> queryParkingPage(Parking parking);

    int updateParking(Parking parking);
    Parking querySingParking(Parking parking);

    int delParking(Parking parking);









}