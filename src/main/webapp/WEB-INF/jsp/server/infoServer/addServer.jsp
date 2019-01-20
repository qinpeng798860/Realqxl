<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <script src="js/server/infoServer/addServer.js"></script>
    <script src="js/common.js"></script>

<form id="addServerForm"  method="post">
    <div id="addServerModal">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
            新增服务信息
            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label for="name">所属住宅</label>
                    <select id="Sszzdropdown" name="fc" class="form-control">
                    </select>

                </div>
                <div class="form-group col-lg-4">
                    <label for="name">选择楼宇</label>
                    <select class="form-control" id="SslySelect" name="lymc">

                    </select>
                </div>
                <div class="form-group col-lg-4">
                    <label for="name">选择单元</label>
                    <select class="form-control" id="dySelect2" name="dy"></select>
                </div>

            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label for="name">选择房间</label>
                    <select class="form-control" id="fjSelect2">

                    </select>
                </div>
                <div class="form-group col-lg-4">
                    <label for="name">房间名称</label>
                    <input type="text" class="form-control" placeholder="房间名称" id="fjmc" name="rFjmc" readonly>
                </div>
                <div class="form-group col-lg-4">
                    <%--<label for="name">申请人</label>--%>
                    <input type="hidden" name="rSqr" readonly value="${LoginUser.rUserid}">
                </div>

            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label for="name">手机号码</label>
                    <input type="text" class="form-control" placeholder="请输入电话" name="rLxdh">
                </div>
                <div class="form-group col-lg-4">
                    <label for="name">诉求时间</label>
                        <!--指定 date标记-->
                        <div class='input-group date' id="datetimepicker2s">
                            <input type='text' class="form-control" readonly id="datetimepicker2" name="createDate" value="${rSqsj}"/>
                            <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
                        </div>
                </div>


            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label for="name">服务类型</label>
                    <select class="form-control" id="addServerTypeSelect" name="rFwlx"></select>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-11">
                    <label for="name">诉求事项</label>
                    <textarea class="form-control" rows="3" placeholder="请输入诉求事项"  id="rSqsx" name="rSqsx"></textarea>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label for="name">附件</label>
                    <input type="file" id="inputfile">
                </div>
            </div>
            <%--按钮组--%>
            <div class="modal-footer">
                <a  class="btn btn-primary" id="addServer_submit">
                    提交
                </a>
                <button type="button" class="btn btn-default" data-dismiss="modal" >关闭

                </button>
            </div>
        </div>
    </div>
    </div>
</form>

