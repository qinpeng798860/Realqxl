$(function () {
    //时间选择器

    inputDateEdit("datetimepicker2s", "datetimepicker2");
    inputDateEdit("rblsj", "rblsjvalue");
    inputDateEdit("rjssj", "rjssjvalue");

})

//开始办理
function bigenServerMange() {
    var option = $("#editServerTypeForm").serialize();//序列化获取表单数据
    option = decodeURIComponent(option, true);//解码 不解码中文乱码
    bootbox.confirm("确定开始办理吗?", function (result) { /* your callback code */
        if($("#rZtid").val()!=5 && $("#rZtid").val()!=6 && $("#rZtid").val()!=7){
            if(result){
                $.ajax({
                    url:rootPath+'serverManage/addServerManage?'+option,
                    data:'',
                    dataType:'json',
                    type:'post',
                    async:false,
                    success:function(data){
                        if(data.code!=-1){
                            alert(data.message);
                            $("#editServerManage").modal('hide');  //手动关闭
                            queryManage();
                        }
                    }
                });
            }
        }else {
            bootbox.alert("您已经开始办理了 无需再次办理", function(){ /* your callback code */ })
        }
    })
}



//退回重审
function manageBack(){
    console.log($("#rBlid").val());
    if($("#rZtid").val()==6){
        bootbox.alert("退回失败！或已完结", function(){ /* your callback code */ })
    }else{
        $.ajax({
            url:rootPath+'serverManage/manageBack',
            data:{'id':$("#rSerid").val(),'rZt':'7','rBlid':$("#rBlid").val()},
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                if(data.code!=-1){
                    alert(data.message);
                    $("#editServerManage").modal('hide');  //手动关闭
                    queryManage();
                }
            }

        });
    }
}


/*关闭模态框 并刷新表格数据*/
$("#editServerManage").on("hidden.bs.modal", function () {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    /*    queryTypeServer();*/
});