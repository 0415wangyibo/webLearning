package com.potoyang.myblog.controller.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/20 10:29
 * Modified:
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleIndexResp implements Serializable {
    private String title;
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate publishDate;
    private String tag;
}
