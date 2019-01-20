var url = "";
$(function(){
    // console.log($("#rZbbm").val()+"+++------+")
    if($("#datetimepicker2").val()!='')
        inputDateEdit("datetimepicker2s","datetimepicker2");
    else
        inputDate("datetimepicker2s","datetimepicker2");

    if ($("#rZbbm").val()!= ''){
        $("#myVegeModalLabel").html("植被修改");
        url = rootPath+"vege/updateVege?";//必须加?号
    }else{
        $("#myVegeModalLabel").html("新增植被");
        url = rootPath+"vege/insertVege?"
    }

    $("#editaddVegeTypeForm").bootstrapValidator({
        message: '通用的验证失败消息',//好像从来没出现过
        feedbackIcons: {//根据验证结果显示的各种图标
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            rZbmc: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    }
                },
            },
            rZbzl: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rZbsl: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },
                }
            },
            rSl: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },
                }
            },
            rZbdw: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },
                }
            },
            rZbxx: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },
                }
            },
            rZbtd: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//rZbtd
                        message: '不能为数字'
                    },
                }
            },
        },
    });

    /*提交表单*/
    $("#addVegeBtn_submit").click(function(){
        //业务逻辑
        editaddVegeTypeSubmit();
    })
})
// JSON.stringify(option)
function editaddVegeTypeSubmit(){
    //获取验证结果
    var bootstrapValidator = $("#editaddVegeTypeForm").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    //查看验证是否通过
    if(bootstrapValidator.isValid()){
        var option=$("#editaddVegeTypeForm").serialize();//序列化获取表单数据
        option = decodeURIComponent(option,true);//解码 不解码中文乱码
      //  console.log(option[0].r_zbbm+"-+++++++++++-");
        $.ajax({
            url:url+option,
            data:'',
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                console.log(data+"--");
                alert(data.message);
                $("#addVegeModal").modal('hide');
            }
        });
        $("#editaddVegeTypeForm").data('bootstrapValidator').destroy();//验证清除
        $("#editaddVegeTypeForm")[0].reset();//表单重置
    }
}

/*关闭模态框 并刷新表格数据*/
$("#addVegeModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    queryvegeTable();
});