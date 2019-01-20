package com.zking.real.system.service.imp;

import com.zking.real.system.mapper.RoleMapper;
import com.zking.real.system.model.Role;
import com.zking.real.system.service.IRoleService;
import com.zking.real.system.vo.RoleModel;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int deleteByPrimaryKey(String roleid) {
        return roleMapper.deleteByPrimaryKey(roleid);
    }

    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    @Override
    public Role selectByPrimaryKey(String roleid) {
        return roleMapper.selectByPrimaryKey(roleid);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Role> queryRolePager(Role role, PageBean bean) {
        return roleMapper.queryRolePager(role);
    }

    @Override
    public int insertRoleModule(RoleModel roleModel) {
        return roleMapper.insertRoleModule(roleModel);
    }

    @Override
    public List<RoleModel> queryRoleModule(RoleModel roleModel) {
        return roleMapper.queryRoleModule(roleModel);
    }

    @Override
    public int deleteRoleModule(RoleModel roleModel) {
        return roleMapper.deleteRoleModule(roleModel);
    }
}
