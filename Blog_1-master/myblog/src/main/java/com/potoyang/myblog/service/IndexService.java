package com.potoyang.myblog.service;

import com.potoyang.myblog.controller.response.ArticleIndexResp;
import com.potoyang.myblog.controller.response.CategoryIndexResp;
import com.potoyang.myblog.controller.response.RecentIndexResp;
import com.potoyang.myblog.controller.response.TagIndexResp;

import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/20 10:01
 * Modified:
 * Description:
 */

public interface IndexService {
    // 获取分类列表信息
    List<CategoryIndexResp> listCategory();

    // 获取标签列表信息
    List<TagIndexResp> listTag();

    // 获取最近文章列表信息
    List<RecentIndexResp> listRecent();

    // 获取首页文章列表信息
    List<ArticleIndexResp> listArticle();

    // 获取首页更多文章列表信息
    List<ArticleIndexResp> listMoreArticle();
}
