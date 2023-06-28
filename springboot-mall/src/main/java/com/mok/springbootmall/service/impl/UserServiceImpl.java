package com.mok.springbootmall.service.impl;

import com.mok.springbootmall.dao.UserDao;
import com.mok.springbootmall.dto.UserRegisterRequest;
import com.mok.springbootmall.model.User;
import com.mok.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
