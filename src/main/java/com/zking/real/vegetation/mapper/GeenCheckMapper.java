package com.zking.real.vegetation.mapper;

import com.zking.real.vegetation.model.GeenCheck;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface GeenCheckMapper {

    int insert(GeenCheck record);

    int updateGeenCheck(GeenCheck geenCheck);

    int deleteSingGeenCheck(String rCbm);

    List<Map<String,Object>> queryGeenCheckPager(GeenCheck geenCheck);
}