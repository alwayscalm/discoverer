package com.wjh.discoverer.constant;

/**
 * @author wangjianhua on 2017/11/19
 */
public enum ApiResponseCode {
    SUCCESS(0,"成功"),
    PARAM_ERROR(1,"参数错误"),

    /*10000-40000 自定义返回信息*/
    NOT_FOUND_MOVIE(10000,"电影资源不存在"),
    PARSER_ERROR(10001,"电影解析失败");

    private int code;
    private String message;

    ApiResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode(){
        return code;
    }

    public String getMessage() {
        return message;
    }
}
