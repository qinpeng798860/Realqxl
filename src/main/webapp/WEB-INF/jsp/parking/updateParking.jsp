<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/8
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script src="js/parking/updateParking.js"></script>

<form id="updateparkingFrom" method="post">
    <div id="TypeServerModal">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                </button>
                <h4 class="modal-title" id="editUserTitle">
                    我是标题
                </h4>
            </div>
            <div class="modal-body"><%--主体--%>

                <input type="hidden" id="zts" value="${parking.zt}"/>
                <input type="hidden" value="${parking.cwlx}" id="cwlxs">
                <input type="hidden" value="${parking.gllb}" id="gllbs">

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
                        <label for="cwbh">车位编号</label>
                        <input type="text" class="form-control" id="cwbh" name="cwbh" value="${parking.cwbh}">
                    </div>

                </div>
                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>

                    <div class="form-group col-lg-5">
                        <label for="cwlb">车位类别</label>
                        <label class="radio-inline">
                            <input type="radio" name="cwlb" id="cwlb" value="1" checked> 地上
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="cwlb" id="cwlb" value="2"> 地下
                        </label>
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
                        <label for="gllb">管理类别</label>
                        <select class="form-control" disabled="disabled" id="gllb" name="gllb">
                        </select>
                    </div>


                </div>
                <div class="row">

                    <div class="form-group col-lg-1">

                    </div>

                    <div class="form-group col-lg-5">
                        <label for="ysjg">预售价格</label>
                        <input type="text" class="form-control" id="ysjg" name="ysjg" value="${parking.ysjg}">
                    </div>

                </div>


                <div class="row">

                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="yzjg">预租价格</label>
                        <input type="text" class="form-control" id="yzjg" name="yzjg" value="${parking.yzjg}">
                    </div>

                </div>

                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="cwwz">车位位置</label>
                        <input type="text" class="form-control" id="cwwz" name="cwwz" value="${parking.cwwz}">
                    </div>

                </div>
                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="cwmj">车位面积</label>
                        <input type="text" class="form-control" id="cwmj" name="cwmj" value="${parking.cwmj}">
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
                        <input type="text" class="form-control" id="note" name="note" value="${parking.note}">
                    </div>
                </div>


            </div>


            <div class="modal-footer">
                <a class="btn btn-primary" id="updateParking_submit">
                    提交
                </a>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
            </div>
        </div>
    </div>
</form>

