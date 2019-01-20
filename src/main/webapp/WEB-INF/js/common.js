var rootPath = $("#absout").val();

//字典查询 id是 type是类型
function querySelectDict(id,type,dictValue){
    $.ajax({
        url:rootPath+'dict/queryDict',
        data:{'rType':type},
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){
            var dict=$("#"+dictValue).val();
            $("#"+id).append("<option value='' selected>--请选择类型--</option>")
            $.each(data,function(idx,ele){
                // console.log(ele);
                // console.log(idx);
                if (ele.rValue==dict)
                    $("#"+id).append("<option value='"+ele.rValue+"' selected>"+ele.rItem+"</option>");
                else
                    $("#"+id).append("<option value='"+ele.rValue+"'>"+ele.rItem+"</option>");
            })
        }
    });
}

// id是 type是类型
function querySelectGeen(id,type,dictValue){
    $.ajax({
        url:rootPath+'geen/queryGeenSetPager',
        data:'',
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){

            var dict=$("#"+dictValue).val();
            $("#"+id).append("<option value='' selected>--请选择--</option>")
            $.each(data.rows,function(idx,ele){
                // console.log(ele);
                // console.log(idx);
                if (ele.rGid==dict)
                    $("#"+id).append("<option value='"+ele.r_gid+"' selected>"+ele.r_gszmc+"</option>");
                else
                    $("#"+id).append("<option value='"+ele.r_gid+"'>"+ele. r_gszmc+"</option>");
            })
        }
    });
}

// id是 type是类型  清洁名称
function querySelectClean(id,type,dictValue){
    $.ajax({
        url:rootPath+'arrangement/queryCleanArrangementPager',
        data:'',
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){

            var dict=$("#"+dictValue).val();
            $("#"+id).append("<option value='' selected>--请选择--</option>")
            $.each(data.rows,function(idx,ele){
                // console.log(ele);
                // console.log(idx);
                if (ele.r_aid==dict)
                    $("#"+id).append("<option value='"+ele.r_aid+"' selected>"+ele.r_amc+"</option>");
                else
                    $("#"+id).append("<option value='"+ele.r_aid+"'>"+ele.r_amc+"</option>");
            })
        }
    });
}



// id是 type是类型  清洁名称
function querySelectResidental(id,type,dictValue){
    $.ajax({
        url:rootPath+'residential/queryResidential',
        data:'',
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){

            var dict=$("#"+dictValue).val();
            $("#"+id).append("<option value='' selected>--请选择--</option>")
            $.each(data,function(idx,ele){
                // console.log(ele);
                // console.log(idx);
                if (ele.id==dict)
                    $("#"+id).append("<option value='"+ele.id+"'>"+ele.rZzmc+"</option>");
                else
                    $("#"+id).append("<option value='"+ele.id+"'>"+ele.rZzmc+"</option>");
            })
        }
    });
}









function showsmsselect() {

    //每次调用先清空
    $("#lybm").find("option").remove();  //楼宇下拉
    $("#dybm").find("option").remove();  //楼层下拉
    $("#fjbm").find("option").remove(); //房间下拉

    //查询楼宇
    $.ajax({
        url:rootPath+'/Bu/queryBuild', //查询全部楼宇
        type : "post",
        dataType : "json",
        success : function(result) {
            var b = "";
            b += "<option id='bu' value='0'>请选择楼宇</option>";
            $.each(result, function(key, value) {

                b += "<option value='" + value.lybm + "'>" + value.lymc //下拉框序言的循环数据
                    + "</option>";
            });
            $("#lybm").append(b);//append 添加进去并展示
            //绑定事件之前先解绑,解决该方法被调用了多少次，则该事件被绑定了多少次问题
            $("#lybm").unbind();
            $("#lybm").on( //change改变事件
                "change",
                function() {
                    //每次改变前先清空floor在追加
                    $("#dybm").find("option").remove();
                    $("#fjbm").find("option").remove();
                    //查询楼层
                    $.ajax({
                        url:rootPath+'/Unit/queryUnitKey?lyid='+$("#lybm").val(), //根据楼宇id查询楼层
                        type : "post",
                        dataType : "json",
                        success : function(result) {
                            var c = "";
                            c += "<option value='0'>请选择楼层</option>";
                            $.each(result, function(key, value) {

                                c += "<option value='" + value.dybm + "'>" + value.dymc //下拉框序言的循环数据
                                    + "</option>";
                            });
                            $("#dybm").append(c);//append 添加进去并展示
                        }
                    });
                })
            //绑定事件之前先解绑,解决该方法被调用了多少次，则该事件被绑定了多少次问题
            $("#dybm").unbind();
            $("#dybm").on( //change改变事件
                "change",
                function() {
                    //每次改变前先清空number在追加
                    $("#fjbm").find("option").remove();
                    //查询房号
                    $.ajax({
                        url:rootPath+'/room/queryRoomKey?dyid='+$("#dybm").val(), //根据楼层id查询房号
                        type : "post",
                        dataType : "json",
                        success : function(result) {
                            var d = "";
                            d += "<option id='num' value='0'>请选择房号</option>";
                            $.each(result, function(key, value) {
                                //这里查询全部的房产，也可以查房产状态为未入住的
                                if (value.r_fczt=="") {
                                    d += "<option value='" + value.fjbm + "'>" + value.fjmc + "(已入住)" //下拉框序言的循环数据
                                        + "</option>";
                                }else {
                                    d += "<option value='" + value.fjbm + "'>" + value.fjmc //下拉框序言的循环数据
                                        + "</option>";
                                }
                            });
                            $("#fjbm").append(d);//append 添加进去并展示
                            //绑定事件之前先解绑,解决该方法被调用了多少次，则该事件被绑定了多少次问题
                            $("#fjbm").unbind();
                            $("#fjbm").on( //change改变事件
                                "change",
                                function() {
                                    //如果选择了已入住则提示并默认选中"请选择"
                                    if ($('#fjbm').find("option:selected").text().match("(已入住)")){
                                        $('#num').prop('selected',true);
                                        swal(
                                            {title:"警告！此房间已有客户入住",
                                                text:"请重新选择房间",
                                                confirmButtonColor:"#CDCD00",
                                                confirmButtonText:"确定",
                                            }
                                        )
                                    }
                                })
                        }
                    });
                })
        }
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
    $('#'+id).datetimepicker({
         minView: "month", //选择日期后，不会再跳转去选择时分秒
         format: 'yyyy-mm-dd',
         language:'zh-CN',
     });

    // //获取当前系统时间
    var newDate =$("#"+inputId).val().toString()
    var s = new Date(newDate).format('yyyy-MM-dd');
    $('#'+inputId).attr("value",s);

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



Date.prototype.format = function (format) {
    var date = {
        "M+": this.getMonth()+1,
        "d+": this.getDate(),
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






