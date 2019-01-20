package com.zking.real.system.service.imp;

import com.zking.real.system.mapper.DictMapper;
import com.zking.real.system.model.Dict;
import com.zking.real.system.service.IDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl implements IDictService {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public List<Dict> queryDict(Dict dict) {
        return dictMapper.queryDict(dict);
    }
}
