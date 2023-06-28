package com.mok.springbootmall.service;

import com.mok.springbootmall.dto.UserRegisterRequest;
import com.mok.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
