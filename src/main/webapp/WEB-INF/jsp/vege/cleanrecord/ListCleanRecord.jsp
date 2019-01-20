<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>安排记录</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/vege/cleanrecord/ListCleanRecord.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3" style="padding-top: 10px">
            <label>清洁人：</label>
            <%--<input type="text" name="StringName" value=""/>--%>
            <input type="text" class="form-control" id="rQqjr" name="rQqjr"/>
        </div>
        <div class="col-sm-9 col-md-offset-4"></div>
    </div>
</div>
<table id="cleanRecordTable">
    <div id="btn-recordbar">
        <button type="button" class="btn btn-default" onclick="queryCleanRecordTable()">查询</button>
        <button type="button" class="btn btn-default" onclick="addCleanRecordTable()">新增</button>
    </div>
</table>
<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="addCleanRecordModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
</body>
</html>
