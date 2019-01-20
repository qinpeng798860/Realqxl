package com.zking.real.vegetation.service.impl;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.mapper.CleanCheckMapper;
import com.zking.real.vegetation.model.CleanCheck;
import com.zking.real.vegetation.service.ICleanCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CleanCheckServiceImpl implements ICleanCheckService {

    @Autowired
    private CleanCheckMapper cleanCheckMapper;

    @Override
    public int insert(CleanCheck record) {
        return cleanCheckMapper.insert(record);
    }

    @Override
    public int updateCleanCheck(CleanCheck cleanCheck) {
        return cleanCheckMapper.updateCleanCheck(cleanCheck);
    }

    @Override
    public int deleteSingCleanCheck(String rQbm) {
        return cleanCheckMapper.deleteSingCleanCheck(rQbm);
    }

    @Override
    public List<Map<String, Object>> queryCleanCheckPager(CleanCheck cleanCheck, PageBean bean) {
        return cleanCheckMapper.queryCleanCheckPager(cleanCheck);
    }
}
