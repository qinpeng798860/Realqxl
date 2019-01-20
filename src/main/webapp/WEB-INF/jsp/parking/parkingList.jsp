<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/15
  Time: 9:00
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
    <script src="js/parking/parkingList.js"></script>
    <title>车位维护</title>
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


<div>
    <ul class="nav nav-tabs" id="zzxx">
        <li style="padding-left: 650px;" class="active">车位状态：</li>
        <li class="active"><select class="form-control" id="cwzt">
            <option>请选择</option>
        </select></li>
        <li class="active"><input type="text" class="form-control" id="zzbh "></li>
        <li class="active" >
            <div >
                <button type="button" class="btn btn-primary " onclick="addTypeServer();">新增</button>
                <button type="button" class="btn btn-primary" onclick="DelLy()">删 除</button>
            </div></li>
    </ul>
</div>
<table id="typeServerTable">

</table>
<script>

</script>
</body>
</html>
