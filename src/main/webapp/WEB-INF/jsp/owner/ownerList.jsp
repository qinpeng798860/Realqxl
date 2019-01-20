<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>业主信息</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/owner/ownerList.js"></script>

</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-1" style="padding-top: 10px;width: 150px">
            <%--<label>快速检索：</label>--%>
            <select class="selectpicker show-tick form-control" name="StringValue"  id="StringValue" data-live-search="true">
                <option>请选择</option>
                <option value="r_yzxm">业主名称</option>
                <option value="r_zjhm">证件号码</option>
                <option value="r_sjhm">手机号码</option>
            </select>
        </div>
        <div class="col-sm-3" style="padding-top: 10px">
            <%--<input type="text" name="StringName" value=""/>--%>
                <input type="text" class="form-control" id="StringName" name="StringName">
        </div>
        <div class="col-sm-1" style="padding-top: 10px;width: 150px">
            <select id="ownerSelect" class="selectpicker show-tick form-control" name="rYzlx" data-live-search="true">
            </select>
        </div>
        <div class="col-sm-3 col-md-offset-4"></div>
    </div>
</div>
<table id="ownerListTable">
    <div id="btn-toolbar">
        <button type="button" class="btn btn-default" onclick="queryTable()">查询</button>
        <button type="button" class="btn btn-default" onclick="addOwnerTable()">新增</button>
        <button type="button" class="btn btn-default" onclick="updateOwnerServer()">修改</button>
    </div>
</table>
<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="addownerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
<%--查看房产--%>
<div class="modal fade loadingModal" id="addBuildModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content" >

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->

<%--查看家庭--%>
<div class="modal fade loadingModal" id="addHomeModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
<!--新增家庭 模态框（Modal） -->
<div class="modal fade loadingModal" id="addHomeMembersModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->

<!--新增房产 模态框（Modal） -->
<div class="modal fade loadingModal" id="BuildModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
<script>
    $(function(){
        querySelectDict("ownerSelect","业主类型",'');
    })

</script>
</body>
</html>
