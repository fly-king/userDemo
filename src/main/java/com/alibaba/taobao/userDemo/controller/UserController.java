package com.alibaba.taobao.userdemo.controller;

import java.io.IOException;

import com.alibaba.taobao.userdemo.model.User;
import com.alibaba.taobao.userdemo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tianda.lt on 2017/3/29.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/showUser", method = RequestMethod.GET)
    public String showUser(@RequestParam("id") String id, ModelMap modelMap) throws IOException {

        //1.调用BLL层（Business Logic Layer）的服务接口
        User user = userService.getUser(id);
        //2.设置模型数据
        modelMap.put("user",user);
        //3.返回逻辑视图名称
        return "showUser";

    }

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String helloWorld() throws IOException {
        //response.getWriter().print("<h1>Hello SpringMVC</h1>");
        //response.flushBuffer();
        return "helloWorld";

    }

}
