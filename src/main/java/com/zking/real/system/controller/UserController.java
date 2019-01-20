package com.zking.real.system.controller;

import com.zking.real.system.model.Role;
import com.zking.real.system.model.User;
import com.zking.real.system.service.IRoleService;
import com.zking.real.system.service.IUserService;
import com.zking.real.system.vo.UserVo;
import com.zking.real.util.AppliUtils;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("user")
@Controller
public class UserController extends AppliUtils{
    @Autowired
    private IUserService iUserService;
    @Autowired
    private IRoleService iRoleService;


    /**
     * 前往用户管理
     * @return
     */
    @RequestMapping("gotoUserManage")
    public String gotoUserManage(){

        return "system/user/userManage";
    }

    /**
     * 前往用户编辑和新增页面
     * @return
     */
    @RequestMapping("gotoeditUser")
    public String gotoeditUser(User user, Model model){
        model.addAttribute("user", user);

        return "system/user/editUser";
    }


    /**
     * 分页查询所有用户
     * @return
     */
    @RequestMapping("userQueryPager")
    @ResponseBody
    public Map<String, Object> userQueryPager(User user, HttpServletRequest request){
        PageBean bean = new PageBean();
        List<UserVo> users = iUserService.queryUserPager(user,bean);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", users);
        map.put("total", bean.getTotal());

        return map;
    }

     /**
     *新增用户
     * @return
     */
    @RequestMapping("addUser")
    @ResponseBody
    public Map<String, Object> addUser(User user){
        User user1 = iUserService.selectSingUser(user);
        Map<String, Object> map = new HashMap<String, Object>();
        if(user1==null){
            user.setrUserid(uuidRandom());

            int users = iUserService.insert(user);

            map.put("code", users);
            map.put("message","新增成功");

            return map;
        }else{
            map.put("code", -1);
            map.put("message","已有该用户,请重新输入");

            return map;
        }


    }

     /**
     *修改用户
     * @return
     */
    @RequestMapping("updateUser")
    @ResponseBody
    public Map<String, Object> updateUser(User user){

        int users = iUserService.updateByPrimaryKey(user);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", users);
        map.put("message","修改成功");

        return map;
    }

    /**
     *删除用户
     * @return
     */
    @RequestMapping("delUser")
    @ResponseBody
    public Map<String, Object> delUser(User user){

        int users = iUserService.deleteByPrimaryKey(user.getrUserid());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", users);
        map.put("message","删除成功");

        return map;
    }


    /**
     * 前往角色分配
     *
     * @return
     */
    @RequestMapping("gotoEditRole.shtml")
    public String gotoEditRole(UserVo userVo, Model model) {

        model.addAttribute("userVo", userVo);
        return "system/user/editRole";
    }
    /**
     * 查询角色下拉
     * @return
     */
    @RequestMapping("editRole")
    @ResponseBody
    public List<Role> editRole(){
        this.bean.setPagination(false);
        List<Role> roles = iRoleService.queryRolePager(null, this.bean);
        return roles;
    }
    /**
     * 更改角色
     * @return
     */
    @RequestMapping("editUserRole")
    @ResponseBody
    public Map<String,Object> editUserRole(UserVo userVo){
        int i = iUserService.editUserRole(userVo);
        this.mapUtils.put("code", i);
        this.mapUtils.put("message", "角色更换成功");
        return this.mapUtils;
    }




}
