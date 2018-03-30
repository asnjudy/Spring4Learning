package com.sample.bean;

import java.util.Date;

public class UserFactory {

    public User createTomUser() {
        User user = new User();
        user.setId(2);
        user.setName("tom");
        user.setBirthday(new Date());
        return user;
    }

    public static User createJimUser() {
        User user = new User();
        user.setId(3);
        user.setName("jim");
        user.setBirthday(new Date());
        return user;
    }
}
