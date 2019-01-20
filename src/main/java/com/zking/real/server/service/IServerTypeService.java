package com.zking.real.server.service;

import com.zking.real.server.model.ServerType;
import com.zking.real.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface IServerTypeService {

    int insert(ServerType record);

    List<Map<String,Object>> queryServerTypePager(ServerType serverType, PageBean bean);

    int updateServerType(ServerType serverType);

    int updateServerTypeStatus(ServerType serverType);

    int delServerType(ServerType serverType);

    List<ServerType> queryServerTypeSelect();


}