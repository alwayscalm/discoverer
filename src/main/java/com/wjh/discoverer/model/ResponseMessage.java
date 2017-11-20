package com.wjh.discoverer.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @author 一直很低调 on 2017/11/20
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ApiModel("响应基础类")
public class ResponseMessage {
    @NonNull
    @ApiModelProperty(value = "响应码", required = true)
    private int code;

    @NonNull
    @ApiModelProperty(value = "响应消息", required = true)
    private String message;

    @ApiModelProperty(value = "返回数据")
    private String data;
}
