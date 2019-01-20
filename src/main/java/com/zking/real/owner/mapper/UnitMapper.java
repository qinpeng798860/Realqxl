package com.zking.real.owner.mapper;

import com.zking.real.owner.model.Unit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitMapper {

    List<Unit> queryUnitKey(Unit unit);
}