var url = "";
// console.log($("#rId").val()+"====");
$(function(){

    if($("#datetimepicker2").val()!='')
        inputDateEdit("datetimepicker2s","datetimepicker2");
    else
        inputDate("datetimepicker2s","datetimepicker2");

    if ($("#rId").val()!= ''){
        $("#myownerModalLabel").html("业主修改");
        url = rootPath+"owner/updateOwner?";//必须加?号
    }else{
        $("#myownerModalLabel").html("新增业主");
        url = rootPath+"owner/insertOwner?"
    }


    $("#editaddOwnerTypeForm").bootstrapValidator({
        message: '通用的验证失败消息',//好像从来没出现过
        feedbackIcons: {//根据验证结果显示的各种图标
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            rEid: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '下拉框必须输入'
                    }
                },
            },
            rYzlx: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '下拉框必须输入'
                    }
                },
            },
            // rYzbm: {
            //     validators: {
            //         notEmpty: {//检测非空,radio也可用
            //             message: '文本框必须输入'
            //         },
            //
            //     }
            // },
            rYzxm: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },
                  }
            },
            rXb: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rCsrq: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                         regexp:/^((([0-9]{2})(0[48]|[2468][048]|[13579][26]))|((0[48]|[2468][048]|[13579][26])00)-02-29)|([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))/,//
                            message: '日期格式不正确'
                    },

                }
            },
            rMz: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rXl: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rGj: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rJg: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rZjlx: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rZjhm: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp: /^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/,//匹配正浮点数
                        message: '身份证格式不正确'
                    },

                }
            },
            rGzdw: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },
                }
            },
            rYb: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    }, regexp: {//正则验证
                        regexp: /[1-9]\d{5}(?!\d)/,//
                        message: '邮编格式不正确'
                    },
                }
            },
            rZw: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },
                }
            },
            rSjhm: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    }, regexp: {//正则验证
                        regexp: /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/,//匹配正浮点数
                        message: '手机格式不正确'
                    },

                }
            },
            rLxdz: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rJjlxr: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rJjlxdh: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    }, regexp: {//正则验证
                        regexp: /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/,//匹配正浮点数
                        message: '手机号码格式不正确'
                    },

                }
            },
            Jjlxdz: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rKhx: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },

                }
            },
            rYhzh: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    }, regexp: {//正则验证
                        regexp:/([1-9]{1})(\d{14}|\d{18})$/,//
                        message: '银行账号格式不正确'
                    },

                }
            },
            rSzpcs: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp:/[\u4E00-\u9FA5]/g,//
                        message: '不能为数字'
                    },
                }
            },
            rZt: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '下拉框必须输入'
                    },

                }
            },
        },
    });

    /*提交表单*/
    $("#addownerBtn_submit").click(function(){
        //业务逻辑
        editaddOwnerTypeSubmit();
    })
})
// JSON.stringify(option)
function editaddOwnerTypeSubmit(){
    //获取验证结果
    var bootstrapValidator = $("#editaddOwnerTypeForm").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    //查看验证是否通过
    if(bootstrapValidator.isValid()){
        var option=$("#editaddOwnerTypeForm").serialize();//序列化获取表单数据
        option = decodeURIComponent(option,true);//解码 不解码中文乱码
        // console.log(option);
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
                $("#addownerModal").modal('hide');
            }
        });
        $("#editaddOwnerTypeForm").data('bootstrapValidator').destroy();//验证清除
        $("#editaddOwnerTypeForm")[0].reset();//表单重置
    }
}

/*关闭模态框 并刷新表格数据*/
$("#addownerModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    queryTable();
});