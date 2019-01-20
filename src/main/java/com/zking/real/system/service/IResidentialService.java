package com.zking.real.system.service;

import com.zking.real.system.model.Residential;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IResidentialService {

    //查询住宅
    List<Residential> queryResidential();
}