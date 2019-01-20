package com.zking.real.owner.service.impl;

import com.zking.real.owner.mapper.BuildMapper;
import com.zking.real.owner.model.Build;
import com.zking.real.owner.service.IBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildServiceImpl implements IBuildService {

    @Autowired
    private BuildMapper buildMapper;

    @Override
    public List<Build> queryBuild() {
        return buildMapper.queryBuild();
    }
}
