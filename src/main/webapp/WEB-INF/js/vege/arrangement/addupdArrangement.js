var url = "";
$(function(){
    // console.log($("#rAbm").val()+"+++------+")
    if($("#datetimepicker2").val()!='')
        inputDateEdit("datetimepicker2s","datetimepicker2");
    else
        inputDate("datetimepicker2s","datetimepicker2");

    if ($("#rAbm").val()!= ''){
        $("#myArrangementLabel").html("清洁安排修改");
        url = rootPath+"arrangement/updateArrangement?";//必须加?号
    }else{
        $("#myArrangementLabel").html("新增清洁安排");
        url = rootPath+"arrangement/insertArangement?"

    }

    $("#editaddArrangementForm").bootstrapValidator({
        message: '通用的验证失败消息',//好像从来没出现过
        feedbackIcons: {//根据验证结果显示的各种图标
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            rAmc: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    }
                },
            },
            rAqjdd: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rAqjsj: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/^((([0-9]{2})(0[48]|[2468][048]|[13579][26]))|((0[48]|[2468][048]|[13579][26])00)-02-29)|([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))/,//
                        message: '日期格式不正确'
                    },
                 }
            },
            rAfzr: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },
                }
            },
            rAqjnr: {
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
    $("#addArrangementBtn_submit").click(function(){
        //业务逻辑
        editaddArrangementSubmit();
    })
})
// JSON.stringify(option)
function editaddArrangementSubmit(){
    //获取验证结果
    var bootstrapValidator = $("#editaddArrangementForm").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    //查看验证是否通过
    if(bootstrapValidator.isValid()){
        var option=$("#editaddArrangementForm").serialize();//序列化获取表单数据
        option = decodeURIComponent(option,true);//解码 不解码中文乱码
       console.log(option);
        $.ajax({
            url:url+option,
            data:'',
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                console.log(data+"--");
                alert(data.message);
                // queryArrangementTable();
                $("#addCleanArrangementModal").modal('hide');
            }
        });
        $("#editaddArrangementForm").data('bootstrapValidator').destroy();//验证清除
        $("#editaddArrangementForm")[0].reset();//表单重置
    }
}



/*关闭模态框 并刷新表格数据*/
$("#addCleanArrangementModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    queryArrangementTable();
});