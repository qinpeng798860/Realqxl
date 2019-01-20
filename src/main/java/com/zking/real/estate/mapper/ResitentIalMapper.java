package com.zking.real.estate.mapper;

import com.zking.real.estate.model.ResitentIal;

import java.util.List;

public interface ResitentIalMapper {
    int deleteByPrimaryKey(String id);

    int insert(ResitentIal record);

    int insertSelective(ResitentIal record);

    ResitentIal selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ResitentIal record);

    int updateByPrimaryKey(ResitentIal record);

    List<ResitentIal> queryResitentSelect(ResitentIal resitentIal);
}