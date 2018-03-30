package com.smart.chapter7.advice.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaiveWaiter implements Waiter {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void greetTo(String name) {
        logger.info("greet to " + name + " ....");
        throw new RuntimeException("运行异常。");
    }

    @Override
    public void serveTo(String name) {
        logger.info("serve to " + name + " ....");
    }
}
