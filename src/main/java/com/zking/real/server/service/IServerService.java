package com.zking.real.server.service;

import com.zking.real.server.model.Server;
import com.zking.real.util.PageBean;

import java.util.List;

public interface IServerService {
    int insert(Server record);
    List<Server> queryModelPager(Server server, PageBean bean);

}