var url = "";
$(function(){

    //绑定公司数据
    select2Compay("rSSgs","SelectedIdSSgs");
    //绑定类型 rLxmc
    querySelectDict("rLxmc","服务类型",'lxmcId');



    if ($("#editServerTypeid").val() != ''){
        $("#myModalLabel").html("类型修改");
        url = rootPath+"serverType/updateServerType?";//必须加?号
    }else{
        $("#myModalLabel").html("新增类型");
        url = rootPath+"serverType/addServerType?"
    }



    /*提交表单*/
    $("#addServerTypeBtn_submit").click(function(){

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
                            message: '请选择一个公司'
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
                if(data.code!=-1){
                    alert(data.message);
                    $("#TypeServerModal").modal('hide');  //手动关闭
                    queryTypeServer();
                }else{
                    alert(data.message);
                }
            }
        });
        $("#editServerTypeForm").data('bootstrapValidator').destroy();//验证清除
        $("#editServerTypeForm")[0].reset();//表单重置
    }

}


/*关闭模态框 并刷新表格数据*/
$("#TypeServerModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();

});