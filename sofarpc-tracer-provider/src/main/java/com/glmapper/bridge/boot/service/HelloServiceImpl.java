package com.glmapper.bridge.boot.service;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.glmapper.bridge.boot.facade.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author: guolei.sgl (glmapper_2018@163.com) 2019/3/15 10:52 PM
 * @since:
 **/
@Service
@SofaService(bindings = { @SofaServiceBinding(bindingType = "bolt") })
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "glmapper";
    }
}
