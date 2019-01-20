var rootPath=$("#absout").val();

$(function () {
    initMenu();
    /*点击li事件*/
    $("#navMenuList a ").click(function(){
        var fid = $(this).attr("id");
        var arrfid=fid.split(",");
        fid=arrfid[0];
        var s=oneInitMenu(fid);
      if(s!=-1){
          $.ajax({
              url:rootPath+'model/queryModel',
              data:{'rParentCode':fid},
              dataType:'json',
              type:'post',
              async:false,
              success:function(data){
                  var menus=""
                  $.each(data,function(idx,ele){
                      var s=JSON.stringify(ele);
                      menus+="<span><a href=\"javascript:;\" onclick='openIframeNews("+s+");'>"+ele.rText+"</a></span>";
                  });
                  $("#"+fid).append(menus);
              }

          })
      }
    });



})

//初始化左侧导航菜单
function initMenu(){
    /**/
    $.ajax({
        url:rootPath+'model/queryModel',
        data:{'rParentCode':'-1'},
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){
            var menus=""
            $.each(data,function(idx,ele){
                menus+="<a href='javascript:void(0)' class=\"li_a\" " +//图标
                    " id='"+ele.rCode+",'><em></em><i class='fa "+ele.rIcon+" fa-1x'></i>"+ele.rText+"<em class=\"left_em2\"></em></a>" +
                    "<div class=\"left_slide\" id='"+ele.rCode+"'></div>" +
                    "";
             });
            $("#navMenuList").append(menus);
        }
    })
}

/*导航*/
var arryMenu=[];
//只加载第一次
function oneInitMenu(fid){
    if(arryMenu.indexOf(fid,0)!=-1){
        return -1;
    }else{
        arryMenu.push(fid);
    }
}
//获取id用来判断是否重复加载
var openId="";
function openIframeNews(node){
    var s=JSON.stringify(node);
    var uls = "<li ><a href=\"javascript:void(0)\" id='"+node.id+"' onclick='openoldIfrme("+s+")'>" + node.rText + "</a></li>";
    //判断是否重复
    if(openId!=node.id){
        $("#indexUl").append(uls);
    }
    //面包屑名
    $("#" + node.id).html(node.rText);
    openId = node.id;
    //打开新页面
    $("#iframeContext").attr("src",rootPath+node.rUrl);
}
//打开上一个页面
function openoldIfrme(node){
    $("#iframeContext").attr("src",rootPath+node.rUrl);
}




/*
/!*创建tab页面  并只加载一次*!/
var arryTabs=[];
function createTab(node) {
    var s=$("#tabContainer").data("tabs").showTab(node.rCode);
    if(arryTabs.indexOf(node.rCode,0)!=-1){
        $("#tabContainer").data("tabs").showTab(node.rCode);

    }else{
        $("#tabContainer").data("tabs").addTab({
            id: node.rCode,
            text: node.rText,
            url:rootPath+node.rUrl,
            closeable: true,
        });
        arryTabs.push(node.rCode);
    }
}

/!*删除数组中tab的id*!/
function removeTab(id){
    //查找下标
    var index = arryTabs.indexOf(id);
    //删除
    if (index > -1) {
        arryTabs.splice(index, 1);
    }

}*/
