package com.zking.real.estate.mapper;

import com.zking.real.estate.model.Unit;

import java.util.List;
import java.util.Map;

public interface UnitMapper {
    int deleteByPrimaryKey(String dybm);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(String dybm);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);

    List<Unit> queryUintSelect(String paramId);
}