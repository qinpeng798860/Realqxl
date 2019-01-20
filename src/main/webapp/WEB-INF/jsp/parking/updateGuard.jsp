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
                    修改保安安排
                </h4>
            </div>
            <div class="modal-body"><%--主体--%>
                <input type="hidden" id="zts" value="${parking.zt}"/>
                <input type="hidden" value="${parking.cwlx}" id="cwlxs">
                <input type="hidden" value="${parking.gllb}" id="gllbs">
                <input type="hidden" value="${guard.rSsgs}" id="rSsgs" >

                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="ssgs">所属公司</label>
                        <select class="form-control" id="ssgs" name="ssgs"  >
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label >开始时间</label>
                        <!--指定 date标记-->
                        <div class='input-group date' id="datetimepicker2s">
                            <input type='text' class="form-control" readonly id="datetimepicker2" name="createDate" value="${guards.rKssj}"/>
                            <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
                        </div>
                    </div>

                </div>
                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label >结束时间</label>
                        <!--指定 date标记-->
                        <div class='input-group date' id="datetimepicker2s">
                            <input type='text' class="form-control" readonly id="datetimepicker2" name="createDate" value="${guards.rJssj}"/>
                            <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
                        </div>
                    </div>

                </div>
                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>

                    <div class="form-group col-lg-5">
                        <label for="rbc">班次</label>
                        <input type="text" class="form-control" id="rbc" name="rbc" value="${guards.rBc}">
                        </input>
                    </div>


                </div>

                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>

                    <div class="form-group col-lg-5">
                        <label for="rsd">时段</label>
                        <input  type="text" class="form-control"  id="rsd" name="rsd" value="${guards.rSd}">
                    </div>


                </div>
                <div class="row">

                    <div class="form-group col-lg-1">

                    </div>

                    <div class="form-group col-lg-5">
                        <label for="rdd">地段</label>
                        <input type="text" class="form-control" id="rdd" name="rdd" value="${guards.rDd}">
                    </div>

                </div>


                <div class="row">

                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="rgw">岗位</label>
                        <input type="text" class="form-control" id="rgw" name="rgw" value="${guards.rGw}">
                    </div>

                </div>

                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>
                    <div class="form-group col-lg-5">
                        <label for="rzbry">值班人员</label>
                        <input type="text" class="form-control" id="rzbry" name="rzbry" value="${guards.rZbry}">
                    </div>

                </div>
                <div class="row">
                    <div class="form-group col-lg-1">

                    </div>


                    <div class="form-group col-lg-5">
                        <label for="note">备注：</label>
                        <input type="text" class="form-control" id="note" name="note" value="${guards.rNote}">
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

