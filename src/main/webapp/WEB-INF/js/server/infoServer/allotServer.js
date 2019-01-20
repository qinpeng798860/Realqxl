$(function(){

    queryCompanyrFwlx('rSSgs',$("#typeFwlx").val());
    /*提交表单*/
    $("#allotServer_submit").click(function(){
        //业务逻辑
        allotServerSubmit();
    })

})


function allotServerSubmit(){
    var option=$("#allotServerFrom").serialize();//序列化获取表单数据
    option = decodeURIComponent(option,true);//解码 不解码中文乱码
    //查看验证是否通过
    if($("#rSSgs").val()!=''){
       var rDj=$("#rSSgs option:selected").attr("title");
       $.ajax({
            url:rootPath+'server/addallotServer?'+option,
            data:{"rDj":rDj},
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                if(data.code!=-1){
                    alert(data.message);
                    $("#allotServer").modal('hide');  //手动关闭
                    queryTypeServer();
                }
            }
        });
        $("#allotServerFrom")[0].reset();//表单重置
    }else{
        alert("请选中分配公司")
    }

}



/*关闭模态框 并刷新表格数据*/
$("#allotServer").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    /*    queryTypeServer();*/
});

