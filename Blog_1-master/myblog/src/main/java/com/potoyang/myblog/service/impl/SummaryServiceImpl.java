package com.potoyang.myblog.service.impl;

import com.potoyang.myblog.controller.response.ContentSummaryResp;
import com.potoyang.myblog.controller.response.ScheduleSummaryResp;
import com.potoyang.myblog.data.summary.SummaryData;
import com.potoyang.myblog.service.SummaryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/21 18:52
 * Modified:
 * Description:
 */
@Service
public class SummaryServiceImpl implements SummaryService {

    @Override
    public List<ScheduleSummaryResp> listSchedule() {
        return SummaryData.getSchedule();
    }

    @Override
    public List<ContentSummaryResp> listContent(String schedule) {
        return SummaryData.getContent(schedule);
    }
}
