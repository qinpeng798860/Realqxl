<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>

    <title>权限管理</title>
</head>
<body style="width: 98%">

<div class="row">
    <div class="col-lg-offset-3">
        <div id="roleRadio" style="margin-top: 20px;">

        </div>
    </div>
    <div class="col-lg-4">
        <%--树形--%>
        <a type="button" class="btn btn-default" onclick="addRoleModule()">保存权限</a>
            <ul id="treeDemo" class="ztree"></ul>
    </div>
</div>


</body>
</html>
