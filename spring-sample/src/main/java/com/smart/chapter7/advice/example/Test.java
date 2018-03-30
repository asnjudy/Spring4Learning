package com.smart.chapter7.advice.example;


import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {



    public static void testBeforeAdvice() {
        Waiter waiter = new NaiveWaiter();
        BeforeAdvice beforeAdice = new GreetingBeforeAdice();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(beforeAdice);

        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("asn");
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter7/advice.xml");
        Waiter waiter = ctx.getBean("waiter", Waiter.class);
        waiter.greetTo("asn");
    }
}
