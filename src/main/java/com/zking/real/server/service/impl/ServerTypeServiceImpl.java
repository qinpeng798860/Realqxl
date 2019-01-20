package com.zking.real.server.service.impl;

import com.zking.real.server.mapper.ServerTypeMapper;
import com.zking.real.server.model.ServerType;
import com.zking.real.server.service.IServerTypeService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ServerTypeServiceImpl implements IServerTypeService {

    @Autowired
    private ServerTypeMapper serverTypeMapper;

    @Override
    public int insert(ServerType record) {
        return serverTypeMapper.insert(record);
    }

    @Override
    public List<Map<String,Object>> queryServerTypePager(ServerType serverType, PageBean bean) {
        return serverTypeMapper.queryServerTypePager(serverType);
    }

    @Override
    public int updateServerType(ServerType serverType) {
        return serverTypeMapper.updateServerType(serverType);
    }
}
