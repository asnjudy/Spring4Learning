package com.smart.chapter5.anno.dao;

import com.smart.chapter5.anno.entity.User;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;


@Repository("userDao")
public class UserDao {

    public boolean isExist(User user) throws SQLException {
        if ("admin".equals(user.getName()) && "admin".equals(user.getPasswd())) {
            return true;
        } else {
            return false;
        }
    }
}
