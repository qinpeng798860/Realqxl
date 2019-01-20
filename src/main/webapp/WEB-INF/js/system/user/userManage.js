var rootPath = $("#absout").val();
var roleId='';
var treeObj='';
/*ztree配置*/
var setting = {
    view: {
        /*       addHoverDom: addHoverDom,
               removeHoverDom: removeHoverDom,*/
        selectedMulti: false
    },
    check: {
        enable: true

    },
    data: {
        simpleData: {
            enable: true
        }
    },
    edit: {
        enable: false
    }
};
$(function(){
    initRadioRole();//角色单选
    initTree();//树形

    $('#userManage').bootstrapTable({
        url: rootPath+'user/userQueryPager',         //请求后台的URL（*）
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
            width:'5%',
        },  {
            field: 'rUserid',
            title: '用户id',
            width:'20%',

        },{
            field: 'rUsername',
            title: '用户名',
            width:'20%',

        },{
            field: 'rUsername',
            title: '密码',
            width:'20%',
            formatter:function(value,row,index){
                return "<label>******</label>";
            }
        },{
            field: 'rolename',
            title: '角色',
            width:'20%',
        },{
            field: '',
            title: '操作',
            width:'20%',
            formatter:function(value,row,index){
                var option=JSON.stringify(row); // 把对象转译成json对象  可进行方法值传递
                return " <button type=\"button\" class=\"btn btn-primary\" onClick='editRole("+option+")'>分配角色</button>";
            }
        }]
    });


})

//重新分配角色
function editRole(option){
    $("#editUserModel").modal({
        remote: rootPath + "user/gotoEditRole.shtml?rUserid="+option.rUserid+"&rRoleId="+option.rRoleId,
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard: true,//当按下esc键时，modal框消失
    });
}



/*数据表格查询刷新*/
function queryUser(){
  var param=$("#rUsername").val();
    if(param==null){
        param='';
    }
    var opt = {
        url: rootPath+'user/userQueryPager?rUsername='+param
    };
    $("#userManage").bootstrapTable('refresh', opt);
}




/**
 *前往用户编辑和新增页面
 */
function editUser(code){
    var option=$('#userManage').bootstrapTable('getSelections');//获取的是数组

    var url=rootPath+"user/gotoeditUser";
    if(code==2){
        if(option==''){
            bootbox.alert("请选中行", function(){ /* your callback code */ })
            return
        }
        url+="?rUserid="+option[0].rUserid+"&rUsername="+option[0].rUsername+"&rPassword="+option[0].rPassword;
    }
    $("#editUserModel").modal({
        remote:url,
        /*backdrop:"static",//指定一个静态背景，当用户点击背景处，modal界面不会消失*/
        keyboard:true,//当按下esc键时，modal框消失
    })
}

/**
 *删除用户
 */
function delUser(){
    var option=$('#userManage').bootstrapTable('getSelections');//获取的是数组
    if(option==''){
        bootbox.alert("请选中行", function(){ /* your callback code */ })
        return
    }

    var url=rootPath+"user/delUser?rUserid="+option[0].rUserid;
          bootbox.confirm("确认要删除嘛?", function(result){
            if(result){
                $.ajax({
                    url:url,
                    data:'',
                    dataType:'json',
                    type:'post',
                    async:false,
                    success:function(data){
                        if(data.code!=-1){
                            bootbox.alert(data.message, function(){ })
                            $("#editUserModel").modal("hide")
                            queryUser();
                        }
                    }
                })
            }
        /* your callback code */ })
}





/*关闭模态框 并刷新表格数据*/
$("#editUserModel").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    /*    queryTypeServer();*/
    queryUser();
});

/*关闭模态框 并刷新表格数据*/
$("#editUserRoleModal").on("hidden.bs.modal", function() {
    /*解决第二次赋值还是第一次值的问题*/
    $(this).removeData("bs.modal");
    /*modal页面加载$()错误,由于移除缓存时加载到
    <span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>
    未移除的数据，手动移除加载的内容 */
    $(this).find(".modal-content").children().remove();
    /*    queryTypeServer();*/
    queryUser();
});









//加载角色
function initRadioRole(){
    $.ajax({
        url: rootPath + "role/queryRole",
        data:'',
        dataType:'json',
        type:'post',
        async:false,
        success: function (data) {
            var radio="";
            $.each(data.rows,function(idx,ele){
                radio += " <div class=\"radio radio-inline\">\n" +
                    "                <input type=\"radio\" id='" + ele.roleid + "' value='" + ele.roleid + "' name=\"radioInline\" onclick=assgiRoleid(\""+ele.roleid+"\")>" +
                    "                <label for='" + ele.roleid + "'>" + ele.rolename + "</label>\n" +
                    "            </div>";
            })

            $("#roleRadio").html(radio);
        }
    });


}



//初始化权限树
function initTree(){
    $.ajax({
        type: "Post",
        url: rootPath+"author/queryModelTree",
        data:{},
        dataType: "json",
        success: function (result) {
            treeObj=$.fn.zTree.init($("#treeDemo"), setting, result);
        },
        error: function () {
            alert("树形结构加载失败！")
        }
    });
}



function assgiRoleid(id){
    //取消所有节点选中
    treeObj.checkAllNodes(false);
    roleId=id;
    var data= queryRoleModule();

    $.each(data,function(idx,ele){
        //根据id属性的值获取zTree中对应的TreeNode节点
        var node = treeObj.getNodeByParam("id",ele.moduleId);

        //选中节点
        treeObj.checkNode(node, true, false);
    })
}



/*获取权限数据绑定*/
function queryRoleModule(){
    var datas='';
        $.ajax({
            url: rootPath + "author/queryRoleMoDel?roleid="+roleId,
            data: '',
            dataType: 'json',
            type: 'post',
            async: false,
            contentType: "application/json; charset=utf-8",
            success: function (data) {
                datas=data
            }

        });
    return datas;
}


function addRoleModule(){
    var nodes = treeObj.getCheckedNodes(true);
    if(nodes.length>0 || roleId==''){
        var ModuleIds=[]
        //循环获取选中节点的id，并以，隔开
        for(var i=0;i<nodes.length;i++){
            ModuleIds.push(nodes[i].id);
        }
        console.log(ModuleIds);
        $.ajax({
            url:rootPath+"author/addModuleRole",
            data:{'roleid':roleId,"ModuleIds":ModuleIds},
            dataType:'json',
            type:'post',
            async:false, //同步
            //数据量大用异步
            success:function(data){
                if(data.code){
                    //取消所有选中状态的节点
                    /*  treeObj.checkAllNodes(false);*/
                    bootbox.alert("权限保存成功",function(){});
                }
            }
        });
    }else{
        bootbox.alert("请选择角色进行权限操作",function(){});
    }
}