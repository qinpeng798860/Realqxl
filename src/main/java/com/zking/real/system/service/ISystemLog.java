package com.zking.real.system.service;

import com.zking.real.system.model.SystemLog;
import com.zking.real.system.vo.SystemLogVo;
import com.zking.real.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface ISystemLog {
    int deleteByPrimaryKey(String logid);

    int insert(SystemLog record);

    int insertSelective(SystemLog record);

    SystemLog selectByPrimaryKey(String logid);

    int updateByPrimaryKeySelective(SystemLog record);

    int updateByPrimaryKey(SystemLog record);

    List<SystemLog> queryLogPager(SystemLogVo systemLogVo, PageBean bean);
}