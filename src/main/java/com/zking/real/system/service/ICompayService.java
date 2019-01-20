package com.zking.real.system.service;

import com.zking.real.system.model.Compay;
import com.zking.real.util.PageBean;

import java.util.List;
import java.util.Map;

public interface ICompayService {
    List<Compay> queryCompay(Compay compay, PageBean bean);

    List<Map<String,Object>> queryCompayFwlx(String rFwId);
}
