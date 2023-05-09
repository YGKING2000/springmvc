package com.example.mybatisxml.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 评论映射接口
 * @date 2023/05/09 10:13
 */
@Mapper
public interface CommentMapper {

    @Insert("INSERT INTO comment (content, user_id, weibo_id) VALUES(#{content}, #{user_Id}, #{weibo_Id})")
    boolean insert(String content, @Param("user_Id") Integer userId, @Param("weibo_Id") Integer weiboId);

    @Update("UPDATE comment SET content = #{content} WHERE id = #{id}")
    boolean updateById(@Param("content") String content, @Param("id") Integer id);
}
