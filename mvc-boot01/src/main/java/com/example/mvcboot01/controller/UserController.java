package com.example.mvcboot01.controller;

import com.example.mvcboot01.pojo.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 用户控制类
 * @className UserController
 * @date 2023/05/11 10:55
 */
@Controller
public class UserController {
    /* 服务端获取数据的第一种方式: 使用HttpServletRequest类接收 */
    /*@RequestMapping("/v1/users/login")
    @ResponseBody
    public String userLogin(HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));
        return "<h1 style=\"color: green; text-align: center\">登录成功!</h1>";
    }*/

    /* 服务端获取数据的第二种方式: 声明参数接收 */
    /*@RequestMapping("/v1/users/login")
    @ResponseBody
    public String userLogin(String username, String password) {
        return "<h1 style=\"color: green; text-align: center\">登录成功!" +
                "<br/>" + username + ":" + password +"</h1>";
    }*/

    /* 服务端获取数据的第三种方式: 声明DTO类接收 */
    @RequestMapping("/v1/users/login")
    @ResponseBody
    public String userLogin(UserDTO userDTO) {
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        return "<h1 style=\"color: green; text-align: center\">登录成功!" +
                "<br/>" + username + ":" + password +"</h1>";
    }

}
