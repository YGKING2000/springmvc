package com.example.weibo.mapper;

import com.example.weibo.pojo.vo.CommentVO;
import com.example.weibo.pojo.entity.Comment;

import java.util.List;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @date 2023/05/12 20:25
 */
public interface CommentMapper {
    List<CommentVO> selectByWeiboId(int id);

    void insert(Comment comment);

    void delete(Integer id);
}
