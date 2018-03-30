package com.smart.chapter7.advice.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodPerformance {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private long begin;
    private long end;
    private String serviceMethod;

    public MethodPerformance(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance() {
        end = System.currentTimeMillis();
        long elapse = end - begin;
        logger.info(serviceMethod + " use " + elapse + " ms");
    }
}
