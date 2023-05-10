package com.example.weibo.controller;

import com.example.weibo.mapper.UserMapper;
import com.example.weibo.pojo.dto.UserLoginDTO;
import com.example.weibo.pojo.dto.UserRegDTO;
import com.example.weibo.pojo.entity.User;
import com.example.weibo.pojo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 用户控制类
 * @className UserController
 * @date 2023/05/12 11:45
 */
@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/reg")
    public int reg(@RequestBody UserRegDTO userRegDTO) {
        UserVO userVO = userMapper.selectByUsername(userRegDTO.getUsername());
        if (userVO != null) {
            return 2;
        }
        User user = new User();
        BeanUtils.copyProperties(userRegDTO, user);
        user.setCreated(new Date());
        int flag = userMapper.insert(user);
        if (flag > 0) {
            return 1;
        } else {
            return 2;
        }
    }

    @RequestMapping("/login")
    public int login(@RequestBody UserLoginDTO userLoginDTO, HttpSession session) {
        UserVO userVO = userMapper.selectByUsername(userLoginDTO.getUsername());
        if (userVO != null) {
            if (userLoginDTO.getPassword().equals(userVO.getPassword())) {
                session.setAttribute("user", userVO);
                return 1;// 登录成功
            }
            return 2;// 密码错误
        }
        return 3;// 用户不存在
    }

    @RequestMapping("/currentUser")
    public UserVO currentUser(HttpSession session) {
        return (UserVO) session.getAttribute("user");
    }

    @RequestMapping("/logout")
    public void logout(HttpSession session) {
        session.removeAttribute("user");
    }
}
