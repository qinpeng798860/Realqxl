package com.zking.real.owner.service;

import com.zking.real.owner.model.Owner;
import com.zking.real.util.PageBean;

import java.util.List;
import java.util.Map;

public interface IOwnerService {

    int deleteByPrimaryKey(String rId);

    int insert(Owner record);

    Owner selectByPrimaryKey(String rId);

    int updateOwner(Owner owner);

    int updateSingPhtot(String id);

    List<Map<String,Object>> queryOwnerPager(Owner owner, PageBean bean);

    //业主报表
    List<Map<String,Object>> queryOwnerReport(Owner owner);
}