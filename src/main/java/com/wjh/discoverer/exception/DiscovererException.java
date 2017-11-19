package com.wjh.discoverer.exception;

import lombok.Data;

/**
 * @author wangjianhua on 2017/11/19
 */
@Data
public class DiscovererException extends RuntimeException {
    private static final long serialVersionUID = -6293832430910884734L;

    private int code;
    private String message;
}
