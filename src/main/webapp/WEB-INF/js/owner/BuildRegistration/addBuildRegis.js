var url = "";
$(function(){
    // console.log($('#rYzid').val()+"---")
    $("#myModalLabel").html("业主房产登记");
    url = rootPath+"Build/insertBuild?"

    $("#editBuildForm").bootstrapValidator({
        message: '通用的验证失败消息',//好像从来没出现过
        feedbackIcons: {//根据验证结果显示的各种图标
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            rLy: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '下拉框必须输入'
                    }
                },
            },
            rLc: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '下拉框必须输入'
                    },
                }
            },
            rFjmc: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '下拉框必须输入'
                    },
                }
            },
            rFczh: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },
                }
            },
            rRgzh: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },
                }
            },
        },
    });
    /*提交表单*/
    $("#addBuildBtn_submit").click(function(){
        //业务逻辑
        addBuildSubmit();
    })
})


// JSON.stringify(option)
function addBuildSubmit(){
    //获取验证结果
    var bootstrapValidator = $("#editBuildForm").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    //查看验证是否通过
    if(bootstrapValidator.isValid()){
        var option=$("#editBuildForm").serialize();//序列化获取表单数据
        option = decodeURIComponent(option,true);//解码 不解码中文乱码
        console.log(option)
        $.ajax({
            url:url+option,
            data:'',
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                console.log(data+"--");
                alert(data.message);
                $("#BuildModal").modal('hide');
            }
        });
        // console.log("123")
        $("#editBuildForm").data('bootstrapValidator').destroy();//验证清除
        $("#editBuildForm")[0].reset();//表单重置
    }

}
/*关闭模态框 并刷新表格数据*/
$("#BuildModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    queryBuildTable();
});