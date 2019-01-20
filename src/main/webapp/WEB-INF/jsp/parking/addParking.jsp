<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/8
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script src="js/parking/addParking.js"></script>

<form id="addparkingFrom" method="post">
    <div id="TypeServerModal">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                </button>
                <h4 class="modal-title" id="editUserTitle">
                    新增车位
                </h4>
            </div>
            <div class="modal-body"><%--主体--%>

                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="ssfc">所属房产</label>
                        <select class="form-control" id="ssfc" name="ssfc">
                        </select>
                    </div>
                </div>

                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>

                    <div class="form-group col-lg-5">
                        <label for="cwlb">车位类别</label>
                        <select class="form-control" id="cwlb" name="cwlb">
                        </select>
                    </div>


                </div>

                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="gllb">管理类别</label>
                        <select class="form-control" id="gllb" name="gllb">
                        </select>
                    </div>

                </div>

                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>

                    <div class="form-group col-lg-5">
                        <label for="cwlx">车位类型</label>
                        <select class="form-control" id="cwlx" name="cwlx">
                        </select>
                    </div>


                </div>
                <div class="row">

                    <div class="form-group col-lg-1">

                    </div>

                    <div class="form-group col-lg-5">
                        <label for="ysjg">预售价格</label>
                        <input type="text" class="form-control" id="ysjg" name="ysjg">
                    </div>

                </div>


                <div class="row">

                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="yzjg">预租价格</label>
                        <input type="text" class="form-control" id="yzjg" name="yzjg">
                    </div>

                </div>

                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="cwwz">车位位置</label>
                        <input type="text" class="form-control" id="cwwz" name="cwwz">
                    </div>

                </div>



                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="cwmj">车位面积</label>
                        <input type="text" class="form-control" id="cwmj" name="cwmj">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="zt">当前状态</label>
                        <select class="form-control" id="zt" name="zt">
                        </select>
                    </div>


                </div>


                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>


                    <div class="form-group col-lg-5">
                        <label for="note">备注：</label>
                        <input type="text" class="form-control" id="note" name="note">
                    </div>
                </div>


            </div>


            <div class="modal-footer">
                <a class="btn btn-primary" id="addParking_submit">
                    提交
                </a>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
            </div>
        </div>
    </div>
</form>

