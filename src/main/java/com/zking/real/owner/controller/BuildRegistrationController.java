package com.zking.real.owner.controller;

import com.zking.real.owner.model.Estate;
import com.zking.real.owner.model.Owner;
import com.zking.real.owner.service.IEstateService;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/Build")
@Controller
public class BuildRegistrationController extends AppliUtils {

    @Autowired
    private IEstateService iEstateService;

    private HttpServletRequest request;

    @RequestMapping("/queryEstate")
    @ResponseBody
    public List<Map<String,Object>> queryEstate(Estate estate){
        List<Map<String,Object>> estates = iEstateService.queryEstatePager(estate);
        return  estates;
    }


    //新增房产
    @RequestMapping("/insertBuild")
    @ResponseBody
    public Map<String,Object> insertBuild(Estate estate){
        System.out.println(estate+"==========================");
        estate.setrId(uuidRandom());
        int insert = iEstateService.insert(estate);
        this.mapUtils.put("code",insert);
        this.mapUtils.put("message","新增房产成功");
        return mapUtils;
    }


    //查询页面
    @RequestMapping("gotoBuildQuery.shtml")
    public String gotoBuildQuery(Model model, @RequestParam String rId) {
        model.addAttribute("rId",rId);
        return "owner/BuildRegistration/BuildRegistration";
    }


    //新增页面
    @RequestMapping("gotoBuildAdd.shtml")
    public String gotoBuildAdd(Model model, @RequestParam String rYzid) {
        model.addAttribute("rYzid",rYzid);
        return "owner/BuildRegistration/addBuildRegistration";
    }

    @RequestMapping("/delSingBuild")
    @ResponseBody
    public Map<String, Object> delSingBuild(Estate estate) {
        int i = iEstateService.deleteByPrimaryKey(estate.getrId());
        this.mapUtils.put("code",i);
        this.mapUtils.put("message","删除成功");
        return mapUtils;
    }


}
