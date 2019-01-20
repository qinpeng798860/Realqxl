package com.zking.real.owner.controller;

import com.zking.real.owner.model.Estate;
import com.zking.real.owner.model.Members;
import com.zking.real.owner.model.Owner;
import com.zking.real.owner.service.IEstateService;
import com.zking.real.owner.service.IMembersService;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@RequestMapping("/Home")
@Controller
public class HomeMembersController extends AppliUtils {

    @Autowired
    private IMembersService iMembersService;


    //新增家庭
    @RequestMapping("/insertHome")
    @ResponseBody
    public Map<String,Object> insertHome(Members members){
//        System.out.println("来了吗");
        members.setrMid(uuidRandom());
        int insert = iMembersService.insert(members);
        this.mapUtils.put("code",insert);
        this.mapUtils.put("message","新增家庭成员成功");
        return mapUtils;
    }


    //查看页面
    @RequestMapping("gotoHomequery.shtml")
    public String gotoHomequery(Model model, @RequestParam String rId){
        model.addAttribute("rId",rId);
        return "owner/Home/HomeMembers";
    }


    //添加页面
    @RequestMapping("/gotoHomeAdd.shtml")
    public String gotoHomeAdd(Model model, @RequestParam String rYzid){
        model.addAttribute("rYzid",rYzid);
//        System.out.println("====================");
        return "owner/Home/addHomeMebers";
    }


    @RequestMapping("/queryMembers")
    @ResponseBody
    public List<Members> queryMembers(Members members){
        List<Members> members1 = iMembersService.queryMembers(members);
        return  members1;
    };

    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
    public Map<String, Object> deleteByPrimaryKey(Members members) {
        int i = iMembersService.deleteByPrimaryKey(members.getrMid());
        this.mapUtils.put("code",i);
        this.mapUtils.put("message","删除成功");
        return mapUtils;
    }

}
