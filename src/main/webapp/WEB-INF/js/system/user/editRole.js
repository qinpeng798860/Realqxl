$(function () {
    editRoleSelect("RoleSelect","roleid");
    /*关闭模态框 并刷新表格数据*/
    $("#editUserRoleModal").on("hidden.bs.modal", function() {
        /*解决第二次赋值还是第一次值的问题*/
        $(this).removeData("bs.modal");
        /*modal页面加载$()错误,由于移除缓存时加载到
        <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
        未移除的数据，手动移除加载的内容 */
        $(this).find(".modal-content").children().remove();
        /*    queryTypeServer();*/
        queryUser();
    });
    $("#editRole_submit").click(function () {
        $.ajax({
            url:rootPath+'user/editUserRole',
            data:{'roleid':$("#RoleSelect").val(),'rUserid':$("#rUserid").val()},
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                if(data.code!=-1){
                    bootbox.alert(data.message);
                    $("#editUserRoleModal").modal("hide");
                }
                queryUser();
            }
        });
    })
    
})