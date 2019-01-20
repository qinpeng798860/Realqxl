<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>检查记录</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/vege/cleancheck/ListCleanCheck.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3" style="padding-top: 10px">
            <%--<input type="text" name="StringName" value=""/>--%>
            <label>检查人：</label>
            <input type="text" class="form-control" id="rQjcr" name="rQjcr"/>
        </div>
        <div class="col-sm-4 col-md-offset-4"></div>
    </div>
</div>
<table id="CleanCheckTable">
    <div id="btn-cleancheckbar">
        <button type="button" class="btn btn-default" onclick="queryCleanCheckTable()">查询</button>
        <button type="button" class="btn btn-default" onclick="addCleanCheckTable()">新增</button>
    </div>
</table>
<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="addCleanCheckModal" tabindex="-1" role="dialog" aria-labelledby="myCleanCheckLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
</body>
</html>
