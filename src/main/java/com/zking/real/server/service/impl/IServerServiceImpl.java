package com.zking.real.server.service.impl;

import com.zking.real.server.mapper.ServerMapper;
import com.zking.real.server.model.Server;
import com.zking.real.server.service.IServerService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IServerServiceImpl implements IServerService {
    @Autowired
    private ServerMapper serverMapper;

    @Override
    public int insert(Server record) {
        return serverMapper.insert(record);
    }

    @Override
    public List<Server> queryModelPager(Server server, PageBean bean) {
        return serverMapper.queryModelPager(server);
    }
}
