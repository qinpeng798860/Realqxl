package com.zking.real.owner.controller;

import com.zking.real.owner.model.Owner;
import com.zking.real.owner.service.IOwnerService;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/owner")
@Controller
public class OwnerController extends AppliUtils{


    @Autowired
    private IOwnerService iOwnerService;


//    查询业主信息
    @RequestMapping("/queryOwnerPager")
    @ResponseBody
    public Map<String,Object> queryOwnerPager(Owner owner, HttpServletRequest request){
        this.bean.setRequest(request);
        List<Map<String,Object>> owners = iOwnerService.queryOwnerPager(owner,this.bean);
        this.mapUtils.put("rows", owners);
        this.mapUtils.put("total", bean.getTotal());
        return  mapUtils;
    };

    //主页面
    @RequestMapping("gotoOwnertLis.shtml")
    public String toqueryOwner2(){
        return "/owner/ownerList";
    }

    //新增业主
    @RequestMapping("/insertOwner")
    @ResponseBody
    public Map<String,Object> insertOwner(Owner owner){
            owner.setrId(uuidRandom());
            int insert = iOwnerService.insert(owner);
            this.mapUtils.put("code",insert);
            this.mapUtils.put("message","新增业主成功");
            return mapUtils;
    }

    //新增业主
    @RequestMapping("/updateOwner")
    @ResponseBody
    public Map<String,Object> updateOwner(Owner owner){
        int update = iOwnerService.updateOwner(owner);
        this.mapUtils.put("code",update);
        this.mapUtils.put("message","修改业主成功");
        return mapUtils;
    }


    //添加页面、修改
    @RequestMapping("gotoOwnerAdd.shtml")
    public String gotoaddowner(Owner owner){
        return "/owner/addowner";
    }


    public Map<String,Object> queryOwnerReport(Owner owner){
        List<Map<String, Object>> maps = iOwnerService.queryOwnerReport(owner);
        return null;
    }


    //添加页面、修改
    @RequestMapping("gotoOwnerReport.shtml")
    public String gotoOwnerReport(Owner owner){
        return "/report/ownerReport";
    }

}
