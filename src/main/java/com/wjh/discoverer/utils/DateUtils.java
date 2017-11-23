package com.wjh.discoverer.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 一直很低调(1223271200@qq.com) on 2017/11/20
 * @since 1.0
 */
@Slf4j
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {
    private static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    private static final String DATETIME_FORMAT_NO_LINE = "yyyyMMddHHmmss";
    private static final String DATE_FORMAT_NO_LINE = "yyyyMMdd";

    public static String getDefaultDatetimeFormat(Date date){
        String dateTime = null;
        try{
            SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT);
            dateTime = formatter.format(date);
        } catch (Exception e){
            log.error("parse time occur error:{}", ExceptionUtils.getStackTrace(e));
        }
        return dateTime;
    }
}
