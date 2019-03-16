package com.glmapper.bridge.boot.multi;

import com.alipay.sofa.rpc.core.exception.SofaRpcException;
import com.alipay.sofa.rpc.core.invoke.SofaResponseCallback;
import com.alipay.sofa.rpc.core.request.RequestBase;

/**
 * @author: guolei.sgl (glmapper_2018@163.com) 2019/3/16 12:20 PM
 * @since:
 **/
public class TestCallback implements SofaResponseCallback {

    @Override
    public void onAppResponse(Object appResponse, String methodName, RequestBase request) {
        System.out.println(1111);
    }

    @Override
    public void onAppException(Throwable throwable, String methodName, RequestBase request) {

    }

    @Override
    public void onSofaException(SofaRpcException sofaException, String methodName, RequestBase request) {

    }
}
