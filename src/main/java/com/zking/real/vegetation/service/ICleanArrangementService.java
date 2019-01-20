package com.zking.real.vegetation.service;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.model.CleanArrangement;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface ICleanArrangementService {

    int insert(CleanArrangement record);

    int updateCleanArrangement(CleanArrangement cleanArrangement);

    int deleteSingCleanArrangement(String rAbm);

    List<Map<String,Object>> queryCleanArrangementPager(CleanArrangement cleanArrangement, PageBean bean);
}