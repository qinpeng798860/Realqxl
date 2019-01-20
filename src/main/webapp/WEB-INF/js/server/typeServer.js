var rootPath = $("#absout").val();

$(function(){
    initTypeServerTable();/*初始化数据表格*/
    //绑定类型 rLxmc
    select2Dict("serverTypeName","服务类型");
    
})

function initTypeServerTable() {
    $('#typeServerTable').bootstrapTable({
        url: rootPath+'serverType/queryServerType',         //请求后台的URL（*）
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
            width:'10%',
        },  {
            field: 'r_ssgs',
            title: '所属公司',
            width:'15%',

        },{
            field: 'r_lxmc',
            title: '类型名称',
            width:'15%',
        }, {
            field: 'r_dj',
            title: '服务价格',
            width:'15%',
        }, {
            field: 'r_status',
            title: '状态',
            width:'15%',
            formatter:function(value,row,index){
                if(value=="1"){
                    return "<label style='color: lightseagreen'>启用</label>";
                }else{
                    return "<label style='color: red'>禁用</label>";
                }
            }
        },{
            field: 'r_note',
            title: '说明',
            width:'30%',
        }, ]
    });

}

/*数据表格查询刷新*/
function queryTypeServer(){
    var param=$("#serverTypeName").val();
    if(param==null){
       param='';
    }
    var opt = {
        url: rootPath+'serverType/queryServerType?rLxmc='+param
    };
    $("#typeServerTable").bootstrapTable('refresh', opt);
}

/**
 * 新增服务类型
 */
function addTypeServer(){
    $("#TypeServerModal").modal({
        remote:rootPath+"serverType/gotoEditServer",
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard:true,//当按下esc键时，modal框消失
    })

}


/**
 * 修改服务类型
 */
function updateTypeServer(){
    var option=$('#typeServerTable').bootstrapTable('getSelections');//获取的是数组
    if(option[0].r_status==1){
        alert("只能修改停用的服务类型")
        return
    }
    if(option!=''){
        $("#TypeServerModal").modal({
            remote:rootPath+"serverType/gotoEditServer?id="+option[0].id+"&rSsgs="+option[0].r_ssgsId+"&rDj="+option[0].r_dj+"&rStatus="+option[0].r_status+"&rLxmc="+option[0].r_lxmcId+"&rNote="+option[0].r_note+"",//可以填写一个url，会调用jquery load方法加载数据

            /*   backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/

            keyboard:true,//当按下esc键时，modal框消失
        })
    }else{
      alert("请选择编辑数据")
    }
}

/*删除*/
function delSingServerType(){
    var option=$('#typeServerTable').bootstrapTable('getSelections');//获取的是数组
    if(option==''){
        alert("请选择行")
    }else{
        if(option[0].r_status == 1){
            bootbox.alert("删除失败,只能删除停用状态");
            return
        }
        $.ajax({
            url:rootPath+'serverType/delServerType',
            data:{id:option[0].id},
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                if(data.code!=-1){
                    alert(data.message);
                    queryTypeServer();
                }
            }
        });

    }
}


/**
 * 停用、启用 服务状态
 */
function ServerTypeStatus(status){
    var option=$('#typeServerTable').bootstrapTable('getSelections');//获取的是数组

    var url="serverType/updateServerTypeStatus";
        $.ajax({
            url:rootPath+url,
            data:{id:option[0].id,rStatus:status},
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                if(data.code!=-1){
                    alert(data.message);
                    queryTypeServer();
                }
            }
        });


}






