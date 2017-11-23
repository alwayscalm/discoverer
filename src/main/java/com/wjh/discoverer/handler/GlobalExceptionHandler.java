package com.wjh.discoverer.handler;

import com.wjh.discoverer.exception.DiscovererException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理类
 * @author 一直很低调 on 2017/11/19
 * @since 1.0
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(DiscovererException.class)
    public String handlerDiscovererException(HttpServletRequest request,
                                             HttpServletResponse response,
                                             DiscovererException discovererException){
        log.info("#occur error: {}", discovererException.getMessage());
        return null;
    }
}
