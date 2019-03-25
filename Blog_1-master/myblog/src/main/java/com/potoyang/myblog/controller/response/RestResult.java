package com.potoyang.myblog.controller.response;

import lombok.Data;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/20 09:57
 * Modified:
 * Description:
 */
@Data
public class RestResult<T> {
    private Integer code = 0;
    private String msg = "success";
    private T data;

    public RestResult(T data) {
        this.data = data;
    }
}
