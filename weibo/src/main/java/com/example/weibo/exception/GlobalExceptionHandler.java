package com.example.weibo.exception;

import com.example.weibo.common.response.ResultVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 全局异常处理类
 * @className GlobalExceptionHandler
 * @date 2023/05/17 10:12
 */
// RestControllerAdvice: 用来标注全局异常处理类
// 该注解为@ControllerAdvice和@ResponseBody两个注解的组合
// 当某个Controller方法中出现了异常，此时在Controller类内部，又没有定义对应的异常处理方法(即使用注解@ExceptionHandler注解描述的方法)
// 系统底层就会查找有没有定义全局异常处理类中有这个异常处理方法，假如有就调用此方法处理异常
@RestControllerAdvice
public class GlobalExceptionHandler {
    /*
     * @ExceptionHandler: 描述的方法为一个异常处理方法，
     * 在此注解内部可以定义具体的异常处理类型(例如RuntimeException.class)
     * 此注解描述的方法需要定义一个异常类型的形式参数，通过这个参数接收具体的异常对象
     */
    @ExceptionHandler(RuntimeException.class)
    public ResultVO handlerException(RuntimeException e) {
        return new ResultVO(0, e.getMessage(), null);
    }
}
