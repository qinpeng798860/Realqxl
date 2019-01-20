
$(function(){
    initGeenable();
    // console.log(111);
})

//查询业主信息
function initGeenable(Str){
    $('#GeenSetTable').bootstrapTable({
        url: rootPath+'geen/queryGeenSetPager',         //请求后台的URL（*）
        data:Str,
        method: 'post',                      //请求方式（*）
        toolbar: '#btn-Geenbar',               /* //工具按钮用哪个容器*/
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
        uniqueId: "rGbm",                     //每一行的唯一标识，一般为主键列
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
            field: 'r_gbm',
            align:'center',
            width:'5%',
            visible:false,
        },{
            field: 'r_gszmc',
            title: '设置名称',
            align:'center',
            width:'5%',

        },{
            field: 'r_gmj',
            title: '面积',
            align:'center',
            width:'5%',
        }, {
            field: 'r_gdd',
            title: '地点',
            align:'center',
            width:'5%',
        }, {
            field: 'r_gzrr',
            title: '责任人',
            align:'center',
            width:'5%',
        },{
            field: 'r_glhsj',
            title: '绿化时间',
            align:'center',
            width:'5%',
        }, {
            field: 'r_gzyzb',
            title: '主要植被',
            align:'center',
            width:'10%',
        }, {
            field: 'cz',
            title: '操作',
            formatter:function(value,row,index){
              var v="<a href='javascript:void(0);' onclick='delSingGeenSet()'>删除</a>&nbsp;&nbsp;";
                 v+="<a href='javascript:void(0);' onclick='updateGeenSet()'>修改</a>"
              return v;
            },
            align:'center',
            width:'5%',
        }, ]
    });
}
/*数据表格查询刷新*/
function queryGeenSetTable(){
    var url= rootPath+'geen/queryGeenSetPager'
    var a = $('#StringGeenSet').val();
    var b = $('#GeenSetName').val();
    if(a=='r_gszmc'){
        url = url+"?rGszmc="+b;
    }
    if(a=='r_gmj'){
        url = url+"?rGmj="+b;
    }
    if(a=='r_gdd'){
        url = url+"?rGdd="+b;
    }
    if(a=='r_gzyzb'){
        url = url+"?rGzyzb="+b;
    }
    // console.log(url)
    var opt={
        url:url
    }
    $("#GeenSetTable").bootstrapTable('refresh', opt);
}

/*删除*/
function delSingGeenSet(){
    var option=$('#GeenSetTable').bootstrapTable('getSelections');//获取的是数组
    // console.log(option[0].r_gbm+"+++++++++++")
    if(option==''){
        alert("请选择行")
    }else{
        Ewin.confirm({ message: "确认要删除选择的数据吗？" }).on(function (e) {
            if (!e) {
                return;
            }
        $.ajax({
            url:rootPath+'geen/deleteSingGeenSet',
            data:{rGbm:option[0].r_gbm},
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                console.log(data);
                if(data.code!=-1){
                    alert(data.message);
                    queryGeenSetTable();
                }
            }
        });
        });
    }
}

/*新增绿化*/
function addGeenSetTable(){
    $("#addGeenSetModal").modal({
        remote:rootPath+"geen/gotoGeensetAdd.shtml",
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard:true,//当按下esc键时，modal框消失
    })
}

/**
 * 修改服务类型
 */
function updateGeenSet(){
    var option=$('#GeenSetTable').bootstrapTable('getSelections');//获取的是数组
    // console.log(option+"====")
    if(option!=''){
        $("#addGeenSetModal").modal({
            remote:rootPath+"geen/gotoGeensetAdd.shtml?rGbm="+option[0].r_gbm+"&rGszmc="+option[0].r_gszmc+"&rGmj="+option[0].r_gmj+"&rGdd="+option[0].r_gdd+"&rGzrr="+option[0].r_gzrr+"&rGlhsj="+option[0].r_glhsj+"&rGzyzb="+option[0].r_gzyzb+"&rGnote="+option[0].r_gNote+"",//可以填写一个url，会调用jquery load方法加载数据

            /*   backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/

            keyboard:true,//当按下esc键时，modal框消失
        })
    }else{
        alert("请选择编辑数据")
    }
}

/*关闭模态框 并刷新表格数据*/
$("#addGeenSetModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    queryvegeTable();
});
