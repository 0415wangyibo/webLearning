package com.potoyang.myblog.data.index;

import com.potoyang.myblog.controller.response.TagIndexResp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/20 10:17
 * Modified:
 * Description:
 */
public class TagData {

    public static List<TagIndexResp> getTagIndexData() {
        String[] tagIndexNames = new String[]{"Go", "语言", "前端", "后端", "有意思"};
        List<TagIndexResp> tagIndexRespList = new ArrayList<>();
        TagIndexResp tagIndexResp;
        for (int i = 0; i < 5; i++) {
            tagIndexResp = new TagIndexResp(tagIndexNames[i]);
            tagIndexRespList.add(tagIndexResp);
        }
        return tagIndexRespList;
    }
}
