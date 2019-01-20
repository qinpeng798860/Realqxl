package com.zking.real.system.mapper;

import com.zking.real.system.model.Residential;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResidentialMapper {

    //查询住宅
    List<Residential> queryResidential();
}