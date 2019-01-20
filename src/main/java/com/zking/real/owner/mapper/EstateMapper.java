package com.zking.real.owner.mapper;

import com.zking.real.owner.model.Estate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

//房产
@Repository
public interface EstateMapper {

    int insert(Estate record);

    int insertSelective(Estate record);

    List<Map<String,Object>> queryEstatePager(Estate estate);

    int deleteByPrimaryKey(String rId);



}