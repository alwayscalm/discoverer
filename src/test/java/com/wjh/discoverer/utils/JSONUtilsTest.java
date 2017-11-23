package com.wjh.discoverer.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 一直很低调(1223271200@qq.com) on 2017/11/23
 * @since 1.0
 */
@Slf4j
@RunWith(SpringRunner.class)
public class JSONUtilsTest {
    @Test
    public void testToJsonString(){
        Map<String,Object> data = new HashMap<>();
        data.put("name", "一直很低调");
        data.put("time", new Date());

        log.info("JSON: {}",JSONUtils.toJsonString(data));
    }
}
