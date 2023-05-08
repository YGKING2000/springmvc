package com.example.mybatisannotation.mapper;

import com.example.mybatisannotation.pojo.User;
import com.example.mybatisannotation.pojo.UserVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @date 2023/05/08 14:28
 */
@Mapper
public interface UserMapper {

    /**
     * @description 向user表中插入一条数据
     * @return boolean
     * @param user User
     * @author YGKING
     * @date 2023/05/08 14:33:31
     */
    @Insert("INSERT INTO user VALUES(NULL, #{username}, #{password}, #{nickname}, #{created})")
    boolean insert(User user);

    /**
     * @description 查询所有id小于指定id的用户名和密码
     * @return java.util.List<com.example.mybatisannotation.pojo.UserVO>
     * @param id int
     * @author YGKING
     * @date 2023/05/08 17:34:07
     */
    @Select("SELECT username, password FROM user WHERE id < #{id}")
    List<UserVO> selectByIdAndColumn(int id);
}
