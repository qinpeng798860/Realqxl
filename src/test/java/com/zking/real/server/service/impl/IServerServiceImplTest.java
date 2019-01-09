package com.zking.real.server.service.impl;

import com.zking.real.server.model.Server;
import com.zking.real.server.service.IServerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.ServiceTestCase;

import java.util.List;

import static org.junit.Assert.*;

public class IServerServiceImplTest extends ServiceTestCase {
    @Autowired
    private IServerService iServerService;

    public void setUp(){
        super.setUp();
    }

    @Test
    public void queryModelPager() {
        Server server = new Server();



    }
}