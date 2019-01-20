<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>
    <script src="js/system/log/systemlog.js"></script>
</head>
<body>
<div class="row">
<div class="form-group col-lg-2">
    <label for="name">诉求时间开始</label>
    <!--指定 date标记-->
    <div class='input-group date' id="dateA">
        <input type='text' class="form-control" readonly id="dateAvalue" name="createDate" />
        <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
    </div>
</div>
<div class="form-group col-lg-2">
    <label for="name">诉求时间结束</label>
    <!--指定 date标记-->
    <div class='input-group date' id="dateB">
        <input type='text' class="form-control" readonly id="dateBvalue" name="createDate"/>
        <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
    </div>

</div>
</div>
<table id="SyslogTable">

    <div id="toolbar">
        <a type="button" class="btn btn-default" onclick="queryLog()">查 询</a>
    </div>

</table>

</body>
</html>
