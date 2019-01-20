package com.zking.real.server.mapper;

import com.zking.real.server.model.Server;
import com.zking.real.server.vo.ServerVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ServerMapper {
    int insert(Server record);

    List<ServerVo> queryModelPager(Server server);

    List<ServerVo> queryManagerPager(Server server);

    int delServer(Server server);

    int updateServerZt(Server server);

    int updateServerFy(Server server);


    /*List<Map<String,Object>> queryCompay();*/

    List<Map<String,Object>> queryCompanyType(Map<String,Object>  maps);

    ServerVo selectSingServer(Server server);

    ServerVo selectSingManageServer(Server server);

    int updateManageServerZt(Server server);


    int deleteManageServer(ServerVo server);
}