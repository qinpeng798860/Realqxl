$(function(){
    initHomeTable();
    // console.log(111);
})
// var rYzid= $("#rYzid").val();
// console.log($("#rYzid").val()+"===========");
// 查询家庭成员信息
function initHomeTable(){
    $('#BHomeTable').bootstrapTable({
        url: rootPath+'Home/queryMembers?rYzid='+$("#rYzid").val(),         //请求后台的URL（*）
        method: 'post',                      //请求方式（*）
       toolbar: '#btn-Homebar',               /* //工具按钮用哪个容器*/
        striped: false,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: false, //分页
        pageNumber: 1,//如果设置了分页，首页页码
        pageSize: 10,//如果设置了分页，页面数据条数
        pageList:[10, 20, 30, 50,'All'],
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        showRefresh: false,                    //是否显示刷新按钮
        minimumCountColumns: 1,             //最少允许的列数
        clickToSelect: true,                //是否启用点击选中行
        width:800,
        height: 650,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "rMid",                     //每一行的唯一标识，一般为主键列
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
            field: 'rMid',
            align: 'center',
            width:'10%',
            visible:false,
        },{
            field: 'rCyxm',
            title: '姓名',
            align: 'center',
            width:'10%',
        },{
            field: 'rXb',
            title: '性别',
            align: 'center',
            width:'10%',

        },{
            field: 'rLxdh',
            title: '联系电话',
            align: 'center',
            width:'10%',
        }, {
            field: 'rZjhm',
            title: '证件号码',
            align: 'center',
            width:'10%',
        },{
            field: 'rGzdw',
            title: '工作单位',
            align: 'center',
            width:'10%',

        },{
            field: 'aa',
            title: '操作',
            align: 'center',
            formatter:function(value,row,index){
               var v="<a href='javascript:void(0)'onclick='deleteHomeMembers()'>删除</a>";
                return v;
            },
            width:'10%',
        },  ]
    });
}


/*删除*/
function deleteHomeMembers() {
    var option = $('#BHomeTable').bootstrapTable('getSelections');//获取的是数组
    // console.log(option);
    if (option == '') {
        alert("请选择行")
    } else {
        Ewin.confirm({message: "确认要删除选择的数据吗？"}).on(function (e) {
            if (!e) {
                return;
            }
            $.ajax({
                url: rootPath + 'Home/deleteByPrimaryKey',
                data: {rMid: option[0].rMid},
                dataType: 'json',
                type: 'post',
                async: false,
                success: function (data) {
                    console.log(data);
                    if (data.code != -1) {
                        alert(data.message);
                        queryHomeTable();
                    }
                }
            });
        });
    }
}

// 新增家庭成员
    function addHomeTable() {
        $("#addHomeMembersModal").modal({
            remote: rootPath + 'Home/gotoHomeAdd.shtml?rYzid='+ $("#rYzid").val(),
            /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
            keyboard: true,//当按下esc键时，modal框消失
        });
    }

//
    /*数据表格查询刷新*/
    function queryHomeTable() {
        var opt = {
            url: rootPath + 'Home/queryMembers?rYzid='+$("#rYzid").val()
        }
        $("#BHomeTable").bootstrapTable('refresh', opt);
    }


    /*关闭模态框 并刷新表格数据*/
    $("#addHomeModal").on("hidden.bs.modal", function () {
        /*解决第二次赋值还是第一次值的问题*/
        $(this).removeData("bs.modal");
        /*modal页面加载$()错误,由于移除缓存时加载到
        <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
        未移除的数据，手动移除加载的内容 */
        $(this).find(".modal-content").children().remove();
        // queryTable();
    })


