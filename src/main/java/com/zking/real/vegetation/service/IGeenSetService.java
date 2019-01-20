package com.zking.real.vegetation.service;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.model.GeenSet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface IGeenSetService {
    int insert(GeenSet record);

    int updateGeenSet(GeenSet record);

    int deleteSingGeenSet(String rGbm);

    List<Map<String,Object>> queryGeenSetPager(GeenSet geenSet, PageBean bean);
}