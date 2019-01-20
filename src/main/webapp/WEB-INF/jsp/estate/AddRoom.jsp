<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/8
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/estate/addRoom.js"></script>

<form id="addRoomFrom" method="post">
    <div id="TypeServerModal">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                </button>
                <h4 class="modal-title" id="editUserTitle">
                    新增楼宇
                </h4>
            </div>

            <input type="hidden" name="dybh" value="${dybh}">

            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="fjmc">房间名称</label>
                    <input type="text" class="form-control" id="fjmc" name="fjmc">
                </div>
                <div class="form-group col-lg-5">
                    <label for="hx">户型</label>
                    <select class="form-control" id="hx" name="hx">
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="cx">朝向</label>
                    <select class="form-control" id="cx" name="cx">
                    </select>
                </div>
                <div class="form-group col-lg-5">
                    <label for="zx">装修</label>
                    <select class="form-control" id="zx" name="zx">
                    </select>
                </div>
            </div>

            <div class="row">

                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="lcx">楼层数</label>
                    <input type="text" class="form-control" id="lcx" name="lcx"/>
                </div>
                <div class="form-group col-lg-5">
                    <label for="jzmj">建筑面积</label>
                    <input type="text" class="form-control" id="jzmj" name="jzmj"/>

                </div>
            </div>

            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="symj">使用面积</label>
                    <input type="text" class="form-control" id="symj" name="symj">
                </div>
                <div class="form-group col-lg-5">
                    <label for="cph">车牌号</label>
                    <input type="text" class="form-control" id="cph" name="cph">
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="ckmj">车库面积</label>
                    <input type="text" class="form-control" id="ckmj" name="ckmj">
                </div>
                <div class="form-group col-lg-5">
                    <label for="fjxz">房间性质</label>
                    <select class="form-control" id="fjxz" name="fjxz"></select>
                </div>
            </div>


            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="cwmj">车位面积</label>
                    <input type="text" class="form-control" id="cwmj" name="cwmj">
                </div>


                <div class="form-group col-lg-5">
                    <label for="ccsh">储藏室号</label>
                    <input type="text" class="form-control" id="ccsh" name="ccsh">
                </div>
            </div>


            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="ccsmj">储藏室面积</label>
                    <input type="text" class="form-control" id="ccsmj" name="ccsmj">
                </div>


                <div class="form-group col-lg-5">
                    <label for="glmj">阁楼面积</label>
                    <input type="text" class="form-control" id="glmj" name="glmj">
                </div>
            </div>

            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="fjzt">房间状态</label>
                    <select type="text" class="form-control" id="fjzt" name="fjzt">
                    </select>
                </div>


                <div class="form-group col-lg-5">
                    <label for="wylx">物业类型</label>
                    <select class="form-control" id="wylx" name="wylx">
                    </select>
                </div>
            </div>



            <div class="row">
                <div class="form-group col-lg-1">

                </div>
                <div class="form-group col-lg-5">
                    <label for="node">备注</label>
                    <input type="text" class="form-control" id="node" name="node">
                </div>


            </div>

            <div class="modal-footer">
                <a class="btn btn-primary" id="addRoom_Submit">
                    提交
                </a>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
            </div>
        </div>
    </div>
</form>


