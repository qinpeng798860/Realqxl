
$(function(){
    initCleanCheckTable();
    // console.log(111);
})

//查询业主信息
function initCleanCheckTable(Str){
    $('#CleanCheckTable').bootstrapTable({
        url: rootPath+'Cleancheck/queryCleanCheckPager',         //请求后台的URL（*）
        data:Str,
        method: 'post',                      //请求方式（*）
        toolbar: '#btn-cleancheckbar',               /* //工具按钮用哪个容器*/
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
        search: false,
        uniqueId: "rQbm",                     //每一行的唯一标识，一般为主键列
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
            field: 'r_qbm',
            align:'center',
            width:'5%',
            visible:false,
        },{
            field: 'r_qjcrq',
            title: '检查日期',
            align:'center',
            width:'5%',

        },{
            field: 'r_qjcdd',
            title: '检查地段',
            align:'center',
            width:'5%',
        }, {
            field: 'r_qjcr',
            title: '检查人',
            align:'center',
            width:'5%',
        }, {
            field: 'r_qqjr',
            title: '清洁人',
            align:'center',
            width:'5%',
        },{
            field: 'r_qjcqk',
            title: '检查情况',
            align:'center',
            width:'10%',
        }, {
            field: 'cz',
            title: '操作',
            formatter:function(value,row,index){
              var v="<a href='javascript:void(0);' onclick='delSingCleanChcek()'>删除</a>&nbsp;&nbsp;";
                 v+="<a href='javascript:void(0);' onclick='updateCleanCheck()'>修改</a>"
              return v;
            },
            align:'center',
            width:'5%',
        }, ]
    });
}
/*数据表格查询刷新*/
function queryCleanCheckTable(){
    var opt={
        url: rootPath+'Cleancheck/queryCleanCheckPager?rQjcr='+$('#rQjcr').val(),
    }
    // initVegeTable(opt);
    $("#CleanCheckTable").bootstrapTable('refresh', opt);
}

/*删除*/
function delSingCleanChcek(){
    var option=$('#CleanCheckTable').bootstrapTable('getSelections');//获取的是数组
    console.log(option)
    // console.log(option[0].r_cbm+"+++++++++++")
    if(option==''){
        alert("请选择行")
    }else{
        Ewin.confirm({ message: "确认要删除选择的数据吗？" }).on(function (e) {
            if (!e) {
                return;
            }
            $.ajax({
                url: rootPath + 'Cleancheck/deleteSingCleanCheck',
                data: {rQbm: option[0].r_qbm},
                dataType: 'json',
                type: 'post',
                async: false,
                success: function (data) {
                    console.log(data);
                    if (data.code != -1) {
                        alert(data.message);
                        queryCleanCheckTable();
                    }
                }
            });
        });
    }
}

/*新增绿化*/
function addCleanCheckTable(){
    $("#addCleanCheckModal").modal({
        remote:rootPath+"Cleancheck/gotoCleanCheckAdd.shtml",
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard:true,//当按下esc键时，modal框消失
    })
}

/**
 * 修改服务类型
 */
function updateCleanCheck(){
    var option=$('#CleanCheckTable').bootstrapTable('getSelections');//获取的是数组
    // console.log(option[0].mc+"====")
    if(option!=''){
        $("#addCleanCheckModal").modal({
            remote:rootPath+"Cleancheck/gotoCleanCheckAdd.shtml?rQbm="+option[0].r_qbm+"&rQjcrq="+option[0].r_qjcrq+"&rQjcdd="+option[0].r_qjcdd+"&rQjcr="+option[0].r_qjcr+"&rQqjr="+option[0].r_qqjr+"&rQjcqk="+option[0].r_qjcqk+"&rQnote="+option[0].r_qnote+"",//可以填写一个url，会调用jquery load方法加载数据

            /*   backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/

            keyboard:true,//当按下esc键时，modal框消失
        })
    }else{
        alert("请选择编辑数据")
    }
}

/*关闭模态框 并刷新表格数据*/
$("#addCleanCheckModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    queryCleanCheckTable();
});