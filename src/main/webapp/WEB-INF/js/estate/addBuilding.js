

$(function(){


    querySelectDict("lygn", "楼宇功能",'');
    querySelectDict("jglb", "结构类别",'');
    querySelectDict("zxbz", "装修标准",'');
    querySelectDict("wsdj", "完损等级",'');

    $("#addBuilding_Submit").click(function(){
        $("#addBuildingFrom").bootstrapValidator({
            message: '通用的验证失败消息',//好像从来没出现过
            feedbackIcons: {//根据验证结果显示的各种图标
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                lymc: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        }
                    },
                },
                dysl: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                lygn: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                jglb: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                zxbz: {
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
                wsdj: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },   jzmj: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },   symj: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                jzxkz: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                ysxkz: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                jgrq: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                fdrq: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                },
                note: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },

                    }
                }


            /*
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


        //业务逻辑
        addHomeSubmit();
    });






});


function addHomeSubmit() {

    //获取验证结果
    var bootstrapValidator = $("#addBuildingFrom").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    //查看验证是否通过
    if (bootstrapValidator.isValid()) {
        var option = $("#addBuildingFrom").serialize();//序列化获取表单数据
        option = decodeURIComponent(option, true);//解码 不解码中文乱码
        console.log(option);
        $.ajax({
            url: rootPath+'building/addBuilding?' + option,
            data: '',
            dataType: 'json',
            type: 'post',
            async: false,
            success: function (data) {
                alert(data.message);
                $("#TypeServerModal").modal("hide")
                queryList();
            }
        });
        $("#addBuildingFrom").data('bootstrapValidator').destroy();//验证清除
        $("#addBuildingFrom")[0].reset();//表单重置
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


