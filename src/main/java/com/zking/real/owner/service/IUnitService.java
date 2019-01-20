package com.zking.real.owner.service;

import com.zking.real.owner.model.Unit;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IUnitService {

    List<Unit> queryUnitKey(Unit unit);
}