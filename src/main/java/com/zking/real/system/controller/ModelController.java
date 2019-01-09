package com.zking.real.system.controller;

import com.zking.real.system.model.Model;
import com.zking.real.system.service.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/model")
@Controller
public class ModelController {

    @Autowired
    private IModelService iModelService;

    /*前往首页*/
    @RequestMapping("/index.shtml")
    public String gotoIndex(){
        return "index";
    }

    /*首页内容页面*/
    @RequestMapping("/queryIndxContext")
    public String gotoIndexContext(){
        return "indexContext";
    }

    /*查询模块信息*/
    @RequestMapping("/queryModel")
    @ResponseBody
    public List<Model> queryModel(Model model){
        List<Model> models = iModelService.queryModel(model);
        return models;
    }
}
