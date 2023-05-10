package com.example.weibo.controller;

import com.example.weibo.mapper.WeiboMapper;
import com.example.weibo.pojo.dto.WeiboDTO;
import com.example.weibo.pojo.entity.Weibo;
import com.example.weibo.pojo.vo.UserVO;
import com.example.weibo.pojo.vo.WeiboVO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className WeiboController
 * @date 2023/05/12 17:21
 */
@RestController
@RequestMapping("/v1/weibo")
public class WeiboController {
    @Resource
    private WeiboMapper weiboMapper;

    @RequestMapping("/insert")
    public int insert(@RequestBody WeiboDTO weiboDTO, HttpSession session) {
        UserVO userVO = (UserVO) session.getAttribute("user");
        if (userVO == null) {
            return 2;
        }
        Weibo weibo = new Weibo();
        BeanUtils.copyProperties(weiboDTO, weibo);
        weibo.setUserId(userVO.getId());
        weibo.setCreated(new Date());
        weiboMapper.insert(weibo);
        return 1;
    }

    @RequestMapping("/selectIndex")
    public List<WeiboVO> selectIndex() {
        return weiboMapper.selectIndex();
    }

    @RequestMapping("/selectById")
    public WeiboVO selectById(int id) {
        return weiboMapper.selectById(id);
    }
}
