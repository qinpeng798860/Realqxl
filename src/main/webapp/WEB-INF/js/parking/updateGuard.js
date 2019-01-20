var bh = $('cwbh');
$(function(){

    inputDate("datetimepicker2s","datetimepicker2");
    select2Compay("ssgs","rSsgs");

    querySelectDict("cwlx", "车位类型",'cwlxs');
    querySelectDict("zt", "车位状态",'zts');
    querySelectDict("gllb", "管理类别",'gllbs');

    $("#updateParking_submit").click(function(){
        //业务逻辑

        $("#updateparkingFrom").bootstrapValidator({
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
                rZzbh: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                rZzmc: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                rZdmj: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                rJzmj: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },   rLdmj: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                rDlmj: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },   rLybh: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },   rFzr: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                rZzdz: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                rGsmc: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                rFrdb: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                rLxr: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                rLxdh: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                rLxdz: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                }/*,



            rDj: {
                validators: {
                    notEmpty: {//检测非空,radio也可用
                        message: '文本框必须输入'
                    },regexp: {//正则验证
                        regexp: /[1-9]\d*.\d*|0\.\d*[1-9]\d*!/,//匹配正浮点数
                        message: '请正确的价格'
                    },
                }
            }*/
            },
        });

        addHomeSubmit();
    });







});


function addHomeSubmit() {

    //获取验证结果
    var bootstrapValidator = $("#updateparkingFrom").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    //查看验证是否通过
    if (bootstrapValidator.isValid()) {
        var option = $("#updateparkingFrom").serialize();//序列化获取表单数据
        option = decodeURIComponent(option, true);//解码 不解码中文乱码
        $.ajax({
            url: 'parking/updateParkingssss?'+ option,
            data: '',
            dataType: 'json',
            type: 'post',
            async: false,
            success: function (data) {

                alert(data.message);
                $("#TypeServerModal").modal("hide")
                queryParkingList();
            }
        });
        $("#updateparkingFrom").data('bootstrapValidator').destroy();//验证清除
        $("#updateparkingFrom")[0].reset();//表单重置
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
    /*    queryTypeServer();*/
});