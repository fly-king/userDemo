package com.alibaba.taobao.userdemo.service.impl;

import java.util.List;

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

    public List<User> getAllUsers() {
        return this.userMapper.getAllUsers();
    }
    public void addUser(User user) {
        this.userMapper.addUser(user.getNAME(),user.getAge());
    }
    public void deleteUser(String userId){
        this.userMapper.deleteUser(userId);
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
