window.onunload = initSummary();

function initSummary() {
    initSchedule();
}

function initSchedule() {
    $.ajax({
        type: "get",
        url: "http://127.0.0.1:9999/summary/schedule",
        dataType: "json",
        success: function (resp) {
            var data = resp.data;
            initScheduleData(data);
        },
        error: function () {
            toastr.error("获取时间分类失败")
        }
    });

    function initScheduleData(data) {
        var scheduleId = $("#schedule");
        scheduleId.empty();
        for (var i = 0; i < data.length; i++) {
            scheduleId.append(
                '<li role="presentation" class="active">\n' +
                '<a href="Summary.html#' + data[i].schedule + '" role="tab" data-toggle="tab">\n' +
                data[i].schedule +
                '</a>\n' +
                '</li>'
            );
        }
    }
}