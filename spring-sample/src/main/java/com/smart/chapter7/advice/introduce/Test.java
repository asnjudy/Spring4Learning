package com.smart.chapter7.advice.introduce;

import com.smart.chapter7.advice.proxy.ForumService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter7/introduce/advice.xml");
        ForumService forumService = ctx.getBean("forumService", ForumService.class);

        forumService.removeForum(10);
        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMenitorAdvice(true);

        forumService.removeForum(10);
    }
}
