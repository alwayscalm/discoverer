package com.wjh.discoverer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 一直很低调 on 2017/11/18.
 */
@SpringBootApplication
@EnableScheduling
@EnableAsync
@Slf4j
public class Discoverer {
    public static void main(String[] args) {
        log.info("#Discoverer beginning start");
        SpringApplication.run(Discoverer.class,args);
        log.info("#Discoverer start successful");
    }
}
