package com.sample;

import com.sample.bean.MagicUser;
import com.smart.chapter3.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetUserBean {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-user.xml");

        MagicUser mu = (MagicUser) ctx.getBean("magicUser");
        System.out.println("###user###" + mu.getUser());

        // User user = ctx.getBean("user", User.class);
        // System.out.println(user);

        System.out.println("----------------------------------------\n");

        ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("bean-user.xml");

        MagicUser mu2 = (MagicUser) ctx2.getBean("magicUser");
        System.out.println("###user###" + mu2.getUser());


        ctx.close();
        ctx2.close();
    }
}
