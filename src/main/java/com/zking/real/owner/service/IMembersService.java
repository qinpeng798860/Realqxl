package com.zking.real.owner.service;

import com.zking.real.owner.model.Members;

import java.util.List;

public interface IMembersService {
    int insert(Members record);

    List<Members> queryMembers(Members members);

    int deleteByPrimaryKey(String rMid);
}