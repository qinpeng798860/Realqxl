package com.zking.real.owner.service.impl;

import com.zking.real.owner.mapper.OwnerMapper;
import com.zking.real.owner.model.Owner;
import com.zking.real.owner.service.IOwnerService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public int insertSelective(Owner record) {
        return 0;
    }

    @Override
    public Owner selectByPrimaryKey(String rId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Owner record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Owner record) {
        return 0;
    }

    @Override
    public List<Owner> queryOwner(Owner owner, PageBean bean) {
        return ownerMapper.queryOwner(owner);
    }
}
