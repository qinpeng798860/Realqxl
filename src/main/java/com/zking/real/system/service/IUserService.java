package com.zking.real.system.service;

import com.zking.real.system.model.User;
import com.zking.real.system.vo.UserVo;
import com.zking.real.util.PageBean;

import java.util.List;

public interface IUserService {
    int deleteByPrimaryKey(String rUserid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(User rUserid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<UserVo> queryUserPager(User user, PageBean bean);

    User selectSingUser(User user);

    User selectLoginUser(User user);

    int editUserRole(UserVo userVo);
}