window.onunload = init();

function init() {
    initCategoryDataAjax();
    initTagDataAjax();
    initRecentDataAjax();
    initArticleDataAjax();
}

function initCategoryDataAjax() {
    $.ajax({
        type: "get",
        url: "http://127.0.0.1:9999/index/category",
        dataType: "json",
        success: function (resp) {
            var data = resp.data;
            initCategoryData(data);
        },
        error: function () {
            // alert("失败");
            toastr.error('获取分类失败');
        }
    });

    function initCategoryData(data) {
        var category = $("#category");
        category.empty();
        for (var i = 0; i < data.length; i++) {
            category.append(
                '<li>\n' +
                '<a href="Classification.html">' + data[i].name + ' <span>(' + data[i].count + ')</span></a>\n' +
                '</li>\n'
            );
        }
    }
}

function initTagDataAjax() {
    $.ajax({
        type: "get",
        url: "http://127.0.0.1:9999/index/tag",
        dataType: "json",
        success: function (resp) {
            var data = resp.data;
            initTagData(data);
        },
        error: function () {
            toastr.error('获取标签失败');
        }
    });

    function initTagData(data) {
        var tag = $("#tag");
        tag.empty();
        for (var i = 0; i < data.length; i++) {
            tag.append(
                '<li>\n' +
                '<a href="Tag.html#">' + data[i].name + '</a>\n' +
                '</li>\n'
            );
        }
    }
}

function initRecentDataAjax() {
    $.ajax({
        type: "get",
        url: "http://127.0.0.1:9999/index/recent",
        dataType: "json",
        success: function (resp) {
            var data = resp.data;
            initRecentData(data);
        },
        error: function () {
            toastr.error('获取最近文章失败');
        }
    });

    function initRecentData(data) {
        var recent = $("#recent");
        recent.empty();
        for (var i = 0; i < data.length; i++) {
            recent.append(
                '<li>\n' +
                '<a href="Blog_00' + (i + 1) + '.html">\n' +
                '<div class="recent-article">\n' + (i + 1) + '. ' + data[i].title + '</div>\n' +
                '</a>\n' +
                '</li>\n'
            );
        }
    }
}

function initArticleDataAjax() {
    $.ajax({
        type: "get",
        url: "http://127.0.0.1:9999/index/article",
        dataType: "json",
        success: function (resp) {
            var data = resp.data;
            initArticleData(data);
        },
        error: function () {
            toastr.error('获取文章列表失败');
        }
    });

    function initArticleData(data) {
        var article = $("#article");
        article.empty();
        for (var i = 0; i < data.length; i++) {
            article.append(
                '<div class="article">\n' +
                '<div class="b-box-item">\n' +
                '<h1 class="line-title">' +
                data[i].title +
                '</h1>\n' +
                '<div class="b-caption">\n' +
                '<div class="caption-data">\n' +
                data[i].tag +
                '</div>\n' +
                '</div>\n' +
                '<div class="offer-text">\n' +
                '<p>\n' +
                data[i].description +
                '</div>\n' +
                '<div class="offer-datetime">\n' +
                data[i].publishDate +
                '<a href="Blog_00' + (i + 1) + '.html" class="read-more">\n' +
                'read more\n' +
                '</a>\n' +
                '</div>\n' +
                '</div>\n' +
                '</div>'
            );
        }

        article.append(
            '<div class="b-more text-center">\n' +
            '<button class="btn btn-primary btn-more" type="button">\n' +
            'see more\n' +
            '</button>\n' +
            '</div>'
        );
    }
}

$(".slideInRight").on('click', '.btn', function loadMore() {
    $.ajax({
        type: "get",
        url: "http://127.0.0.1:9999/index/article/more",
        dataType: "json",
        success: function (resp) {
            var data = resp.data;
            moreArticleData(data);
        },
        error: function () {
            toastr.error('获取文章列表失败');
        }
    });

    function moreArticleData(data) {
        var moreBlog = $(".b-more");
        moreBlog.remove();

        var article = $("#article");
        for (var i = 0; i < data.length; i++) {
            article.append(
                '<div class="article b-more-blogs">\n' +
                '<div class="b-box-item">\n' +
                '<h1 class="line-title">' +
                data[i].title +
                '</h1>\n' +
                '<div class="b-caption">\n' +
                '<div class="caption-data">\n' +
                data[i].tag +
                '</div>\n' +
                '</div>\n' +
                '<div class="offer-text">\n' +
                '<p>\n' +
                data[i].description +
                '</div>\n' +
                '<div class="offer-datetime">\n' +
                data[i].publishDate +
                '<a href="Blog_00' + (i + 1) + '.html" class="read-more">\n' +
                'read more\n' +
                '</a>\n' +
                '</div>\n' +
                '</div>\n' +
                '</div>'
            );
        }

        article.append(
            '<div class="b-more text-center">\n' +
            '<button class="btn btn-primary btn-more" type="button">\n' +
            'see more\n' +
            '</button>\n' +
            '</div>'
        );
    }
});

