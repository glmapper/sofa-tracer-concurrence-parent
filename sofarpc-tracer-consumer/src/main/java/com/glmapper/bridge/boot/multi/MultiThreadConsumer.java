package com.glmapper.bridge.boot.multi;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.glmapper.bridge.boot.facade.HelloService;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * 线程池同步调用
 *
 * @author: guolei.sgl (glmapper_2018@163.com) 2019/3/15 10:57 PM
 * @since:
 **/
@Service
public class MultiThreadConsumer {

    private static ExecutorService executorService = Executors.newFixedThreadPool(2);

    @SofaReference(binding = @SofaReferenceBinding(bindingType = "bolt"))
    private HelloService helloService;

    /**
     * 模拟批量处理，同步调用
     */
    public void multiThread(){
        for (int i=0;i < 10;i++){
            executorService.submit(new TaskRunnable());
        }
    }

    class TaskRunnable implements Runnable{
        @Override
        public void run() {
            helloService.hello();
        }
    }

}
