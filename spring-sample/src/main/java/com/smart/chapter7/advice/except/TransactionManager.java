package com.smart.chapter7.advice.except;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class TransactionManager implements ThrowsAdvice {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
        logger.info("method: " + method.getName());
        logger.info("抛出异常: " + ex.getMessage());
        logger.info("成功回滚事务");
    }
}
