package com.zking.real.owner.mapper;

import com.zking.real.owner.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OwnerMapper {
    int deleteByPrimaryKey(String rId);

    int insert(Owner record);

    Owner selectByPrimaryKey(String rId);

    int updateSingPhtot(String id);

    int updateOwner(Owner owner);

    List<Map<String,Object>> queryOwnerPager(Owner owner);


     //业主报表
     List<Map<String,Object>> queryOwnerReport(Owner owner);
}