package com.potoyang.myblog.data.summary;

import com.potoyang.myblog.controller.response.ContentSummaryResp;
import com.potoyang.myblog.controller.response.ScheduleSummaryResp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/21 18:57
 * Modified:
 * Description:
 */
public class SummaryData {

    public static List<ScheduleSummaryResp> getSchedule() {
        String[] schedules = new String[]{"2018", "2017", "2016", "2015"};
        List<ScheduleSummaryResp> scheduleSummaryRespList = new ArrayList<>();
        ScheduleSummaryResp scheduleSummaryResp;
        for (int i = 0; i < schedules.length; i++) {
            scheduleSummaryResp = new ScheduleSummaryResp(schedules[i]);
            scheduleSummaryRespList.add(scheduleSummaryResp);
        }
        return scheduleSummaryRespList;
    }

    public static List<ContentSummaryResp> getContent(String schedule) {
        String[] title2018 = new String[]{"关于通用代码和特殊情况之间的冲突", "关于通用代码和特殊情况之间的冲突"};
        String[] description2018 = new String[]{
                "<p>\n文章研究了 <code>io.Copy</code> 的设计和实现\n</p>",
                " <p>\n文章研究了 <code>io.Copy</code> 的设计和实现\n</p>"
        };
        String[] imageUrl2018 = new String[]{"media/summary/icon-1.jpg", "media/summary/icon-1.jpg"};
        String[] articleUrl2018 = new String[]{"Blog_001.html", "Blog_001.html"};


        String[] title2016 = new String[]{"关于通用代码和特殊情况之间的冲突", "关于通用代码和特殊情况之间的冲突"};
        String[] description2016 = new String[]{
                "<p>\n文章研究了 <code>io.Copy</code> 的设计和实现\n</p>",
                " <p>\n文章研究了 <code>io.Copy</code> 的设计和实现\n</p>"
        };
        String[] imageUrl2016 = new String[]{"media/summary/icon-2.jpg", "media/summary/icon-2.jpg"};
        String[] articleUrl2016 = new String[]{"Blog_001.html", "Blog_001.html"};

        List<ContentSummaryResp> contentSummaryRespList = new ArrayList<>();
        ContentSummaryResp contentSummaryResp;

        switch (schedule) {
            case "2018":
                for (int i = 0; i < 2; i++) {
                    contentSummaryResp = new ContentSummaryResp(title2018[i], description2018[i], imageUrl2018[i], articleUrl2018[i]);
                    contentSummaryRespList.add(contentSummaryResp);
                }
                break;
            case "2016":
                for (int i = 0; i < 2; i++) {
                    contentSummaryResp = new ContentSummaryResp(title2016[i], description2016[i], imageUrl2016[i], articleUrl2016[i]);
                    contentSummaryRespList.add(contentSummaryResp);
                }
                break;
            default:
                break;
        }
        return contentSummaryRespList;
    }
}
