<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>服务类型</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/server/typeServer.js"></script>
</head>
<body>

<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="TypeServerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
<%--查询--%>
<form class="form-inline" role="form">
    <div class="form-group">
        <label class="sr-only">服务类型</label>
        <select type="text" class="form-control" id="serverTypeName" name="rLxmc" value=""></select>
    </div>
    <a  class="btn btn-default" onclick="queryTypeServer();">查 询</a>
</form>

<table id="typeServerTable">
    <div id="toolbar">
        <div class="btn-group">
            <button type="button" class="btn btn-primary " onclick="addTypeServer();">新增类型</button>
            <button type="button" class="btn btn-primary" onclick="delSingServerType()">删 除</button>
            <button type="button" class="btn btn-primary" onClick="updateTypeServer()">修 改</button>
            <button type="button" class="btn btn-danger" onclick="ServerTypeStatus(2)">停用</button>
            <button type="button" class="btn btn-success" onclick="ServerTypeStatus(1)">启用</button>
        </div>
    </div>
</table>

</body>
</html>
