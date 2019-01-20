package com.zking.real.owner.service.impl;

import com.zking.real.owner.mapper.OwnerMapper;
import com.zking.real.owner.model.Owner;
import com.zking.real.owner.service.IOwnerService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IOwnerServiceImpl implements IOwnerService {

    @Autowired
    private OwnerMapper ownerMapper;
    @Override
    public int deleteByPrimaryKey(String rId) {
        return 0;
    }

    @Override
    public int insert(Owner record) {
        return ownerMapper.insert(record);
    }


    @Override
    public Owner selectByPrimaryKey(String rId) {
        return null;
    }

    @Override
    public int updateOwner(Owner owner) {
        return ownerMapper.updateOwner(owner);
    }

    @Override
    public int updateSingPhtot(String id) {
        return ownerMapper.updateSingPhtot(id);
    }

    @Override
    public  List<Map<String,Object>> queryOwnerPager(Owner owner, PageBean bean) {
        return ownerMapper.queryOwnerPager(owner);
    }

    @Override
    public List<Map<String, Object>> queryOwnerReport(Owner owner) {
        return ownerMapper.queryOwnerReport(owner);
    }

    //业主报表

}
