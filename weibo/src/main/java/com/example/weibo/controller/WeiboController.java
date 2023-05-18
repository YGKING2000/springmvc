package com.example.weibo.controller;

import com.example.weibo.mapper.WeiboMapper;
import com.example.weibo.pojo.dto.WeiboDTO;
import com.example.weibo.pojo.entity.Weibo;
import com.example.weibo.pojo.vo.UserVO;
import com.example.weibo.pojo.vo.WeiboVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
@Slf4j
@RestController
@RequestMapping("/v1/weibo")
@Api(tags = "02.微博管理模块")
public class WeiboController {

    @Resource
    private WeiboMapper weiboMapper;

    @PostMapping("/insert")
    @ApiOperation(value = "发表微博功能")
    public int insert(@Validated @RequestBody WeiboDTO weiboDTO, HttpSession session) {
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

    @GetMapping("/selectIndex")
    @ApiOperation(value = "查询所有微博内容")
    public List<WeiboVO> selectIndex() {
        return weiboMapper.selectIndex();
    }

    @GetMapping("/selectById")
    @ApiOperation(value = "查询指定微博详情")
    public WeiboVO selectById(int id) {
        return weiboMapper.selectById(id);
    }

    @GetMapping("/doSelectById/{id}")
    @ApiOperation(value = "查询指定微博详情")
    @ApiImplicitParam(name = "id", value = "微博ID", required=true, dataType = "int")
    public WeiboVO doSelectById(@PathVariable("id") int id) throws RuntimeException {
        // 日志等级优先级: trace<debug<info<warn<error
        log.debug("id's value is {}", id);
        if (id <= 0) {
            throw new IllegalArgumentException("id值错误");
        }
        return weiboMapper.selectById(id);
    }

    @PostMapping("/doInsert")
    @ApiOperation(value = "发表微博功能")
    public int doInsert(@Validated @RequestBody WeiboDTO weiboDTO) {
        Weibo weibo = new Weibo();
        BeanUtils.copyProperties(weiboDTO, weibo);
        weibo.setUserId(1);
        weibo.setCreated(new Date());
        weiboMapper.insert(weibo);
        return 1;
    }

    /* @ExceptionHandler(RuntimeException.class)
    public ResultVO handlerException(RuntimeException e) {
        return new ResultVO(5000, e.getMessage(), null);
    }*/
}
