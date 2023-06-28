package com.mok.springbootmall.dao;

import com.mok.springbootmall.dto.UserRegisterRequest;
import com.mok.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);

}
