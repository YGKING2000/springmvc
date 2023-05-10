package com.example.mybatisxml;

import com.example.mybatisxml.mapper.CommentMapper;
import com.example.mybatisxml.mapper.UserMapper;
import com.example.mybatisxml.mapper.WeiboMapper;
import com.example.mybatisxml.pojo.entity.Comment;
import com.example.mybatisxml.pojo.entity.User;
import com.example.mybatisxml.pojo.entity.Weibo;
import com.example.mybatisxml.pojo.vo.CommentVO;
import com.example.mybatisxml.pojo.vo.WeiboDetailVO;
import com.example.mybatisxml.pojo.vo.WeiboIndexVO;
import com.example.mybatisxml.pojo.vo.WeiboVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootTest
class MybatisxmlApplicationTests {

    /**
     * 测试向数据库中插入一条数据的方法是否可行
     */
    // 1.自动装配
    @Autowired
    private UserMapper userMapper;

    // 2.测试插入数据
    @Test
    void testUserInsert() {
        User user = new User();
        // user.setUsername("胡歌");
        user.setUsername("刘亦菲");
        user.setPassword("123456");
        // user.setNickname("梅长苏");
        user.setNickname("赵盼儿");
        user.setCreated(new Date());
        System.out.println(userMapper.insert(user));
    }

    /**
     * 测试查询user表中的id符合要求的所有数据的指定字段
     */
    @Test
    void testUserSelect() {
        System.out.println(userMapper.selectByIdAndColumn(2));
    }

    /**
     * 测试向weibo表中插入一条数据
     */
    @Autowired
    private WeiboMapper weiboMapper;

    @Test
    void testWeiboInsert() {
        Weibo weibo = new Weibo();
        /*"寒蝉凄切，对长亭晚，骤雨初歇。都门帐饮无序，留恋处，兰舟催发。执手相看泪眼，竟无语凝噎。" +
                "念去去，千里烟波，暮霭沉沉楚天阔。多情自古伤离别，更那堪，冷落清秋节！" +
                "今宵酒醒何处？杨柳岸，晓风残月。此去经年，应是良辰好景虚设。" +
                "便纵有千种风情，更与何人说。"
                "十年生死两茫茫，不思量，自难忘。千里孤坟，无处话凄凉。纵使相逢应不识，尘满面，鬓如霜。" +
                "夜来幽梦忽还乡，小轩窗，正梳妆。相顾无言，惟有泪千行。料得年年肠断处，明月夜，短松冈。"*/
        weibo.setContent("纵使相逢应不识，尘满面，鬓如霜");
        weibo.setCreated(new Date());
        weibo.setUserId(2);
        // weibo.setUserId(2);
        System.out.println(weiboMapper.insert(weibo));
    }

    /**
     * 测试根据id删除表weibo中一条数据
     */
    @Test
    void testWeiboDeleteById() {
        System.out.println(weiboMapper.deleteById(2));
    }

    /**
     * 测试根据id修改weibo表中的一条数据
     */
    @Test
    void testWeiboUpdateById() {
        Weibo weibo = new Weibo();
        weibo.setId(1);
        /*  "十年生死两茫茫，不思量，自难忘。千里孤坟，无处话凄凉。纵使相逢应不识，尘满面，鬓如霜。" +
            "夜来幽梦忽还乡，小轩窗，正梳妆。相顾无言，惟有泪千行。料得年年肠断处，明月夜，短松冈。"
            "寒蝉凄切，对长亭晚，骤雨初歇。都门帐饮无序，留恋处，兰舟催发。执手相看泪眼，竟无语凝噎。" +
            "念去去，千里烟波，暮霭沉沉楚天阔。多情自古伤离别，更那堪，冷落清秋节！" +
            "今宵酒醒何处？杨柳岸，晓风残月。此去经年，应是良辰好景虚设。" +
            "便纵有千种风情，更与何人说。"*/
        weibo.setContent("今宵酒醒何处？杨柳岸，晓风残月");
        weibo.setCreated(new Date());
        weibo.setUserId(1);
        // weibo.setUserId(2);
        System.out.println(weiboMapper.updateById(weibo));
    }

    /**
     * 测试查询weibo表中的所有数据
     */
    @Test
    void selectAll() {
        for (Weibo weibo : weiboMapper.selectAll()) {
            System.out.println(weibo);
        }
    }

    /**
     * 测试根据id查询weibo表中的一条数据
     */
    @Test
    void selectById() {
        System.out.println(weiboMapper.selectById(3));
    }

    /**
     * 测试查询weibo表中所有数据的指定字段
     */
    @Test
    void selectByColumn() {
        for (WeiboVO w : weiboMapper.selectByColumn()) {
            System.out.println(w);
        }
    }

    @Test
    void selectWeiboCount() {
        System.out.println(weiboMapper.selectWeiboCount());
    }

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 向表comment中插入一条数据
     */
    @Test
    void testInsertComment() {
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            System.out.println(commentMapper.insert("兄弟为手足，女人为衣服。谁动我手足，我扒谁衣服", random.nextInt(2) + 1, random.nextInt(2) + 1));
        }
    }

    @Test
    void testUpdateComment() {
        System.out.println(commentMapper.updateById("千呼万唤始出来，犹抱琵琶半遮面", 2));
    }

    @Test
    void testDeleteByIds1() {
        Integer[] ids = {29, 28, 27};
        System.out.println(commentMapper.deleteByIds1(ids));
    }

    @Test
    void testDeleteByIds2() {
        System.out.println(commentMapper.deleteByIds2(24, 25, 26));
    }

    @Test
    void testDeleteByIds3() {
        List<Integer> ids = new ArrayList<>();
        ids.add(21);
        ids.add(22);
        ids.add(23);
        System.out.println(commentMapper.deleteByIds3(ids));
    }

    @Test
    void testDynamicUpdate() {
        Comment comment = new Comment();
        comment.setContent("在这个社会上敢怂才是英雄，不怂头破血流，猛男记住一句话，时势造英雄");
        comment.setId(18);
        System.out.println(commentMapper.dynamicUpdate(comment));
    }

    @Test
    void testSelect() {
        for (WeiboIndexVO weibo : weiboMapper.select()) {
            System.out.println(weibo);
        }
    }

    @Test
    void testSelectWeiboDetail() {
        for (WeiboDetailVO weibo : weiboMapper.selectWeiboDetail()) {
            System.out.println(weibo);
        }
    }

    @Test
    void testSelectCommentsByUserId() {
        for (CommentVO commentVO : commentMapper.selectCommentsByUserId(1)) {
            System.out.println(commentVO);
        }
    }

}
