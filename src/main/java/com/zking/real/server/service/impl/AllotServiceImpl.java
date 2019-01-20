package com.zking.real.server.service.impl;

import com.zking.real.server.mapper.AllotMapper;
import com.zking.real.server.model.Allot;
import com.zking.real.server.service.IAllotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllotServiceImpl implements IAllotService {

    @Autowired
    private AllotMapper allotMapper;


    @Override
    public int deleteByPrimaryKey(String rAllid) {
        return allotMapper.deleteByPrimaryKey(rAllid);
    }

    @Override
    public int insert(Allot record) {
        return allotMapper.insert(record);
    }

    @Override
    public int insertSelective(Allot record) {
        return allotMapper.insertSelective(record);
    }

    @Override
    public Allot selectByPrimaryKey(String rAllid) {
        return allotMapper.selectByPrimaryKey(rAllid);
    }

    @Override
    public int updateByPrimaryKeySelective(Allot record) {
        return allotMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Allot record) {
        return allotMapper.updateByPrimaryKey(record);
    }
}
