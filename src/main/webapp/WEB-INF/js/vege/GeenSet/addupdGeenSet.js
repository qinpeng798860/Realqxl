var url = "";
$(function(){
    // console.log($("#rGbm").val()+"+++------+")
    if($("#datetimepicker2").val()!='')
        inputDateEdit("datetimepicker2s","datetimepicker2");
    else
        inputDate("datetimepicker2s","datetimepicker2");


    if ($("#rGbm").val()!= ''){
        $("#myGeenSetLabel").html("绿化设置修改");
        url = rootPath+"geen/updateGeenSet?";//必须加?号
    }else{
        $("#myGeenSetLabel").html("新增绿化设置植被");
        url = rootPath+"geen/insertGeenSet?"

    }

    $("#editaddGeenSetForm").bootstrapValidator({
        message: '通用的验证失败消息',//好像从来没出现过
        feedbackIcons: {//根据验证结果显示的各种图标
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            rGszmc: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    }
                },
            },
            rGmj: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },

                }
            },
            rGdd: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },
                }
            },
            rGzrr: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },
                }
            },
            rGlhsj: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/^((([0-9]{2})(0[48]|[2468][048]|[13579][26]))|((0[48]|[2468][048]|[13579][26])00)-02-29)|([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))/,
                        message: '日期格式不正确'
                    },
                }
            },
            rGzyzb: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },
                }
            },
        },
    });

    /*提交表单*/
    $("#addGeenSetBtn_submit").click(function(){
        //业务逻辑
        editaddGeenSetSubmit();
    })
})
// JSON.stringify(option)
function editaddGeenSetSubmit(){
    //获取验证结果
    var bootstrapValidator = $("#editaddGeenSetForm").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    //查看验证是否通过
    if(bootstrapValidator.isValid()){
        var option=$("#editaddGeenSetForm").serialize();//序列化获取表单数据
        option = decodeURIComponent(option,true);//解码 不解码中文乱码
       // console.log(option[0].r_zbbm+"-+++++++++++-");
        $.ajax({
            url:url+option,
            data:'',
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                console.log(data+"--");
                alert(data.message);
                $("#addGeenSetModal").modal('hide');
            }
        });
        $("#editaddGeenSetForm").data('bootstrapValidator').destroy();//验证清除
        $("#editaddGeenSetForm")[0].reset();//表单重置
    }
}

/*关闭模态框 并刷新表格数据*/
$("#addGeenSetModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    queryGeenSetTable();
});