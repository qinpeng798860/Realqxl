package com.zking.real.server.mapper;

import com.zking.real.server.model.ManageServer;
import org.springframework.stereotype.Repository;

@Repository
public interface ManageServerMapper {
    int deleteByPrimaryKey(String rBlr);

    int insert(ManageServer record);

    int insertSelective(ManageServer record);

    ManageServer selectByPrimaryKey(String rBlr);

    int updateByPrimaryKeySelective(ManageServer record);

    int updateByPrimaryKey(ManageServer record);

    int updateManagebljg(ManageServer record);

    
}