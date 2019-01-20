<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/system/roleManage/roleManage.js"></script>
</head>
<body>


<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="editRole" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
<table id="roleManage">
    <div id="toolbar">
        <div class="btn-group">
            <button type="button" class="btn btn-primary " onclick="addRole(1)">新 增</button>
            <button type="button" class="btn btn-primary" onclick="delRole()">删 除</button>
            <button type="button" class="btn btn-primary" onClick="addRole(2)">修 改</button>
        </div>
    </div>
</table>

</body>
</html>
