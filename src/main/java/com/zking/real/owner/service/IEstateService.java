package com.zking.real.owner.service;

import com.zking.real.owner.model.Estate;
import com.zking.real.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface IEstateService {
    int insert(Estate record);

    int insertSelective(Estate record);

    List<Map<String,Object>> queryEstatePager(Estate estate);


    int deleteByPrimaryKey(String rId);
}