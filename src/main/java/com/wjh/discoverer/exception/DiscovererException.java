package com.wjh.discoverer.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 一直很低调 on 2017/11/19
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscovererException extends RuntimeException {
    private static final long serialVersionUID = -6293832430910884734L;

    private int code;
    private String message;
}
