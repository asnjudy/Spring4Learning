package com.sample.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.User;

/**
 * Created by xuwentang on 2017/8/30.
 */
public class EhCacheDemo {

    private static Logger LOG = LoggerFactory.getLogger(EhCacheDemo.class);


    public static void testSpring() {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext(
                        "classpath:spring/beans.xml");
        User user = context.getBean("user", User.class);
        LOG.info("user: " + user);
    }

    public static void main(String[] args) {

        testSpring();
    }

}
