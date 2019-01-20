<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/system/user/userManage.js"></script>
</head>
<body style="width: 98%">
    <div class="row">
        <div class="col-lg-5">
            <table id="userManage">
                <div id="toolbar">
                    <div class="btn-group">
                        <button type="button" class="btn btn-primary " onclick="editUser(1);">新 增</button>
                        <button type="button" class="btn btn-primary" onclick="delUser()">删 除</button>
                        <button type="button" class="btn btn-primary" onClick="editUser(2)">修 改</button>
                    </div>
                </div>
            </table>
        </div>


        <div class="form-group col-sm-2">
            <div class="input-group">
                <input type="text" class="form-control" id="rUsername" placeholder="请输入用户名">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button" onclick="queryUser();">查 询</button>
                    </span>
            </div><!-- /input-group -->
        </div>


        <div class=" form-group col-sm-2">
            <div id="roleRadio" class=""  style="margin-top: 50px;">

            </div>
        </div>
        <div class="col-sm-2">
            <%--树形--%>
            <a type="button" class="btn btn-default" onclick="addRoleModule()">保存权限</a>
            <ul id="treeDemo" class="ztree"></ul>
        </div>


    </div>
    <!-- 模态框（Modal） -->
    <div class="modal fade loadingModal" id="editUserRoleModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">

            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->



<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="editUserModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->



</body>
</html>
