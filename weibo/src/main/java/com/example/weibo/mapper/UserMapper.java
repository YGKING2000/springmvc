package com.example.weibo.mapper;

import com.example.weibo.pojo.entity.User;
import com.example.weibo.pojo.vo.UserVO;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 用户映射接口
 * @date 2023/05/12 11:43
 */
public interface UserMapper {
    UserVO selectByUsername(String username);

    int insert(User user);
}
