$(function(){
    var rootPath = $("#absout").val();
            $('#boot1').bootstrapTable({
                    url: rootPath+'book/queryBooklist',         //请求后台的URL（*）
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
                    field: 'id',
                    title: '书本id',
                    width:'20%',

                },{
                    field: 'bookname',
                    title: '书本名称',
                    width:'20%',
                }, {
                    field: 'price',
                    title: '书本价格',
                    width:'20%',
                }, {
                    field: 'booktype',
                    title: '书本类别',
                    width:'20%',
                }, ]
            });

})


/*删除*/
function delSingBook(){
    var option=$('#boot1').bootstrapTable('getSelections');//获取的是数组
    if(option==''){
        alert("请选择行")
    }else{
        $.ajax({
            url:rootPath+'book/delSingBook',
            data:{id:option[0].id},
            dataType:'json',
            type:'post',
            async:false,
            success:function(data){
                console.log(data);
                if(data.code!=-1){
                    alert(data.message);
                    queryTable();
                }
            }
        });

    }
}

/*数据表格查询刷新*/
function queryTable(){
    var opt={
        url: rootPath+'book/queryBooklist'
    }
    $("#boot1").bootstrapTable('refresh', opt);
}


/*修改*/
function updateSingBook(){
    var option=$('#boot1').bootstrapTable('getSelections');//获取的是数组
    if(option!=''){
        $("#myAlert").css("display", "none"); //关闭所有的警告框,整个消息框被移除
        $("#myModal").modal({
            remote:rootPath+"book/gotoUpdateSingBook?"+option[0].id+"&bookname="+option[0].bookname+"&price="+option[0].price+"&booktype="+option[0].booktype+"",//可以填写一个url，会调用jquery load方法加载数据

            /*   backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/

            keyboard:true,//当按下esc键时，modal框消失
        })
    }else{
        $("#myAlert").css("display", "block");
    }


}


/*新增*/
function addSingBook(){
    $("#myModal").modal({
        remote:rootPath+"book/gotoUpdateSingBook",
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard:true,//当按下esc键时，modal框消失
    })
}



/*关闭模态框 并刷新表格数据*/
$("#myModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();

    queryTable();
});