<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/8
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <script src="js/estate/addUnit.js"></script>

<form  id="addUnitFrom" method="post">
    <div id="TypeServerModal">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                </button>
                <h4 class="modal-title" id="editUserTitle">
                    新增单元
                </h4>
            </div>

    <input type="hidden" name="lybh" value="${lybh}" >
    <div class="row">
        <div class="form-group col-lg-1">

        </div>

        <div class="form-group col-lg-5">
            <label for="dymc">单元名称</label>
            <input type="text" class="form-control" id="dymc" name="dymc">
        </div>
    </div>
    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="kslc">开始楼层</label>
            <input type="text" class="form-control" id="kslc" name="kslc"/>
        </div>
        <div class="form-group col-lg-5">
            <label for="jslc">结束楼层</label>
            <input type="text" class="form-control" id="jslc" name="jslc"/>
        </div>
    </div>

    <div class="row">

        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="ksfh">开始房号</label>
            <input type="text" class="form-control" id="ksfh" name="ksfh">
            </input>
        </div>
        <div class="form-group col-lg-5">
            <label for="jsfh">结束房号</label>
            <input type="text" class="form-control" id="jsfh" name="jsfh"/>

        </div>
    </div>
    <div class="row">
        <div class="form-group col-lg-1">

        </div>
        <div class="form-group col-lg-5">
            <label for="node">备注：</label>
            <input type="text" class="form-control" id="node" name="node">
        </div>
    </div>
            <div class="modal-footer">
                <a class="btn btn-primary" id="addUnit_Submit">
                    提交
                </a>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
            </div>
        </div>
    </div>
</form>


