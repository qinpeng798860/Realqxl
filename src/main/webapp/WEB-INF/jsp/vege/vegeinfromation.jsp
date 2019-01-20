<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>绿植信息</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/vege/vegeinfromation.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-1" style="padding-top: 10px;width: 150px">
            <%--<label>快速检索：</label>--%>
            <select class="selectpicker show-tick form-control" id="StringVege" name="StringVege" data-live-search="true">
                <option>请选择</option>
                <%--<option value="r_zbbm">植被编码</option>--%>
                <option value="r_zbmc">植被名称</option>
                <option value="r_zbzl">植被种类</option>
                <option value="r_zbsl">植被数量</option>
                <option value="r_sl">植被树龄</option>
            </select>
        </div>
        <div class="col-sm-3" style="padding-top: 10px">
            <%--<input type="text" name="StringName" value=""/>--%>
            <input type="text" class="form-control" id="VegeName" name="VegeName"/>
        </div>
        <div class="col-sm-4 col-md-offset-4"></div>
    </div>
</div>
<table id="vegeListTable">
    <div id="btn-vegebar">
        <button type="button" class="btn btn-default" onclick="queryvegeTable()">查询</button>
        <button type="button" class="btn btn-default" onclick="addVegeTable()">新增</button>
    </div>
</table>
<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="addVegeModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->


</body>
</html>
