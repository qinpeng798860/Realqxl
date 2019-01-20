<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>绿植信息</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/vege/check/ListGeenCheck.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3" style="padding-top: 10px">
            <label>检查人：</label>
            <%--<input type="text" name="StringName" value=""/>--%>
            <input type="text" class="form-control" id="rCjcr" name="rCjcr"/>
        </div>
        <div class="col-sm-4 col-md-offset-4"></div>
    </div>
</div>
<table id="GeenCheckTable">
    <div id="btn-checkbar">
        <button type="button" class="btn btn-default" onclick="queryGeenCheckTable()">查询</button>
        <button type="button" class="btn btn-default" onclick="addGeenCheckTable()">新增</button>
    </div>
</table>
<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="addGeenCheckModal" tabindex="-1" role="dialog" aria-labelledby="myGeenCheckLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
</body>
</html>
