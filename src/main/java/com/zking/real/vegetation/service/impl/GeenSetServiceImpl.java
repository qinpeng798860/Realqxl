package com.zking.real.vegetation.service.impl;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.mapper.GeenSetMapper;
import com.zking.real.vegetation.model.GeenSet;
import com.zking.real.vegetation.service.IGeenSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GeenSetServiceImpl implements IGeenSetService {

    @Autowired
    private GeenSetMapper geenSetMapper;

    @Override
    public int insert(GeenSet record) {
        return geenSetMapper.insert(record);
    }

    @Override
    public int updateGeenSet(GeenSet record) {
        return geenSetMapper.updateGeenSet(record);
    }

    @Override
    public int deleteSingGeenSet(String rGbm) {
        return geenSetMapper.deleteSingGeenSet(rGbm);
    }

    @Override
    public List<Map<String, Object>> queryGeenSetPager(GeenSet geenSet, PageBean bean) {
        return geenSetMapper.queryGeenSetPager(geenSet);
    }
}
