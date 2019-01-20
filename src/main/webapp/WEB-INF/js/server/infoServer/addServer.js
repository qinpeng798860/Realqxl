var rootPath= $("#absout").val();
$(function(){

    //时间选择器
    inputDate("datetimepicker2s","datetimepicker2");
    //服务类型
    select2Dict('addServerTypeSelect','服务类型','');
     $("#addServerTypeSelect").change(function(){

         var ServerDanjia=$("#addServerTypeSelect option:checked").attr("title");
         $("#rLjqfze").attr("value",ServerDanjia);

     })

    /*第一级 选中房产*/
    $('#Sszzdropdown').select2({
        language: 'zh-CN',//语言
        /*   data:data,*/
        minimumResultsForSearch: -1,//是否显示搜索框
        width: '100%',//宽
        placeholder: '--请选择--',//提示
        ajax:{
            url: rootPath+'srelevance/queryResitentSelect',
            type:'post',
            dataType: 'json',
            data: function(data){
            },
            processResults: function (data) {
                /*数据要求 id value值
                *         text 文本值*/
                return {
                    results: data
                };
            }
        },
    });
    /*选中房产触发事件：加载楼宇*/
    $('#Sszzdropdown').change(function(){
        //请空楼宇 单元 房间
        $('#SslySelect option:checked').val('');
        $('#SslySelect option:checked').val('');

        $('#dySelect2 option:checked').val('');
        $("#fjSelect2").html('');
        $("#fjmc").attr("value",'');

        var paraid = $("#Sszzdropdown option:checked").val();
        $('#SslySelect').select2({
            language: 'zh-CN',//语言
            /*   data:data,*/
            minimumResultsForSearch: -1,//是否显示搜索框
            allowClear: true, //是否允许清空选中
            maximumSelectionLength: 1,//设置最多保留多少个值
            width: '100%',//宽
            placeholder: '--请选择--',//提示
            ajax:{
                url: rootPath+'srelevance/queryBuildSelect?paramId='+paraid,
                /*data:{"":paraid},*/
                type:'post',
                dataType: 'json',
                data: function(data){

                },
                processResults: function (data) {
                    /*数据要求 id value值
                    *         text 文本值*/
                    return {
                        results: data
                    };
                }
            },
        });

    })

    /*选中楼宇触发事件：加载单元*/
    $('#SslySelect').change(function(){
        //清空单元选中
        $('#dySelect2 option:checked').val('');

        var paraid=$('#SslySelect option:checked').val();
        //清空房间选中
        $("#fjSelect2").html('');

        $("#fjmc").attr("value",'');

        $('#dySelect2').select2({
            language: 'zh-CN',//语言
            /*   data:data,*/
            minimumResultsForSearch: -1,//是否显示搜索框
            width: '100%',//宽
            placeholder: '--请选择--',//提示
            ajax:{
                url: rootPath+'srelevance/queryUnitSelect?paramId='+paraid,
                /*data:{"":paraid},*/
                type:'post',
                dataType: 'json',
                data: function(data){

                },
                processResults: function (data) {
                    /*数据要求 id value值
                    *         text 文本值*/
                    return {
                        results: data
                    };
                }
            },
        });
    })


    /*选中单元触发事件：加载房间*/
    $('#dySelect2').change(function () {
        //清空房间选中
        $("#fjSelect2").html('');
        //获取选中单元的id
        /**
         *
         * select2的一个bug  第三个触发事件的话 select会直接加载数据 不会如管判断操作、、所以用了ajax拼接
         * @type {*|jQuery}
         */
        var Dyid=$('#dySelect2 option:checked').val()
        //传递id
        Fjselet2(Dyid);
    });

    /*$('#static_dropdown').val('1'); // 设置选中*/
    //服务类型

    $("#fjSelect2").change(function(){
        //获取option的title属性 为房间名称
        var fjmc=$("#fjSelect2  option:checked").attr('title');
        //房间名称
        $("#fjmc").attr("value",fjmc);

    })














    /*提交表单*/
    $("#addServer_submit").click(function(){

        /*表单验证*/
        $("#addServerForm").bootstrapValidator({
            message: '通用的验证失败消息',//好像从来没出现过
            feedbackIcons: {//根据验证结果显示的各种图标
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                fc: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '请选择住宅'
                        }
                    },
                },
                lymc: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '请选择楼宇'
                        },

                    }
                },
                dy: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '请选择单元'
                        },

                    }
                },
                rSqr: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '请输入申请人'
                        },

                    }
                },
                rLxdh: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '请输入手机号码'
                        },regexp: {//正则验证
                            regexp: /^1[34578]\d{9}$/,//匹配正浮点数
                            message: '请正确的手机号码'
                        },

                    }
                },
                fwlx: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '请选择服务类型'
                        },

                    }
                },
                rSqsx: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '请输入诉求事项'
                        },
                    }
                },
                rDj: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '文本框必须输入'
                        },regexp: {//正则验证
                            regexp: /^1[34578]\d{9}$/,//匹配正浮点数
                            message: '请正确的价格'
                        },
                    }
                }

            },
        });
        //业务逻辑
        addServerSubmit();
    })
})



function addServerSubmit(){
    //获取验证结果
    var bootstrapValidator = $("#addServerForm").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    var rFc=$("#Sszzdropdown").text().trim();//房产名称
    var rLymc=$("#SslySelect").text().trim();//楼宇名称
    var rDy=$("#dySelect2").text().trim();//楼宇名称


    //查看验证是否通过
    if(bootstrapValidator.isValid()){
        var option=$("#addServerForm").serialize();//序列化获取表单数据
        option = decodeURIComponent(option,true);//解码 不解码中文乱码
        option+="&rFc="+rFc+"&rLymc="+rLymc+"&rDy="+rDy;
       $.ajax({
            url:rootPath+'server/insertServer?'+option,
            data:'',
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                if(data.code!=-1){
                    alert(data.message);
                    $("#addServerModal").modal('hide');  //手动关闭
                    queryTypeServer();
                }
            }
        });
        $("#addServerForm").data('bootstrapValidator').destroy();//验证清除
        $("#addServerForm")[0].reset();//表单重置
    }

}
/*加载房间*/
function Fjselet2(dyid){
    $.ajax({
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
    });
}







/*关闭模态框 并刷新表格数据*/
$("#addServerModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    /*    queryTypeServer();*/
});


