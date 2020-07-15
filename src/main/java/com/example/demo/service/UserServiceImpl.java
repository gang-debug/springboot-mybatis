package com.example.demo.service;

import javax.annotation.Resource;
import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

public class UserServiceImpl implements com.example.demo.service.UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List< User > getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List< User > getFourUser() {
        return userMapper.getFourUser();
    }
}
