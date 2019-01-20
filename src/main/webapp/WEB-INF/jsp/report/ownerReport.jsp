<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>

    <script src="js/report/ownerReport.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row" style="padding-top: 10px;">
        <div class="col-sm-1" >
            <label>住宅：</label>
            <select class="selectpicker show-tick form-control" name="rZzmc"  id="id" data-live-search="true">
            </select>
        </div>
    </div>
</div>
<div id="container" style="width: 1500px; height: 890px; margin: 0 auto">
</div>
<script>
    $(function(){
        querySelectResidental("id","",'');
    });
</script>
</body>
</html>
