package com.example.weibo.mapper;

import com.example.weibo.pojo.entity.Weibo;
import com.example.weibo.pojo.vo.WeiboVO;

import java.util.List;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @date 2023/05/12 17:23
 */
public interface WeiboMapper {
    int insert(Weibo weibo);

    List<WeiboVO> selectIndex();

    WeiboVO selectById(int id);

    int selectUserId(int id);
}
