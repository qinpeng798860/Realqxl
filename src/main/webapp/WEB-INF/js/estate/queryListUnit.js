$(function(){
    initTypeServerTable();/*初始化数据表格*/


});

function initTypeServerTable() {
    $('#LyxxTable').bootstrapTable({
        url:rootPath+'unit/queryListUnit',         //请求后台的URL（*）
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
            width:'4%',
        },  {
            field: 'dybm',
            title: '单元编号',
            width:'10%',
            formatter:function(value,row,index){

                var bh ="";

                bh = row.dybm;

                var btn="<a class='link-button' href='javascript:updateTypeServer(\""+bh+"\")'> ";
                btn+=bh+"</a>";
                return btn;
            }

        },{
            field: 'dymc',
            title: '单元名称',
            width:'10%',
        }, {
            field: 'kslc',
            title: '开始楼层',
            width:'10%',
        }, {
            field: 'jslc',
            title: '结束楼层',
            width:'10%',
        }, {
            field: 'ksfh',
            title: '开始房号',
            width:'10%',
        }, {
            field: 'jsfh',
            title: '结束房号',
            width:'10%',
        }, {
            field: '',
            title: '操作',
            width:'20%',
            formatter:function(value,row,index){

                var bh ="";

                bh = row.dybm;

                var btn="<a class='link-button' href='javascript:queryListRoom(\""+bh+"\")'>查看房间 </a>";
                return btn;
            }
        }, ]
    });

}

/*数据表格查询刷新*/
function queryUnitList(){
    var option=$('#LyxxTable').bootstrapTable('getSelections');//获取的是数组
    var opt={
        url: rootPath+'unit/queryListUnit'
    }
    $("#LyxxTable").bootstrapTable('refresh', opt);
}

/**
 * 新增服务类型
 */
function addTypeServer(){
    $("#TypeServerModal").modal({
        remote:rootPath+"unit/addUnit.shtml",
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard:true,//当按下esc键时，modal框消失
    })
}

/*关闭模态框 并刷新表格数据*/
$("#TypeServerModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    queryTypeServer();
});

/**
 * 修改服务类型
 */
function updateTypeServer(bh){
    var option=$('#typeServerTable').bootstrapTable('getSelections');//获取的是数组
    console.log(bh);
    if(option!=''){
        $("#TypeServerModal").modal({
            remote:rootPath+"unit/updateUnit.shtml?dybh="+bh,//可以填写一个url，会调用jquery load方法加载数据

            /*   backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/

            keyboard:true,//当按下esc键时，modal框消失
        })
    }else{
        alert("请选择编辑数据")
    }
}

function queryListRoom(bh){
   window.location.href="room/queryListRoom.shtml?dybh="+bh;

}
function DelLy(){
    var option=$('#LyxxTable').bootstrapTable('getSelections');//获取的是数组

    console.log(a)
    if(option!=''){
        var a = option[0].dybm;
        $.ajax({
            url:rootPath+'unit/delUnit',
            data:{"dybm":a},
            dataType:"json",
            async:false,
            type:"post",
            success:function(data) {
                alert(data.message)
                queryUnitList();

            }
        });
    }else{
        alert("请选择要删除数据")
    }
}



/*关闭模态框 并刷新表格数据*/
$("#TypeServerModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();

    queryTable();
});