package com.potoyang.myblog.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/20 10:00
 * Modified:
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagIndexResp implements Serializable {
    private String name;
}
