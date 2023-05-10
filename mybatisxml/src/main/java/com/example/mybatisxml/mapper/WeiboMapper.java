package com.example.mybatisxml.mapper;

import com.example.mybatisxml.pojo.entity.Weibo;
import com.example.mybatisxml.pojo.vo.WeiboDetailVO;
import com.example.mybatisxml.pojo.vo.WeiboIndexVO;
import com.example.mybatisxml.pojo.vo.WeiboVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 微博映射接口
 * @date 2023/05/08 15:39
 */
@Mapper
public interface WeiboMapper {

    // @Insert("INSERT INTO weibo (id, content, created, user_id) VALUES (NULL, #{content}, #{created}, #{userId})")
    boolean insert(Weibo weibo);

    // @Delete("DELETE FROM weibo WHERE id = #{id}")
    boolean deleteById(int id);

    // @Update("UPDATE weibo set id = #{id}, content = #{content}, created = #{created}, user_Id = #{userId} WHERE id = #{id}")
    boolean updateById(Weibo weibo);

    // @Select("SELECT * FROM weibo")
    List<Weibo> selectAll();

    // @Select("SELECT * FROM weibo WHERE id = #{id}")
    Weibo selectById(int id);

    // @Select("SELECT content, created, user_id as userId FROM weibo")
    List<WeiboVO> selectByColumn();

    int selectWeiboCount();

    List<WeiboIndexVO> select();

    List<WeiboDetailVO> selectWeiboDetail();
}
