package com.wjh.discoverer;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author wangjinahua on 2017/11/19
 */
@SpringBootTest
@Log4j2
@ActiveProfiles("test")
public class TestDiscoverer {
    public static void main(String[] args) {
        log.info("#TestDiscoverer will start");
        SpringApplication.run(TestDiscoverer.class,args);
        log.info("#TestDiscoverer start successful");
    }
}
