package com.zking.real.system.controller;

import com.zking.real.system.model.Role;
import com.zking.real.system.service.IRoleService;
import com.zking.real.util.AppliUtils;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("role")
@Controller
public class RoleManageController extends AppliUtils{

    @Autowired
    private IRoleService iRoleService;

    /**
     * 前往角色信息页面
     * @return
     */
    @RequestMapping("gotoRoleManage")
    public String gotoRoleManage(){


        return "system/roleManage/roleManage";
    }

    /**
     * 前往角色新增页面
     *
     * @return
     */
    @RequestMapping("gotoAddRole")
    public String gotoAddRole(Role role, Model model) {
        model.addAttribute("role", role);
        return "system/roleManage/addRole";
    }

    /**
     * 分页查询角色
     * @return
     */
    @RequestMapping("queryRole")
    @ResponseBody
    public Map<String,Object> queryRole(Role role, HttpServletRequest request){
        this.bean.setRequest(request);
        List<Role> roles = iRoleService.queryRolePager(role, this.bean);
        this.mapUtils.put("rows",roles);
        this.mapUtils.put("total", this.bean.getTotal());
        return this.mapUtils;
    }

    /**
     * 分页查询角色
     * @return
     */
    @RequestMapping("queryRadioRole")
    @ResponseBody
    public List<Role> querRadioRole(Role role){
        PageBean bean = new PageBean();
        bean.setPagination(false);
        List<Role> roles = iRoleService.queryRolePager(role, bean);

        return roles;
    }

  /**
     * 新增角色
     * @return
     */
    @RequestMapping("addRole")
    @ResponseBody
    public Map<String,Object> addRole(Role role){
        role.setRoleid(uuidRandom());
        int insert = iRoleService.insert(role);
        this.mapUtils.put("code",insert);
        if(insert!=-1)
            this.mapUtils.put("message","新增成功");
        else
            this.mapUtils.put("message","新增失败");


        return this.mapUtils;
    }
  /**
     * 修改角色
     * @return
     */
    @RequestMapping("editRole")
    @ResponseBody
    public Map<String,Object> editRole(Role role){
        int insert = iRoleService.updateByPrimaryKey(role);
        this.mapUtils.put("code",insert);
        if(insert!=-1)
            this.mapUtils.put("message","修改成功");
        else
            this.mapUtils.put("message","修改失败");


        return this.mapUtils;
    }
    /**
     * 删除角色
     * @return
     */
    @RequestMapping("delRole")
    @ResponseBody
    public Map<String,Object> delRole(Role role){
        int i = iRoleService.deleteByPrimaryKey(role.getRoleid());
        this.mapUtils.put("code",i);
        if(i!=-1)
            this.mapUtils.put("message","删除成功");
        else
            this.mapUtils.put("message","删除失败");

        return this.mapUtils;
    }




}
