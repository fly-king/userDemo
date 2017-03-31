package com.alibaba.taobao.userdemo.service.impl;

import com.alibaba.taobao.userdemo.mapper.UserMapper;
import com.alibaba.taobao.userdemo.model.User;
import com.alibaba.taobao.userdemo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tianda.lt on 2017/3/31.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(String userId) {
        return this.userMapper.getUser(userId);
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
