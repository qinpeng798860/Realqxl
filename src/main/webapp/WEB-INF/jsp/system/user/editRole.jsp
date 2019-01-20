<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="editUserRoleModal">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">

            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <input type="hidden" value="${userVo.rRoleId}" id="roleid">
            <input type="hidden" value="${userVo.rUserid}" id="rUserid">
            <div class="form-group">
                <label >所属公司</label>
                <select  class="form-control"  id="RoleSelect" >
                </select>
            </div>

        </div>
        <%--按钮组--%>
        <div class="modal-footer">
            <a  class="btn btn-primary" id="editRole_submit">
                提交
            </a>
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
            </button>
        </div>
    </div><!-- /.modal-content -->
</div>
<script src="js/system/user/editRole.js"></script>