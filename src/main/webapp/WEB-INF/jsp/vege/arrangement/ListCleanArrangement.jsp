<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>清洁安排</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/vege/arrangement/ListCleanArrangement.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-1" style="padding-top: 10px;width: 150px">
            <%--<label>快速检索：</label>--%>
            <select class="selectpicker show-tick form-control" name="CleanArrangement" id="CleanArrangement" data-live-search="true">
                <option>请选择</option>
                <option value="r_aqjdd">清洁地段</option>
                <option value="r_afzr">负责人</option>
            </select>
        </div>
        <div class="col-sm-3" style="padding-top: 10px">
            <%--<input type="text" name="StringName" value=""/>--%>
            <input type="text" class="form-control" id="NameArrangement" name="NameArrangement"/>
        </div>
        <div class="col-sm-4 col-md-offset-4"></div>
    </div>
</div>
<table id="CleanArrangementTable">
    <div id="btn-cleanbar">
        <button type="button" class="btn btn-default" onclick="queryArrangementTable()">查询</button>
        <button type="button" class="btn btn-default" onclick="addArrangementTable()">新增</button>
    </div>
</table>
<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="addCleanArrangementModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
</body>
</html>
