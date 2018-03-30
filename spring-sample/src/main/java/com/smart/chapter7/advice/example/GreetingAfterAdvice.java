package com.smart.chapter7.advice.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class GreetingAfterAdvice implements AfterReturningAdvice {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        logger.info("Please enjoy yourself!");
    }
}
