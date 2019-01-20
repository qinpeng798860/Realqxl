package com.zking.real.owner.service.impl;

import com.zking.real.owner.mapper.UnitMapper;
import com.zking.real.owner.model.Unit;
import com.zking.real.owner.service.IUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitServiceImpl implements IUnitService {

    @Autowired
    private UnitMapper unitMapper;

    @Override
    public List<Unit> queryUnitKey(Unit unit) {
        return unitMapper.queryUnitKey(unit);
    }
}
