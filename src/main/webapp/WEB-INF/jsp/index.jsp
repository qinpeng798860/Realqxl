<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <%@taglib prefix="t" uri="http://www.springframework.org/tags" %>
    <link rel="stylesheet" href="bootstrap/css/bootstrap-tab.css" /><%--选项卡样式--%>
    <script src="bootstrap/js/bootstrap-tab.js"></script><%--选项卡js--%>
    <script src="js/index.js"></script>
    <meta charset="utf-8">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="edit-Type" edit="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>物业后台管理系统</title>
</head>

<script>
    $(function () {
        $("#iframeContext").height($(window).height()-110)
        $(window).resize(function(){
            $("#iframeContext").height($(window).height()-110);
        });

        /*点击图标首页*/
        $("#IndxContext").click(function(){
            $("#iframeContext").attr("src",rootPath+"/model/queryIndxContext");
        })



    })

</script>
<body>
!--头部-->
<header>
    <div class="logo">
        <em></em>云辉物业管理系统
        </div>
        <div class="header_left">
            <a href="property_homePage.html" style="color: #fff;">
                <em></em>
            </a>
        </div>
        <form class="navbar-form navbar-right" role="search">
            <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span>欢迎您:${LoginUser.rUsername}</a></li>
                <li><a href="javascript:void(0)" onclick="loginOut();"><span class="glyphicon glyphicon-log-in"></span> 安全退出</a></li>
                <script>
                    function loginOut(){
                        bootbox.confirm("您确认要退出吗",function(result){
                            if(result){
                                location.href=rootPath+"model/userLoginOut";
                            }
                        })
                    }

                </script>
            </ul>
        </form>
            <div class="clear"></div>
    <div class="clear"></div>
</header>
<!--页面左侧-->
<div class="left" >
     <div class="left_list"  id="navMenuList"><%--左侧导航--%></div>
 </div>

<%--内容--%>
<div class="con" style="height: 100%;">
        <%--中间内容--%>
    <div style="background: #ddd;margin-top: -20px;">

        <ul class="breadcrumb" id="indexUl">
            <li ><a href="javascript:void(0)" id="IndxContext"><i class="fa fa-university" ></i>物业首页</a></li>
        </ul>
        <iframe id="iframeContext" style="border:0; width:100%;margin-top: -20px;
         background-color:#FFF;"name="iframe" frameborder="0" src="/real/model/queryIndxContext.shtml">

        </iframe>
    </div>
    <%--    <script>
            $("#tabContainer").tabs({
                data: [{id:"1",
                    url:rootPath+'model/queryIndxContext',
                    text:'物业首页',
                    closeable: false,},{id:"1",
                    url:rootPath+'model/queryIndxContext',
                    text:'物业首页',
                    closeable: false,},{id:"1",
                    url:rootPath+'model/queryIndxContext',
                    text:'物业首页',
                    closeable: false,},{id:"1",
                    url:rootPath+'model/queryIndxContext',
                    text:'物业首页',
                    closeable: false,}],
                showIndex: 0,
                loadAll: false
            })
        </script>--%>

</div>

<script>
    /*左侧效果*/
    $(function(){
        $(".li_a").bind("click", function() {
            $(this).next(".left_slide").slideToggle().siblings(".left_slide").slideUp();
        });
    })
</script>

</body>
</html>

