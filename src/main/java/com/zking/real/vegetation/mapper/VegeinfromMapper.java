package com.zking.real.vegetation.mapper;

import com.zking.real.vegetation.model.Vegeinfrom;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface VegeinfromMapper {
    int insert(Vegeinfrom record);

    int updateVegeinfrom(Vegeinfrom record);

    int deleteSingVegeinfrom(String rZbbm);

    List<Map<String,Object>> queryVegeinfromPager(Vegeinfrom vegeinfrom);

}