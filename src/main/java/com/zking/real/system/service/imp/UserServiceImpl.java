package com.zking.real.system.service.imp;

import com.zking.real.system.mapper.UserMapper;
import com.zking.real.system.model.User;
import com.zking.real.system.service.IUserService;
import com.zking.real.system.vo.UserVo;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(String rUserid) {
        return userMapper.deleteByPrimaryKey(rUserid);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(User rUserid) {
        return userMapper.selectByPrimaryKey(rUserid);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }


    @Override
    public List<UserVo> queryUserPager(User user, PageBean bean) {
        return userMapper.queryUserPager(user);
    }

    @Override
    public User selectSingUser(User user) {
        return userMapper.selectSingUser(user);
    }

    @Override
    public User selectLoginUser(User user) {
        return userMapper.selectLoginUser(user);
    }

    @Override
    public int editUserRole(UserVo userVo) {
        return userMapper.editUserRole(userVo);
    }
}
