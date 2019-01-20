package com.zking.real.vegetation.service.impl;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.mapper.CleanArrangementMapper;
import com.zking.real.vegetation.model.CleanArrangement;
import com.zking.real.vegetation.service.ICleanArrangementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CleanArrangementServiceImpl implements ICleanArrangementService {

    @Autowired
    private CleanArrangementMapper cleanArrangementMapper;

    @Override
    public int insert(CleanArrangement record) {
        return cleanArrangementMapper.insert(record);
    }

    @Override
    public int updateCleanArrangement(CleanArrangement cleanArrangement) {
        return cleanArrangementMapper.updateCleanArrangement(cleanArrangement);
    }

    @Override
    public int deleteSingCleanArrangement(String rAbm) {
        return cleanArrangementMapper.deleteSingCleanArrangement(rAbm);
    }

    @Override
    public List<Map<String, Object>> queryCleanArrangementPager(CleanArrangement cleanArrangement, PageBean bean) {
        return cleanArrangementMapper.queryCleanArrangementPager(cleanArrangement);
    }
}
