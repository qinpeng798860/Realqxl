package com.zking.real.server.service;

import com.zking.real.server.model.Allot;

public interface IAllotService {
    int deleteByPrimaryKey(String rAllid);

    int insert(Allot record);

    int insertSelective(Allot record);

    Allot selectByPrimaryKey(String rAllid);

    int updateByPrimaryKeySelective(Allot record);

    int updateByPrimaryKey(Allot record);
}