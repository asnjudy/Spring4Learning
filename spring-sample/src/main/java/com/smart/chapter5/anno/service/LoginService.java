package com.smart.chapter5.anno.service;

import com.smart.chapter5.anno.entity.User;
import com.smart.chapter5.anno.dao.LogDao;
import com.smart.chapter5.anno.dao.UserDao;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class LoginService implements BeanNameAware {

    @Lazy
    @Autowired
    private LogDao logDao;


    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public LogDao getLogDao() {
        return logDao;
    }
    public UserDao getUserDao() {
        return userDao;
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("##beanName##: " + name);
    }

    public void initMethod1() {
        System.out.println("initMethod1");
    }

    public void initMethod2() {
        System.out.println("initMethod2");
    }

    /**
     * 保存日志
     */
    public void saveLog(){
        logDao.saveLog();
    }


    public void login(String userName, String passwd) {
        User user = new User();
        user.setName(userName);
        user.setPasswd(passwd);
        try {
            if (userDao.isExist(user)) {
                System.out.println("login success!");
            } else {
                System.out.println("login failed!");
            }
        } catch (SQLException e) {
            System.out.println("login error!");
            e.printStackTrace();
        }
    }
}
