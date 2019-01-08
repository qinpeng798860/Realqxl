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
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> 重新登陆</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 安全退出</a></li>
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
<div class="con">
    <div style="width: 100%;height: 100%;margin-top: -20px;">
        <div id="tabContainer"></div>
        <script>
            var rootPath=$("#absout").val();
            $("#tabContainer").tabs({
                data: [{id:"1",
                    url:rootPath+'model/queryIndxContext',
                    text:'物业首页',
                    closeable: false,}],
                showIndex: 0,
                loadAll: false
            })

        </script>
    </div>
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

