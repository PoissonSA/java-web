$(document).ready(function(){
    $.ajax({
        url: "/User/getUserInfo.do",
        type: "post",
        data: {},
        async: false,//是否异步请求
        success: function (data) {
            if(data!=null&&data.role==1){
                $('#meetingBox').hide();
            }else if(data!=null&&data.role==0){
                $('#uploadfileBox').hide();
            }
        }

    })
    
    

    $('#datetimepicker1').datetimepicker({

        format: 'YYYY-MM-DD',

        locale: moment.locale('zh-cn')

    });

    $('#datetimepicker2').datetimepicker({

        format: 'YYYY-MM-DD hh:mm',

        locale: moment.locale('zh-cn')

    });

    $("#uploadfile").fileinput({

        language: 'en', //设置语言

        uploadUrl:"/Group/uploadFile.do?groupId="+groupId, //上传的地址

        allowedFileExtensions: ['pdf', 'gif', 'png'],//接收的文件后缀

        //uploadExtraData:{"id": 1, "fileName":'123.mp3'},

        uploadAsync: false, //默认异步上传

        showUpload:true, //是否显示上传按钮

        showRemove :true, //显示移除按钮

        showPreview :true, //是否显示预览

        showCaption:true,//是否显示标题

        browseClass:"btn btn-primary", //按钮样式    

        dropZoneEnabled: true,//是否显示拖拽区域

        //minImageWidth: 50, //图片的最小宽度

        //minImageHeight: 50,//图片的最小高度

        //maxImageWidth: 1000,//图片的最大宽度

        //maxImageHeight: 1000,//图片的最大高度

        //maxFileSize:0,//单位为kb，如果为0表示不限制文件大小

        //minFileCount: 0,

        maxFileCount:1, //表示允许同时上传的最大文件个数

        enctype:'multipart/form-data',

        validateInitialCount:true,

        previewFileIcon: "<iclass='glyphicon glyphicon-king'></i>",

        msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",

    }).on("filebatchuploadsuccess", function(event,data,previewId,index) {

        if(data.response){
            $("#fileName").text(data.response.fileName);
            alert(data.response.message);
            window.location.reload();

        }
        // console.log(data.response.message);
        });
});
function  exportFile(){
     window.location.href="/Group/exportFile.do?groupId="+groupId;

}
function setMeeting() {
    json={};
    json.groupId=window.groupId
    json.mDate=$('#mDate').val();
    $.ajax({
        url: "/Meeting/setMeeting.do",
        type: "get",
        data: json,
        async: false,//是否异步请求
        success: function (data) {
            var jsonObj =  JSON.parse(data);
            if(jsonObj&&jsonObj.msg){
                alert("Propose dating success");
                window.location.reload();
            }
        }

    })
}
