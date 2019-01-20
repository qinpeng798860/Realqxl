var rootPath=$("#absout").val()
$(function () {
//用户登陆
$("#login_submit").click(function(){
    var option = $("#loginform_user").serialize();//序列化获取表单数据
    option = decodeURIComponent(option, true);//解码 不解码中文乱码
    $.ajax({
        url:rootPath+'model/userLogin?'+option,
        data:{id:option[0].id},
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){
            if(data.code!=-1){
                bootbox.alert(data.message,function () {});
                location.href=rootPath+"model/gotoIndex.shtml"
            }else{
                bootbox.alert(data.message,function () {});
            }
        }
    });
})

})