$(function(){
    initBuildTable();
    // console.log(111);
})
// 查询房产信息
// var rYzid= $("#rYzid").val();
function initBuildTable(){
    $('#BuildListTable').bootstrapTable({
        url: rootPath+'Build/queryEstate?rYzid='+$("#rYzid").val(),         //请求后台的URL（*）
        method: 'post',                      //请求方式（*）
        toolbar: '#btn-Buildbar',               /* //工具按钮用哪个容器*/
        striped: false,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: false, //分页
        pageNumber: 1,//如果设置了分页，首页页码
        pageSize: 10,//如果设置了分页，页面数据条数
        pageList:[10, 20, 30, 50,'All'],
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        showRefresh: true,                    //是否显示刷新按钮
        minimumCountColumns: 1,             //最少允许的列数
        clickToSelect: true,                //是否启用点击选中行
        height: 550,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        search: false,
        uniqueId: "id",                     //每一行的唯一标识，一般为主键列
        showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
        smartDisplay:false,
        contentType: "application/x-www-form-urlencoded",
        singleSelect:true,
        queryParamsType:'',//设置请求参数格式
        queryParams:function queryParams(params) { //设自定义查询参数
            var param = {
                rows: params.pageSize,   //每页多少条数据
                page: params.pageNumber, // 页码
            };
            return param;
        },
        columns: [{
            checkbox: true,
            width:'1%',
        },{
            field: 'dy',
            title: '单元名称',
            align: 'center',
            width:'10%',

        },{
            field: 'fj',
            title: '房间名称',
            align: 'center',
            width:'10%',

        },{
            field: 'r_fczt',
            title: '房产状态',
            align: 'center',
            formatter:function(value,row,index){
                if(row.r_fczt==1){
                    return "自住";
                }
                if(row.r_fczt==2){
                    return "出租"
                }
                if(row.r_fczt==3){
                    return "空闲"
                }
            },
            width:'10%',
        }, {
            field: 'r_fcsj',
            title: '登记时间',
            align: 'center',
            formatter:function(value,row,index){
                return changeDateFormat(value);
            },
            width:'10%',
        },{
            field: 'r_fczh',
            title: '房产证号',
            align: 'center',
            width:'10%',

        },{
            field: 'bb',
            title: '操作',
            align: 'center',
            formatter:function(value,row,index){
                var v="<a href='javascript:void(0)'onclick='delSingBuild()'>删除</a>";
                return v;
            },
            width:'10%',
        },  ]
    });
}

/*删除*/
function delSingBuild(){
    var option=$('#BuildListTable').bootstrapTable('getSelections');//获取的是数组
    console.log(option)
    if(option==''){
        alert("请选择行")
    }else{
        Ewin.confirm({ message: "确认要删除选择的数据吗？" }).on(function (e) {
            if (!e) {
                return;
            }
        $.ajax({
            url:rootPath+'Build/delSingBuild',
            data:{rId:option[0].r_id},
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                console.log(data);
                if(data.code!=-1){
                    alert(data.message);
                    queryBuildTable();
                }
            }
        });
      });
    }
}

/*新增*/
function addBuildTable(){
    $("#BuildModal").modal({
        remote:rootPath+"Build/gotoBuildAdd.shtml?rYzid="+$("#rYzid").val(),
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard:true,//当按下esc键时，modal框消失
    })
}
//
/*数据表格查询刷新*/
function queryBuildTable(){
    var opt={
        url: rootPath+'Build/queryEstate?rYzid='+$("#rYzid").val()
    }
    $("#BuildListTable").bootstrapTable('refresh', opt);
}

/*关闭模态框 并刷新表格数据*/
$("#addBuildModal").on("hidden.bs.modal", function () {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    // queryTable();
})
