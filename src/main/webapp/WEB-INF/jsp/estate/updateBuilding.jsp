<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/8
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/estate/updateBuilding.js"></script>

<form id="addBuildingFrom" method="post">
    <div id="TypeServerModal">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                </button>
                <h4 class="modal-title" id="editUserTitle">
                    新增楼宇
                </h4>
            </div>
            <div class="modal-body"><%--主体--%>
            <input type="hidden" name="zzbh" value="${zzbh}">
            <input type="hidden" id="l" value="${buidings.lygn}"/>
            <input type="hidden" id="j" value="${buidings.jglb}"/>
            <input type="hidden" id="z" value="${buidings.zxbz}"/>
            <input type="hidden" id="w" value="${buidings.wsdj}"/>

            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="lymc">楼宇名称</label>
                    <input type="text" class="form-control" id="lymc" name="lymc" value="${buidings.lymc}">
                </div>
                <div class="form-group col-lg-5">
                    <label for="dysl">单元数量</label>
                    <input type="text" class="form-control" id="dysl" name="dysl" value="${buidings.dysl}">
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="lygn">楼宇功能</label>
                    <select class="form-control" id="lygn" name="lygn">
                    </select>
                </div>
                <div class="form-group col-lg-5">
                    <label for="jglb">结构类别</label>
                    <select class="form-control" id="jglb" name="jglb">
                    </select>
                </div>
            </div>

            <div class="row">

                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="zxbz">装修标准</label>
                    <select class="form-control" id="zxbz" name="zxbz">
                    </select>
                </div>
                <div class="form-group col-lg-5">
                    <label for="wsdj">完损等级</label>
                    <select class="form-control" id="wsdj" name="wsdj">
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="jzmj">建筑面积</label>
                    <input type="text" class="form-control" id="jzmj" name="jzmj" value="${buidings.jzmj}">
                </div>
                <div class="form-group col-lg-5">
                    <label for="symj">使用面积</label>
                    <input type="text" class="form-control" id="symj" name="symj" value="${buidings.symj}">
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="jzxkz">建筑许可证</label>
                    <input type="text" class="form-control" id="jzxkz" name="jzxkz" value="${buidings.jzxkz}">
                </div>
                <div class="form-group col-lg-5">
                    <label for="ysxkz">预售许可证</label>
                    <input type="text" class="form-control" id="ysxkz" name="ysxkz" value="${buidings.ysxkz}">
                </div>
            </div>


            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="note">备注：</label>
                    <input type="text" class="form-control" id="note" name="note" value="${buidings.note}">
                </div>
            </div>
            <div class="modal-footer">
                <a class="btn btn-primary" id="addBuilding_Submit">
                    提交
                </a>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
            </div>
        </div>
    </div>
    </div>
</form>


