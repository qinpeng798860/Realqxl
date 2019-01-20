package com.zking.real.system.mapper;
import com.zking.real.system.model.Model;
import com.zking.real.system.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelMapper {

    List<Model> queryModel(Model model);

    List<Model> queryUserModel(Model model);
}