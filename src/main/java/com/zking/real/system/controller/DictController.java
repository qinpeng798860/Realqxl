package com.zking.real.system.controller;

import com.zking.real.system.model.Dict;
import com.zking.real.system.service.IDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@RequestMapping("dict")
@Controller
public class DictController {

    @Autowired
    private IDictService iDictService;


    /**
     * 查询字典数据
     * @param dict
     * @return
     */
    @RequestMapping("/queryDict")
    @ResponseBody
    public List<Dict> queryDict(Dict dict){

        List<Dict> dicts = iDictService.queryDict(dict);

        return dicts;
    }
}
