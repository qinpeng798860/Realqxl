package com.zking.real.vegetation.service;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.model.CleanCheck;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface ICleanCheckService {

    int insert(CleanCheck record);

    int updateCleanCheck(CleanCheck cleanCheck);

    int deleteSingCleanCheck(String rQbm);

    List<Map<String,Object>> queryCleanCheckPager(CleanCheck cleanCheck, PageBean bean);

}