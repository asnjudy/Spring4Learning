package com.smart.chapter7.advice.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class GreetingBeforeAdice implements MethodBeforeAdvice {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String clientName = (String) args[0];
        logger.info("How are you! Mr." + clientName);
    }
}
