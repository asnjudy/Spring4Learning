package com.smart.chapter5.anno_jsoft.dao.impl;

import com.smart.chapter5.anno_jsoft.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    final static Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public void save() {
        logger.info("[数据库访问层] 执行save");
    }
}
