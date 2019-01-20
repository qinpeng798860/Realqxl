package com.zking.real.server.mapper;

import com.zking.real.server.model.Server;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServerMapper {
    int insert(Server record);

    List<Server> queryModelPager(Server server);

}