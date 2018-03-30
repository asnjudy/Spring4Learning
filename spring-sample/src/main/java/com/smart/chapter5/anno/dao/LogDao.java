package com.smart.chapter5.anno.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository
public class LogDao implements InitializingBean {

    public LogDao() {
        System.out.println("construct a LogDao object.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties injected, do something on the LogDao instance.");
    }

    public void saveLog() {
        System.out.println("save log ....");
    }
}
