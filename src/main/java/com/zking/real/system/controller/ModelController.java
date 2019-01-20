package com.zking.real.system.controller;

import com.zking.real.system.model.Model;
import com.zking.real.system.model.User;
import com.zking.real.system.service.IModelService;
import com.zking.real.system.service.IUserService;
import com.zking.real.system.vo.ModelVo;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/model")
@Controller
public class ModelController extends AppliUtils{

    @Autowired
    private IModelService iModelService;
    @Autowired
    private IUserService iUserService;

    /*前往登陆*/
    @RequestMapping("error.shtml")
    public String gotoError(HttpServletRequest request){
        return "error";
    }



    /*前往登陆*/
    @RequestMapping("login.shtml")
    public String gotoLogin(){
        return "login";
    }

    /*前往首页*/
    @RequestMapping("gotoIndex.shtml")
    public String gotoIndex(){
        return "index";
    }

    /*首页内容页面*/
    @RequestMapping("queryIndxContext.shtml")
    public String gotoIndexContext(){
        return "indexContext";
    }

    /*用户登陆*/
    @RequestMapping("/userLogin")
    @ResponseBody
    public Map<String,Object> userLogin(User user, HttpServletRequest request){
        User u = iUserService.selectLoginUser(user);
        Map<String, Object> map = new HashMap<String, Object>();
        if(null!=u){
            ModelVo modelVo=new ModelVo();
            modelVo.setrUserid(u.getrUserid());
            List<Model> models = iModelService.queryUserModel(modelVo);
            u.setModelList(models);
            //登陆的用户
            request.getSession().setAttribute("LoginUser",u);
            map.put("code",1);
            map.put("message","登陆成功");
        }else{
            map.put("code",-1);
            map.put("message","登陆失败");
        }
        return map;
    }

    /**
     * 用户退出
     * @return
     */


    /*退出登陆*/
    @RequestMapping("/userLoginOut")
    public String userLoginOut(HttpServletRequest request){
        //清空所有session
        request.getSession().invalidate();

        return "redirect:login.shtml";
    }

    /*查询模块信息*/
    @RequestMapping("/queryModel")
    @ResponseBody
    public List<Model> queryModel(ModelVo model,HttpServletRequest request){
        User u = (User) request.getSession().getAttribute("LoginUser");
        List<Model> modelList = queryShintModel(model, u.getModelList());
        return modelList;
    }

    //转换
    public  List<Model> queryShintModel(Model model,List<Model> queryModel){
        Model ms =null;
        List<Model> modelList = new ArrayList<Model>();
        for (Model m : queryModel) {
            if(model.getrParentCode().equals(m.getrParentCode())){
                ms= new Model();
                ms.setrCode(m.getrCode());
                ms.setrParentCode(m.getrParentCode());
                ms.setrIcon(m.getrIcon());
                ms.setrText(m.getrText());
                ms.setrUrl(m.getrUrl());
                modelList.add(ms);
            }
        }
        return modelList;
    }
}
