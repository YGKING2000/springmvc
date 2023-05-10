package com.example.mybatisexercise4.mapper;

import com.example.mybatisexercise4.pojo.entity.Category;
import com.example.mybatisexercise4.pojo.vo.CategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @date 2023/05/10 11:52
 */
@Mapper
public interface CategoryMapper {
    boolean insert(Category category);

    List<Category> selectAll();

    Category selectOne(int id);

    boolean updateById(Category category);

    boolean deleteById(int id);

    int deleteByIds(Integer ... ids);

    int selectCount();

    List<CategoryVO> selectByColumn();
}
