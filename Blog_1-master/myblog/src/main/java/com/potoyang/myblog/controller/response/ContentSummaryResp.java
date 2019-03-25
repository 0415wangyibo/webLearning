package com.potoyang.myblog.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/21 19:02
 * Modified:
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContentSummaryResp implements Serializable {
    private String title;
    private String description;
    private String imageUrl;
    private String articleUrl;
}
