package com.alibaba.taobao.userdemo.service;

import com.alibaba.taobao.userdemo.model.User;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by tianda.lt on 2017/3/31.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/applicationContext.xml")

public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUserTest(){
        User user = userService.getUser("1");
        Assert.assertNotNull(user);
    }

}
