package com.potoyang.myblog.data.index;

import com.potoyang.myblog.controller.response.CategoryIndexResp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/20 10:08
 * Modified:
 * Description:
 */
public class CategoryData {

    public static List<CategoryIndexResp> getCategoryIndexData() {
        String[] categoryIndexNames = new String[]{"教程", "后端", "前端", "全栈"};
        Integer[] categoryIndexCount = new Integer[]{24, 16, 3, 4};
        List<CategoryIndexResp> categoryIndexRespList = new ArrayList<>();
        CategoryIndexResp categoryIndexResp;
        for (int i = 0; i < 4; i++) {
            categoryIndexResp = new CategoryIndexResp(categoryIndexNames[i], categoryIndexCount[i]);
            categoryIndexRespList.add(categoryIndexResp);
        }
        return categoryIndexRespList;
    }
}
