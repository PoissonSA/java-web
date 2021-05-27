$(document).ready(function() {

    loadSubjectdata();    //执行此函数，从后台获取数据，拼接成option标签，添加到select的里面
});
function loadSubjectdata(){
    $.ajax({
        url : "/Project/findAllSubjectName.do",    //后台controller中的请求路径
        type : 'GET',
        async : false,
        datatype : 'json',
        success : function(data) {
            if(data){


                for(var i=0,len=data.length;i<len;i++){
                    var subjectOption ='';
                    var subjectData = data[i];
                    //拼接成多个<option><option/>
                    subjectOption+='<option value="'+subjectData.subjectid+'">'+subjectData.subjectname+'</option>';
                    $("#subjectId").append(subjectOption);
                }
                // $("#parkID").append(parknames);    //根据parkID(根据你自己的ID写)填充到select标签中
            }
        },
        error : function() {
            alert('Wrong for Subject load！');
        }
    });
}