package com.smart.chapter5.anno_jsoft.controller;

import com.smart.chapter5.anno_jsoft.dto.DtoClass;
import com.smart.chapter5.anno_jsoft.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private DtoClass dtoClass;

    public void save() {
        logger.info("[控制层] 执行save");
        dtoClass.say();
        userService.userSave();
    }
}
