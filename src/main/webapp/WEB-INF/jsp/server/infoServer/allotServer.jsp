<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/server/infoServer/allotServer.js"></script>
<form id="allotServerFrom"  method="post">
    <div id="allotServer">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    分配服务
                </h4>
            </div>
            <div class="modal-body"><%--主体--%>
                <input type="hidden" value="${server.rFwId}" id="typeFwlx"/>
                <input type="hidden" value="${server.id}" name="rFwbm"/>

                <div class="row">
                    <select class="form-control" id="rSSgs" name="rGsbm"></select>
                </div>

                <%--按钮组--%>
                <div class="modal-footer">
                    <a class="btn btn-primary" id="allotServer_submit">
                        提交
                    </a>
                    <button type="button" class="btn btn-default" data-dismiss="modal" >关闭

                    </button>
                </div>
            </div>
        </div>
    </div>
</form>

