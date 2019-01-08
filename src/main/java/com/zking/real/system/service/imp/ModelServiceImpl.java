package com.zking.real.system.service.imp;

import com.zking.real.system.mapper.ModelMapper;
import com.zking.real.system.model.Model;
import com.zking.real.system.service.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ModelServiceImpl implements IModelService {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Model> queryModel(Model model) {
        return modelMapper.queryModel(model);
    }
}
