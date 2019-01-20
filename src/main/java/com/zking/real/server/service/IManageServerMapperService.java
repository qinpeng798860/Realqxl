package com.zking.real.server.service;

import com.zking.real.server.model.ManageServer;

public interface IManageServerMapperService {
    int deleteByPrimaryKey(String rBlr);

    int insert(ManageServer record);

    int insertSelective(ManageServer record);

    ManageServer selectByPrimaryKey(String rBlr);

    int updateByPrimaryKeySelective(ManageServer record);

    int updateByPrimaryKey(ManageServer record);

    int updateManagebljg(ManageServer record);
    
}