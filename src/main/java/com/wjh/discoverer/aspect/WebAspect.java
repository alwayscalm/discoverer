package com.wjh.discoverer.aspect;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author 一直很低调(1223271200@qq.com) on 2017/11/21
 * @since 1.0
 */
@Aspect
@Order(1)//值越小，优先级越高
@Component
@Log4j2
public class WebAspect {
    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * com.wjh.discoverer.controller..*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());

        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        log.info("URL : {}", request.getRequestURL().toString());
        log.info("HTTP_METHOD : {}", request.getMethod());
        log.info("IP : {}", request.getRemoteAddr());
        log.info("CLASS_METHOD : {}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        log.info("ARGS : {}", Arrays.toString(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        try {
            log.info("RESPONSE : {}", ret);
            log.info("SPEND TIME : {}", (System.currentTimeMillis() - startTime.get()));
        }finally {
            startTime.remove();
        }
    }
    /**
     * 使用@Around貌似可以一步替代上面的两个方法
     */
    @Around(value = "webLog()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) {
        Object ret = null;
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        long startTime = 0L;
        try {
            log.info("URL : {}", request.getRequestURL().toString());
            log.info("HTTP_METHOD : {}", request.getMethod());
            log.info("IP : {}", request.getRemoteAddr());
            log.info("CLASS_METHOD : {}.{}", proceedingJoinPoint.getSignature().getDeclaringTypeName(), proceedingJoinPoint.getSignature().getName());
            log.info("ARGS : {}", Arrays.toString(proceedingJoinPoint.getArgs()));
            startTime = System.currentTimeMillis();
            ret = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            log.error("Save log has error: {}", ExceptionUtils.getMessage(e));
        }
        log.info("RESPONSE : {}", ret);
        log.info("SPEND TIME : {}ms", (System.currentTimeMillis() - startTime));
        return ret;
    }

}
