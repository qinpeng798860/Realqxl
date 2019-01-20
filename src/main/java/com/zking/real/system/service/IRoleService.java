package com.zking.real.system.service;

import com.zking.real.system.model.Role;
import com.zking.real.system.vo.RoleModel;
import com.zking.real.util.PageBean;

import java.util.List;

public interface IRoleService {
    int deleteByPrimaryKey(String roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> queryRolePager(Role role,PageBean bean);

    int insertRoleModule(RoleModel roleModel);

    List<RoleModel> queryRoleModule(RoleModel roleModel);

    int deleteRoleModule(RoleModel roleModel);
}