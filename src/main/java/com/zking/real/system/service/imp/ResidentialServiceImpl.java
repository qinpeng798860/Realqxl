package com.zking.real.system.service.imp;

import com.zking.real.system.mapper.ResidentialMapper;
import com.zking.real.system.model.Residential;
import com.zking.real.system.service.IResidentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentialServiceImpl implements IResidentialService {

    @Autowired
    private ResidentialMapper residentialMapper;

    @Override
    public List<Residential> queryResidential() {
        return residentialMapper.queryResidential();
    }
}
