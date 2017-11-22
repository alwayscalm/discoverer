package com.wjh.discoverer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 一直很低调 on 2017/11/20
 * @since 1.0
 */
@RestController
@RequestMapping("/wjh")
public class BaseController {

    /**
     *
     */
    @GetMapping("/api")
    public String print(){
        return "hello world!";
    }
}
