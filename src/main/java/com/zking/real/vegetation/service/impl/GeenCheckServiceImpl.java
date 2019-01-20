package com.zking.real.vegetation.service.impl;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.mapper.GeenCheckMapper;
import com.zking.real.vegetation.model.GeenCheck;
import com.zking.real.vegetation.service.IGeenCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GeenCheckServiceImpl implements IGeenCheckService {

    @Autowired
    private GeenCheckMapper geenCheckMapper;

    @Override
    public int insert(GeenCheck record) {
        return geenCheckMapper.insert(record);
    }

    @Override
    public int updateGeenCheck(GeenCheck geenCheck) {
        return geenCheckMapper.updateGeenCheck(geenCheck);
    }

    @Override
    public int deleteSingGeenCheck(String rCbm) {
        return geenCheckMapper.deleteSingGeenCheck(rCbm);
    }

    @Override
    public List<Map<String, Object>> queryGeenCheckPager(GeenCheck geenCheck, PageBean bean) {
        return geenCheckMapper.queryGeenCheckPager(geenCheck);
    }
}
