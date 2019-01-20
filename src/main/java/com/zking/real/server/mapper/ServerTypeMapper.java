package com.zking.real.server.mapper;

import com.zking.real.server.model.ServerType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ServerTypeMapper {

    int insert(ServerType record);

    List<Map<String,Object>> queryServerTypePager(ServerType serverType);

    int updateServerType(ServerType serverType);

    int updateServerTypeStatus(ServerType serverType);

    int delServerType(ServerType serverType);

    List<ServerType> queryServerTypeSelect();
}