package com.potoyang.myblog.controller;

import com.potoyang.myblog.controller.response.ContentSummaryResp;
import com.potoyang.myblog.controller.response.RestResult;
import com.potoyang.myblog.controller.response.ScheduleSummaryResp;
import com.potoyang.myblog.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/21 18:52
 * Modified:
 * Description:
 */
@CrossOrigin
@RequestMapping("summary")
@RestController
public class SummaryController {
    private final SummaryService summaryService;

    @Autowired
    public SummaryController(SummaryService summaryService) {
        this.summaryService = summaryService;
    }

    @GetMapping("schedule")
    public RestResult<List<ScheduleSummaryResp>> listSchedule() {
        return new RestResult<>(summaryService.listSchedule());
    }

    @GetMapping("content/{schedule}")
    public RestResult<List<ContentSummaryResp>> listContent(@PathVariable("schedule") String schedule) {
        return new RestResult<>(summaryService.listContent(schedule));
    }
}
