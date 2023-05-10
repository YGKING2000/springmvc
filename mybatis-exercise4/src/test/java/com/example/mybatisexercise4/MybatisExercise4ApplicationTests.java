package com.example.mybatisexercise4;

import com.example.mybatisexercise4.mapper.CategoryMapper;
import com.example.mybatisexercise4.pojo.entity.Category;
import com.example.mybatisexercise4.pojo.vo.CategoryVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class MybatisExercise4ApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    void testInsert() {
        Category category = new Category();
        for (int i = 21; i <= 40; i++) {
            category.setName("皮衣" + i);
            category.setIntro("浙江温州浙江温州，江南皮革厂倒闭了" + i);
            category.setCreated(new Date());
            System.out.println(categoryMapper.insert(category));
        }
    }

    @Test
    void testSelectAll() {
        for (Category category : categoryMapper.selectAll()) {
            System.out.println(category);
        }
    }

    @Test
    void testSelectOne() {
        System.out.println(categoryMapper.selectOne(33));
    }

    @Test
    void testUpdateById() {
        Category category = new Category();
        category.setId(3);
        category.setName("西瓜条");
        category.setIntro("家人们，谁懂啊");
        category.setCreated(new Date());
        System.out.println(categoryMapper.updateById(category));
    }

    @Test
    void testDeleteById() {
        System.out.println(categoryMapper.deleteById(40));
        System.out.println(categoryMapper.deleteById(123));
    }

    @Test
    void testDeleteByIds() {
        System.out.println(categoryMapper.deleteByIds(37, 38, 39));
    }

    @Test
    void testSelectCount() {
        System.out.println(categoryMapper.selectCount());
    }

    @Test
    void testSelectByColumn() {
        for (CategoryVO categoryVO : categoryMapper.selectByColumn()) {
            System.out.println(categoryVO);
        }
    }
}
