package com.zking.real.vegetation.mapper;

import com.zking.real.vegetation.model.CleanRecord;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CleanRecordMapper {
    int insert(CleanRecord record);

    int updateCleanRecord(CleanRecord cleanRecord);

    int deleteSingCleanRecord(String rQbm);

    List<Map<String,Object>> queryCleanRecordPager(CleanRecord cleanRecord);
}