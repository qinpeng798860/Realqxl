package com.zking.real.server.service.impl;

import com.zking.real.server.mapper.ServerMapper;
import com.zking.real.server.model.Server;
import com.zking.real.server.service.IServerService;
import com.zking.real.server.vo.ServerVo;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IServerServiceImpl implements IServerService {
    @Autowired
    private ServerMapper serverMapper;

    @Override
    public int insert(Server record) {
        return serverMapper.insert(record);
    }

    @Override
    public List<ServerVo> queryModelPager(Server server, PageBean bean) {
        return serverMapper.queryModelPager(server);
    }

    @Override
    public int delServer(Server server) {
        return serverMapper.delServer(server);
    }

    @Override
    public int updateServerZt(Server server) {
        return serverMapper.updateServerZt(server);
    }

    @Override
    public int updateServerFy(Server server) {
        return serverMapper.updateServerFy(server);
    }

    @Override
    public List<Map<String, Object>> queryCompanyType(Map<String,Object>  map) {
        return serverMapper.queryCompanyType(map);
    }

    @Override
    public List<ServerVo> queryManagerPager(Server server,PageBean bean) {
        return serverMapper.queryManagerPager(server);
    }

    @Override
    public ServerVo selectSingServer(Server server) {
        return serverMapper.selectSingServer(server);
    }

    @Override
    public ServerVo selectSingManageServer(Server server) {
        return serverMapper.selectSingManageServer(server);
    }

    @Override
    public int updateManageServerZt(Server server) {
        return serverMapper.updateManageServerZt(server);
    }

    @Override
    public int deleteManageServer(ServerVo server) {
        return serverMapper.deleteManageServer(server);
    }
}
