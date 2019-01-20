package com.zking.real.system.controller;

import com.zking.real.system.model.Compay;
import com.zking.real.system.service.ICompayService;
import com.zking.real.util.AppliUtils;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@RequestMapping("compay")
@Controller
public class CompayController extends AppliUtils{

    @Autowired
    private ICompayService iCompayService;


    //查询公司
    @RequestMapping("queryCompay")
    @ResponseBody
    public List<Compay> queryCompay(Compay compay){
        PageBean bean = new PageBean();
        List<Compay> compays = iCompayService.queryCompay(compay, bean);

        return compays;
    }

    /**
     * 根据服务类型查询公司 分配服务
     * @param rFwId
     * @return
     */
    @RequestMapping("queryCompayrFwlx")
    @ResponseBody
    public List<Map<String,Object>> queryCompayrFwlx(@RequestParam String rFwId){

        List<Map<String,Object>> compays = iCompayService.queryCompayFwlx(rFwId);

        return compays;
    }

}
