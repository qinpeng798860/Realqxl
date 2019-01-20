package com.zking.real.parking.mapper;

import com.zking.real.parking.model.Guard;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GuardMapper {
    int insert(Guard record);

    List<Guard> queryGuarList(Guard guard);

    int updateGuard(Guard guard);

    Guard querySingGurad(Guard guard);


}