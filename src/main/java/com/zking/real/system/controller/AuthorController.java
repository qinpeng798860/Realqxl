package com.zking.real.system.controller;

import com.zking.real.system.model.Model;
import com.zking.real.system.service.IModelService;
import com.zking.real.system.service.IRoleService;
import com.zking.real.system.vo.RoleModel;
import com.zking.real.util.AppliUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 权限管理
 */
@RequestMapping("author")
@Controller
public class AuthorController extends AppliUtils{

    @Autowired
    private IModelService iModelService;
    @Autowired
    private IRoleService iRoleService;


    /**
     * 前往权限管理页面
     * @return
     */
    @RequestMapping("gotoAuthorManage")
    public String gotoAthorManage(){
        return "system/user/authorManage";
    }

    /**
     * 查询权限树
     * @return
     */
    @RequestMapping("queryModelTree")
    @ResponseBody
    public  List<Map<String, Object>> queryModelTree(Model model){
        List<Model> models = iModelService.queryModel(model);
        //转换后台数据格式 返回tree需要的json格式
        List<Map<String, Object>> maps = treeShitData(models);



        return maps;
    }
    /**
     * 新增权限
     * @return
     */
    @RequestMapping("addModuleRole")
    @ResponseBody
    public Map<String, Object> addModuleRole(RoleModel roleModel,@RequestParam(value = "ModuleIds[]") String ModuleIds[]){
        //新增之前先删除原来的权限
        int i = iRoleService.deleteRoleModule(roleModel);
        Map<String, Object> map = new HashMap<String, Object>();
        if(i!=-1){
            RoleModel roleModel1 = new RoleModel();
            //遍历数据
            for (String moduleId : ModuleIds) {
                //获取权限模块id
                roleModel1.setRoleid(roleModel.getRoleid());
                roleModel1.setModuleId(moduleId);
                //循环加入数据库
                iRoleService.insertRoleModule(roleModel1);
            }

            map.put("code",1);
            map.put("message","权限添加成功");

        }



        //        /*objectMapper.readValue()*/
        //        //转换后台数据格式 返回tree需要的json格式

        /*List<Map<String, Object>> maps = treeShitData(models, "-1",null);*/


        return map;
    }


    /**
     * 查询角色权限
     * @return
     */
    @RequestMapping("queryRoleMoDel")
    @ResponseBody
    public List<RoleModel> queryRoleModel(RoleModel roleModel){
        List<RoleModel> roleModels = iRoleService.queryRoleModule(roleModel);

        return roleModels;
    }






    /**
     * 转换树形数据格式
     * @param models
     * @return
     *
     */
    public  List<Map<String,Object>> treeShitData(List<Model> models){
        Map<String, Object> tree=null;
        List<Map<String, Object>> queryTree = new ArrayList<Map<String, Object>>();
        for (Model model1 : models) {//11
            if(!model1.getrParentCode().equals("99")){
                tree= new HashMap<String, Object>();
                tree.put("name",model1.getrText());
                tree.put("id",model1.getrCode());
                tree.put("pId",model1.getrParentCode());
                //添加进map
                queryTree.add(tree);
            }
        }
        return queryTree;
    }
}
