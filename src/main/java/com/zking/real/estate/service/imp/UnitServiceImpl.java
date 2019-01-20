package com.zking.real.estate.service.imp;

import com.zking.real.estate.mapper.UnitMapper;
import com.zking.real.estate.model.Unit;
import com.zking.real.estate.service.IUnitService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Service
public class UnitServiceImpl implements IUnitService {
    @Autowired
    UnitMapper unitMapper;




    @Override
    public List<Unit> queryListUnit(Unit unit, PageBean pageBean) {
        return unitMapper.queryListUnit(unit);
    }

    @Override
    public int addUnit(Unit unit) {
        return unitMapper.addUnit(unit);
    }

    @Override
    public int delUnit(Unit unit) {
        return unitMapper.delUnit(unit);
    }

    @Override
    public Unit querySingUnit(Unit unit) {
        return unitMapper.querySingUnit(unit);
    }

    @Override
    public int updateUnit(Unit unit) {
        return unitMapper.updateUnit(unit);
    }
}
