<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/system/user/editUser.js"></script>
<form id="editUserForm"  method="post">
    <div id="editUserModel">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="editUserTitle">

                </h4>
            </div>
            <div class="modal-body"><%--主体--%>
                <div class="row">
                    <input type="hidden" id="userid" name="rUserid" value="${user.rUserid}">

                    <div class="form-group">
                        <label >账号</label>
                        <input  class="form-control" placeholder="请输入账号" id="username" name="rUsername" value="${user.rUsername}">
                        </input>
                    </div>
                    <div class="form-group">
                        <label >密码</label>
                        <input  class="form-control" placeholder="请输入密码" id="password" name="rPassword" value="${user.rPassword}">
                        </input>
                    </div>
                </div>

                <%--按钮组--%>
                <div class="modal-footer">
                    <a  class="btn btn-primary" id="addUser_submit" >
                        提交
                    </a>
                    <button type="button" class="btn btn-default" data-dismiss="modal" >关闭

                    </button>
                </div>
            </div>
        </div>
    </div>
</form>

