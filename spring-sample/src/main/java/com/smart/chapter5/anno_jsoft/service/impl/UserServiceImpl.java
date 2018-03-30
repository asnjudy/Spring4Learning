package com.smart.chapter5.anno_jsoft.service.impl;

import com.smart.chapter5.anno_jsoft.dao.UserDao;
import com.smart.chapter5.anno_jsoft.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public void userSave() {
        logger.info("[服务层] 执行save");
        userDao.save();
    }
}
