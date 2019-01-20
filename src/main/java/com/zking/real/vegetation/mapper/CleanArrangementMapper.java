package com.zking.real.vegetation.mapper;

import com.zking.real.vegetation.model.CleanArrangement;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CleanArrangementMapper {

    int insert(CleanArrangement record);

    int updateCleanArrangement(CleanArrangement cleanArrangement);

    int deleteSingCleanArrangement(String rAbm);

    List<Map<String,Object>> queryCleanArrangementPager(CleanArrangement cleanArrangement);
}