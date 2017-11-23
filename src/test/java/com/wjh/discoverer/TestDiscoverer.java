package com.wjh.discoverer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author 一直很低调 on 2017/11/19
 */
@Slf4j
@SpringBootApplication
@ActiveProfiles("test")
public class TestDiscoverer {
    public static void main(String[] args) {
        log.info("#TestDiscoverer will start");
        SpringApplication.run(TestDiscoverer.class,args);
        log.info("#TestDiscoverer start successful");
    }
}
