package com.example.weibo.controller;

import com.example.weibo.mapper.CommentMapper;
import com.example.weibo.mapper.WeiboMapper;
import com.example.weibo.pojo.dto.CommentDeleteDTO;
import com.example.weibo.pojo.vo.CommentVO;
import com.example.weibo.pojo.dto.CommentInsertDTO;
import com.example.weibo.pojo.entity.Comment;
import com.example.weibo.pojo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className CommentController
 * @date 2023/05/12 20:24
 */
@RestController
@RequestMapping("/v1/comment")
public class CommentController {
    @Resource
    private CommentMapper commentMapper;

    @Resource
    private WeiboMapper weiboMapper;

    @RequestMapping("/selectByWeiboId")
    public List<CommentVO> selectByWeiboId(int id) {
        return commentMapper.selectByWeiboId(id);
    }

    @RequestMapping("/insert")
    public int insert(@RequestBody CommentInsertDTO commentInsertDTO, HttpSession session) {
        UserVO userVO = (UserVO) session.getAttribute("user");
        if (userVO != null) {
            Comment comment = new Comment();
            BeanUtils.copyProperties(commentInsertDTO, comment);
            comment.setCreated(new Date());
            comment.setUserId(userVO.getId());
            commentMapper.insert(comment);
            return 1;
        }
        return 2;
    }

    @RequestMapping("/delete")
    public int delete(@RequestBody CommentDeleteDTO commentDeleteDTO, HttpSession session) {
        UserVO userVO = (UserVO) session.getAttribute("user");
        if (userVO != null) {
            int userId = weiboMapper.selectUserId(commentDeleteDTO.getWeiboId());
            if (userId == userVO.getId()) {
                commentMapper.delete(commentDeleteDTO.getId());
            }
            return 2;
        }
        return 3;
    }
}
