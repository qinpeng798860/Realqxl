var url="";
$(function () {

    if($("#roleid").val()!=''){
        $("#roleTitle").html("角色修改")
        url=rootPath+"role/editRole?";
    }else{
        $("#roleTitle").html("角色新增")
        url=rootPath+"role/addRole?";
    }




    $("#editRole").on("hidden.bs.modal", function() {
        /*解决第二次赋值还是第一次值的问题*/
        $(this).removeData("bs.modal");
        /*modal页面加载$()错误,由于移除缓存时加载到
        <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
        未移除的数据，手动移除加载的内容 */
        $(this).find(".modal-content").children().remove();
        /*    queryTypeServer();*/
    });



    $("#addRole_submit").click(function(){
        $("#editRoleForm").bootstrapValidator({
            message: '通用的验证失败消息',//好像从来没出现过
            feedbackIcons: {//根据验证结果显示的各种图标
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                rolename: {
                    validators: {
                        notEmpty: {//检测非空,radio也可用
                            message: '请输入角色名'
                        }
                    },
                },
            },
        });
        editRoleManages();
    })

})



function editRoleManages(){
    //获取验证结果
    var bootstrapValidator = $("#editRoleForm").data('bootstrapValidator');
    //手动开启验证
    bootstrapValidator.validate();
    //查看验证是否通过
    if(bootstrapValidator.isValid()) {
        var option = $("#editRoleForm").serialize();//序列化获取表单数据
        option = decodeURIComponent(option, true);//解码 不解码中文乱码
        console.log(option);
        $.ajax({
            url: url + option,
            data: '',
            dataType: 'json',
            type: 'post',
            async: false,
            success: function (data) {
                if (data.code != -1) {
                    bootbox.alert(data.message, function () {
                    })
                    $("#editRole").modal("hide")
                } else {
                    bootbox.alert(data.message, function () {
                    })
                }
                queryRole();
            }
        })
    }
}