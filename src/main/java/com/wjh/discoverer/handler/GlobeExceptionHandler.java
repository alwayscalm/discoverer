package com.wjh.discoverer.handler;

import com.wjh.discoverer.exception.DiscovererException;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理类
 * @author wangjianhua on 2017/11/19
 */
@Log4j2
@ControllerAdvice
public class GlobeExceptionHandler {
    @ExceptionHandler(DiscovererException.class)
    public String handlerDiscovererException(HttpServletRequest request,
                                             HttpServletResponse response,
                                             DiscovererException discovererException){
        log.info("#occur error: {}", discovererException.getMessage());
        return null;
    }
}
