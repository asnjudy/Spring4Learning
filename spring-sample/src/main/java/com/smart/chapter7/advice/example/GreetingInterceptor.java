package com.smart.chapter7.advice.example;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingInterceptor implements MethodInterceptor {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();
        String clientName = (String) args[0];
        logger.info("How are you! Mr." + clientName);

        // 通过反射机制调用目标方法
        Object obj = invocation.proceed();
        logger.info("proceed end");
        return obj;
    }
}
