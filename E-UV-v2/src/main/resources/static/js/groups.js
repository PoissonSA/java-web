$(document).ready(function(){
    var joinResult = document.getElementById("joinResult").innerText;
    window.groupId=null;
    if(joinResult!=""){
        alert(joinResult);
    }

    $('#loading-example-btn').click(function () {
        btn = $(this);
        simpleLoad(btn, true)

        // Ajax example
//                $.ajax().always(function () {
//                    simpleLoad($(this), false)
//                });

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
                 $('#enterGroup').hide();
                $('#validerGroup').hide();

            }else if(data!=null&&data.role==0){
                $('#joinGroup').hide();
                $('#creatGroup').hide();

            }
            if(data!=null&&data.groupid!=null){
                window.groupId=data.groupid;
            }
        }

    })


    $("#table").bootstrapTable({
        url:'/Group/findAllGroup.do',  //获取表格数据
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
        singleSelect:false,        //单选checkbox
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
            field:'groupName',  //返回json中的name
            title:'group name',   //表格表头显示文字
            halign:'center', //表头居中
            align:'center',
            valign: 'middle' // 上下居中
        },{
            field:'subjectName',  //返回json中的name
            title:'Nom du projet',   //表格表头显示文字
            halign:'center',
            align:'center',   //左右居中
            valign: 'middle' // 上下居中
        },{
            field:'total',  //返回json中的name
            title:'total',   //表格表头显示文字
            halign:'center',
            align:'center',   //左右居中
            valign: 'middle' ,// 上下居中
            formatter:function(value,row,index){
                var value="";
                value=row.total+'/( '+row.number_min+'~'+row.number_max+' )'
                return value;
        }
        },
            {
            field:'is_valid',  //返回json中的name
            title:'valide',   //表格表头显示文字
            halign:'center',
            align:'center',   //左右居中
            valign: 'middle' ,// 上下居中
            formatter:function(value,row,index){
                var value="";
                if(row.is_valid=="0"){
                    value = "Non";
                }else{
                    value = "Oui";
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

function createGroup(){
    if(window.groupId!=null){
        alert('you already have a group!!!');
        return;
    }
    // 获取当前行
    var row=$("#table").bootstrapTable('getSelections');
    console.log(window.parent.document.getElementById("J_iframe"));
    window.parent.document.getElementById("J_iframe").setAttribute('src',"/groupCreation.html");
}

function showProjectInformation() {
    var row=$("#table").bootstrapTable('getSelections');
    console.log(row[0].subjectid);
    window.parent.document.getElementById("J_iframe").setAttribute('src',"/Project/subjectInformation.do?subjectId="+row[0].subjectid);

    // window.location.href="http://localhost:8080/simpleforum/Subject/toCreateSubjectPage.do";
}
function joinGroup() {
    if(window.groupId!=null){
        alert('you already have a group!!!');
        return;
    }
    var row=$("#table").bootstrapTable('getSelections');
    if(row==null||row.length==0){
        alert('choose a group first');
        return;
    }
    if(row.length!=1){
        alert('choose one group');
        return;
    }
    if(row[0].total==row[0].number_max){
        alert('The number of groups has reached the upper limit');
        return;
    }
   // window.parent.document.getElementById("J_iframe").setAttribute('src',"/Project/subjectInformation.do?subjectId="+row[0].subjectid);
    var gnl=confirm("确定要加入?");
    if (gnl==true){
        window.location.href="/Group/joinGroup.do?groupId="+row[0].groupId;
    }else{
        return false;
    }
}

function enterMyGroup() {
    var row=$("#table").bootstrapTable('getSelections');
    if(row==null||row.length==0){
        alert('choose a group first');
        return;
    }
    if(row.length!=1){
        alert('choose one group');
        return;
    }
    window.parent.document.getElementById("J_iframe").setAttribute('src',"/Group/groupPage.do?groupId="+row[0].groupId);
}

function validerGroup() {
    var row=$("#table").bootstrapTable('getSelections');
    if(row==null||row.length==0){
        alert('Sélectionner un groupe');
        return;
    }
    if(row.length!=1){
        alert('Sélectionner un groupe');
        return;
    }
    if(row[0].is_valid==1){
        alert('Le groupe a été validé');
        return;
    }

    window.parent.document.getElementById("J_iframe").setAttribute('src',"/Group/validerGroup.do?groupId="+row[0].groupId);
}