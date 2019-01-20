package com.zking.real.vegetation.service;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.model.Vegeinfrom;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface IVegeinfromService {
    int insert(Vegeinfrom record);

    int updateVegeinfrom(Vegeinfrom record);

    int deleteSingVegeinfrom(String rZbbm);

    List<Map<String,Object>> queryVegeinfromPager(Vegeinfrom vegeinfrom, PageBean bean);

}