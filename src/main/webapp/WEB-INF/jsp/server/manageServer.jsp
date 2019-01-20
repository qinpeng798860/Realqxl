<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>

    <script src="js/server/manageServer.js"></script>
</head>
<body style="height: 95%;width: 98%;">
<form id="manageServerFrom">
    <div class="row">
        <div class="form-group col-lg-2">
            <label for="name">诉求事项</label>
            <input type="text" class="form-control" placeholder="请输入诉求事项" name="rSqsx">
        </div>
        <div class="form-group col-lg-2">
            <label for="name">服务类型</label>
            <select class="form-control" name="rFwlx" id="rFwlx">

            </select>
        </div>

        <div class="form-group col-lg-2">
            <label for="name">状态</label>
            <select class="form-control" name="rZt" id="rZt">
            </select>
        </div>
    </div>
</form>


</div><!-- /.modal-dialog -->
<table id="manageServer">
    <div id="toolbar">
        <a type="button" class="btn btn-default" onclick="queryManage()">查 询</a>
        <button type="reset" class="btn btn-default" onclick="resetFrom()">清 空</button>
<script>
    function  resetFrom() {
        $("#manageServerFrom")[0].reset();//表单重置
    }
</script>
<button type="button" class="btn btn-default" onclick="editServerMange();">查询办理</button>
</div>
</table>

<!-- 新增服务模态框（Modal） -->
<div class="modal fade loadingModal" id="editServerManage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->


</body>
</html>
