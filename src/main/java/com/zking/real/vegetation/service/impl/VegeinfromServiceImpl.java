package com.zking.real.vegetation.service.impl;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.mapper.VegeinfromMapper;
import com.zking.real.vegetation.model.Vegeinfrom;
import com.zking.real.vegetation.service.IVegeinfromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VegeinfromServiceImpl implements IVegeinfromService {

    @Autowired
    private VegeinfromMapper vegeinfromMapper;

    @Override
    public int insert(Vegeinfrom record) {
        return vegeinfromMapper.insert(record);
    }

    @Override
    public int updateVegeinfrom(Vegeinfrom record) {
        return vegeinfromMapper.updateVegeinfrom(record);
    }

    @Override
    public int deleteSingVegeinfrom(String rZbbm) {
        return vegeinfromMapper.deleteSingVegeinfrom(rZbbm);
    }

    @Override
    public List<Map<String, Object>> queryVegeinfromPager(Vegeinfrom vegeinfrom, PageBean bean) {
        return vegeinfromMapper.queryVegeinfromPager(vegeinfrom);
    }
}
