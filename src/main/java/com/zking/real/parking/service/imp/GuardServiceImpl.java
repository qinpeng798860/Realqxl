package com.zking.real.parking.service.imp;

import com.zking.real.parking.mapper.GuardMapper;
import com.zking.real.parking.model.Guard;
import com.zking.real.parking.service.IGuardService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuardServiceImpl implements IGuardService {
    @Autowired
    private GuardMapper guardMapper;

    @Override
    public int insert(Guard record) {
        return guardMapper.insert(record);
    }

    @Override
    public List<Guard> queryGuarList(Guard guard, PageBean pageBean) {
        return guardMapper.queryGuarList(guard);
    }

    @Override
    public int updateGuard(Guard guard) {
        return guardMapper.updateGuard(guard);
    }

    @Override
    public Guard querySingGurad(Guard guard) {
        return guardMapper.querySingGurad(guard);
    }


}
