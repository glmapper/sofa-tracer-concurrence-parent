package com.glmapper.bridge.boot.controller;

import com.glmapper.bridge.boot.multi.MultiThreadAsyncConsumer;
import com.glmapper.bridge.boot.multi.MultiThreadCallbackConsumer;
import com.glmapper.bridge.boot.multi.MultiThreadConsumer;
import com.glmapper.bridge.boot.single.SingleThreadAsyncConsumer;
import com.glmapper.bridge.boot.single.SingleThreadConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guolei.sgl (glmapper_2018@163.com) 2019/3/15 11:10 PM
 * @since:
 **/
@RestController
public class TestController {

    @Autowired
    SingleThreadConsumer singleThreadConsumer;

    @Autowired
    SingleThreadAsyncConsumer singleThreadAsyncConsumer;

    @Autowired
    MultiThreadConsumer multiThreadConsumer;

    @Autowired
    MultiThreadAsyncConsumer multiThreadAsyncConsumer;

    @Autowired
    MultiThreadCallbackConsumer multiThreadCallbackConsumer;

    @RequestMapping("testSingleSync")
    public String testSingleSync(){
        return singleThreadConsumer.singleThread();
    }
    @RequestMapping("testSingleASync")
    public void testSingleASync(){
        singleThreadAsyncConsumer.singleThreadAsync();
    }

    @RequestMapping("testMultiSync")
    public void testMultiSync(){
        multiThreadConsumer.multiThread();
    }

    @RequestMapping("testMultiASync")
    public void testMultiASync(){
        multiThreadAsyncConsumer.multiThreadAsync();
    }

    @RequestMapping("testMultiCallback")
    public void testMultiCallback(){
        multiThreadCallbackConsumer.multiCallbackThread();
    }
}
