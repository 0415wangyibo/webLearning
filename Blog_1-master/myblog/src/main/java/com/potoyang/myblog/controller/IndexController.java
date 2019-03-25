package com.potoyang.myblog.controller;

import com.potoyang.myblog.controller.response.*;
import com.potoyang.myblog.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/20 09:55
 * Modified:
 * Description:
 */
@RequestMapping("index")
@RestController
@CrossOrigin
public class IndexController {
    private final IndexService indexService;

    @Autowired
    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }

    @GetMapping("category")
    public RestResult<List<CategoryIndexResp>> listCategory() {
        return new RestResult<>(indexService.listCategory());
    }

    @GetMapping("tag")
    public RestResult<List<TagIndexResp>> listTag() {
        return new RestResult<>(indexService.listTag());
    }

    @GetMapping("recent")
    public RestResult<List<RecentIndexResp>> listRecent() {
        return new RestResult<>(indexService.listRecent());
    }

    @GetMapping("article")
    public RestResult<List<ArticleIndexResp>> listArticle() {
        return new RestResult<>(indexService.listArticle());
    }


    @GetMapping("article/more")
    private RestResult<List<ArticleIndexResp>> listMoreArticle() {
        return new RestResult<>(indexService.listMoreArticle());
    }
}
