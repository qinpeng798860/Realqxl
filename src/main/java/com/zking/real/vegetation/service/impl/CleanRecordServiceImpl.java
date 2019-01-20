package com.zking.real.vegetation.service.impl;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.mapper.CleanRecordMapper;
import com.zking.real.vegetation.model.CleanRecord;
import com.zking.real.vegetation.service.ICleanRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CleanRecordServiceImpl implements ICleanRecordService {

    @Autowired
    private CleanRecordMapper cleanRecordMapper;


    @Override
    public int insert(CleanRecord record) {
        return cleanRecordMapper.insert(record);
    }

    @Override
    public int updateCleanRecord(CleanRecord cleanRecord) {
        return cleanRecordMapper.updateCleanRecord(cleanRecord);
    }

    @Override
    public int deleteSingCleanRecord(String rQbm) {
        return cleanRecordMapper.deleteSingCleanRecord(rQbm);
    }

    @Override
    public List<Map<String, Object>> queryCleanRecordPager(CleanRecord cleanRecord,PageBean bean) {
        return cleanRecordMapper.queryCleanRecordPager(cleanRecord);
    }
}
