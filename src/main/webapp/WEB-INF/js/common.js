$(function(){

    bootbox.setDefaults("locale","zh_CN");

})

//字典查询 id是组件id
// type是类型
// dictValue是字典数据隐藏域的值
function querySelectDict(id,type,lxmcId){
    $.ajax({
        url:rootPath+'dict/queryDict',
        data:{'rType':type},
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){
            var selectEdValue=$("#"+lxmcId).val();
            $("#"+id).append("<option value='' selected>--请选择类型--</option>")
            $.each(data,function(idx,ele){
                if(ele.id==selectEdValue){
                    $("#"+id).append("<option value='"+ele.id+"' selected>"+ele.text+"</option>");
                }else{
                    $("#"+id).append("<option value='"+ele.id+"'>"+ele.text+"</option>");
                }

            })
        }
    });
}

/**
 * 使用select2查询字典数据
 * id 绑定标签的id
 * type 字典类型
 */
function select2Dict(id,type,lxmcId){
    $('#'+id).select2({
        language: 'zh-CN',//语言
           /*data:data,*/
        minimumResultsForSearch: -1,//是否显示搜索框
        width: '100%',//宽
        placeholder: '--请选择--',//提示
        ajax:{
            url: rootPath+'dict/queryDict?rType='+type,
            type:'post',
            dataType: 'json',
            data: function(data){
            },
            processResults: function (data) {
                /*数据要求 id value值
                *         text 文本值*/
                return {
                    results: data
                };
            }
        },

    });

}

//获取当前系统时间
function PresentDate(){
    var myDate = new Date();//当前时间
    var year = myDate.getFullYear();//当前年份
    var month = myDate.getMonth() + 1;//当前月份
    var day = myDate.getDate();//当前日
    var newDate=year+"-"+month+"-"+day;
    return newDate;
    /*myDate.getYear();        //获取当前年份(2位)
    myDate.getFullYear();    //获取完整的年份(4位,1970-????)
    myDate.getMonth();       //获取当前月份(0-11,0代表1月)
    myDate.getDate();        //获取当前日(1-31)
    myDate.getDay();         //获取当前星期X(0-6,0代表星期天)
    myDate.getTime();        //获取当前时间(从1970.1.1开始的毫秒数)
    myDate.getHours();       //获取当前小时数(0-23)
    myDate.getMinutes();     //获取当前分钟数(0-59)
    myDate.getSeconds();     //获取当前秒数(0-59)
    myDate.getMilliseconds();    //获取当前毫秒数(0-999)*/
}

//时间控件
//第一个id 按钮组id
//第二个id input id
//获取当前系统时间
function  inputDate(id,inputId){
    //初始化时间框
    $('#'+id).datetimepicker({
        minView: "month", //选择日期后，不会再跳转去选择时分秒
        format: 'yyyy-mm-dd',
        language:'zh-CN',
    });
    //获取当前系统时间
    $('#'+inputId).attr("value",PresentDate());
    //点击显示
    $("#"+id).click(function(){
        $('#'+id).datetimepicker('show');
    })
    //隐藏时间框
    $('#'+id)
        .datetimepicker()
        .on('changeDate', function(ev){
            $('#'+id).datetimepicker('hide');
        });
}


//时间控件
//第一个id 按钮组id
//第二个id input id
//获取当前绑定时间
function  inputDateEdit(id,inputId){
    //初始化时间框
   /* $('#'+id).datetimepicker({
        minView: "month", //选择日期后，不会再跳转去选择时分秒
        format: 'yyyy-mm-dd',
        language:'zh-CN',
    });*/
    //获取当前系统时间
    var newDate =$("#"+inputId).val().toString();
    var s=new Date(newDate).format('yyyy-MM-dd')
    $('#'+inputId).attr("value",s);

}

/**
 * 查询服务类型
 * @param id
 * @param type

 */
function queryServerType(id){
    $.ajax({
        url:rootPath+'serverType/queryServerTypeSelect',
        data:{},
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){
            $("#"+id).append("<option value='' selected>--请选择服务类型--</option>")
            $.each(data,function(idx,ele){
                    $("#"+id).append("<option value='"+ele.id+"' title='"+ele.rDj+"'>"+ele.rLxmc+"</option>");
            })
        }
    });
}



/**
 * 使用select2查询公司数据
 * id 绑定标签的id
 * type 字典类型
 */
function select2Compay(id,selectedId){
    $.ajax({
        url:rootPath+'compay/queryCompay',
        data:'',
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){
            var tedId=$("#"+selectedId).val();
            $("#"+id).append("<option value='' selected>--请选择公司--</option>")
            $.each(data,function(idx,ele){
                if(ele.rComid==tedId){
                    $("#"+id).append("<option value='"+ele.rComid+"' selected>"+ele.rComname+"</option>");
                }else{
                    $("#"+id).append("<option value='"+ele.rComid+"'>"+ele.rComname+"</option>");
                }

            })
        }
    });
}
/**
 * 查询公司服务
 * id 绑定标签的id
 */
function queryCompanyrFwlx(id,type){
    $.ajax({
        url:rootPath+'compay/queryCompayrFwlx',
        data:{'rFwId':type},
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){
            $("#"+id).append("<option value=''>--请选择公司--</option>")
            $.each(data,function(idx,ele){
                    $("#"+id).append("<option value='"+ele.r_comid+"' title='"+ele.r_dj+"'>"+ele.r_comname+"</option>");
            })
        }
    });
}
/**
 * 查询角色
 * id 绑定标签的id
 */
function editRoleSelect(id,inputId){
    var roleid=$("#"+inputId).val();

    $.ajax({
        url:rootPath+'user/editRole',
        data:{},
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){
             var roleid=$("#"+inputId).val();
             console.log(roleid)
            $("#"+id).append("<option value=''>--请选择角色--</option>")
            $.each(data,function(idx,ele){
                if(ele.roleid==roleid){
                    $("#"+id).append("<option value='"+ele.roleid+"' selected>"+ele.rolename+"</option>");
                }else{
                    $("#"+id).append("<option value='"+ele.roleid+"'>"+ele.rolename+"</option>");
                }

            })
        }
    });
}


Date.prototype.format = function (format) {
    var date = {
        "M+": this.getMonth() + 1,
        "d+": this.getDate()-1,
        "h+": this.getHours(),
        "m+": this.getMinutes(),
        "s+": this.getSeconds(),
        "q+": Math.floor((this.getMonth() + 3) / 3),
        "S+": this.getMilliseconds()
    };
    if (/(y+)/i.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear()  + '').substr(4 - RegExp.$1.length));
    }
    for (var k in date) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1
                ? date[k] : ("00" + date[k]).substr(("" + date[k]).length));
        }
    }
    return format;
}

