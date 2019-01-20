var rootPath = $("#absout").val();
$(function () {
    $('#roleManage').bootstrapTable({
        url: rootPath+'role/queryRole',         //请求后台的URL（*）
        method: 'post',                      //请求方式（*）
        toolbar: '#toolbar',               /* //工具按钮用哪个容器*/
        striped: false,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true, //分页
        pageNumber: 1,//如果设置了分页，首页页码
        pageSize: 10,//如果设置了分页，页面数据条数
        pageList:[10, 20, 30, 50,'All'],
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        showRefresh: true,                    //是否显示刷新按钮
        minimumCountColumns: 1,             //最少允许的列数
        clickToSelect: true,                //是否启用点击选中行
        height: 550,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "id",                     //每一行的唯一标识，一般为主键列
        showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
        smartDisplay:false,
        contentType: "application/x-www-form-urlencoded",
        singleSelect:true,
        queryParamsType:'',//设置请求参数格式
        queryParams:function queryParams(params) {   //设自定义查询参数
            var param = {
                rows: params.pageSize,   //每页多少条数据
                page: params.pageNumber, // 页码
            };
            return param;
        },
        columns: [{
            checkbox: true,
            width:'5%',
        },  {
            field: 'roleid',
            title: '角色id',
            width:'20%',

        },{
            field: 'rolename',
            title: '角色名',
            width:'20%',

        }]
    });


})

/*数据表格查询刷新*/
function queryRole(){
    var opt = {
        url: rootPath+'role/queryRole'
    };
    $("#roleManage").bootstrapTable('refresh', opt);
}



/*关闭模态框 并刷新表格数据*/
$("#editRole").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    /*    queryTypeServer();*/
    queryUser();
});


function addRole(code){
    var option=$('#roleManage').bootstrapTable('getSelections');//获取的是数组
    var url="role/gotoAddRole";
    if(code==2){
        if(option==''){
            bootbox.alert("请选中行", function(){ /* your callback code */ })
            return
        }
        url+="?roleid="+option[0].roleid+"&rolename="+option[0].rolename;
    }
    $("#editRole").modal({
        remote:rootPath+url,
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard:true,//当按下esc键时，modal框消失
    })
}
function delRole(){
    var option=$('#roleManage').bootstrapTable('getSelections');//获取的是数组
    if(option==''){
        bootbox.alert("请选中行", function(){ /* your callback code */ })
        return
    }
    var url=rootPath+"role/delRole?roleid="+option[0].roleid;
    bootbox.confirm("确认要删除嘛?", function(result){
        if(result){
            $.ajax({
                url:url,
                data:'',
                dataType:'json',
                type:'post',
                async:false,
                success:function(data){
                    if(data.code!=-1){
                        bootbox.alert(data.message, function(){ })
                        $("#roleManage").modal("hide")
                        queryRole();
                    }
                }
            })
        }
    });
}