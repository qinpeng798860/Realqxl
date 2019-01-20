package com.zking.real.server.service.impl;

import com.zking.real.server.mapper.ManageServerMapper;
import com.zking.real.server.model.ManageServer;
import com.zking.real.server.service.IManageServerMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServerMapperServiceImpl implements IManageServerMapperService {
    @Autowired
    private ManageServerMapper manageServerMapper;


    @Override
    public int deleteByPrimaryKey(String rBlr) {
        return manageServerMapper.deleteByPrimaryKey(rBlr);
    }

    @Override
    public int insert(ManageServer record) {
        return manageServerMapper.insert(record);
    }

    @Override
    public int insertSelective(ManageServer record) {
        return manageServerMapper.insertSelective(record);
    }

    @Override
    public ManageServer selectByPrimaryKey(String rBlr) {
        return manageServerMapper.selectByPrimaryKey(rBlr);
    }

    @Override
    public int updateByPrimaryKeySelective(ManageServer record) {
        return manageServerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ManageServer record) {
        return manageServerMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateManagebljg(ManageServer record) {
        return manageServerMapper.updateManagebljg(record);
    }
}
