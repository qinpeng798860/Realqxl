package com.zking.real.estate.service;

import com.github.pagehelper.Page;
import com.zking.real.estate.model.Unit;
import com.zking.real.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IUnitService {
    List<Unit> queryListUnit(Unit unit, PageBean pageBean);
    int addUnit(Unit unit);
    int delUnit(Unit unit);
    Unit querySingUnit(Unit unit);
    int updateUnit(Unit unit);



}