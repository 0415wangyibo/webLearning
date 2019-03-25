package com.potoyang.myblog.service.impl;

import com.potoyang.myblog.controller.response.ArticleIndexResp;
import com.potoyang.myblog.controller.response.CategoryIndexResp;
import com.potoyang.myblog.controller.response.RecentIndexResp;
import com.potoyang.myblog.controller.response.TagIndexResp;
import com.potoyang.myblog.data.index.ArticleData;
import com.potoyang.myblog.data.index.CategoryData;
import com.potoyang.myblog.data.index.TagData;
import com.potoyang.myblog.service.IndexService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/20 10:01
 * Modified:
 * Description:
 */
@Service
public class IndexServiceImpl implements IndexService {
//    private static final Logger LOGGER = LoggerFactory.getLogger(IndexService.class);

    @Override
    public List<CategoryIndexResp> listCategory() {
        return CategoryData.getCategoryIndexData();
    }

    @Override
    public List<TagIndexResp> listTag() {
        return TagData.getTagIndexData();
    }

    @Override
    public List<RecentIndexResp> listRecent() {
        return ArticleData.getRecentIndexData();
    }

    @Override
    public List<ArticleIndexResp> listArticle() {
        return ArticleData.getArticleIndexData();
    }

    @Override
    public List<ArticleIndexResp> listMoreArticle() {
        return ArticleData.getMoreArticle();
    }
}
