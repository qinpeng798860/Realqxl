package com.zking.real.owner.controller;

import com.zking.real.owner.model.Unit;
import com.zking.real.owner.service.IUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/Unit")
@Controller
public class UnitController  {

    @Autowired
    private IUnitService iUnitService;

    @RequestMapping("/queryUnitKey")
    @ResponseBody
    public List<Unit> queryUnitKey(Unit unit){
        List<Unit> units = iUnitService.queryUnitKey(unit);
        return  units;
    }
}
