package com.draper.dao;

import com.draper.BaseTest;
import com.draper.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;


    @Test
    public void testInsertUser() {
        userDao.insertUser("小明", "aaab", "bbba", 0);
    }

    @Test
    public void testQueryUserByAccount() {
        User user = userDao.queryUserByAccount("aaab");
        System.out.println(user.getName());
    }
}
