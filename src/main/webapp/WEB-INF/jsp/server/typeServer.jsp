<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="js/server/typeServer.js"></script>
<head>
    <title>服务类型</title>
</head>
<body>

<!-- 模态框（Modal） -->
<div class="modal fade loadingModal" id="TypeServerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
<table id="typeServerTable">
    <div id="toolbar">
        <div class="btn-group">
            <button type="button" class="btn btn-primary " onclick="addTypeServer();">新增类型</button>
            <button type="button" class="btn btn-primary" onclick="delSingBook()">删 除</button>
            <button type="button" class="btn btn-primary" onClick="updateTypeServer()">修 改</button>
        </div>
    </div>
</table>
<script>
  /*  $("#addServerType").click(function(){
        location.href=rootPath+"serverType/gotoEditServer";
    })
*/
</script>
</body>
</html>
