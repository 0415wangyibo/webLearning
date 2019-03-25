package com.potoyang.myblog.service;

import com.potoyang.myblog.controller.response.ContentSummaryResp;
import com.potoyang.myblog.controller.response.ScheduleSummaryResp;

import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/21 18:53
 * Modified:
 * Description:
 */
public interface SummaryService {

    // 获取时间导航列表
    List<ScheduleSummaryResp> listSchedule();

    // 根据时间分类获取文章列表
    List<ContentSummaryResp> listContent(String schedule);
}
