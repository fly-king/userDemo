package com.alibaba.taobao.userdemo.service;

import java.util.List;

import com.alibaba.taobao.userdemo.model.User;

/**
 * Created by tianda.lt on 2017/3/31.
 */
public interface UserService {

    User getUser(String userId);

    List<User> getAllUsers();

    void addUser(User user);


}
