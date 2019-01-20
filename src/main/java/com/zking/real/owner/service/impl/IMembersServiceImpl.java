package com.zking.real.owner.service.impl;

import com.zking.real.owner.mapper.MembersMapper;
import com.zking.real.owner.model.Members;
import com.zking.real.owner.service.IMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMembersServiceImpl implements IMembersService {

    @Autowired
    private MembersMapper membersMapper;


    @Override
    public int insert(Members record) {
        return membersMapper.insert(record);
    }

    @Override
    public List<Members> queryMembers(Members members) {
        return membersMapper.queryMembers(members);
    }

    @Override
    public int deleteByPrimaryKey(String rMid) {
        return membersMapper.deleteByPrimaryKey(rMid);
    }
}
