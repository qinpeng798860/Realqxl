package com.zking.real.system.service.imp;

import com.zking.real.system.mapper.SystemLogMapper;
import com.zking.real.system.model.SystemLog;
import com.zking.real.system.service.ISystemLog;
import com.zking.real.system.vo.SystemLogVo;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SystemLogServiceImpl implements ISystemLog {
    @Autowired
    private SystemLogMapper systemLogMapper;


    @Override
    public int deleteByPrimaryKey(String logid) {
        return systemLogMapper.deleteByPrimaryKey(logid);
    }

    @Override
    public int insert(SystemLog record) {
        return systemLogMapper.insert(record);
    }

    @Override
    public int insertSelective(SystemLog record) {
        return systemLogMapper.insertSelective(record);
    }

    @Override
    public SystemLog selectByPrimaryKey(String logid) {
        return systemLogMapper.selectByPrimaryKey(logid);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemLog record) {
        return systemLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SystemLog record) {
        return systemLogMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SystemLog> queryLogPager(SystemLogVo dateMap, PageBean bean) {
        return systemLogMapper.queryLogPager(dateMap);
    }
}
