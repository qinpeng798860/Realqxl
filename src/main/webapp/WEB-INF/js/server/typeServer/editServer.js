var url = "";
$(function(){
    if ($("#editServerTypeid").val() != ''){
        $("#myModalLabel").html("类型修改");
        url = rootPath+"serverType/updateServerType?";//必须加?号
    }else{
        $("#myModalLabel").html("新增类型");
        url = rootPath+"serverType/addServerType?"
    }


    $("#editServerTypeForm").bootstrapValidator({
        message: '通用的验证失败消息',//好像从来没出现过
        feedbackIcons: {//根据验证结果显示的各种图标
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            rSsgs: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    }
                },
            },
            rLxmc: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },

                }
            },
            rDj: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp: /[1-9]\d*.\d*|0\.\d*[1-9]\d*/,//匹配正浮点数
                        message: '请正确的价格'
                    },
                }
            }
        },
    });

    /*提交表单*/
    $("#addServerTypeBtn_submit").click(function(){
        //业务逻辑
        editServerTypeSubmit();
    })
})

function editServerTypeSubmit(){
    //获取验证结果
    var bootstrapValidator = $("#editServerTypeForm").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    //查看验证是否通过
    if(bootstrapValidator.isValid()){
        var option=$("#editServerTypeForm").serialize();//序列化获取表单数据
        option = decodeURIComponent(option,true);//解码 不解码中文乱码
        $.ajax({
            url:url+option,
            data:'',
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                console.log(data);
            }
        });
        $("#editServerTypeForm").data('bootstrapValidator').destroy();//验证清除
        $("#editServerTypeForm")[0].reset();//表单重置
    }

}