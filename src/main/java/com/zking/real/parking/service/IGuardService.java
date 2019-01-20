package com.zking.real.parking.service;

import com.zking.real.parking.model.Guard;
import com.zking.real.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IGuardService {
    int insert(Guard record);

    List<Guard> queryGuarList(Guard guard, PageBean pageBean);
    int updateGuard(Guard guard);
    Guard querySingGurad(Guard guard);

}