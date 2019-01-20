package com.zking.real.owner.service;

import com.zking.real.owner.model.Owner;
import com.zking.real.util.PageBean;

import java.util.List;

public interface IOwnerSerivce {

    int deleteByPrimaryKey(String rId);

    int insert(Owner record);

    int insertSelective(Owner record);

    Owner selectByPrimaryKey(String rId);

    int updateByPrimaryKeySelective(Owner record);

    int updateByPrimaryKey(Owner record);

    int updateSingPhtot(String id);

    List<Owner> queryOwner(Owner owner, PageBean bean);
}