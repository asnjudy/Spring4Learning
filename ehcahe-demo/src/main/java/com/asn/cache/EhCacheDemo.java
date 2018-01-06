package com.asn.cache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.User;

/**
 * Created by xuwentang on 2017/8/30.
 */
public class EhCacheDemo {


    public static void testSpring() {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    public static void main(String[] args) {


    }

}
