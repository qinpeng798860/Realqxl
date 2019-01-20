<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/8
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改住宅信息</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp" %>
    <script src="js/estate/updateHomes.js"></script>
</head>
<body style="width: 90%">
<form  id="addHomesFrom" method="post">
    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="rssgs">所属公司</label>
            <select class="form-control" id="rSsgs" name="rSsgs">
            </select>
        </div>
    </div>
    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="rZzbh">住宅编号</label>
            <input type="text" class="form-control" id="rZzbh" name="rZzbh">
        </div>
        <div class="form-group col-lg-5">
            <label for="rZzmc">住宅名称</label>
            <input type="text" class="form-control" id="rZzmc" name="rZzmc">
        </div>
    </div>
    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="rZdmj">占地面积</label>
            <input type="text" class="form-control" id="rZdmj" name="rZdmj">
        </div>
        <div class="form-group col-lg-5">
            <label for="rJzmj">建筑面积</label>
            <input type="text" class="form-control"  id="rJzmj" name="rJzmj">
        </div>
    </div>

    <div class="row">

        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="rLdmj">绿地面积</label>
            <input type="text" class="form-control" id="rLdmj" name="rLdmj">
        </div>
        <div class="form-group col-lg-5">
            <label for="rDlmj">道路面积</label>
            <input type="text" class="form-control" id="rDlmj" name="rDlmj">
        </div>
    </div>

    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="rLybh">楼宇编号</label>
            <input type="text" class="form-control" id="rLybh" name="rLybh">
        </div>
        <div class="form-group col-lg-5">
            <label for="rFzr">负责人</label>
            <input type="text" class="form-control" id="rFzr" name="rFzr">
        </div>
    </div>
    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="rZzdz">住宅地址</label>
            <input type="text" class="form-control" id="rZzdz" name="rZzdz">
        </div>
    </div>
    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-1">

        </div>


        <label >开发商信息</label>
    </div>


    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="rGsmc">公司名称：</label>
            <input type="text" class="form-control" id="rGsmc" name="rGsmc">
        </div>

        <div class="form-group col-lg-5">
            <label for="rFrdb">法人代表：</label>
            <input type="text" class="form-control" id="rFrdb" name="rFrdb">
        </div>
    </div>


    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="rLxr">联系人：</label>
            <input type="text" class="form-control" id="rLxr" name="rLxr">
        </div>

        <div class="form-group col-lg-5">
            <label for="rLxdh">联系电话：</label>
            <input type="text" class="form-control" id="rLxdh" name="rLxdh">
        </div>
    </div>
    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-10">
            <label for="rLxdz">联系地址：</label>
            <input type="text" class="form-control" id="rLxdz" name="rLxdz">
        </div>


    </div>
    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="rNote">备注：</label>
            <input type="text" class="form-control" id="rNote" name="rNote">
        </div>
    </div>
    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <div>
                <a type="button" class="btn btn-primary" name="addHome_Submit" id="addHome_Submit">保存</a>
                <button type="button" class="btn btn-primary" id="TypeServerModal" >关 闭</button>
            </div>
        </div>


    </div>
</form>


</body>
</html>
