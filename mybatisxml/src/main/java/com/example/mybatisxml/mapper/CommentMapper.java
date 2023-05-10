package com.example.mybatisxml.mapper;

import com.example.mybatisxml.pojo.entity.Comment;
import com.example.mybatisxml.pojo.vo.CommentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 评论映射接口
 * @date 2023/05/09 10:13
 */
@Mapper
public interface CommentMapper {

    // @Insert("INSERT INTO comment (content, user_id, weibo_id) VALUES(#{content}, #{userId}, #{weiboId})")
    boolean insert(String content, Integer userId, Integer weiboId);

    // @Update("UPDATE comment SET content = #{content} WHERE id = #{id}")
    boolean updateById(String content, Integer id);

    /*动态删除*/
    // 1.数组形式
    int deleteByIds1(Integer[] ids);
    // 2.可变形参
    int deleteByIds2(Integer ... ids);
    // 3.集合形式
    int deleteByIds3(List<Integer> ids);

    /*动态更新*/
    boolean dynamicUpdate(Comment comment);

    List<CommentVO> selectCommentsByUserId(int id);
}
