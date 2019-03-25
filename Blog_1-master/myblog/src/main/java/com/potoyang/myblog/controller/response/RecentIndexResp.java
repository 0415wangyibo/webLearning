package com.potoyang.myblog.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/20 10:22
 * Modified:
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecentIndexResp implements Serializable {
    private String title;
}
