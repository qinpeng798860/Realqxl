<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/8
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp" %>
    <link rel="stylesheet" href="bootstrap/css/bootstrap-tab.css"/>
    <%--选项卡样式--%>
    <script src="bootstrap/js/bootstrap-tab.js"></script>
    <%--选项卡js--%>
    <script src="js/estate/queryListUnit.js"></script>
    <title>楼宇信息</title>
</head>


<body>

<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="TypeServerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
<table id="LyxxTable">

    <div>
        <ul class="nav nav-tabs" id="zzxx">
            <li class="active"><a href="#identifier" data-toggle="tab">住宅信息</a></li>
            <li class="active"><a href="#identifier" data-toggle="tab">楼宇信息</a></li>
            <li class="active"><a href="#identifier" data-toggle="tab">单元信息</a></li>
            <li class="active"><a href="#identifier" data-toggle="tab">房间信息</a></li>

                <div style="padding-left: 1500px;">
                    <button type="button" class="btn btn-primary " onclick="addTypeServer();">增 加</button>
                    <button type="button" class="btn btn-primary" onclick="DelLy()">删 除</button>
                </div></li>
        </ul>
    </div>
</table>
<script>

</script>
</body>
</html>
