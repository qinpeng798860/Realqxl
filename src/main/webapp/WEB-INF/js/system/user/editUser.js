var rootPath=$("#absout").val();
var url="";
$(function () {

    if($("#userid").val()==''){
        $("#editUserTitle").html("用户新增")
        url=rootPath+'user/addUser?';
    }else{
        $("#editUserTitle").html("用户修改")
        url=rootPath+'user/updateUser?';
    }


    $("#addUser_submit").click(function(){
        $("#editUserForm").bootstrapValidator({
            message: '通用的验证失败消息',//好像从来没出现过
            feedbackIcons: {//根据验证结果显示的各种图标
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                rUsername: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '请输入账号'
                        }
                    },
                },
                rPassword: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '请输入密码'
                        }, regexp: {//正则验证
                            regexp: /^[a-zA-Z0-9]{4,10}$/,
                            message: '密码不能含有非法字符，长度在4-10之间'
                        },

                    }
                },

            },
        });
        editUserManages();
    })

})



function editUserManages(){
    //获取验证结果
    var bootstrapValidator = $("#editUserForm").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    if($("#username").val()=='')
        return
    //查看验证是否通过
    if(bootstrapValidator.isValid()){
        var option=$("#editUserForm").serialize();//序列化获取表单数据
        option = decodeURIComponent(option,true);//解码 不解码中文乱码
        $.ajax({
            url:url+option,
            data:'',
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
              if(data.code!=-1){
                  bootbox.alert(data.message, function(){ })
                  $("#editUserModel").modal("hide")
              }else{
                  bootbox.alert(data.message, function(){ })

              }
            }
        })

    };

  /*  $.ajax({
        url:rootPath+'srelevance/queryRoomSelect?paramId='+dyid,
        data:'',
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){
            $("#fjmc").attr("value",data[0].fjmc);
            //获取默认第一个的房间名称
            $.each(data,function(idx,ele){
                $("#fjSelect2").append("<option value='"+ele.id+"' title='"+ele.fjmc+"'>"+ele.text+"</option>");
            })
        }
    })*/
}

/*关闭模态框 并刷新表格数据*/
$("#editUserModel").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    queryUser();
});