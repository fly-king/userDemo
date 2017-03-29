package com.alibaba.taobao.userDemo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tianda.lt on 2017/3/29.
 */

@Controller
public class UserController {


        @RequestMapping(value = "/showUser",method = RequestMethod.GET)
        public void showUser(HttpServletResponse response) throws IOException {
            response.getWriter().print("<h1>Hello SpringMVC</h1>");
            response.flushBuffer();
        }


}
