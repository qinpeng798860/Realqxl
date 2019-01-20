package com.zking.real.vegetation.service;

import com.zking.real.util.PageBean;
import com.zking.real.vegetation.model.GeenCheck;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface IGeenCheckService {

    int insert(GeenCheck record);

    int updateGeenCheck(GeenCheck geenCheck);

    int deleteSingGeenCheck(String rCbm);

    List<Map<String,Object>> queryGeenCheckPager(GeenCheck geenCheck,PageBean bean);
}