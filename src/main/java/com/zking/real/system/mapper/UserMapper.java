package com.zking.real.system.mapper;

import com.zking.real.system.model.User;
import com.zking.real.system.vo.UserVo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(String rUserid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(User user);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<UserVo> queryUserPager(User user);

    User selectSingUser(User user);

    User selectLoginUser(User user);

    int editUserRole(UserVo userVo);
}