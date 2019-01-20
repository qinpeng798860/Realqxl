package com.zking.real.server.mapper;

import com.zking.real.server.model.Allot;
import org.springframework.stereotype.Repository;

@Repository
public interface AllotMapper {
    int deleteByPrimaryKey(String rAllid);

    int insert(Allot record);

    int insertSelective(Allot record);

    Allot selectByPrimaryKey(String rAllid);

    int updateByPrimaryKeySelective(Allot record);

    int updateByPrimaryKey(Allot record);
}