package com.zking.real.system.service.imp;

import com.zking.real.system.model.Model;
import com.zking.real.system.service.IModelService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.ServiceTestCase;

import java.util.List;

public class ModelServiceImplTest extends ServiceTestCase{

    @Autowired
    private IModelService iModelService;

    @Before
    public void setUp() {
    }

    @Test
    public void queryModel() {
        Model model = new Model();
        model.setrParentCode(-1+"");
        List<Model> models = iModelService.queryModel(model);
        for (Model model1 : models) {
            System.out.println(model1);
        }
        System.out.println("分割线");
        List<Model> models2 = iModelService.queryModel(model);
        for (Model model1 : models2) {
            System.out.println(model1);
        }
    }
}