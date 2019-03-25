package com.potoyang.myblog.data.index;

import com.potoyang.myblog.controller.response.ArticleIndexResp;
import com.potoyang.myblog.controller.response.RecentIndexResp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/12/20 10:24
 * Modified:
 * Description:
 */
public class ArticleData {

    public static List<RecentIndexResp> getRecentIndexData() {
        String[] titles = new String[]{
                "关于通用代码和特殊情况之间的冲突",
                "Go 方法（第二部分）"
        };
        List<RecentIndexResp> recentIndexRespList = new ArrayList<>();
        RecentIndexResp recentIndexResp;
        for (int i = 0; i < 2; i++) {
            recentIndexResp = new RecentIndexResp(titles[i]);
            recentIndexRespList.add(recentIndexResp);
        }

        return recentIndexRespList;
    }

    public static List<ArticleIndexResp> getArticleIndexData() {
        String[] titles = new String[]{
                "关于通用代码和特殊情况之间的冲突",
                "Go 方法（第二部分）",
                "BUSINESS LUNCH - 20$",
                "关于通用代码和特殊情况之间的冲突",
                "Go 方法（第二部分）"
        };
        String[] descriptions = new String[]{
                "<p>这篇文章研究了 <code>io.Copy</code> 的设计和实现，该函数用可能是最简单的方法连接一个 <code>Reader</code> 到一个 <code>Writer</code>：该函数从一个地方传输数据到另一个地方。</p>",
                "<p>这篇文章介绍了关于 Go 语言中方法的剩余部分。强烈建议先阅读<a href='https://studygolang.com/articles/14061'>第一部分</a>的介绍部分。</p>\n" +
                        "<h2>方法表达式</h2>\n" +
                        "<p>如果有这样一个类型 T，它的方法集中包含方法 M，则 T.M 会生成一个与方法 M 几乎相同且带有签名的方法，这称为 <em>方法表达式</em>。不同之处在于，它额外附带的第一个参数与 M 的接收者类型相等。</p>",
                "Lorem ipsum dolor sit amet, consectetur adipt isi cing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim addg minim veniam, quis nostrud exercitation",
                "<p>这篇文章研究了 <code>io.Copy</code> 的设计和实现，该函数用可能是最简单的方法连接一个 <code>Reader</code> 到一个 <code>Writer</code>：该函数从一个地方传输数据到另一个地方。</p>",
                "<p>这篇文章介绍了关于 Go 语言中方法的剩余部分。强烈建议先阅读<a href='https://studygolang.com/articles/14061'>第一部分</a>的介绍部分。</p>\n" +
                        "<h2>方法表达式</h2>\n" +
                        "<p>如果有这样一个类型 T，它的方法集中包含方法 M，则 T.M 会生成一个与方法 M 几乎相同且带有签名的方法，这称为 <em>方法表达式</em>。不同之处在于，它额外附带的第一个参数与 M 的接收者类型相等。</p>"
        };
        LocalDate[] localDates = new LocalDate[]{
                LocalDate.parse("2018-12-06"),
                LocalDate.parse("2016-11-03"),
                LocalDate.parse("2017-02-11"),
                LocalDate.parse("2018-12-06"),
                LocalDate.parse("2016-11-03")
        };
        String[] tags = new String[]{
                "Go/翻译/教程/语言",
                "翻译/教程",
                "May 13",
                "Go/翻译/教程/语言",
                "翻译/教程"
        };
        List<ArticleIndexResp> articleIndexRespList = new ArrayList<>();
        ArticleIndexResp articleIndexResp;
        for (int i = 0; i < 5; i++) {
            articleIndexResp = new ArticleIndexResp(titles[i], descriptions[i], localDates[i], tags[i]);
            articleIndexRespList.add(articleIndexResp);
        }
        return articleIndexRespList;
    }

    public static List<ArticleIndexResp> getMoreArticle() {
        String[] titles = new String[]{
                "关于通用代码和特殊情况之间的冲突",
                "Go 方法（第二部分）",
                "BUSINESS LUNCH - 20$"
        };
        String[] descriptions = new String[]{
                "<p>这篇文章研究了 <code>io.Copy</code> 的设计和实现，该函数用可能是最简单的方法连接一个 <code>Reader</code> 到一个 <code>Writer</code>：该函数从一个地方传输数据到另一个地方。</p>",
                "<p>这篇文章介绍了关于 Go 语言中方法的剩余部分。强烈建议先阅读<a href='https://studygolang.com/articles/14061'>第一部分</a>的介绍部分。</p>\n" +
                        "<h2>方法表达式</h2>\n" +
                        "<p>如果有这样一个类型 T，它的方法集中包含方法 M，则 T.M 会生成一个与方法 M 几乎相同且带有签名的方法，这称为 <em>方法表达式</em>。不同之处在于，它额外附带的第一个参数与 M 的接收者类型相等。</p>",
                "Lorem ipsum dolor sit amet, consectetur adipt isi cing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim addg minim veniam, quis nostrud exercitation"
        };
        LocalDate[] localDates = new LocalDate[]{
                LocalDate.parse("2018-12-06"),
                LocalDate.parse("2016-11-03"),
                LocalDate.parse("2017-02-11")
        };
        String[] tags = new String[]{
                "Go/翻译/教程/语言",
                "翻译/教程",
                "May 13"
        };
        List<ArticleIndexResp> articleIndexRespList = new ArrayList<>();
        ArticleIndexResp articleIndexResp;
        for (int i = 0; i < 3; i++) {
            articleIndexResp = new ArticleIndexResp(titles[i], descriptions[i], localDates[i], tags[i]);
            articleIndexRespList.add(articleIndexResp);
        }
        return articleIndexRespList;
    }
}
