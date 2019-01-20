package com.zking.real.server.service;

import com.zking.real.server.model.Server;
import com.zking.real.server.vo.ServerVo;
import com.zking.real.util.PageBean;

import java.util.List;
import java.util.Map;

public interface IServerService {

    int insert(Server record);

    List<ServerVo> queryModelPager(Server server, PageBean bean);

    int delServer(Server server);

    int updateServerZt(Server server);


    int updateServerFy(Server server);


    List<Map<String,Object>> queryCompanyType(Map<String,Object>  map);

    List<ServerVo> queryManagerPager(Server server, PageBean bean);

    ServerVo selectSingServer(Server server);

    ServerVo selectSingManageServer(Server server);

    int updateManageServerZt(Server server);

    int deleteManageServer(ServerVo server);
}