<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/system/roleManage/addRole.js"></script>
<form id="editRoleForm"  method="post">
    <div id="editRole">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="roleTitle">

                </h4>
            </div>
            <div class="modal-body"><%--主体--%>
                <div class="row">
                    <input type="hidden" id="roleid" name="roleid" value="${role.roleid}">
                    <div class="form-group">
                        <label >账号</label>
                        <input  class="form-control" placeholder="请输入角色名" id="rolename" name="rolename" value="${role.rolename}">
                        </input>
                    </div>
                </div>
                <%--按钮组--%>
                <div class="modal-footer">
                    <a  class="btn btn-primary" id="addRole_submit" >
                        提交
                    </a>
                    <button type="button" class="btn btn-default" data-dismiss="modal" >关闭

                    </button>
                </div>
            </div>
        </div>
    </div>
</form>

