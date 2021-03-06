var rootPath=$("#absout").val();
$(function(){

    //查询服务类型
    querySelectDict("rFwlx",'服务类型','');
//查询服务状态
    querySelectDict("rZt", "服务状态",'');

    $('#manageServer').bootstrapTable({
        url: rootPath+'serverManage/queryServerManage',         //请求后台的URL（*）
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
            field: 'id',
            title: '服务id',
            width:'5%',

        }, {
            field: 'rSqr',
            title: '申请人',
            width:'10%',
        }, {
            field: 'rFwlx',
            title: '服务类型',
            width: '5%',
            formatter:function(value,row,index){
                return "<label style='color: cadetblue'>"+value+"</label>";
            }
        }, {
            field: 'rFwfy',
            title: '服务费用',
            width:'5%',
        }, {
            field: 'rLxdh',
            title: '电话号码',
            width:'10%',
        }, {
            field: 'rSqsj',
            title: '申请时间',
            width:'10%',
        }, {
            field: 'rSqsx',
            title: '诉求事项',
            width:'10%',
        }, {
            field: 'rBljg',
            title: '办理结果',
            width:'10%',
        }, {
            field: 'rZt',
            title: '状态',
            width:'5%',
            formatter:function(value,row,index){

                return "<label style='color: red'>"+value+"</label>";
            }
        }, {
            field: '',
            title: '操作',
            width:'20%',
            formatter:function(value,row,index){
                var option=JSON.stringify(row);
                if(row.rZt=='待办理'){
                    return "<label style='color: #17a2b8'>待办理</label>";
                }else if (row.rZt=='通知办理'){
                    return "<button type=\"button\" class=\"btn btn-success\" onclick='manageSuccess("+option+")'>办理成功</button>";
                }else{
                    return "<label style='color: #17a2b8'>已完结</label>";
                }
            }
        }, ]
    });



})
function queryManage(){
   var option=$("#manageServerFrom").serialize();//序列化获取表单数据
    option = decodeURIComponent(option,true);//解码 不解码中文乱码
    console.log(option);
    var opt = {
        url: rootPath+'serverManage/queryServerManage?'+option
    };
    $("#manageServer").bootstrapTable('refresh', opt);
}


/**
 * 查询服务办理信息
 */
function editServerMange(){
    var option=$('#manageServer').bootstrapTable('getSelections');//获取的是数组
    if(option!=''){
        $("#editServerManage").modal({
            remote:rootPath+"serverManage/gotoSingServerManage.shtml?id="+option[0].id,
            keyboard:true,//当按下esc键时，modal框消失
        })
    }else{
        bootbox.alert("请选中行进行办理", function(){ /* your callback code */ })
    }




}



/**
 * 办理成功
 */
function manageSuccess(option){
    bootbox.prompt("请输入办理结果", function(result){
        if(result!=null){
            $.ajax({
                url:rootPath+'serverManage/updateManagebljg',
                data:{'ide':option.id,'rBljg':result,'rBlid':option.rBlid},
                dataType:'json',
                type:'post',
                async:false,
                success:function(data){
                    if(data.code!=-1){
                        alert(data.message);
                        $("#editServerManage").modal('hide');  //手动关闭
                        queryManage();
                    }
                }
            });
        }
    })
}



/*关闭模态框 并刷新表格数据*/
$("#editServerManage").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    /*    queryTypeServer();*/
});

