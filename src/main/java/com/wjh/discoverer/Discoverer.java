package com.wjh.discoverer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author wangjianhua on 2017/11/18.
 */
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class Discoverer {
    public static void main(String[] args) {
        SpringApplication.run(Discoverer.class,args);
    }
}
