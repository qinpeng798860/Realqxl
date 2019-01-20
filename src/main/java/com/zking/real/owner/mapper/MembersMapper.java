package com.zking.real.owner.mapper;

import com.zking.real.owner.model.Estate;
import com.zking.real.owner.model.Members;
import org.springframework.stereotype.Repository;

import java.util.List;

//家庭成员
@Repository
public interface MembersMapper {
    int insert(Members record);

    List<Members> queryMembers(Members members);

    int deleteByPrimaryKey(String rMid);

}