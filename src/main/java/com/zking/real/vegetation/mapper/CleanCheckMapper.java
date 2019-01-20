package com.zking.real.vegetation.mapper;

import com.zking.real.vegetation.model.CleanArrangement;
import com.zking.real.vegetation.model.CleanCheck;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CleanCheckMapper {

    int insert(CleanCheck record);

    int updateCleanCheck(CleanCheck cleanCheck);

    int deleteSingCleanCheck(String rQbm);

    List<Map<String,Object>> queryCleanCheckPager(CleanCheck cleanCheck);

}