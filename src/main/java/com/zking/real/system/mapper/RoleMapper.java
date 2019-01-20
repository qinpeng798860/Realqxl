package com.zking.real.system.mapper;

import com.zking.real.system.model.Role;
import com.zking.real.system.vo.RoleModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    int deleteByPrimaryKey(String roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> queryRolePager(Role role);

    int insertRoleModule(RoleModel roleModel);


    List<RoleModel> queryRoleModule(RoleModel roleModel);

    int deleteRoleModule(RoleModel roleModel);
}