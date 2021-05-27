$(function () {

    $('#datetimepicker1').datetimepicker({

        format: 'YYYY-MM-DD',

        locale: moment.locale('zh-cn')

    });

    $('#datetimepicker2').datetimepicker({

        format: 'YYYY-MM-DD hh:mm',

        locale: moment.locale('zh-cn')

    });

});
