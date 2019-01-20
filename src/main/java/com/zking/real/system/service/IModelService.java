package com.zking.real.system.service;
import com.zking.real.system.model.Model;
import com.zking.real.system.model.User;
import com.zking.real.system.vo.ModelVo;

import java.util.List;

public interface IModelService {

    List<Model> queryModel(Model model);
    List<Model> queryUserModel(ModelVo user);
}