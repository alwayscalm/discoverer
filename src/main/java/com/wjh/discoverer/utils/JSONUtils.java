package com.wjh.discoverer.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author 一直很低调(1223271200@qq.com) on 2017/11/23
 * @since 1.0
 */
public class JSONUtils extends JSON{

    public static String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String toJsonString(Object obj){
        return JSON.toJSONString(obj, SerializerFeature.WriteDateUseDateFormat);
    }

}
