$(function(){
    initTypeServerTable();/*初始化数据表格*/


});


var cwbh;
function initTypeServerTable() {
    $('#typeServerTable').bootstrapTable({
        url:rootPath+'parking/queryParkingPage',         //请求后台的URL（*）
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
            field: 'gsbh',
            title: '所属公司',
            width:'10%',

        },{
            field: 'ssfc',
            title: '房产',
            width:'5%',
        }, {
            field: 'cwbh',
            title: '车位编号',
            width:'15%', formatter:function(value,row,index){
                var a  ="";
                a=row.cwbh;


                var btn="<a class='link-button' href='javascript:updateParking(\""+a+"\")'>";
                btn+=a+"</a>";


                return btn;
            }
        }, {
            field: 'zt',
            title: '状态',
            width:'5%',
        },{
            field: 'cwlx',
            title: '车位类型',
            width:'10%',

        },{
            field: 'gllb',
            title: '管理类别',
            width:'10%',

        },{
            field: 'ysjg',
            title: '预售价格',
            width:'10%',

        },{
            field: 'yzjg',
            title: '预租价格',
            width:'10%',

        },{
            field: 'cwwz',
            title: '位置',
            width:'30%',

        },{
            field: 'cwmj',
            title: '面积',
            width:'10%',

        }]
    });

}

/*数据表格查询刷新*/
function queryParkingList(){
    var option=$('#typeServerTable').bootstrapTable('getSelections');//获取的是数组
    var opt={
        url: "parking/queryParkingPage"
    }
    $("#typeServerTable").bootstrapTable('refresh', opt);
}

/**
 * 新增服务类型
 */
function addTypeServer(){
    $("#TypeServerModal").modal({
        remote:rootPath+"parking/addParking.shtml",
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
function updateParking(bh){

    cwbh = bh;

    $("#TypeServerModal").modal({
        remote:rootPath+"parking/updateParking.shtml?cwbh="+bh,
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard:true,//当按下esc键时，modal框消失
    })


}

/**
 * 删除
 *
 *
 */

function DelLy(){
    var option=$('#typeServerTable').bootstrapTable('getSelections');//获取的是数组

    if(option!=''){
        var a =  option[0].cwbh;
        $.ajax({
            url:rootPath+'parking/delParkingss',
            data:{"cwbh":a},
            dataType:"json",
            async:false,
            type:"post",
            success:function(data) {
                alert(data.message)
                queryParkingList();

            }
        });
    }else{
        alert("请选择要删除数据")
    }
}


function querySingParking(bh){
    console.log(bh);

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