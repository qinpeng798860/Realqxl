package com.zking.real.estate.mapper;

import com.zking.real.estate.model.Unit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitMapper {
    List<Unit> queryListUnit(Unit unit);
    int addUnit(Unit unit);
    int delUnit(Unit unit);
    Unit querySingUnit(Unit unit);
    int updateUnit(Unit unit);



}