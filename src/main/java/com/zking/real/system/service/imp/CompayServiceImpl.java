package com.zking.real.system.service.imp;

import com.zking.real.system.mapper.CompayMapper;
import com.zking.real.system.model.Compay;
import com.zking.real.system.service.ICompayService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CompayServiceImpl implements ICompayService {

    @Autowired
    private CompayMapper compayMapper;

    @Override
    public List<Compay> queryCompay(Compay compay, PageBean bean) {
        return compayMapper.queryCompay(compay);
    }

    @Override
    public List<Map<String,Object>> queryCompayFwlx(String rFwId) {
        return compayMapper.queryCompayFwlx(rFwId);
    }


}
