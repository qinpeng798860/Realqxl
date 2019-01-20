package com.zking.real.vegetation.service;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.model.CleanRecord;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface ICleanRecordService {
    int insert(CleanRecord record);

    int updateCleanRecord(CleanRecord cleanRecord);

    int deleteSingCleanRecord(String rQbm);

    List<Map<String,Object>> queryCleanRecordPager(CleanRecord cleanRecord, PageBean bean);
}