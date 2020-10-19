package com.example.bankapp.service;

import com.example.bankapp.dao.UserDao;
import com.example.bankapp.models.User;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.insertUser(user);
    }

}
