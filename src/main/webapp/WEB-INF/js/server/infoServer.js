var rootPath=$("#absout").val();
$(function(){
//查询服务类型
    querySelectDict("rFwlx",'服务类型','');
//查询服务状态
    querySelectDict("rZt", "服务状态",'');

    $('#infoServerTable').bootstrapTable({
        url: rootPath+'server/queryServer',         //请求后台的URL（*）
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

        },{
            field: 'rFc',
            title: '房产名称',
            width:'10%',
        }, {
            field: 'rSqr',
            title: '申请人',
            width:'10%',
        }, {
            field: 'rFwlx',
            title: '服务类型',
            width:'5%',
            formatter:function(value,row,index){

                    return "<label style='color: cadetblue'>"+value+"</label>";
                }
        },{
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
                if(row.rZt=='待审批'){
                    return "<button type=\"button\" class=\"btn btn-success\" onclick='ShpsZt(2,"+option+")'>审核通过</button>&nbsp;&nbsp;<button type=\"button\" class=\"btn btn-danger\" onclick='infoBack(8,"+option+")'>不通过</button>"
                }else if(row.rZt=='待分配'){

                    return "<button type=\"button\" class=\"btn btn-warning\" onclick='allotServer("+option+")'>待分配</button>";
                }else if(row.rZt=='被退回重审'){
                    return "<button type=\"button\" class=\"btn btn-success\" onclick='ShpsZt(2,"+option+")'>重新审核</button> &nbsp;&nbsp;<button type=\"button\" class=\"btn btn-danger\" onclick='infoBack(8,"+option+")'>不通过</button>";
                }else{
                    return "<label style='color: red'>审核失败 请重新发起服务</label>";
                }
            }
        }, ]
    });



})
/*数据表格查询刷新*/
function queryTypeServer(){
/*    var param=$("#serverTypeName").val();*/
    var option=$("#serverForm").serialize();//序列化获取表单数据
    option = decodeURIComponent(option,true);//解码 不解码中文乱码
    var opt = {
        url: rootPath+'server/queryServer?'+option
    };
    $("#infoServerTable").bootstrapTable('refresh', opt);
}
/**
 * 新增服务
 */
function addTypeServer(){
    $("#addServerModal").modal({
        remote: rootPath + "server/gotoaddServer.shtml",
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard: true,//当按下esc键时，modal框消失
    });
}

/**
 * 分配服务
 */
function allotServer(option){
    $("#allotServer").modal({
        remote:rootPath+"server/allotServer.shtml?rFwId="+option.rFwId+"&id="+option.id,
        /**backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失**/
        keyboard:true,//当按下esc键时，modal框消失
    })
}

/**
 * 删除服务类型
 */
function delServer(option){
    var option=$('#infoServerTable').bootstrapTable('getSelections');//获取的是数组
    if(option==''){
        bootbox.alert("请选择行");
    }else{
        $.ajax({
            url:rootPath+'server/delServer',
            data:{id:option[0].id},
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                if(data.code!=-1){
                    queryTypeServer();
                }else{
                    bootbox.alert(data.message,function () {
                    });
                }
            }
        });

    }

}




/*关闭模态框 并刷新表格数据*/
$("#addServerModal").on("hidden.bs.modal", function() {
    alert("我来了");
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    /*    queryTypeServer();*/
});


/**
 * 审核 、、 分配
 * @param rZt
 * @constructor
 */
function ShpsZt(rZt,option){

    if(option==''){

    }else{
        var strResult='';
        bootbox.prompt("审批意见", function (result) {
             if(result!=null){
                $.ajax({
                    url:rootPath+'server/updateServerZt',
                    data:{id:option.id,'rZt':rZt,'rSpyj':strResult},
                    dataType:'json',
                    type:'post',
                    async:false,
                    success:function(data){
                        if(data.code!=-1){
                            bootbox.alert(data.message,function () {
                            });
                            queryTypeServer();
                        }else{
                            bootbox.alert(data.message,function () {
                            });
                        }
                    }
                });
             }
        });

    }
}



function infoBack(status,option){
    bootbox.confirm("确定不通过吗?", function (result) { /* your callback code */
        if(result){
            $.ajax({
                url:rootPath+'serverManage/manageBack',
                data:{id:option.id,'rZt':status},
                dataType:'json',
                type:'post',
                async:false,
                success:function(data){
                    if(data.code!=-1){
                        alert(data.message);
                        queryTypeServer();
                    }else{
                        bootbox.alert(data.message,function () {
                        });
                    }
                }
            });

        }
    });

}



