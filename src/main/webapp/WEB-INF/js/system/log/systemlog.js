var rootPath = $("#absout").val();

$(function(){

   inputDate("dateA","dateAvalue");
   inputDate("dateB","dateBvalue");
    var dateA=$("#dateAvalue").val();
    var dateB=$("#dateBvalue").val();
    $('#SyslogTable').bootstrapTable({
        url: rootPath+"systemLog/querySystemLog?dateA="+dateA+"&dateB="+dateB,         //请求后台的URL（*）
        method: 'post',                      //请求方式（*）
        toolbar: '#toolbar',               /* //工具按钮用哪个容器*/
        striped: false,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true, //分页
        pageNumber: 1,//如果设置了分页，首页页码
        pageSize: 10,//如果设置了分页，页面数据条数
        pageList:[10, 20, 30, 50,'All'],
        sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
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
            field: 'logdate',
            title: '执行时间',
            width:'10%',

        },{
            field: 'logpath',
            title: '执行路径',
            width:'10%',

        },{
            field: 'logmethod',
            title: '执行方法',
            width:'10%',
        },{
            field: 'logparam',
            title: '执行参数',
            width:'10%',
        },{
            field: 'logcontext',
            title: '执行内容',
            width:'10%',
        }]
    });
})


/*数据表格查询刷新*/
function queryLog(){

    var dateA=$("#dateAvalue").val();
    var dateB=$("#dateBvalue").val();
    var opt = {
        url: rootPath+'systemLog/querySystemLog?dateA='+dateA+"&dateB="+dateB
    };
    $("#SyslogTable").bootstrapTable('refresh', opt);
}


/*            formatter:function(value,row,index){*/