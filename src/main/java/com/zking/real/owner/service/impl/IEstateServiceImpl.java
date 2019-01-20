package com.zking.real.owner.service.impl;

import com.zking.real.owner.mapper.EstateMapper;
import com.zking.real.owner.model.Estate;
import com.zking.real.owner.service.IEstateService;
import com.zking.real.util.PageBean;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IEstateServiceImpl implements IEstateService {

    @Autowired
    private EstateMapper estateMapper;

    @Override
    public int insert(Estate record) {
        return estateMapper.insert(record);
    }

    @Override
    public int insertSelective(Estate record) {
        return 0;
    }

    @Override
    public List<Map<String,Object>> queryEstatePager(Estate estate) {
        return estateMapper.queryEstatePager(estate);
    }

    @Override
    public int deleteByPrimaryKey(String rId) {
        return estateMapper.deleteByPrimaryKey(rId);
    }
}
