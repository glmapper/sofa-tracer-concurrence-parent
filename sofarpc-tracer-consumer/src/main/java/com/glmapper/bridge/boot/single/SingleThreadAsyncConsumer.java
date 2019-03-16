package com.glmapper.bridge.boot.single;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.glmapper.bridge.boot.facade.HelloService;
import org.springframework.stereotype.Service;

/**
 *
 * 单线程异步调用
 *
 * @author: guolei.sgl (glmapper_2018@163.com) 2019/3/15 11:14 PM
 * @since:
 **/
@Service
public class SingleThreadAsyncConsumer {
    @SofaReference(binding = @SofaReferenceBinding(bindingType = "bolt",invokeType = "future"))
    private HelloService helloService;
    /**
     * 模拟批量处理，同步调用
     */
    public void singleThreadAsync(){
        for (int i=0;i<10;i++){
            helloService.hello();
        }
    }
}
