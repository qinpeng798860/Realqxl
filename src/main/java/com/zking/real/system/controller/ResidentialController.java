package com.zking.real.system.controller;

import com.zking.real.system.model.Residential;
import com.zking.real.system.service.IResidentialService;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/residential")
@Controller
public class ResidentialController extends AppliUtils {

    @Autowired
    private IResidentialService iResidentialService;


    @RequestMapping("/queryResidential")
    @ResponseBody
    public List<Residential> queryResidential(Residential residential){
        List<Residential> residentials = iResidentialService.queryResidential();
        return residentials;
    }
}
