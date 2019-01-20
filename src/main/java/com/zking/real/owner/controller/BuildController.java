package com.zking.real.owner.controller;

import com.zking.real.owner.model.Build;
import com.zking.real.owner.service.IBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@RequestMapping("/Bu")
@Controller
public class BuildController {

    @Autowired
    private IBuildService iBuildService;

    @RequestMapping("/queryBuild")
    @ResponseBody
    public List<Build> queryBuild(){
        List<Build> builds = iBuildService.queryBuild();
        return builds;
    };
}
