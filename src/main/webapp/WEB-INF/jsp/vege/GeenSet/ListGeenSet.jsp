<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>绿植信息</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/vege/GeenSet/ListGeenSet.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-1" style="padding-top: 10px;width: 150px">
            <%--<label>快速检索：</label>--%>
            <select class="selectpicker show-tick form-control" name="StringGeenSet" id="StringGeenSet" data-live-search="true">
                <option>请选择</option>
                <option value="r_gszmc">设置名称</option>
                <option value="r_gmj">面积</option>
                <option value="r_gdd">地点</option>
                <option value="r_gzyzb">主要植被</option>
            </select>
        </div>
        <div class="col-sm-3" style="padding-top: 10px">
            <%--<input type="text" name="StringName" value=""/>--%>
            <input type="text" class="form-control" id="GeenSetName" name="GeenSetName"/>
        </div>
        <div class="col-sm-4 col-md-offset-4"></div>
    </div>
</div>
<table id="GeenSetTable">
    <div id="btn-Geenbar">
        <button type="button" class="btn btn-default" onclick="queryGeenSetTable()">查询</button>
        <button type="button" class="btn btn-default" onclick="addGeenSetTable()">新增</button>
    </div>
</table>
<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="addGeenSetModal" tabindex="-1" role="dialog" aria-labelledby="myGeenSetLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
</body>
</html>
