package com.potoyang.myblog.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/21 18:55
 * Modified:
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleSummaryResp implements Serializable {
    private String schedule;
}
