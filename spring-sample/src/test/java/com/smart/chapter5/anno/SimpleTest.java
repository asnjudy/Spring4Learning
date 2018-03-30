package com.smart.chapter5.anno;

import com.smart.chapter5.anno.service.LoginService;
import com.smart.chapter5.anno.bean_demo.Boss;
import com.smart.chapter5.anno_jsoft.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleTest {

    ApplicationContext ctx;

    @Before
    public void init() {
        String[] contextConfigLocations = {
                // "chapter5/anno/beans.xml",
                "chapter5/anno/beans-jsoft.xml",
        };
        ctx = new ClassPathXmlApplicationContext(contextConfigLocations);
    }

    // @Test
    public void testLoginService() {
        Boss boss = ctx.getBean(Boss.class);
        System.out.println(boss);

        LoginService loginService = ctx.getBean(LoginService.class);
        // loginService.saveLog();
        loginService.login("admin", "admin");
    }

    @Test
    public void testUserController() {
        UserController userController = ctx.getBean(UserController.class);
        userController.save();
    }
}
