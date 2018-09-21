package com.draper.dao;

import com.draper.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserDao {

    void insertUser(@Param("name") String name, @Param("account") String account, @Param("password") String password, @Param("credit") int credit);

    User queryUserByAccount(@Param("account") String account);

    boolean increaseCredit(int credit, User user);

    boolean decreaseCredit(int credit, User user);

    boolean checkUser(User user);

    Date getLastLoginTime(User user);

    boolean refreshLastLoginTime(User user);

}
