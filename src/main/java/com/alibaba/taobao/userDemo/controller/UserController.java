package com.alibaba.taobao.userdemo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.taobao.userdemo.model.User;
import com.alibaba.taobao.userdemo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
        modelMap.put("user", user);
        //3.返回逻辑视图名称
        return "hello";
    }

    @RequestMapping(value = "/allUsers", method = RequestMethod.GET)
    public String allUsers(ModelMap modelMap) {
        List<User> users = userService.getAllUsers();
        modelMap.put("users", users);
        return "allUsers";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUser(@RequestParam("name") String name, @RequestParam("age") String age, ModelMap modelMap) {
        User user = new User();
        user.setNAME(name);
        user.setAge(age);
        userService.addUser(user);
        return "redirect:/allUsers";
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public String deleteUser(@RequestParam("id") String id, ModelMap modelMap) {
        userService.deleteUser(id);
        return "redirect:/allUsers";
    }

    //@RequestMapping(value = "", method = RequestMethod.GET)
    //public String index( ModelMap modelMap) {
    //    return "redirect:/index.html";
    //}

    //@RequestMapping(value="/index")
    //public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
    //    return new ModelAndView("/index.html");
    //}
    //@RequestMapping(value = "/", method = RequestMethod.GET)
    //public String helloWorld() throws IOException {
    //    //response.getWriter().print("<h1>Hello SpringMVC</h1>");
    //    //response.flushBuffer();
    //    return "/static/index.html";
    //
    //}

}
