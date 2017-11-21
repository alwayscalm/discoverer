package com.wjh.discoverer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 一直很低调(1223271200@qq.com) on 2017/11/21
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String name;
    private String password;
}
