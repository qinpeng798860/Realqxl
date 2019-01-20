
$(function(){
    initOwnerTable();
    // console.log(111);
})

//查询业主信息
function initOwnerTable(Str){
    $('#ownerListTable').bootstrapTable({
        url: rootPath+'owner/queryOwnerPager',         //请求后台的URL（*）
        data:Str,
        method: 'post',                      //请求方式（*）
        toolbar: '#btn-toolbar',               /* //工具按钮用哪个容器*/
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
        uniqueId: "rId",                     //每一行的唯一标识，一般为主键列
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
            field: 'r_id',
            align: 'center',
            width:'3%',
            visible:false,//隐藏列
        },{
            field: 'r_yzbm',
            title: '业主编码',
            width:'3%',
            visible:false,
        }, {
            field: 'ab',
            title: '住宅名称',
            align: 'center',
            width:'5%',

        },{
            field: 'r_yzxm',
            title: '业主姓名',
            align: 'center',
            width:'5%',
        }, {
            field: 'r_xb',
            title: '性别',
            align: 'center',
            width:'5%',
        },{
            field: 'r_csrq',
            title: '出生日期',
            align: 'center',
            width:'5%',

        },{
            field: 'r_zjhm',
            title: '证件号码',
            align: 'center',
            width:'5%',
        }, {

            field: 'r_sjhm',
            title: '手机号码',
            align: 'center',
            width:'5%',
        }, {
            field: 'r_zt',
            title: '状态',
            align: 'center',
            formatter:function(value,row,index){
                if(row.r_zt==1){
                    return "正常";
                }
                if(row.r_zt==2){
                    return "临时"
                }
            },
            width:'5%',
        }, {
            field: 'cz',
            title: '操作',
            align: 'center',
            formatter:function(value,row,index){
                var option=JSON.stringify(row);
                var v="<a href='javascript:void(0);' onclick='addBuildQuery("+option+")'>房产登记</a>&nbsp;&nbsp;";
                v+="<a href='javascript:void(0);' onclick='addHomeQuery("+option+")'>家庭成员</a>";
                return v;
            },
            width:'5%',
        },  ]
    });
}
/*数据表格查询刷新*/
function queryTable(){
    var url= rootPath+'owner/queryOwnerPager?rYzlx='+$('#ownerSelect').val()
    var sv = $('#StringValue').val();
    var sn = $('#StringName').val();
    if(sv=='r_zjhm'){
        url=url+"?rZjhm="+sn;
    }
    if(sv=='r_yzxm'){
        url=url+"?rYzxm="+sn;
    }
    if(sv=='r_sjhm'){
        url=url+"?rSjhm="+sn;
    }
    var opt={
        url:url
    }
    // initOwnerTable(opt);
    $("#ownerListTable").bootstrapTable('refresh', opt);
}




/*查看房产*/
function addBuildQuery(option){
   // var option=$('#ownerListTable').bootstrapTable('getSelections');//获取的是数组
    // console.log(option[0].r_id+"=========+++")
    if(option==''){
        alert("请选择行")
    }else {
        $("#addBuildModal").modal({
            remote: rootPath + "Build/gotoBuildQuery.shtml?rId="+option.r_id,
            /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
            keyboard: true,//当按下esc键时，modal框消失
        })
    }
}

//查看家庭成员
function addHomeQuery(option){
    if(option==''){
        alert("请选择行")
    }else {
        $("#addHomeModal").modal({
            remote: rootPath + "Home/gotoHomequery.shtml?rId="+option.r_id,
            /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
            keyboard: true,//当按下esc键时，modal框消失
        })
    }
}

/*新增*/
function addOwnerTable(){
    $("#addownerModal").modal({
        remote:rootPath+"owner/gotoOwnerAdd.shtml",
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard:true,//当按下esc键时，modal框消失
    })
}
/**
 * 修改服务类型
 */
function updateOwnerServer(){
    var option=$('#ownerListTable').bootstrapTable('getSelections');//获取的是数组
    console.log(option);
    if(option!=''){
        $("#addownerModal").modal({
            remote:rootPath+"owner/gotoOwnerAdd.shtml?rId="+option[0].r_id+"&rEid="+option.ab+"&rYzxm="+option[0].r_yzxm+"&rXb="+option[0].r_xb+
            "&rCsrq="+option[0].r_csrq+"&rZjhm="+option[0].r_zjhm+"&rSjhm="+option[0].r_sjhm+"&rZt="+option[0].r_zt+"&rYzlx"+option[0].r_yzlx+
            "&rMz="+option[0].r_mz+"&rXl="+option[0].r_xl+"&rGj="+option[0].r_gj+"&rJg="+option[0].r_jg+"&rZjlx="+option[0].r_zjlx+
            "&rGzdw="+option[0].r_gzdw+"&rZw="+option[0].r_zw+"&rYb="+option[0].r_yb+"&rLxdz="+option[0].r_lxdz+"&rJjlxr="+option[0].r_jjlxr+
            "&rJjlxdh="+option[0].r_jjlxdh+"&rJjlxdz="+option[0].r_jjlxdz+"&rKhx="+option[0].r_khx+"&rYhzh="+option[0].r_yhzh+"&rSzpcs="+option[0].r_szpcs+
            "&rNote="+option[0].r_note,//可以填写一个url，会调用jquery load方法加载数据

            /*   backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
            keyboard:true,//当按下esc键时，modal框消失
        })
    }else{
        alert("请选择编辑数据")
    }
}


/*关闭模态框 并刷新表格数据*/
$("#addownerModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
  queryTable();
});