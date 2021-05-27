$(document).ready(function(){

    $('#loading-example-btn').click(function () {
        btn = $(this);
        simpleLoad(btn, true)
        simpleLoad(btn, false)
    });

    var table=$("#GroupTable");
    var str="";//定义用于拼接的字符串
    $.ajax({
        url: "/User/getUserInfo.do",
        type: "post",
        data: {},
        async: false,//是否异步请求
        success: function (data) {
            if(data!=null&&data.role==1){
                $('#createProject').hide();
            }
        }

    })


    $("#table").bootstrapTable({
        url:'/Project/findAllSubject.do',  //获取表格数据
        //使用post传参，去掉后无法成功
        method: "get",
        toolbar:"#companyToolbar",
        cache: false,            //禁用ajax缓存
        striped: true,           //表格显示条纹
        pagination: true,        //在底部显示分页组件
        pageSize: 5,                       //每页的记录行数（*）
        pageList: [10, 25, 50, 100],
        pageNumber: 1,            // 首页页码
        sidePagination: 'server', // 设置为服务器端分页
        showColumns:true,        //是否显示内容列下拉框
        showToggle:false,         //切换详细视图和列表视图
        singleSelect:true,        //单选checkbox
        clickToSelect: true,
        onClickRow:function (row,$element) {
            $('.info').removeClass('info');//移除class
            $($element).addClass('info');//添加class
        },
        queryParams:function (params){   //请求服务器数据时，添加额外参数
            return {
                limit : params.limit, // 每页显示数量
                offset : params.offset, // SQL语句起始索引
            }
        },
        idField:'subjectId',             //指定主键列
        columns:[{

            // radio: true, // 单选
            checkbox: true,
            width: 50
        },{
            field:'subjectname',  //返回json中的name
            title:'Nom du projet',   //表格表头显示文字
            halign:'center', //表头居中
            align:'center',
            valign: 'middle' // 上下居中
        },{
            field:'description',  //返回json中的name
            title:'Description',   //表格表头显示文字
            halign:'center',
            align:'center',   //左右居中
            valign: 'middle', // 上下居中
            formatter:function(value,row,index){
                value=row.description;
                if(value.length>20){
                    value= value.substr(0, 80)+'...'
                }
                return value;
            }
        }
        ]
    });

});

function simpleLoad(btn, state) {
    if (state) {
        btn.children().addClass('fa-spin');
        btn.contents().last().replaceWith(" Loading");
    } else {
        setTimeout(function () {
            btn.children().removeClass('fa-spin');
            btn.contents().last().replaceWith(" Refresh");
        }, 2000);
    }
}

function createProject(){
    // 获取当前行
    var row=$("#table").bootstrapTable('getSelections');
    console.log(window.parent.document.getElementById("J_iframe"));
    window.parent.document.getElementById("J_iframe").setAttribute('src',"/showSubject.html");
}

function showProjectInformation() {
    var row=$("#table").bootstrapTable('getSelections');
    if(row==null||row.length==0){
        alert("Choisir un projet !!!")
        return;
    }
    window.parent.document.getElementById("J_iframe").setAttribute('src',"/Project/subjectInformation.do?subjectId="+row[0].subjectid);

    // window.location.href="http://localhost:8080/simpleforum/Subject/toCreateSubjectPage.do";

}