<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <script src="js/server/typeServer/editServer.js"></script>

<form id="editServerTypeForm"  method="post">
    <div id="TypeServerModal">
        <div class="modal-content">
                <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">

                </h4>
            </div>
            <div class="modal-body"><%--主体--%>

                <input type="hidden" name="id" id="editServerTypeid" value="${serverType.id}">
                <input type="hidden" name="rStatus" id="editServerTyperStatus" value="${serverType.rStatus}">
                <input type="hidden" id="SelectedIdSSgs" value="${serverType.rSsgs}">
                <input type="hidden" id="lxmcId" value="${serverType.rLxmc}">

                <div class="form-group">
                    <label >所属公司</label>
                    <select  class="form-control" placeholder="所属公司名称" id="rSSgs" name="rSsgs">
                    </select>
                </div>
                <div class="form-group">
                    <label >类型名称</label>
                    <%--书本类型id--%>
                    <input type="hidden" id="serverType" />
                    <select  class="form-control" placeholder="类型名称" id="rLxmc" name="rLxmc" >

                    </select>
            </div>
                <div class="form-group">
                    <label >服务价格</label>
                    <%--书本类型id--%>
                    <input type="hidden" id="serverType" />
                    <input  class="form-control" placeholder="服务价格" name="rDj" value="${serverType.rDj}">
                </div>
                <div class="form-group">
                    <label >说明</label>
                    <%--书本类型id--%>
                    <input type="hidden" id="serverType" />
                    <input  class="form-control" placeholder="服务说明" name="rNote" value="${serverType.rNote}">
                </div>

            </div>
            <%--按钮组--%>
            <div class="modal-footer">
                <a  class="btn btn-primary" id="addOwnerTypeBtn_submit">
                    提交
                </a>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div>
</form>
