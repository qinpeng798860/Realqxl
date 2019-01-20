package com.zking.real.estate.service.imp;

import com.zking.real.estate.mapper.ResidentialMapper;
import com.zking.real.estate.model.Residential;
import com.zking.real.estate.service.IResidentialService;
import com.zking.real.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class ResidentialServiceImpl implements IResidentialService {

    @Autowired
    private  ResidentialMapper residentialMapper;
    @Override
    public int addHomes(Residential residential) {
        residential.setId(UUID.randomUUID().toString().replace("-",""));
        return residentialMapper.addHomes(residential);

    }

    @Override
    public List<Residential> queryListResidential(Residential residential, PageBean pageBean) {
        return residentialMapper.queryListResidential(residential);
    }

    @Override
    public int DelResidential(Residential residential) {
        return residentialMapper.DelResidential(residential);
    }
}
